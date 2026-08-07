package com.tyso.tyso.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tyso.tyso.entity.Room;
import com.tyso.tyso.repository.RoomRepository;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    // Get all rooms
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    // Save room
    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }

    // Get room by id
    public Room getRoomById(Long id) {
        return roomRepository.findById(id).orElse(null);
    }

    // Delete room
    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
    
 // Update room
    public Room updateRoom(Long id, Room room) {
        Room existingRoom = roomRepository.findById(id).orElse(null);

        if (existingRoom != null) {
            existingRoom.setRoomNumber(room.getRoomNumber());
            existingRoom.setRoomType(room.getRoomType());
            existingRoom.setPrice(room.getPrice());

            return roomRepository.save(existingRoom);
        }

        return null;
    }

}