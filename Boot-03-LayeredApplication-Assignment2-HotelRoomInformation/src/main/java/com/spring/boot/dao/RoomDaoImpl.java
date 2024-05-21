package com.spring.boot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.boot.model.Room;

@Repository("roomDao")
public class RoomDaoImpl implements IRoomDao{

	private static final String GET_ROOMS_BY_CITY = "SELECT * FROM ROOMS WHERE CITY = (?)";
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public List<Room> getRoomByCity(String city) throws Exception {
		List<Room> rooms = new ArrayList<Room>();
		try(Connection con = dataSource.getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(GET_ROOMS_BY_CITY)){
			preparedStatement.setString(1, city);
			try(ResultSet resultSet = preparedStatement.executeQuery()){
				
				while(resultSet.next()) {
					Room room = new Room();
					room.setRoomNo(resultSet.getInt(1));
					room.setHotelName(resultSet.getString(2));
					room.setContactPerson(resultSet.getString(3));
					room.setCity(resultSet.getString(4));
					rooms.add(room);
				}
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return rooms;
	}

}
