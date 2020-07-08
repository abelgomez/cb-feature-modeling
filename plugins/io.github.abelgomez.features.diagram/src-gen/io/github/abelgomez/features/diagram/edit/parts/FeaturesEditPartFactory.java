/*
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

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry;

/**
 * @generated
 */
public class FeaturesEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (FeaturesVisualIDRegistry.getVisualID(view)) {

			case FeatureModelEditPart.VISUAL_ID:
				return new FeatureModelEditPart(view);

			case FeatureEditPart.VISUAL_ID:
				return new FeatureEditPart(view);

			case FeatureNameEditPart.VISUAL_ID:
				return new FeatureNameEditPart(view);

			case ConstraintsSetEditPart.VISUAL_ID:
				return new ConstraintsSetEditPart(view);

			case GroupEditPart.VISUAL_ID:
				return new GroupEditPart(view);

			case GroupLowerBoundUpperBoundEditPart.VISUAL_ID:
				return new GroupLowerBoundUpperBoundEditPart(view);

			case Group2EditPart.VISUAL_ID:
				return new Group2EditPart(view);

			case GroupLowerBoundUpperBound2EditPart.VISUAL_ID:
				return new GroupLowerBoundUpperBound2EditPart(view);

			case AttributeEditPart.VISUAL_ID:
				return new AttributeEditPart(view);

			case ConstraintEditPart.VISUAL_ID:
				return new ConstraintEditPart(view);

			case FeatureAttributesEditPart.VISUAL_ID:
				return new FeatureAttributesEditPart(view);

			case ConstraintsSetConstraintsSetBodyEditPart.VISUAL_ID:
				return new ConstraintsSetConstraintsSetBodyEditPart(view);

			case StructuralRelationshipEditPart.VISUAL_ID:
				return new StructuralRelationshipEditPart(view);

			case StructuralRelationshipLowerBoundUpperBoundEditPart.VISUAL_ID:
				return new StructuralRelationshipLowerBoundUpperBoundEditPart(view);

			case StructuralRelationship2EditPart.VISUAL_ID:
				return new StructuralRelationship2EditPart(view);

			case StructuralRelationshipLowerBoundUpperBound2EditPart.VISUAL_ID:
				return new StructuralRelationshipLowerBoundUpperBound2EditPart(view);

			case ImpliesEditPart.VISUAL_ID:
				return new ImpliesEditPart(view);

			case BiconditionalEditPart.VISUAL_ID:
				return new BiconditionalEditPart(view);

			case ExcludesEditPart.VISUAL_ID:
				return new ExcludesEditPart(view);

			case UsesEditPart.VISUAL_ID:
				return new UsesEditPart(view);

			case UsesNameEditPart.VISUAL_ID:
				return new UsesNameEditPart(view);

			case UsesLowerBoundUpperBoundEditPart.VISUAL_ID:
				return new UsesLowerBoundUpperBoundEditPart(view);

			case ConstrainableElementConstraintsSetEditPart.VISUAL_ID:
				return new ConstrainableElementConstraintsSetEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
