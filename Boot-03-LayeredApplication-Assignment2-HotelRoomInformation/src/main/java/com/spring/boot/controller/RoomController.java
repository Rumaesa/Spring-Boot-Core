package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.boot.model.Room;
import com.spring.boot.service.RoomServiceImpl;

@Controller("roomController")
public class RoomController {

	@Autowired
	private RoomServiceImpl roomService;
	
	public List<Room> showRoomsByCity(String city) throws Exception{
		
		List<Room> rooms = roomService.fetchRoomsByCity(city);
		return rooms;
	}
}
