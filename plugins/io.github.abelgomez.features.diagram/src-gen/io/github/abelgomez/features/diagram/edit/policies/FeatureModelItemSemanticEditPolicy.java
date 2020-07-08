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

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import io.github.abelgomez.features.diagram.edit.commands.ConstraintsSetCreateCommand;
import io.github.abelgomez.features.diagram.edit.commands.FeatureCreateCommand;
import io.github.abelgomez.features.diagram.providers.FeaturesElementTypes;

/**
 * @generated
 */
public class FeatureModelItemSemanticEditPolicy extends FeaturesBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FeatureModelItemSemanticEditPolicy() {
		super(FeaturesElementTypes.FeatureModel_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FeaturesElementTypes.Feature_2003 == req.getElementType()) {
			return getGEFWrapper(new FeatureCreateCommand(req));
		}
		if (FeaturesElementTypes.ConstraintsSet_2004 == req.getElementType()) {
			return getGEFWrapper(new ConstraintsSetCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
