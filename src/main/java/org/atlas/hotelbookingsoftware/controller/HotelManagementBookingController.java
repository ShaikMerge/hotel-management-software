package org.atlas.hotelbookingsoftware.controller;

import lombok.RequiredArgsConstructor;
import org.atlas.hotelbookingsoftware.dto.BookingRequestDTO;
import org.atlas.hotelbookingsoftware.entity.Booking;
import org.atlas.hotelbookingsoftware.service.BookingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/booking")
public class HotelManagementBookingController {


    private final BookingService bookingService;

    @PostMapping("/book")
    public Booking createBooking(@RequestBody BookingRequestDTO bookingRequestDTO) {
        return bookingService.createBooking(bookingRequestDTO);
    }

}
