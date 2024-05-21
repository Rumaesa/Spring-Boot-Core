package com.spring.boot.service;

import java.util.List;

import com.spring.boot.model.Room;

public interface IRoomService {

	public List<Room> fetchRoomsByCity(String city)throws Exception;
}
