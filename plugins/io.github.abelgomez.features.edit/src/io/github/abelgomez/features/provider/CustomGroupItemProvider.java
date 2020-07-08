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

import io.github.abelgomez.features.Group;
import io.github.abelgomez.features.StructuralRelationship;

public class CustomGroupItemProvider extends GroupItemProvider {

	public CustomGroupItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		Group group = (Group) object;
		return (group.getLowerBound() == 0)
				? overlayImage(object, getResourceLocator().getImage("full/obj16/SelectionGroup"))
				: overlayImage(object, getResourceLocator().getImage("full/obj16/AlternativeGroup"));

	}

	@Override
	public String getText(Object object) {
		Group group = (Group) object;
		StringBuilder result = new StringBuilder();

		if (group.getLowerBound() == 0) {
			result.append(getString("_UI_SelectionGroup_type"));
		} else {
			result.append(getString("_UI_AlternativeGroup_type"));
		}

		result.append(" <");

		result.append(group.getParentFeature() != null ? group.getParentFeature().getName() : "null");

		if (group.getChilds() != null && group.getChilds().size() > 0) {
			result.append("{");

			for (StructuralRelationship structuralRelationship : group.getChilds()) {
				result.append(
						structuralRelationship.getTo() != null ? structuralRelationship.getTo().getName() : "null");
				result.append(",");
			}
			result.deleteCharAt(result.length() - 1);
			result.append("}");
		}

		result.append(">");

		return result.toString();
	}

}
