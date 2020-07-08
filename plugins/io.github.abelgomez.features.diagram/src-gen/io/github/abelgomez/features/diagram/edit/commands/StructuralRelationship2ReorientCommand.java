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
package io.github.abelgomez.features.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import io.github.abelgomez.features.Feature;
import io.github.abelgomez.features.FeatureModel;
import io.github.abelgomez.features.RelatableElement;
import io.github.abelgomez.features.StructuralRelationship;
import io.github.abelgomez.features.diagram.edit.policies.FeaturesBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class StructuralRelationship2ReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public StructuralRelationship2ReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof StructuralRelationship) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof RelatableElement && newEnd instanceof RelatableElement)) {
			return false;
		}
		Feature target = getLink().getTo();
		if (!(getLink().eContainer() instanceof FeatureModel)) {
			return false;
		}
		FeatureModel container = (FeatureModel) getLink().eContainer();
		return FeaturesBaseItemSemanticEditPolicy.getLinkConstraints().canExistStructuralRelationship_4009(container,
				getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Feature && newEnd instanceof Feature)) {
			return false;
		}
		RelatableElement source = getLink().getFrom();
		if (!(getLink().eContainer() instanceof FeatureModel)) {
			return false;
		}
		FeatureModel container = (FeatureModel) getLink().eContainer();
		return FeaturesBaseItemSemanticEditPolicy.getLinkConstraints().canExistStructuralRelationship_4009(container,
				getLink(), source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setFrom(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTo(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected StructuralRelationship getLink() {
		return (StructuralRelationship) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected RelatableElement getOldSource() {
		return (RelatableElement) oldEnd;
	}

	/**
	* @generated
	*/
	protected RelatableElement getNewSource() {
		return (RelatableElement) newEnd;
	}

	/**
	* @generated
	*/
	protected Feature getOldTarget() {
		return (Feature) oldEnd;
	}

	/**
	* @generated
	*/
	protected Feature getNewTarget() {
		return (Feature) newEnd;
	}
}
