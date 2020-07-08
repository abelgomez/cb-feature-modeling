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
import io.github.abelgomez.features.diagram.providers.FeaturesElementTypes;
import io.github.abelgomez.features.diagram.providers.FeaturesModelingAssistantProvider;

/**
 * @generated
 */
public class FeaturesModelingAssistantProviderOfFeatureEditPart extends FeaturesModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(FeaturesElementTypes.Group_3005);
		types.add(FeaturesElementTypes.Group_3006);
		types.add(FeaturesElementTypes.Attribute_3007);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((FeatureEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(FeatureEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(FeaturesElementTypes.StructuralRelationship_4008);
		types.add(FeaturesElementTypes.StructuralRelationship_4009);
		types.add(FeaturesElementTypes.Implies_4010);
		types.add(FeaturesElementTypes.Biconditional_4011);
		types.add(FeaturesElementTypes.Excludes_4012);
		types.add(FeaturesElementTypes.Uses_4013);
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
		return doGetRelTypesOnSourceAndTarget((FeatureEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(FeatureEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof FeatureEditPart) {
			types.add(FeaturesElementTypes.StructuralRelationship_4008);
		}
		if (targetEditPart instanceof FeatureEditPart) {
			types.add(FeaturesElementTypes.StructuralRelationship_4009);
		}
		if (targetEditPart instanceof FeatureEditPart) {
			types.add(FeaturesElementTypes.Implies_4010);
		}
		if (targetEditPart instanceof FeatureEditPart) {
			types.add(FeaturesElementTypes.Biconditional_4011);
		}
		if (targetEditPart instanceof FeatureEditPart) {
			types.add(FeaturesElementTypes.Excludes_4012);
		}
		if (targetEditPart instanceof FeatureEditPart) {
			types.add(FeaturesElementTypes.Uses_4013);
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
		return doGetTypesForTarget((FeatureEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(FeatureEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FeaturesElementTypes.StructuralRelationship_4008) {
			types.add(FeaturesElementTypes.Feature_2003);
		} else if (relationshipType == FeaturesElementTypes.StructuralRelationship_4009) {
			types.add(FeaturesElementTypes.Feature_2003);
		} else if (relationshipType == FeaturesElementTypes.Implies_4010) {
			types.add(FeaturesElementTypes.Feature_2003);
		} else if (relationshipType == FeaturesElementTypes.Biconditional_4011) {
			types.add(FeaturesElementTypes.Feature_2003);
		} else if (relationshipType == FeaturesElementTypes.Excludes_4012) {
			types.add(FeaturesElementTypes.Feature_2003);
		} else if (relationshipType == FeaturesElementTypes.Uses_4013) {
			types.add(FeaturesElementTypes.Feature_2003);
		} else if (relationshipType == FeaturesElementTypes.ConstrainableElementConstraintsSet_4014) {
			types.add(FeaturesElementTypes.ConstraintsSet_2004);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((FeatureEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(FeatureEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(FeaturesElementTypes.StructuralRelationship_4008);
		types.add(FeaturesElementTypes.StructuralRelationship_4009);
		types.add(FeaturesElementTypes.Implies_4010);
		types.add(FeaturesElementTypes.Biconditional_4011);
		types.add(FeaturesElementTypes.Excludes_4012);
		types.add(FeaturesElementTypes.Uses_4013);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((FeatureEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(FeatureEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FeaturesElementTypes.StructuralRelationship_4008) {
			types.add(FeaturesElementTypes.Feature_2003);
			types.add(FeaturesElementTypes.Group_3005);
			types.add(FeaturesElementTypes.Group_3006);
		} else if (relationshipType == FeaturesElementTypes.StructuralRelationship_4009) {
			types.add(FeaturesElementTypes.Feature_2003);
			types.add(FeaturesElementTypes.Group_3005);
			types.add(FeaturesElementTypes.Group_3006);
		} else if (relationshipType == FeaturesElementTypes.Implies_4010) {
			types.add(FeaturesElementTypes.Feature_2003);
		} else if (relationshipType == FeaturesElementTypes.Biconditional_4011) {
			types.add(FeaturesElementTypes.Feature_2003);
		} else if (relationshipType == FeaturesElementTypes.Excludes_4012) {
			types.add(FeaturesElementTypes.Feature_2003);
		} else if (relationshipType == FeaturesElementTypes.Uses_4013) {
			types.add(FeaturesElementTypes.Feature_2003);
		}
		return types;
	}

}
