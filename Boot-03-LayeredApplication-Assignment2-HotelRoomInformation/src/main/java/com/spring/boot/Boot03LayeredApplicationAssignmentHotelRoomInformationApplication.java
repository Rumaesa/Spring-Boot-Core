package com.spring.boot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.boot.controller.RoomController;
import com.spring.boot.model.Room;

@SpringBootApplication
public class Boot03LayeredApplicationAssignmentHotelRoomInformationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Boot03LayeredApplicationAssignmentHotelRoomInformationApplication.class, args);
		
		RoomController roomController = ctx.getBean("roomController",RoomController.class);
		
		try {
			List<Room> rooms = roomController.showRoomsByCity("Mumbai");
			System.out.println(rooms);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
