/**
 * Copyright (c) 2020 Abel Gómez.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Abel Gómez (abel@gomez.llana.me) - initial API and implementation
 */
package io.github.abelgomez.features.diagram.edit.parts;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class FoldedRectangle extends Shape {

	private int foldSize = 20;
	
	@Override
	protected void outlineShape(Graphics graphics) {
		Rectangle r = getBounds();

		PointList points = new PointList();
		points.addPoint(r.x + r.width - Math.max(1, lineWidth), r.y + lineWidth / 2 + foldSize);
		points.addPoint(r.x + r.width - Math.max(1, lineWidth), r.y + r.height - Math.max(1, lineWidth));
		points.addPoint(r.x + lineWidth / 2, r.y + r.height - Math.max(1, lineWidth));
		points.addPoint(r.x + lineWidth / 2, r.y + lineWidth / 2);
		points.addPoint(r.x + r.width - Math.max(1, lineWidth) - foldSize, r.y + lineWidth / 2);
		points.addPoint(r.x + r.width - Math.max(1, lineWidth) - foldSize, r.y + lineWidth / 2 + foldSize);
		points.addPoint(r.x + r.width - Math.max(1, lineWidth), r.y + lineWidth / 2 + foldSize);
		points.addPoint(r.x + r.width - Math.max(1, lineWidth) - foldSize, r.y + lineWidth / 2);
		
		graphics.drawPolyline(points);
	}

	@Override
	protected void fillShape(Graphics graphics) {
		
		Color bgColor = getBackgroundColor();
		Rectangle r = getBounds();

		PointList points = new PointList();
		points.addPoint(r.x + lineWidth / 2, r.y + lineWidth / 2);
		points.addPoint(r.x + r.width - Math.max(1, lineWidth) - foldSize, r.y + lineWidth / 2);
		points.addPoint(r.x + r.width - Math.max(1, lineWidth), r.y + lineWidth / 2 + foldSize);
		points.addPoint(r.x + r.width - Math.max(1, lineWidth), r.y + r.height - Math.max(1, lineWidth));
		points.addPoint(r.x + lineWidth / 2, r.y + r.height - Math.max(1, lineWidth));
		graphics.fillPolygon(points);
		
	
		Color foldColor = new Color(Display.getCurrent(),
				Math.min(bgColor.getRed() - 32, 255),
				Math.min(bgColor.getGreen() - 32 , 255),
				Math.min(bgColor.getBlue() - 32, 255));
		
		graphics.setBackgroundColor(foldColor);
		
		points.removeAllPoints();
		points.addPoint(r.x + r.width - Math.max(1, lineWidth) - foldSize, r.y + lineWidth / 2);
		points.addPoint(r.x + r.width - Math.max(1, lineWidth) - foldSize, r.y + lineWidth / 2 + foldSize);
		points.addPoint(r.x + r.width - Math.max(1, lineWidth), r.y + lineWidth / 2 + foldSize);
		
		graphics.fillPolygon(points);
		
		graphics.setBackgroundColor(bgColor);
		
	}
	
	public void setFoldSize(int foldSize) {
		this.foldSize = foldSize;
	}
	
}
