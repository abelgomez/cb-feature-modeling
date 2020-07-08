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

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.SlidableAnchor;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import io.github.abelgomez.features.Feature;

public class CustomStructuralRelationship2EditPart extends StructuralRelationship2EditPart {

	public CustomStructuralRelationship2EditPart(View view) {
		super(view);
	}

	@Override
	protected ConnectionAnchor getSourceConnectionAnchor() {
		SlidableAnchor slidableAnchor = (SlidableAnchor) super.getSourceConnectionAnchor();
		if (getSource().getModel() instanceof Node) {
			if (((Node) getSource().getModel()).getElement() instanceof Feature) {
				MiddleSlidableAnchor newAnchor = new MiddleSlidableAnchor(slidableAnchor.getOwner());
				return newAnchor;
			}
		}
		CustomSlidableAnchor newAnchor = new CustomSlidableAnchor(slidableAnchor.getOwner());
		return newAnchor;
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connEditPart) {
		SlidableAnchor slidableAnchor = (SlidableAnchor) super.getSourceConnectionAnchor();
		if (getSource().getModel() instanceof Node) {
			if (((Node) getSource().getModel()).getElement() instanceof Feature) {
				MiddleSlidableAnchor newAnchor = new MiddleSlidableAnchor(slidableAnchor.getOwner());
				return newAnchor;
			}
		}
		CustomSlidableAnchor newAnchor = new CustomSlidableAnchor(slidableAnchor.getOwner());
		return newAnchor;
	}

	@Override
	protected ConnectionAnchor getTargetConnectionAnchor() {
		SlidableAnchor slidableAnchor = (SlidableAnchor) super.getTargetConnectionAnchor();
		MiddleSlidableAnchor newAnchor = new MiddleSlidableAnchor(slidableAnchor.getOwner());
		return newAnchor;
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connEditPart) {
		SlidableAnchor slidableAnchor = (SlidableAnchor) super.getTargetConnectionAnchor();
		MiddleSlidableAnchor newAnchor = new MiddleSlidableAnchor(slidableAnchor.getOwner());
		return newAnchor;
	}
}
