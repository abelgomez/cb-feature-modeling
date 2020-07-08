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

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import io.github.abelgomez.features.diagram.edit.parts.FeatureModelEditPart;
import io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry;


public class CustomFeaturesEditPartProvider extends DefaultEditPartProvider {

	public CustomFeaturesEditPartProvider() {
		super(new CustomFeaturesEditPartFactory(), FeaturesVisualIDRegistry.TYPED_INSTANCE, FeatureModelEditPart.MODEL_ID);
	}

}
