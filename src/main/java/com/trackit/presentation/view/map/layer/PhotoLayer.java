/*
 * This file is part of Track It!.
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
package com.trackit.presentation.view.map.layer;

import static com.trackit.business.common.Messages.getMessage;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

import com.trackit.TrackIt;
import com.trackit.business.DocumentManager;
import com.trackit.business.common.Constants;
import com.trackit.business.common.Location;
import com.trackit.business.common.Pair;
import com.trackit.business.domain.DocumentItem;
import com.trackit.business.domain.PhotoContainer;
import com.trackit.business.domain.Picture;
import com.trackit.business.domain.Waypoint;
import com.trackit.business.utilities.TrackItPreferences;
import com.trackit.business.utilities.ZoomScrollPane;
import com.trackit.presentation.event.Event;
import com.trackit.presentation.event.EventListener;
import com.trackit.presentation.event.EventManager;
import com.trackit.presentation.event.EventPublisher;
import com.trackit.presentation.utilities.ImageUtilities;
import com.trackit.presentation.utilities.Operation;
import com.trackit.presentation.view.map.Map;

public class PhotoLayer extends MapLayer implements EventPublisher,
		EventListener {
	private static final long serialVersionUID = -910047315532941173L;
	private List<JButton> buttons;
	private List<Picture> pictures;

	public PhotoLayer(Map map) {
		super(map);
		this.setLayout(null);
		init();
		buttons = new ArrayList<JButton>();
		pictures = new ArrayList<Picture>();

		EventManager eventManager = EventManager.getInstance();
		eventManager.register(this);

	}

	@Override
	public MapLayerType getType() {
		return MapLayerType.PHOTO_LAYER;
	}

	private void init() {
		setOpaque(false);
		EventHandler handler = new EventHandler();
		addMouseListener(handler);
		addMouseMotionListener(handler);
		addMouseWheelListener(handler);
	}

	public void removeButtons() {
		for (JButton button : buttons) {
			remove(button);
		}
		buttons.clear();
		map.revalidate();
	}

	public void placeButtons() {
		for (Picture pic : pictures) {
//			ImageIcon thumbnail = createThumbnail(pic);		//12335: 2016-09-29
			ImageIcon thumbnail = pic.getIcon();
			Point hotSpot = new Point(16, 31);
			Waypoint waypoint = toWaypoint(pic, thumbnail, hotSpot);
			JButton button = createThumbnailButton(this, pic, waypoint);
			buttons.add(button);
			add(button);
		}
		map.revalidate();
	}

	private void openThumbnail(Picture pic) {
		@SuppressWarnings("unused")
		ZoomScrollPane pane = new ZoomScrollPane(pic.getImage(), pic.getName());
	}
	
	private Operation removePictureOperation(final Picture picture){
		String group = getMessage("operation.group.discard");
		String name = getMessage("operation.name.discard");
		String description = getMessage("operation.description.discard");
		Runnable action = new Runnable() {
			public void run() {
				int result = JOptionPane.showConfirmDialog(
						TrackIt.getApplicationFrame(),
						getMessage("operation.removePicture.confirm"),
						getMessage("warning"), JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					picture.getContainer().removePicture(picture);
				}
			}
		};

		return new Operation(group, name, description, action);
	}

	private JButton createThumbnailButton(MapLayer layer, final Picture pic,
			Waypoint thumbnailWaypoint) {
		ImageIcon icon = getIcon(thumbnailWaypoint);
		Point iconHotSpot = getIconHotSpot(thumbnailWaypoint);
		final Point position = comparePosition(getPosition(thumbnailWaypoint, icon,
				iconHotSpot, layer));
		final int imageWidth = icon.getImage().getWidth(null);
		final int imageHeight = icon.getImage().getHeight(null);

		JButton button = new JButton(icon);
		TrackItPreferences appPreferences = TrackIt.getPreferences();
		int frameColor = Integer.valueOf(appPreferences.getIntPreference(
				Constants.PrefsCategories.COLOR, null,
				Constants.ColorPreferences.THUMBNAIL_FRAME_COLOR, new Color(200, 0, 0).getRGB()));

		button.setBorder(new LineBorder(new Color(frameColor), 2));
		button.setBounds(position.x, position.y, imageWidth, imageHeight);
		button.setLocation(position);
		/*
		 * button.addActionListener(new ActionListener() {
		 * 
		 * public void actionPerformed(ActionEvent e) { // Execute when button
		 * is pressed openThumbnail(pic); } });
		 */

		button.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (SwingUtilities.isRightMouseButton(e)) {
					final Operation operation = removePictureOperation(pic);
					
					JPopupMenu menu = new JPopupMenu();
					
					JMenuItem menuItem = new JMenuItem(operation.getName());
					menuItem.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							operation.actionPerformed(null);
							map.refresh();
						}
					});
					
					menu.add(menuItem);
					menu.show(map, position.x+20, position.y+17);					
				}
				if (SwingUtilities.isLeftMouseButton(e)) {
					openThumbnail(pic);
				}
			}
		});

		return button;

	}

	private Point comparePosition(Point position) {
		int deltax = 24, deltay = 18;
		for (JButton button : buttons) {
			int dx = position.x - button.getLocation().x;
			int dy = position.y - button.getLocation().y;
			int adx = Math.abs( dx);
			int ady = Math.abs( dy);
//			System.out.print( "Position - original " + position.x + "x" + position.y);
			if ( adx <= deltax && ady <= deltay ) {
//				System.out.print( " changing ");
				if ( adx == 0 )
					adx = dx = 1;
				if ( ady == 0 )
					ady = dy = 1;
//				System.out.print( "by " + dx * deltax / adx + "x" + dy * deltay / ady);
				position.x = button.getLocation().x + dx * deltax / adx;
				position.y = button.getLocation().y - dy * deltay / ady;
//				System.out.print( " to " + position.x + " " + position.y);
			}
//			System.out.println();
		}
//		for (JButton button : buttons) {
//			if (position.x == button.getLocation().x
//					&& position.y == button.getLocation().y) {
//				position.x += 10;
//				position.y -= 5;
//			}
//			System.out.println( " - " + position.x+ "  " + position.y );
//		}
		return position;
	}

