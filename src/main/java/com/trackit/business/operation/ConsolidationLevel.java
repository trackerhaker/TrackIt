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

import com.trackit.business.common.Messages;

public enum ConsolidationLevel {
	BASIC,
	SUMMARY,
	RECALCULATION;
	
	private static final String[] labels = new String[] {
		"consolidationLevel.label.basic", "consolidationLevel.label.summary",
		"consolidationLevel.label.recalculation"
	};
	
	private static final String[] descriptions = new String[] {
		"consolidationLevel.description.basic", "consolidationLevel.description.summary",
		"consolidationLevel.description.recalculation"
	};
	
	public String getLabel() {
		return Messages.getMessage(labels[this.ordinal()]);
	}
	
	public String getDescription() {
		return Messages.getMessage(descriptions[this.ordinal()]);
	}
	
	@Override
	public String toString() {
		return getLabel();
	}
}