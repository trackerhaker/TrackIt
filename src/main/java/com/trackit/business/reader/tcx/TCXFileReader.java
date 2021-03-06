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
package com.trackit.business.reader.tcx;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import com.trackit.TrackIt;
import com.trackit.business.common.Constants;
import com.trackit.business.domain.Activity;
import com.trackit.business.domain.Course;
import com.trackit.business.domain.GPSDocument;
import com.trackit.business.exception.ReaderException;
import com.trackit.business.reader.ReaderTemplate;


public class TCXFileReader extends ReaderTemplate implements ErrorHandler {
	private Logger logger = Logger.getLogger(TCXFileReader.class.getName());
	
	public TCXFileReader() {
		this(new HashMap<String, Object>());
	}
	
	public TCXFileReader(Map<String, Object> options) {
		super(options);
		
		boolean validateDocument = TrackIt.getPreferences().getBooleanPreference(Constants.PrefsCategories.READER, null,
				Constants.Reader.VALIDATE_DOCUMENT, false);
		this.options.put(Constants.Reader.VALIDATE_DOCUMENT, validateDocument);
	}
	
	public GPSDocument read(InputStream inputStream, String filePath) throws ReaderException {//58406
		GPSDocument document = readXMLFile(inputStream, new TCXHandler(options), this);
		document.setFileName(filePath);
		for(Activity a : document.getActivities()){
			if(a.getTrackpoints().get(0).getSpeed() != null)
				a.setNoSpeedInFile(false);
		}
		for(Course c : document.getCourses()){
			if(c.getTrackpoints().get(0).getSpeed() != null)
				c.setNoSpeedInFile(false);
		}
		return document;
	}

	@Override
	public void warning(SAXParseException e) throws SAXException {
		logger.error(e.getMessage());
		throw new SAXException(e.getMessage());
    }

	@Override
    public void error(SAXParseException e) throws SAXException {
    	logger.error(e.getMessage());
    	throw e;
    }

	@Override
    public void fatalError(SAXParseException e) throws SAXException {
    	logger.error(e.getMessage());
    	throw e;
    }
}