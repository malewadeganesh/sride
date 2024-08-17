package com.krushisampann.sride.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {
double calculateDistnce(Point src, Point dest);
}
