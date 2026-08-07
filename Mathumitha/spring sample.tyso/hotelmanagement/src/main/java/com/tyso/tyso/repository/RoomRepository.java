package com.tyso.tyso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tyso.tyso.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

}