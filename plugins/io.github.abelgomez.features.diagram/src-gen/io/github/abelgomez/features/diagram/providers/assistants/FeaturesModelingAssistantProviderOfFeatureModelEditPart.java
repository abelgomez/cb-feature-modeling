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
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import io.github.abelgomez.features.diagram.providers.FeaturesElementTypes;
import io.github.abelgomez.features.diagram.providers.FeaturesModelingAssistantProvider;

/**
 * @generated
 */
public class FeaturesModelingAssistantProviderOfFeatureModelEditPart extends FeaturesModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FeaturesElementTypes.Feature_2003);
		types.add(FeaturesElementTypes.ConstraintsSet_2004);
		return types;
	}

}
