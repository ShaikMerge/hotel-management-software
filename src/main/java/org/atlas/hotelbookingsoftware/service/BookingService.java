package org.atlas.hotelbookingsoftware.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.atlas.hotelbookingsoftware.dto.BookingRequestDTO;
import org.atlas.hotelbookingsoftware.entity.Booking;
import org.atlas.hotelbookingsoftware.entity.Room;
import org.atlas.hotelbookingsoftware.entity.User;
import org.atlas.hotelbookingsoftware.entity.type.BookingStatus;
import org.atlas.hotelbookingsoftware.repository.BookingRepository;
import org.atlas.hotelbookingsoftware.repository.RoomRepository;
import org.atlas.hotelbookingsoftware.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookingService {

    private final BookingRepository bookingRepository;
    private final RoomRepository roomRepository;
    private final UserRepository userRepository;


    @Transactional
    public Booking createBooking(BookingRequestDTO bookingRequestDTO) {

//        User user = userRepository.findById(bookingRequestDTO.getUserId())).
//                orElseThrow(() -> new RuntimeException("User Not Found" + bookingRequestDTO.getUserId()));
        User user = userRepository.findById(bookingRequestDTO.getUserId()).orElseThrow(
                () -> new RuntimeException("User id cant be null ")
        );

        List<Room> avaliableRooms = bookingRequestDTO.getRoomIds().stream()
                .map((Long roomId) ->
                        {
                            Room rooms = roomRepository.findById(roomId).orElseThrow(() ->
                                    new RuntimeException("Room not available for Id" + roomId)
                            );
                            return rooms;
                        }).toList();

        Booking booking = new Booking();
        booking.setCheckOutDate(bookingRequestDTO.getCheckOutDate());
        booking.setUser_id(user);
        booking.setRooms(avaliableRooms);
        booking.setTotalPrice(calcuateTotalPrice(avaliableRooms, bookingRequestDTO.getCheckOutDate()));
        booking.setBookingStatus(BookingStatus.PENDING);
        // Implement an Order Service ?
      return   bookingRepository.save(booking);

    }

    // Will Implement Later
    private Double calcuateTotalPrice(List<Room> avaliableRooms, LocalDate checkOutDate) {

        return 1000.2;

    }
}
