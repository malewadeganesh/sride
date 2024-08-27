package com.krushisampann.sride.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

@Entity
@Getter
@Setter
public class Driver {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Double rating;
	
	@OneToOne
	private User user;
	
	private Boolean available;
	
	private String vehicleId;
	
//	//import from org.locationtech.jts.geom.Point;
//	//4326 for Earth Geometry--> @Column(columnDefinition = "Geometry(Point, 4326)")
	@Column(columnDefinition = "Geometry(Point, 4326)")
	private Point currentLocation;

}
