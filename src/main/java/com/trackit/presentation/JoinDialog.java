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
package com.trackit.presentation;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.trackit.TrackIt;
import com.trackit.business.DocumentManager;
import com.trackit.business.common.Constants;
import com.trackit.business.common.Formatters;
import com.trackit.business.common.Messages;
import com.trackit.business.domain.Course;
import com.trackit.business.domain.Trackpoint;
import com.trackit.business.exception.TrackItException;
import com.trackit.business.utilities.Utilities;
import com.trackit.presentation.view.map.provider.RoutingType;
import com.trackit.presentation.view.map.provider.TransportMode;

class JoinDialog extends JDialog {
	private static final long serialVersionUID = -2970227573201328334L;
	private static final int COURSES_LIST_ROW_COUNT = 5;
	
	private List<Course> courses;
	
	private JLabel lblJoinOrder;
	private JScrollPane scrollableCoursesList;
	private JList<Course> lstCourses;
	private JButton cmdMoveUp;
	private JButton cmdMoveDown;
	private JButton cmdJoin;
	private JButton cmdCancel;
	private DefaultListModel<Course> coursesModel;
	
	JoinDialog(List<Course> courses) {
		super(TrackIt.getApplicationFrame());
		this.courses = courses;
		
		init();
	}
	
	private void init() {
		setTitle(Messages.getMessage("joinDialog.title"));
		initComponents();
		setLayout();
	}

