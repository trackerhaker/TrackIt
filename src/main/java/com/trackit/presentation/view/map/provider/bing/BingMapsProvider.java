/*
 * This file is part of Track It!.
 * Copyright (C) 2018 João Brisson Lopes
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
package com.trackit.presentation.view.map.provider.bing;

import com.trackit.business.common.Location;
import com.trackit.presentation.view.map.MapType;
import com.trackit.presentation.view.map.provider.MapProvider;
import com.trackit.presentation.view.map.provider.MapProviderType;
import com.trackit.presentation.view.map.provider.SphericalMercatorMapProvider;

public class BingMapsProvider extends SphericalMercatorMapProvider implements MapProvider {

	public BingMapsProvider(MapType mapType, Location centerLocation ) {
		super(MapProviderType.BING_MAPS, mapType, centerLocation);
		tileFileExtension = "jpg";
	}	
	
}
