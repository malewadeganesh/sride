package com.krushisampann.sride.services.impl;

import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

import com.krushisampann.sride.services.DistanceService;

@Service
public class DistanceServiceOsrmImpl implements DistanceService{

	@Override
	public double calculateDistnce(Point src, Point dest) {
		//ToDo    :Call external API called OSRM

		return 0;
	}

}
