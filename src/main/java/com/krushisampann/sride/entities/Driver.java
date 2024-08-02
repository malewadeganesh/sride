package com.krushisampann.sride.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
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
	
//	//import from org.locationtech.jts.geom.Point;
//	//4326 for Earth Geometry--> @Column(columnDefinition ="Geometry(Point, 4326)")
//	@Column(columnDefinition ="Geometry(Point, 4326)")
//	Point currentLocation;

}