	private void setLayout() {
		
		JLabel lblOptions = new JLabel(Messages.getMessage("editionToolbar.title.options"));
		lblOptions.setFont(lblOptions.getFont().deriveFont(Font.BOLD));
		
		JLabel lblRoutingType = new JLabel(Messages.getMessage("editionToolbar.label.routingType"));
		final JComboBox<RoutingType> routingTypeChooser = new JComboBox<>(RoutingType.values());
		routingTypeChooser.putClientProperty("JComponent.sizeVariant", "mini");
		routingTypeChooser.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				final RoutingType routingType = (RoutingType) routingTypeChooser.getSelectedItem();
				TrackIt.getPreferences().setPreference(Constants.PrefsCategories.JOIN, null,
						Constants.JoinPreferences.ROUTING_TYPE, routingType.getRoutingTypeName());
				
			}
		});
		
		JLabel lblTransportMode = new JLabel(Messages.getMessage("editionToolbar.label.transportMode"));
		final JComboBox<TransportMode> transportModeChooser = new JComboBox<>(TransportMode.values());
		transportModeChooser.putClientProperty("JComponent.sizeVariant", "mini");
		transportModeChooser.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				final TransportMode transportMode = (TransportMode) transportModeChooser.getSelectedItem();
				TrackIt.getPreferences().setPreference(Constants.PrefsCategories.JOIN, null,
						Constants.JoinPreferences.TRANSPORT_MODE, transportMode.getTransportModeName());
				
			}
		});
		
		//boolean followRoads = TrackIt.getPreferences().getBooleanPreference(
			//	Constants.PrefsCategories.JOIN, null, Constants.JoinPreferences.FOLLOW_ROADS, true);
		
		boolean followRoads = courses.get(0).getSubSport().getFollowRoads();
		JCheckBox chkFollowRoads = new JCheckBox(Messages.getMessage("editionToolbar.label.followRoads"), followRoads);
		chkFollowRoads.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				final boolean selected = ((JCheckBox) e.getSource()).isSelected();
				//TrackIt.getPreferences().setPreference(Constants.PrefsCategories.JOIN, null,
						//Constants.JoinPreferences.FOLLOW_ROADS, selected);
				courses.get(0).getSubSport().setFollowRoads(selected);
			}
		});
		
		boolean avoidHighways = TrackIt.getPreferences().getBooleanPreference(
				Constants.PrefsCategories.JOIN, null, Constants.JoinPreferences.AVOID_HIGHWAYS, true);
		JCheckBox chkAvoidHighways = new JCheckBox(Messages.getMessage("editionToolbar.label.avoidHighways"), avoidHighways);
		chkAvoidHighways.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				final boolean selected = ((JCheckBox) e.getSource()).isSelected();
				TrackIt.getPreferences().setPreference(Constants.PrefsCategories.JOIN, null,
						Constants.JoinPreferences.AVOID_HIGHWAYS, selected);
			}
		});
		
		boolean avoidTollRoads = TrackIt.getPreferences().getBooleanPreference(
				Constants.PrefsCategories.JOIN, null, Constants.JoinPreferences.AVOID_TOLL_ROADS, true);
		JCheckBox chkAvoidTollRoads = new JCheckBox(Messages.getMessage("editionToolbar.label.avoidTollRoads"), avoidTollRoads);
		chkAvoidTollRoads.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				final boolean selected = ((JCheckBox) e.getSource()).isSelected();
				TrackIt.getPreferences().setPreference(Constants.PrefsCategories.JOIN, null,
						Constants.JoinPreferences.AVOID_TOLL_ROADS, selected);
			}
		});
		
		boolean addCoursePointsAtJunctions = TrackIt.getPreferences().getBooleanPreference(
				Constants.PrefsCategories.JOIN, null, Constants.JoinPreferences.ADD_COURSE_POINTS_AT_JUNCTIONS, true);
		JCheckBox chkAddCoursePointsAtJunctions = new JCheckBox(
				Messages.getMessage("editionToolbar.label.addCoursePointsAtJunctions"), addCoursePointsAtJunctions);
		chkAddCoursePointsAtJunctions.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				final boolean selected = ((JCheckBox) e.getSource()).isSelected();
				TrackIt.getPreferences().setPreference(Constants.PrefsCategories.JOIN, null,
						Constants.JoinPreferences.ADD_COURSE_POINTS_AT_JUNCTIONS, selected);
			}
		});
		
		//58406##################################################################################################################
		boolean keepOriginalTimesAtRemoval = TrackIt.getPreferences().getBooleanPreference(
				Constants.PrefsCategories.JOIN, null, Constants.JoinPreferences.KEEP_ORIGINAL_TIMES_AT_POINT_REMOVAL, true);
		JCheckBox chkKeepOriginalTimesAtRemoval = new JCheckBox(
				Messages.getMessage("editionToolbar.label.keepOriginalTimesAtRemoval"), keepOriginalTimesAtRemoval);
		chkKeepOriginalTimesAtRemoval.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				final boolean selected = ((JCheckBox) e.getSource()).isSelected();
				TrackIt.getPreferences().setPreference(Constants.PrefsCategories.JOIN, null,
						Constants.JoinPreferences.KEEP_ORIGINAL_TIMES_AT_POINT_REMOVAL, selected);
			}
		});
		//#######################################################################################################################
		
		
		JLabel lblActions = new JLabel(Messages.getMessage("editionToolbar.title.actions"));
		lblActions.setFont(lblActions.getFont().deriveFont(Font.BOLD));
		
		//JButton cmdUndoLastAction = new JButton(Messages.getMessage("editionToolbar.label.undoLastAction"));
		//cmdUndoLastAction.setEnabled(false);
		
		
		
		GroupLayout layout = new GroupLayout(getContentPane());
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		getContentPane().setLayout(layout);

				
					//.addComponent(cmdUndoLastAction)
		layout.setHorizontalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(lblJoinOrder)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addComponent(scrollableCoursesList)
										.addGroup(layout.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(cmdJoin)
												.addComponent(cmdCancel)))
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(cmdMoveUp)
										.addComponent(cmdMoveDown)))
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(lblOptions)
						.addGroup(layout.createSequentialGroup()
								.addComponent(lblRoutingType)
								.addComponent(routingTypeChooser))
						.addGroup(layout.createSequentialGroup()
								.addComponent(lblTransportMode)
								.addComponent(transportModeChooser))
						.addComponent(chkFollowRoads)
						.addComponent(chkAvoidHighways)
						.addComponent(chkAvoidTollRoads)
						.addComponent(chkAddCoursePointsAtJunctions)
						.addComponent(chkKeepOriginalTimesAtRemoval)//58406
));

		layout.setVerticalGroup(
				layout.createSequentialGroup()
						.addComponent(lblJoinOrder)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(scrollableCoursesList)
								.addGroup(layout.createSequentialGroup()
										.addComponent(cmdMoveUp)
										.addComponent(cmdMoveDown)))
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(cmdJoin)
								.addComponent(cmdCancel))
						.addGroup(layout.createSequentialGroup()
								.addComponent(lblOptions)
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(lblRoutingType)
										.addComponent(routingTypeChooser))
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(lblTransportMode)
										.addComponent(transportModeChooser))
								.addComponent(chkFollowRoads)
								.addComponent(chkAvoidHighways)
								.addComponent(chkAvoidTollRoads)
								.addComponent(chkAddCoursePointsAtJunctions)
								.addComponent(chkKeepOriginalTimesAtRemoval)//58406
								
								));
		
		getRootPane().setDefaultButton(cmdJoin);
		
		pack();
		setModal(true);
		setResizable(false);
		setLocationRelativeTo(TrackIt.getApplicationFrame());
	}

	private void initComponents() {
		lblJoinOrder = new JLabel(Messages.getMessage("joinDialog.label.joinOrder"));
		
		initCmdMoveUp();
        initCmdMoveDown();
		initCoursesList();
		initOptions();
		
		cmdJoin = new JButton(Messages.getMessage("joinDialog.button.join"));
		cmdJoin.addActionListener(new JoinCmdActionListener());
		
		cmdCancel = new JButton(Messages.getMessage("trackIt.cmdCancel"));
		cmdCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				dispose();
			}
		});
	}
	
	private void initOptions(){
		
	}

	private void initCoursesList() {
		initCoursesListModel();
		
		lstCourses = new JList<Course>(coursesModel);
		lstCourses.setPrototypeCellValue(new Course() {
			@Override
			public String toString() {
				return "Course (course longCourseName)";
			}
		});
		lstCourses.setVisibleRowCount(COURSES_LIST_ROW_COUNT);
		lstCourses.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lstCourses.addListSelectionListener(new CoursesListSelectionListener());
		lstCourses.setSelectedIndex(0);
		
		scrollableCoursesList = new JScrollPane(lstCourses);
		scrollableCoursesList.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollableCoursesList.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}

	private void initCoursesListModel() {
		coursesModel = new DefaultListModel<>();
		for (Course course : courses) {
			coursesModel.addElement(course);
		}
	}

	private void initCmdMoveUp() {
		URL imageURL = JoinDialog.class.getResource("/icons/arrow_up.png");
		ImageIcon icon = new ImageIcon(imageURL, Messages.getMessage("joinDialog.tooltip.moveUp"));
		
		cmdMoveUp = new JButton();
        cmdMoveUp.setIcon(icon);
        cmdMoveUp.setToolTipText(Messages.getMessage("joinDialog.tooltip.moveUp"));
        cmdMoveUp.setEnabled(false);
        cmdMoveUp.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent event) {
				int selectedItemIndex = lstCourses.getSelectedIndex();
				Course selectedCourse = coursesModel.remove(selectedItemIndex);
				selectedItemIndex--;
				coursesModel.add(selectedItemIndex, selectedCourse);
				lstCourses.setSelectedIndex(selectedItemIndex);
			}
		});
	}
	
	private void initCmdMoveDown() {
		URL imageURL = JoinDialog.class.getResource("/icons/arrow_down.png");;
		ImageIcon icon = new ImageIcon(imageURL, Messages.getMessage("joinDialog.tooltip.moveDown"));
		
		cmdMoveDown = new JButton();
        cmdMoveDown.setIcon(icon);
        cmdMoveDown.setToolTipText(Messages.getMessage("joinDialog.tooltip.moveDown"));
        cmdMoveDown.setEnabled(false);
        cmdMoveDown.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent event) {
				int selectedItemIndex = lstCourses.getSelectedIndex();
				Course selectedCourse = coursesModel.remove(selectedItemIndex);
				selectedItemIndex++;
				coursesModel.add(selectedItemIndex, selectedCourse);
				lstCourses.setSelectedIndex(selectedItemIndex);
			}
		});
	}
	
	private final class JoinCmdActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			List<Course> joiningCourses = Collections.list(coursesModel.elements());
			try {
				join(joiningCourses);
			} catch (TrackItException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		private void join(List<Course> joiningCourses) throws TrackItException {
			if (validJoin(joiningCourses)) {
				final Map<String, Object> options = new HashMap<String, Object>();
				options.put(Constants.JoinOperation.COURSES, joiningCourses);
				boolean merge = mergeJoin(joiningCourses);
				
				final Map<String, Object> undoOptions = new HashMap<String, Object>();
				undoOptions.put(Constants.ExtraUndoOptions.ADD_TO_MANAGER, true);
				undoOptions.put(Constants.ExtraUndoOptions.SPLIT_UNDO, false);
				undoOptions.put(Constants.ExtraUndoOptions.JOIN_UNDO, false);
				undoOptions.put(Constants.ExtraUndoOptions.APPEND_UNDO, false);
				
				
				final double minimumDistance = getMinimumDistance();
				DocumentManager.getInstance().join(joiningCourses, merge, minimumDistance, undoOptions);
				
				JoinDialog.this.dispose();
			}
		}
		
		private boolean mergeJoin(List<Course> joiningCourses) {
			boolean merge = true;

			final double minimumDistance = getMinimumDistance();
			Trackpoint trailingTrackpoint;
			Trackpoint leadingTrackpoint;
			double distance;
			
			for (int i = 0; i < joiningCourses.size() - 1; i++) {
				trailingTrackpoint = joiningCourses.get(i).getLastTrackpoint();
				leadingTrackpoint = joiningCourses.get(i + 1).getFirstTrackpoint();
				distance = calculateDistance(trailingTrackpoint, leadingTrackpoint) * 1000.0;
				
				if (distance > minimumDistance) {
					merge = false;
				}
			}
			
			return merge;
		}

		private boolean validJoin(List<Course> joiningCourses) {
			boolean validJoin = true;
			//boolean minDistance = false;
			
			
						
			if (!warnDistanceExceeded() && !warnDistanceBelow()) {
				return validJoin;
			}
			
			final double warningDistance = getWarningDistance();
			Trackpoint trailingTrackpoint;
			Trackpoint leadingTrackpoint;
			double distance;
			
			for (int i = 0; i < joiningCourses.size() - 1; i++) {
				trailingTrackpoint = joiningCourses.get(i).getLastTrackpoint();
				leadingTrackpoint = joiningCourses.get(i + 1).getFirstTrackpoint();
				distance = calculateDistance(trailingTrackpoint, leadingTrackpoint) * 1000.0;
				
				if (distance > warningDistance) {
					validJoin = false;
					
				}
			}
			
			if (!validJoin) {
				int option = JOptionPane.showConfirmDialog(TrackIt.getApplicationFrame(),
						Messages.getMessage("joinDialog.message.warningDistanceExceeded", Formatters.getFormatedDistance(warningDistance)),
						Messages.getMessage("trackIt.warning"), JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				validJoin = (option == JOptionPane.YES_OPTION); 
			}
			/*if (minDistance) {
				int option = JOptionPane.showConfirmDialog(TrackIt.getApplicationFrame(),
						Messages.getMessage("joinDialog.message.warningDistanceDelow", Formatters.getFormatedDistance(minimumDistance)),
						Messages.getMessage("trackIt.warning"), JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				validJoin = (option == JOptionPane.YES_OPTION); 
			}*/
			
			return validJoin;
		}

		private boolean warnDistanceExceeded() {
			return TrackIt.getPreferences().getBooleanPreference(Constants.PrefsCategories.JOIN, null,
					Constants.JoinPreferences.WARN_DISTANCE_EXCEEDED, Boolean.TRUE);
		}
		
		private boolean warnDistanceBelow() {
			return TrackIt.getPreferences().getBooleanPreference(Constants.PrefsCategories.JOIN, null,
					Constants.JoinPreferences.WARN_DISTANCE_BELOW, Boolean.TRUE);
		}
		
		private double getWarningDistance() {
			//return TrackIt.getPreferences().getDoublePreference(Constants.PrefsCategories.JOIN, null,
					//Constants.JoinPreferences.WARNING_DISTANCE, 100.0);
			double warningDistance = DocumentManager.getInstance().getDatabase().getJoinMaximumWarningDistance(
					courses.get(0).getSport(), courses.get(0).getSubSport(), false);
			return warningDistance;
		}
		
		private double getMinimumDistance() {
			/*return TrackIt.getPreferences().getDoublePreference(Constants.PrefsCategories.JOIN, null,
					Constants.JoinPreferences.MINIMUM_DISTANCE, 1.0);*/
			return DocumentManager.getInstance().getDatabase().getJoinMergeDistanceTolerance(
					courses.get(0).getSport(), courses.get(0).getSubSport(), false);
		}

		private Double calculateDistance(Trackpoint trailingTrackpoint, Trackpoint leadingTrackpoint) {
			return Utilities.getGreatCircleDistance(trailingTrackpoint.getLatitude(), trailingTrackpoint.getLongitude(),
					leadingTrackpoint.getLatitude(), leadingTrackpoint.getLongitude());
		}
	}

	private final class CoursesListSelectionListener implements ListSelectionListener {
		@Override
		public void valueChanged(ListSelectionEvent event) {
			if (!event.getValueIsAdjusting()) {
				updateMoveButtons();
			}
		}
		
		private void updateMoveButtons() {
			cmdMoveUp.setEnabled(canMoveUp());
			cmdMoveDown.setEnabled(canMoveDown());
		}
		
		private boolean canMoveUp() {
			return (lstCourses.getSelectedIndex() > 0);
		}
		
		private boolean canMoveDown() {
			return (lstCourses.getSelectedIndex() < (coursesModel.getSize() - 1) && coursesModel
					.getSize() > 1);
		}
	}
}
