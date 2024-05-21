package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.dao.RoomDaoImpl;
import com.spring.boot.model.Room;

@Service("roomService")
public class RoomServiceImpl implements IRoomService {

	@Autowired
	private RoomDaoImpl roomDao;
	
	@Override
	public List<Room> fetchRoomsByCity(String city) throws Exception {
		List<Room> rooms = roomDao.getRoomByCity(city);
		return rooms;
	}

}
