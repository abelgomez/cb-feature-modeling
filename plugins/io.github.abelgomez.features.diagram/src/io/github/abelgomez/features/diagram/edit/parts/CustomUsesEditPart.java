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

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.notation.View;

public class CustomUsesEditPart extends UsesEditPart {
	
	public CustomUsesEditPart(View view) {
		super(view);
	}
	
	@Override
	protected Connection createConnectionFigure() {
		return new CustomUsesRelationshipFigure();
	}
	
	public class CustomUsesRelationshipFigure extends UsesRelationshipFigure {
		
		public CustomUsesRelationshipFigure() {
			this.setLineStyle(Graphics.LINE_CUSTOM);
			this.setForegroundColor(ColorConstants.black);
			this.setLineDash(new int[] { 3, 3 });
			setTargetDecoration(createTargetDecoration());
		}
		
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setFill(false);
			df.setFillXOR(true);
			return df;
		}
	}
}
