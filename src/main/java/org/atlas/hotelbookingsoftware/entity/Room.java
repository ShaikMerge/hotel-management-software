package org.atlas.hotelbookingsoftware.entity;


import jakarta.persistence.*;


@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String roomType;


    private Long roomNumber;

    @Column(name = "pricePerNight")
    private Double pricePerNight;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

}
