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
package io.github.abelgomez.features.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import io.github.abelgomez.features.diagram.providers.FeaturesElementTypes;

/**
 * @generated
 */
public class ConstrainableElementConstraintsSetItemSemanticEditPolicy extends FeaturesBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ConstrainableElementConstraintsSetItemSemanticEditPolicy() {
		super(FeaturesElementTypes.ConstrainableElementConstraintsSet_4014);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
