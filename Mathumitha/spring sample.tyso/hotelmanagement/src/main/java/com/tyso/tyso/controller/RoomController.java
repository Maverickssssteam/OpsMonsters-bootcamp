package com.tyso.tyso.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.tyso.tyso.entity.Room;
import com.tyso.tyso.service.RoomService;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    // Get all rooms
    @GetMapping
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }

    // Add room
    @PostMapping
    public Room addRoom(@RequestBody Room room) {
        return roomService.saveRoom(room);
    }

    // Get room by id
    @GetMapping("/{id}")
    public Room getRoomById(@PathVariable Long id) {
        return roomService.getRoomById(id);
    }

    // Delete room
    @DeleteMapping("/{id}")
    public String deleteRoom(@PathVariable Long id) {
        roomService.deleteRoom(id);
        return "Room deleted successfully";
    }
 // Update room
    @PutMapping("/{id}")
    public Room updateRoom(@PathVariable Long id, @RequestBody Room room) {
        return roomService.updateRoom(id, room);
    }

}