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

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.gmf.runtime.gef.ui.figures.SlidableAnchor;

public class CustomSlidableAnchor extends SlidableAnchor {

	public CustomSlidableAnchor(IFigure f) {
		super(f);
	}
	
	public CustomSlidableAnchor(IFigure f, PrecisionPoint p) {
		super(f, p);
	}
	
	public Point getLocation(Point reference) {
		Point ownReference = normalizeToStraightlineTolerance(reference, getReferencePoint(), 3);
		
		Point location = getLocation(ownReference, reference);
		if (location == null) {
			location = getLocation(new PrecisionPoint(getBox().getCenter()), reference);
			if (location == null) {
				location = getBox().getCenter();
			}
		}
		
		if (reference.y < getBox().getCenter().y) {
			return getBox().getTop();
		} else if (location.x <= getBox().getBottomLeft().x) {
			return getBox().getBottomLeft();
		} else if (location.x >= getBox().getBottomRight().x) {
			return getBox().getBottomRight();
		} 
		
		return location;
	}
}
