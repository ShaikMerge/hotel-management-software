package org.atlas.hotelbookingsoftware.service;

import lombok.RequiredArgsConstructor;
import org.atlas.hotelbookingsoftware.entity.Hotel;
import org.atlas.hotelbookingsoftware.repository.HotelRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HotelService {

    private final HotelRepository hotelRepository;

    public Hotel createHotel(Hotel hotel) {
        Hotel createHotel = new Hotel();
        createHotel.setDescription(hotel.getDescription());
        createHotel.setName(hotel.getName());
        createHotel.setLocation(hotel.getLocation());
        return hotelRepository.save(createHotel);
    }
}
