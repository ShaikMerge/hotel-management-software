package org.atlas.hotelbookingsoftware.controller;

import lombok.RequiredArgsConstructor;
import org.atlas.hotelbookingsoftware.entity.Hotel;
import org.atlas.hotelbookingsoftware.entity.Room;
import org.atlas.hotelbookingsoftware.entity.User;
import org.atlas.hotelbookingsoftware.service.HotelService;
import org.atlas.hotelbookingsoftware.service.RoomService;
import org.atlas.hotelbookingsoftware.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
public class HotelManagementAdminController {

    private final UserService userService;
    private final HotelService hotelService;
    private final RoomService roomService;

    /*
        This method will be decommissioned in the future
     */

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PostMapping("/createHotel")
    public Hotel createHotel(@RequestBody Hotel hotel) {
        return hotelService.createHotel(hotel);
    }

    @PostMapping("/createRooms/{hotel_id}")
    public List<Room> createRooms(@RequestBody List<Room> rooms, @PathVariable Long hotel_id) {
        return roomService.createRooms(rooms, hotel_id);
    }
}
