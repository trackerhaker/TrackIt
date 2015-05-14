/*
 * This file is part of Track It!.
 * Copyright (C) 2013 Henrique Malheiro
 * Copyright (C) 2015 Pedro Gomes
 * 
 * TrackIt! is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Track It! is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Track It!. If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package com.henriquemalheiro.trackit.presentation.view.map.provider.bingmaps.elevation;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;

import com.henriquemalheiro.trackit.business.common.Location;
import com.henriquemalheiro.trackit.business.exception.TrackItException;
import com.henriquemalheiro.trackit.business.utility.Connection;

public class Elevation {
	private static final String SERVER = "http://dev.virtualearth.net";
	private static final String API_KEY = "AlmJ16Pgk8XSCVmfTLzXzSOJhofcHKFymy__9ZnJwOH_Cu1d1RfiAixZHhmEcKrG";
//	private static final String URL_SINGLE_POINT = "%s/REST/v1/Elevation/List?heights=ellipsoid&output=xml&key=%s&points=";
	private static final String URL_COMPRESSED_POINTS = "%s/REST/v1/Elevation/List?heights=sealevel&output=xml&key=%s&points=%s";
	
	private static Logger logger = Logger.getLogger(Elevation.class.getName());
	
	public static void fetchElevation(Location location) throws TrackItException {
		fetchElevations(Arrays.asList(location));
	}
	
	public static void fetchElevations(List<Location> locations) throws TrackItException {
		List<Integer> elevations = getElevations(locations);
		for (int i = 0; i < locations.size(); i++) {
			locations.get(i).setAltitude(elevations.get(i));
		}
	}
	
	public static List<Integer> getElevations(List<Location> locations) throws TrackItException {
		try {
			StringBuilder url = new StringBuilder(String.format(Locale.ENGLISH, URL_COMPRESSED_POINTS,
					SERVER, API_KEY, PointCompression.compress(locations)));
			logger.debug(url);
			
	        JAXBContext context = JAXBContext.newInstance(Response.class);
	        Unmarshaller unmarshaller = context.createUnmarshaller();
	        
	        InputStream inputStream = Connection.getInstance().getResource(url.toString());
	        Response response = (Response) unmarshaller.unmarshal(inputStream);
	        inputStream.close();
	        
	        if (response == null) {
	        	throw new TrackItException("Unable to fetch elevation.");
	        }
	        
	        return (response.getResourceSets().get(0).getResources().get(0).getElevations());
		} catch (JAXBException e) {
			logger.error("Unable to fetch elevation data: " + e.getMessage());
			throw new TrackItException("Unable to fetch elevation.");
		} catch (IOException e) {
			logger.error("Unable to fetch elevation data: " + e.getMessage());
			throw new TrackItException("Unable to fetch elevation.");
		}
	}
	
	public static void main(String[] args) throws TrackItException {
//		Location location = new Location(-9.20276875, 38.71617165);
//		int elevation = getElevation(location);
//		System.out.println("Elevation for location " + location + ": " + elevation);
	}
}
