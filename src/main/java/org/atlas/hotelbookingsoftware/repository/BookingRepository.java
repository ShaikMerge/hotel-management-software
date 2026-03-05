package org.atlas.hotelbookingsoftware.repository;

import org.atlas.hotelbookingsoftware.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, String> {
}
