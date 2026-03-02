package org.atlas.hotelbookingsoftware.repository;

import org.atlas.hotelbookingsoftware.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
