package org.atlas.hotelbookingsoftware.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Hotel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hotel_name", nullable = false)
    private String name;


    private String location;


    private String description;

    @OneToMany(mappedBy = "hotel")  //Owning side
    List<Room> rooms;

}

