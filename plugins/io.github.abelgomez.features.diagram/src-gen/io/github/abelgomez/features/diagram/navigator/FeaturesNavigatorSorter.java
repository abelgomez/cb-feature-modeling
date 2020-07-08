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
package io.github.abelgomez.features.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry;

/**
 * @generated
 */
public class FeaturesNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7006;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof FeaturesNavigatorItem) {
			FeaturesNavigatorItem item = (FeaturesNavigatorItem) element;
			return FeaturesVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
