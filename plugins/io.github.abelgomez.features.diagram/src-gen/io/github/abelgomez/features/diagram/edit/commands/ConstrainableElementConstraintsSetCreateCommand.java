/*
 * Copyright (c) 2020 Abel G�mez.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Abel G�mez (abel@gomez.llana.me) - initial API and implementation
 */
package io.github.abelgomez.features.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import io.github.abelgomez.features.ConstrainableElement;
import io.github.abelgomez.features.ConstraintsSet;
import io.github.abelgomez.features.diagram.edit.policies.FeaturesBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ConstrainableElementConstraintsSetCreateCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final EObject source;

	/**
	* @generated
	*/
	private final EObject target;

	/**
	* @generated
	*/
	public ConstrainableElementConstraintsSetCreateCommand(CreateRelationshipRequest request, EObject source,
			EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof ConstrainableElement) {
			return false;
		}
		if (target != null && false == target instanceof ConstraintsSet) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		return FeaturesBaseItemSemanticEditPolicy.getLinkConstraints()
				.canCreateConstrainableElementConstraintsSet_4014(getSource(), getTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}

		if (getSource() != null && getTarget() != null) {
			getSource().setConstraintsSet(getTarget());
		}
		return CommandResult.newOKCommandResult();

	}

	/**
	* @generated
	*/
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	* @generated
	*/
	protected ConstrainableElement getSource() {
		return (ConstrainableElement) source;
	}

	/**
	* @generated
	*/
	protected ConstraintsSet getTarget() {
		return (ConstraintsSet) target;
	}
}
