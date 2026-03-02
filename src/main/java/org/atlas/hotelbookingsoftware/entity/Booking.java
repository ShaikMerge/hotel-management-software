package org.atlas.hotelbookingsoftware.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.atlas.hotelbookingsoftware.entity.type.BookingStatus;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String booking_id;


    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private Double totalPrice;

    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;


    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user_id;

    @ManyToMany
    @JoinTable(name = "room_booking",
            joinColumns = @JoinColumn(name = "booking_id"),
            inverseJoinColumns = @JoinColumn(name = "room_id")
    )
    @JsonIgnore
    private List<Room> rooms;


}
