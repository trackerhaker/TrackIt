
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
package com.trackit.business.operation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.trackit.TrackIt;
import com.trackit.business.common.Constants;
import com.trackit.business.domain.Course;
import com.trackit.business.domain.GPSDocument;
import com.trackit.business.exception.TrackItException;
import com.trackit.business.operation.event.OperationEvent;
import com.trackit.business.operation.event.OperationEventManager;
import com.trackit.business.utilities.TrackItPreferences;


public abstract class OperationBase implements Operation {
	private long executionTime;
	protected Map<String, Object> options;
	protected Logger logger = Logger.getLogger(OperationBase.class.getName());
	
	protected boolean processFolders;
	protected boolean processActivities;
	protected boolean processCourses;
	protected boolean processWaypoints;
	
	public OperationBase() {
		setUp();
	}
	
	public OperationBase(Map<String, Object> options) {
		this();
		this.options.putAll(options);
	}
	
	private void setUp() {
		setDefaultOptions();
		processFolders = (Boolean) options.get(Constants.Operation.PROCESS_FOLDERS);
		processActivities = (Boolean) options.get(Constants.Operation.PROCESS_ACTIVITIES);
		processCourses = (Boolean) options.get(Constants.Operation.PROCESS_COURSES);
		processWaypoints = (Boolean) options.get(Constants.Operation.PROCESS_WAYPOINTS);
	}
	
	private void setDefaultOptions() {
		options = new HashMap<String, Object>();
		setDefaultOption(Constants.Operation.PROCESS_FOLDERS, false);
		setDefaultOption(Constants.Operation.PROCESS_ACTIVITIES, true);
		setDefaultOption(Constants.Operation.PROCESS_COURSES, true);
		setDefaultOption(Constants.Operation.PROCESS_WAYPOINTS, true);
	}
	
	private void setDefaultOption(String optionName, boolean defaultValue) {
		options.put(optionName, getStoredOption(optionName, defaultValue));
	}
	
	private boolean getStoredOption(String optionName, boolean defaultValue) {
		TrackItPreferences prefs = TrackIt.getPreferences(); 
		return prefs.getBooleanPreference(Constants.PrefsCategories.OPERATION, null,
				optionName, defaultValue);
	}
	
	
	
	@Override
	public abstract String getName();
	
	@Override
	public abstract void process(GPSDocument document) throws TrackItException;
	
	@Override
	public abstract void process(List<GPSDocument> document) throws TrackItException;
	
	@Override
	public abstract void undoOperation(GPSDocument document) throws TrackItException;
	
	@Override
	public abstract void undoOperation(List<GPSDocument> document) throws TrackItException;

	@Override
	public abstract void redoOperation(GPSDocument document) throws TrackItException;
	
	@Override
	public abstract void redoOperation(List<GPSDocument> document) throws TrackItException;
	
	@Override
	public final void start(String message) {
		OperationEventManager.getInstance().publishOperationEvent(OperationEvent.OPERATION_STARTED, message);
	}
	
	@Override
	public final void finish(String message) {
		OperationEventManager.getInstance().publishOperationEvent(OperationEvent.OPERATION_FINISHED, message);
	}
	
	@Override
	public final void setProgress(int progress, String message) {
		OperationEventManager.getInstance().publishOperationEvent(OperationEvent.OPERATION_PROGRESS, Integer.valueOf(progress), message);
	}
	

	
	void startTimer() {
		executionTime = System.currentTimeMillis();
	}
	
	void stopTimer() {
		executionTime = System.currentTimeMillis() - executionTime;;
	}
	
	void logExecutionTime() {
		logger.info(String.format("Operation %s executed in " + executionTime + " miliseconds."));
	}
}

