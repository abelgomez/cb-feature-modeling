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

import io.github.abelgomez.features.Implies;

public class CustomImpliesItemProvider extends ImpliesItemProvider {

	public CustomImpliesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Implies impliesRelationship = ((Implies) object);
		StringBuilder result = new StringBuilder();
		result.append(getString("_UI_Implies_type"));

		result.append(" <");
		result.append(impliesRelationship.getFrom() != null ? impliesRelationship.getFrom().getName() : "null");
		result.append("->");
		result.append(impliesRelationship.getTo() != null ? impliesRelationship.getTo().getName() : "null");
		result.append(">");

		return result.toString();
	}
}
