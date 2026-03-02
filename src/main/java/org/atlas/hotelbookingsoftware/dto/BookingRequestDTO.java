package org.atlas.hotelbookingsoftware.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class BookingRequestDTO {

    private List<Long> roomIds;

    private Long userId;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private String roomType;

}
