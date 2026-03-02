package org.atlas.hotelbookingsoftware.repository;

import org.atlas.hotelbookingsoftware.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
