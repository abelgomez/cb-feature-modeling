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
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import io.github.abelgomez.features.diagram.edit.parts.ConstraintsSetEditPart;
import io.github.abelgomez.features.diagram.edit.parts.FeatureEditPart;
import io.github.abelgomez.features.diagram.edit.parts.Group2EditPart;
import io.github.abelgomez.features.diagram.providers.FeaturesElementTypes;
import io.github.abelgomez.features.diagram.providers.FeaturesModelingAssistantProvider;

/**
 * @generated
 */
public class FeaturesModelingAssistantProviderOfGroup2EditPart extends FeaturesModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Group2EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(Group2EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(FeaturesElementTypes.StructuralRelationship_4008);
		types.add(FeaturesElementTypes.StructuralRelationship_4009);
		types.add(FeaturesElementTypes.ConstrainableElementConstraintsSet_4014);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((Group2EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(Group2EditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof FeatureEditPart) {
			types.add(FeaturesElementTypes.StructuralRelationship_4008);
		}
		if (targetEditPart instanceof FeatureEditPart) {
			types.add(FeaturesElementTypes.StructuralRelationship_4009);
		}
		if (targetEditPart instanceof ConstraintsSetEditPart) {
			types.add(FeaturesElementTypes.ConstrainableElementConstraintsSet_4014);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((Group2EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(Group2EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FeaturesElementTypes.StructuralRelationship_4008) {
			types.add(FeaturesElementTypes.Feature_2003);
		} else if (relationshipType == FeaturesElementTypes.StructuralRelationship_4009) {
			types.add(FeaturesElementTypes.Feature_2003);
		} else if (relationshipType == FeaturesElementTypes.ConstrainableElementConstraintsSet_4014) {
			types.add(FeaturesElementTypes.ConstraintsSet_2004);
		}
		return types;
	}

}
