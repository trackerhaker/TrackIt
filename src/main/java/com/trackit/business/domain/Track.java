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


import java.util.Date;
import java.util.List;

import javax.swing.ImageIcon;

import com.trackit.business.common.FileType;
import com.trackit.business.common.Messages;
import com.trackit.business.exception.TrackItException;
import com.trackit.business.utilities.decoratedlist.EventListener;
import com.trackit.business.utilities.decoratedlist.ListEvent;
import com.trackit.presentation.utilities.ImageUtilities;
import com.trackit.presentation.view.folder.FolderView;

public abstract class Track extends TrackItBaseType implements DocumentItem, EventListener<Trackpoint>{


	private static ImageIcon icon = ImageUtilities.createImageIcon("track_16.png");
	
	private Date startTime;
	private Date endTime;
	
	public Track() {
		super();
	}
	
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
//		System.out.println( "Setting start time to " + startTime + "  by " + getParent().getDocumentItemName());
int x=0;
try {
	int y = 30 /x;
} catch (Exception e) {
//	e.printStackTrace();
}
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
//		System.out.println( "Setting end time to " + endTime + "  by " + getParent().getDocumentItemName());
		this.endTime = endTime;
	}

	public static ImageIcon getIcon() {
		return icon;
	}
	
	public abstract List<Trackpoint> getTrackpoints();
	
	@Override
	public void processEvent(ListEvent<Trackpoint> event) {
		switch(event.getEvent()) {
		case AFTER_ADD:
			break;
		
		case AFTER_REMOVE:
			break;
		
		case AFTER_REMOVE_ALL:
			break;
			
		default:
		}
	}

	public String getFolderTreeItemName() {
		return Messages.getMessage("folderView.label.trackId", getId());
	}

	public ImageIcon getOpenIcon() {
		return icon;
	}

	public ImageIcon getClosedIcon() {
		return icon;
	}

	public ImageIcon getLeafIcon() {
		return icon;
	}

	public void publishEvent(FolderView view) {
	}
	
	public FileType[] getExportFileTypes() {
		return new FileType[0];
	}
	
	public void accept(Visitor visitor) throws TrackItException {
		visitor.visit(this);
	}
}
