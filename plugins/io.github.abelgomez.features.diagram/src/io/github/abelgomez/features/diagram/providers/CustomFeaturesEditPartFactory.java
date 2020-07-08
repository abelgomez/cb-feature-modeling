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
package io.github.abelgomez.features.diagram.providers;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import io.github.abelgomez.features.diagram.edit.parts.CustomStructuralRelationship2EditPart;
import io.github.abelgomez.features.diagram.edit.parts.CustomStructuralRelationshipEditPart;
import io.github.abelgomez.features.diagram.edit.parts.CustomUsesEditPart;
import io.github.abelgomez.features.diagram.edit.parts.FeaturesEditPartFactory;
import io.github.abelgomez.features.diagram.edit.parts.StructuralRelationship2EditPart;
import io.github.abelgomez.features.diagram.edit.parts.StructuralRelationshipEditPart;
import io.github.abelgomez.features.diagram.edit.parts.UsesEditPart;
import io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry;

public class CustomFeaturesEditPartFactory extends FeaturesEditPartFactory  {

	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (FeaturesVisualIDRegistry.getVisualID(view)) {

			case StructuralRelationshipEditPart.VISUAL_ID:
				return new CustomStructuralRelationshipEditPart(view);

			case StructuralRelationship2EditPart.VISUAL_ID:
				return new CustomStructuralRelationship2EditPart(view);

			case UsesEditPart.VISUAL_ID:
				return new CustomUsesEditPart(view);

			}
		}
		return super.createEditPart(context, model);
	}
}