//12335: 2016-09-29: icons are generated by the Picture object
//	private ImageIcon createThumbnail(Picture pic) {
//		int width = 35;
//		BufferedImage img = pic.getImage();
//
//		int imgWidth = img.getWidth();
//		int imgHeight = img.getHeight();
//		int height = Math.abs(imgHeight * width / imgWidth);
//
//		BufferedImage resized = new BufferedImage(width, height, img.getType());
//		Graphics2D g = resized.createGraphics();
//		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
//				RenderingHints.VALUE_INTERPOLATION_BILINEAR);
//		g.drawImage(pic.getImage(), 0, 0, width, height, 0, 0, img.getWidth(),
//				img.getHeight(), null);
//		g.dispose();
//
//		return new ImageIcon(resized);
//	}

	private Waypoint toWaypoint(Picture pic, ImageIcon icon, Point hotSpot) {

		Waypoint waypoint = new Waypoint(pic.getLatitude(), pic.getLongitude(),
				pic.getAltitude(), pic.getName(), pic.getTimestamp());

		waypoint.setIcon(icon, hotSpot);

		final float scale = 1.2f;//		System.out.println( icon.getIconWidth() + " x " + icon.getIconHeight());
		ImageIcon selectedIcon = getScaledIcon(icon, scale);//		System.out.println( selectedIcon.getIconWidth() + " x " + selectedIcon.getIconHeight());
		int x = (int) (selectedIcon.getIconWidth() / 2.0f);
		int y = (int) (selectedIcon.getIconHeight());
		Point selectedIconHotSpot = new Point(x, y);
		waypoint.setSelectedIcon(selectedIcon, selectedIconHotSpot);
//		System.out.println( "Icon: " + icon.getIconWidth() + " x " + icon.getIconHeight() +
//				"\tScaled: " + selectedIcon.getIconWidth() + " x " + selectedIcon.getIconHeight() +
//				"\thotspot: " + selectedIconHotSpot.getX() + " x " + selectedIconHotSpot.getY()
//				);

		return waypoint;
	}

	private ImageIcon getScaledIcon(ImageIcon icon, float factor) {
		return new ImageIcon(getScaledImage(icon.getImage(), factor));
	}

	private BufferedImage getScaledImage(Image image, float factor) {
		return ImageUtilities.resize(image,
				(int) (image.getWidth(null) * factor),
				(int) (image.getHeight(null) * factor));
	}

	private ImageIcon getIcon(Waypoint waypoint) {
		return waypoint.getIcon();
	}

	private Point getIconHotSpot(Waypoint waypoint) {
		return waypoint.getIconHotSpot();
	}

	private Point getPosition(Waypoint waypoint, ImageIcon icon,
			Point iconHotSpot, MapLayer layer) {
		Location location = new Location(waypoint.getLongitude(),
				waypoint.getLatitude());
		Pair<Integer, Integer> centerOffset = layer.getMapProvider()
				.getCenterOffsetInPixels(location);

		final int screenCenterX = layer.getWidth() / 2;
		final int screenCenterY = layer.getHeight() / 2;

		int x = screenCenterX + centerOffset.getFirst() - iconHotSpot.x;
		int y = screenCenterY + centerOffset.getSecond() - iconHotSpot.y;

		return new Point(x, y);
	}

	private class EventHandler implements MouseListener, MouseMotionListener,
			MouseWheelListener {

		@Override
		public void mouseWheelMoved(MouseWheelEvent event) {
			redispatchMouseWheelEvent(event);
			removeButtons();
			placeButtons();
		}

		@Override
		public void mouseDragged(MouseEvent event) {
			redispatchMouseEvent(event);
		}

		@Override
		public void mouseMoved(MouseEvent event) {
			redispatchMouseEvent(event);
		}

		@Override
		public void mouseClicked(MouseEvent event) {
			redispatchMouseEvent(event);
		}

		@Override
		public void mousePressed(MouseEvent event) {
			redispatchMouseEvent(event);
		}

		@Override
		public void mouseReleased(MouseEvent event) {
			redispatchMouseEvent(event);
		}

		@Override
		public void mouseEntered(MouseEvent event) {
			redispatchMouseEvent(event);
		}

		@Override
		public void mouseExited(MouseEvent event) {
			redispatchMouseEvent(event);
		}

		private void redispatchMouseEvent(MouseEvent event) {
			EventsLayer eventsLayer = (EventsLayer) map
					.getLayer(MapLayerType.EVENTS_LAYER);
			eventsLayer.dispatchEvent(new MouseEvent(eventsLayer,
					event.getID(), event.getWhen(), event.getModifiers(), event
							.getX(), event.getY(), event.getClickCount(), event
							.isPopupTrigger()));
		}

		private void redispatchMouseWheelEvent(MouseWheelEvent event) {
			EventsLayer eventsLayer = (EventsLayer) map
					.getLayer(MapLayerType.EVENTS_LAYER);
			eventsLayer.dispatchEvent(new MouseWheelEvent(eventsLayer, event
					.getID(), event.getWhen(), event.getModifiers(), event
					.getX(), event.getY(), event.getClickCount(), event
					.isPopupTrigger(), event.getScrollType(), event
					.getScrollAmount(), event.getWheelRotation()));
		}

	}

	@Override
	public void process(Event event, DocumentItem item) {
		removeButtons();
		if (event == Event.COURSE_SELECTED || event == Event.ACTIVITY_SELECTED || event == Event.ZOOM_TO_ITEM) {			
			if (item instanceof PhotoContainer) {
				PhotoContainer container = (PhotoContainer) item;
				pictures = container.getPictures();
			}			
		} if(event == Event.PICTURE_SELECTED){			
			if (item instanceof Picture){
				pictures = new ArrayList<Picture>();
				pictures.add((Picture)item);
			}
		}
		//Não funciona?
		 if( event == Event.COURSE_REMOVED   || event == Event.ACTIVITY_REMOVED  ||
			 event == Event.COURSE_DISCARDED || event == Event.ACTIVITY_DISCARDED  ){ //12335: 2018-06-29
			 if (item==DocumentManager.getInstance().getSelectedItem()){
				 pictures.clear();
			 }
		 }
		placeButtons();
	}

	@Override
	public void process(Event event, DocumentItem parent,
			List<? extends DocumentItem> items) {
		if (event == Event.PICTURES_SELECTED){
			removeButtons();
			if(!items.isEmpty()){
				if(items.get(0) instanceof Picture){
					@SuppressWarnings("unchecked")
					List<Picture> picList = (List<Picture>)items;
					PhotoContainer container = picList.get(0).getContainer();
					pictures = container.getPictures();
					placeButtons();
				}
			}
		}
	}
	
	public String toString() {
		return getMessage( "view.photoLayer.name");
	}

}
