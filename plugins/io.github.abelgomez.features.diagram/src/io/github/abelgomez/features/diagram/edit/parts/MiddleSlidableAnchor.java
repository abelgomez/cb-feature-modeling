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

public class MiddleSlidableAnchor extends SlidableAnchor {

	public MiddleSlidableAnchor(IFigure f) {
		super(f);
	}
	
	public MiddleSlidableAnchor(IFigure f, PrecisionPoint p) {
		super(f, p);
	}
	
	public Point getLocation(Point reference) {
		if (reference.y < getBox().getCenter().y) {
			return getBox().getTop();
		} else {
			return getBox().getBottom();
		} 
	}
}
