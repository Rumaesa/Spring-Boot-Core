package com.spring.boot.dao;

import java.util.List;

import com.spring.boot.model.Room;

public interface IRoomDao {

	public List<Room> getRoomByCity(String city) throws Exception;
}
