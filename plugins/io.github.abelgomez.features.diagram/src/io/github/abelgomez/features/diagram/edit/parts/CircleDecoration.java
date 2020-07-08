/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation
 *    Abel Gómez (abel@gomez.llana.me) - minor modifications
 */

package io.github.abelgomez.features.diagram.edit.parts;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class CircleDecoration extends Ellipse implements RotatableDecoration {
	private int myRadius = 5;
	private Point myCenter = new Point();
	private double myAngle = 0;

	
	public void setRadius(int radius){
		myRadius =  Math.abs(radius);
		repaint();
	}
	
	public void setLineWidth(int width){
		super.setLineWidth(width);
	}
	
	public Rectangle getBounds() {
		if (bounds == null){
			int diameter = myRadius * 2;
			Point center = this.myCenter;
			center.x -= (int) ((myRadius) * Math.sin(myAngle));
			center.y -= (int) ((myRadius) * Math.cos(myAngle));
			bounds = new Rectangle(center.x - myRadius, center.y - myRadius, diameter, diameter);
			bounds.expand(getLineWidth() / 2, getLineWidth() / 2);
		}
		return bounds;
	}
	
	public void setLocation(Point p) {
		if (myCenter.equals(p)){
			return;
		}
		myCenter.setLocation(p);
		bounds = null;
	}
	
	public void setReferencePoint(Point p) {
		myAngle = Math.atan2(myCenter.x-p.x, myCenter.y-p.y);
	}
	

}
