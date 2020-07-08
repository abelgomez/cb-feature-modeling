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
package io.github.abelgomez.features.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import io.github.abelgomez.features.diagram.edit.parts.ConstraintsSetEditPart;
import io.github.abelgomez.features.diagram.providers.FeaturesElementTypes;
import io.github.abelgomez.features.diagram.providers.FeaturesModelingAssistantProvider;

/**
 * @generated
 */
public class FeaturesModelingAssistantProviderOfConstraintsSetEditPart extends FeaturesModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(FeaturesElementTypes.Constraint_3008);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ConstraintsSetEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ConstraintsSetEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(FeaturesElementTypes.ConstrainableElementConstraintsSet_4014);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ConstraintsSetEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ConstraintsSetEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FeaturesElementTypes.ConstrainableElementConstraintsSet_4014) {
			types.add(FeaturesElementTypes.Feature_2003);
			types.add(FeaturesElementTypes.Group_3005);
			types.add(FeaturesElementTypes.Group_3006);
		}
		return types;
	}

}
