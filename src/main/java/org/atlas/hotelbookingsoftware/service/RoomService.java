package org.atlas.hotelbookingsoftware.service;

import lombok.RequiredArgsConstructor;
import org.atlas.hotelbookingsoftware.entity.Hotel;
import org.atlas.hotelbookingsoftware.entity.Room;
import org.atlas.hotelbookingsoftware.repository.HotelRepository;
import org.atlas.hotelbookingsoftware.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;
    private final HotelRepository hotelRepository;

    public List<Room> createRooms(List<Room> rooms, Long hotelId) {
        Hotel hotel = hotelRepository.findById(hotelId).
                orElseThrow(() -> new RuntimeException("Hotel Not Found for id " + hotelId));
        rooms.forEach(room -> room.setHotel(hotel));
        return roomRepository.saveAll(rooms);
    }
}
