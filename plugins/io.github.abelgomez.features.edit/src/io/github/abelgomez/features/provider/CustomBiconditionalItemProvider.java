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

import io.github.abelgomez.features.Biconditional;

public class CustomBiconditionalItemProvider extends BiconditionalItemProvider {

	public CustomBiconditionalItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Biconditional biconditionalRelationship = ((Biconditional) object);
		StringBuilder result = new StringBuilder();
		result.append(getString("_UI_Biconditional_type"));

		result.append(" <");
		result.append(
				biconditionalRelationship.getFrom() != null ? biconditionalRelationship.getFrom().getName() : "null");
		result.append("<->");
		result.append(biconditionalRelationship.getTo() != null ? biconditionalRelationship.getTo().getName() : "null");
		result.append(">");

		return result.toString();
	}

}
