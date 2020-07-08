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
package io.github.abelgomez.features.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import io.github.abelgomez.features.Feature;
import io.github.abelgomez.features.Group;
import io.github.abelgomez.features.StructuralRelationship;

public class CustomStructuralRelationshipItemProvider extends StructuralRelationshipItemProvider {

	public CustomStructuralRelationshipItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		StructuralRelationship structuralRelationship = (StructuralRelationship) object;
		return (structuralRelationship.getLowerBound() == 0)
				? overlayImage(object, getResourceLocator().getImage("full/obj16/OptionalRelationship"))
				: overlayImage(object, getResourceLocator().getImage("full/obj16/MandatoryRelationship"));

	}

	@Override
	public String getText(Object object) {
		StructuralRelationship structuralRelationship = (StructuralRelationship) object;
		StringBuilder result = new StringBuilder();

		if (structuralRelationship.getLowerBound() == 0) {
			result.append(getString("_UI_OptionalRelationship_type"));
		} else {
			result.append(getString("_UI_MandatoryRelationship_type"));
		}

		result.append(" <");

		if (structuralRelationship.getFrom() != null) {
			if (structuralRelationship.getFrom() instanceof Group) {
				result.append("Group(");
				result.append(((Group) structuralRelationship.getFrom()).getParentFeature().getName());
				result.append(")");
			} else {
				result.append(((Feature) structuralRelationship.getFrom()).getName());
			}
		} else {
			result.append("null");
		}

		result.append("->");

		if (structuralRelationship.getTo() != null) {
			result.append(structuralRelationship.getTo().getName());
		} else {
			result.append("null");
		}
		result.append(">");

		return result.toString();
	}

}
