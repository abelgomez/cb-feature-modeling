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

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import io.github.abelgomez.features.diagram.edit.commands.ConstrainableElementConstraintsSetCreateCommand;
import io.github.abelgomez.features.diagram.edit.commands.ConstrainableElementConstraintsSetReorientCommand;
import io.github.abelgomez.features.diagram.edit.commands.StructuralRelationship2CreateCommand;
import io.github.abelgomez.features.diagram.edit.commands.StructuralRelationship2ReorientCommand;
import io.github.abelgomez.features.diagram.edit.commands.StructuralRelationshipCreateCommand;
import io.github.abelgomez.features.diagram.edit.commands.StructuralRelationshipReorientCommand;
import io.github.abelgomez.features.diagram.edit.parts.ConstrainableElementConstraintsSetEditPart;
import io.github.abelgomez.features.diagram.edit.parts.StructuralRelationship2EditPart;
import io.github.abelgomez.features.diagram.edit.parts.StructuralRelationshipEditPart;
import io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry;
import io.github.abelgomez.features.diagram.providers.FeaturesElementTypes;

/**
 * @generated
 */
public class GroupItemSemanticEditPolicy extends FeaturesBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupItemSemanticEditPolicy() {
		super(FeaturesElementTypes.Group_3005);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (FeaturesVisualIDRegistry.getVisualID(outgoingLink) == StructuralRelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (FeaturesVisualIDRegistry.getVisualID(outgoingLink) == StructuralRelationship2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (FeaturesVisualIDRegistry
					.getVisualID(outgoingLink) == ConstrainableElementConstraintsSetEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (FeaturesElementTypes.StructuralRelationship_4008 == req.getElementType()) {
			return getGEFWrapper(new StructuralRelationshipCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (FeaturesElementTypes.StructuralRelationship_4009 == req.getElementType()) {
			return getGEFWrapper(new StructuralRelationship2CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (FeaturesElementTypes.ConstrainableElementConstraintsSet_4014 == req.getElementType()) {
			return getGEFWrapper(
					new ConstrainableElementConstraintsSetCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (FeaturesElementTypes.StructuralRelationship_4008 == req.getElementType()) {
			return null;
		}
		if (FeaturesElementTypes.StructuralRelationship_4009 == req.getElementType()) {
			return null;
		}
		if (FeaturesElementTypes.ConstrainableElementConstraintsSet_4014 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case StructuralRelationshipEditPart.VISUAL_ID:
			return getGEFWrapper(new StructuralRelationshipReorientCommand(req));
		case StructuralRelationship2EditPart.VISUAL_ID:
			return getGEFWrapper(new StructuralRelationship2ReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ConstrainableElementConstraintsSetEditPart.VISUAL_ID:
			return getGEFWrapper(new ConstrainableElementConstraintsSetReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
