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
package com.trackit.business.domain;

import java.util.List;

import com.trackit.business.exception.TrackItException;
import com.trackit.presentation.event.Event;
import com.trackit.presentation.event.EventManager;
import com.trackit.presentation.event.EventPublisher;

public class CourseTrack extends Track {
	private Course parent;
	
	public CourseTrack(Course parent) {
		super();
		this.parent = parent;
	}
	
	//12335: 2017-03-24
	public CourseTrack clone() {
		return clone( this.parent);
	}
	
	//12335: 2017-03-24
	public CourseTrack clone( Course parent) {
		CourseTrack track = new CourseTrack( parent);
		track.setStartTime( this.getStartTime());
		track.setEndTime( this.getEndTime());
		return track;
	}
	
	//12335: 2017-03-24 - to support Course.clone();
	public CourseTrack( Course parent, Track track) {
		super();
		this.parent = parent;
	}

	@Override
	public List<Trackpoint> getTrackpoints() {
		return parent.getTrackpoints(getStartTime(), getEndTime());
	}
	
	@Override
	public Course getParent() {
		return parent;
	}
	
	@Override
	public void accept(Visitor visitor) throws TrackItException {
		visitor.visit(this);
	}

	@Override
	public void publishSelectionEvent(EventPublisher publisher) {
		EventManager.getInstance().publish(publisher, Event.TRACK_SELECTED, this);
	}
}
