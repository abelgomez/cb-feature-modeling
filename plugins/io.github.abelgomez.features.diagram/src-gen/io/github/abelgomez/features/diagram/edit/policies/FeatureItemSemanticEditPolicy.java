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
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import io.github.abelgomez.features.diagram.edit.commands.BiconditionalCreateCommand;
import io.github.abelgomez.features.diagram.edit.commands.BiconditionalReorientCommand;
import io.github.abelgomez.features.diagram.edit.commands.ConstrainableElementConstraintsSetCreateCommand;
import io.github.abelgomez.features.diagram.edit.commands.ConstrainableElementConstraintsSetReorientCommand;
import io.github.abelgomez.features.diagram.edit.commands.ExcludesCreateCommand;
import io.github.abelgomez.features.diagram.edit.commands.ExcludesReorientCommand;
import io.github.abelgomez.features.diagram.edit.commands.Group2CreateCommand;
import io.github.abelgomez.features.diagram.edit.commands.GroupCreateCommand;
import io.github.abelgomez.features.diagram.edit.commands.ImpliesCreateCommand;
import io.github.abelgomez.features.diagram.edit.commands.ImpliesReorientCommand;
import io.github.abelgomez.features.diagram.edit.commands.StructuralRelationship2CreateCommand;
import io.github.abelgomez.features.diagram.edit.commands.StructuralRelationship2ReorientCommand;
import io.github.abelgomez.features.diagram.edit.commands.StructuralRelationshipCreateCommand;
import io.github.abelgomez.features.diagram.edit.commands.StructuralRelationshipReorientCommand;
import io.github.abelgomez.features.diagram.edit.commands.UsesCreateCommand;
import io.github.abelgomez.features.diagram.edit.commands.UsesReorientCommand;
import io.github.abelgomez.features.diagram.edit.parts.AttributeEditPart;
import io.github.abelgomez.features.diagram.edit.parts.BiconditionalEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ConstrainableElementConstraintsSetEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ExcludesEditPart;
import io.github.abelgomez.features.diagram.edit.parts.FeatureAttributesEditPart;
import io.github.abelgomez.features.diagram.edit.parts.Group2EditPart;
import io.github.abelgomez.features.diagram.edit.parts.GroupEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ImpliesEditPart;
import io.github.abelgomez.features.diagram.edit.parts.StructuralRelationship2EditPart;
import io.github.abelgomez.features.diagram.edit.parts.StructuralRelationshipEditPart;
import io.github.abelgomez.features.diagram.edit.parts.UsesEditPart;
import io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry;
import io.github.abelgomez.features.diagram.providers.FeaturesElementTypes;

/**
 * @generated
 */
public class FeatureItemSemanticEditPolicy extends FeaturesBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FeatureItemSemanticEditPolicy() {
		super(FeaturesElementTypes.Feature_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FeaturesElementTypes.Group_3005 == req.getElementType()) {
			return getGEFWrapper(new GroupCreateCommand(req));
		}
		if (FeaturesElementTypes.Group_3006 == req.getElementType()) {
			return getGEFWrapper(new Group2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (FeaturesVisualIDRegistry.getVisualID(incomingLink) == StructuralRelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (FeaturesVisualIDRegistry.getVisualID(incomingLink) == StructuralRelationship2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (FeaturesVisualIDRegistry.getVisualID(incomingLink) == ImpliesEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (FeaturesVisualIDRegistry.getVisualID(incomingLink) == BiconditionalEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (FeaturesVisualIDRegistry.getVisualID(incomingLink) == ExcludesEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (FeaturesVisualIDRegistry.getVisualID(incomingLink) == UsesEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
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
			if (FeaturesVisualIDRegistry.getVisualID(outgoingLink) == ImpliesEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (FeaturesVisualIDRegistry.getVisualID(outgoingLink) == BiconditionalEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (FeaturesVisualIDRegistry.getVisualID(outgoingLink) == ExcludesEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (FeaturesVisualIDRegistry.getVisualID(outgoingLink) == UsesEditPart.VISUAL_ID) {
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
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (FeaturesVisualIDRegistry.getVisualID(node)) {
			case GroupEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (FeaturesVisualIDRegistry
							.getVisualID(outgoingLink) == StructuralRelationshipEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (FeaturesVisualIDRegistry
							.getVisualID(outgoingLink) == StructuralRelationship2EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (FeaturesVisualIDRegistry
							.getVisualID(outgoingLink) == ConstrainableElementConstraintsSetEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(),
								null, outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(
						new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case Group2EditPart.VISUAL_ID:
				for (Iterator<?> it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (FeaturesVisualIDRegistry
							.getVisualID(outgoingLink) == StructuralRelationshipEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (FeaturesVisualIDRegistry
							.getVisualID(outgoingLink) == StructuralRelationship2EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (FeaturesVisualIDRegistry
							.getVisualID(outgoingLink) == ConstrainableElementConstraintsSetEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(),
								null, outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(
						new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case FeatureAttributesEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (FeaturesVisualIDRegistry.getVisualID(cnode)) {
					case AttributeEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (FeaturesElementTypes.Implies_4010 == req.getElementType()) {
			return getGEFWrapper(new ImpliesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (FeaturesElementTypes.Biconditional_4011 == req.getElementType()) {
			return getGEFWrapper(new BiconditionalCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (FeaturesElementTypes.Excludes_4012 == req.getElementType()) {
			return getGEFWrapper(new ExcludesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (FeaturesElementTypes.Uses_4013 == req.getElementType()) {
			return getGEFWrapper(new UsesCreateCommand(req, req.getSource(), req.getTarget()));
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
			return getGEFWrapper(new StructuralRelationshipCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (FeaturesElementTypes.StructuralRelationship_4009 == req.getElementType()) {
			return getGEFWrapper(new StructuralRelationship2CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (FeaturesElementTypes.Implies_4010 == req.getElementType()) {
			return getGEFWrapper(new ImpliesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (FeaturesElementTypes.Biconditional_4011 == req.getElementType()) {
			return getGEFWrapper(new BiconditionalCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (FeaturesElementTypes.Excludes_4012 == req.getElementType()) {
			return getGEFWrapper(new ExcludesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (FeaturesElementTypes.Uses_4013 == req.getElementType()) {
			return getGEFWrapper(new UsesCreateCommand(req, req.getSource(), req.getTarget()));
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
		case ImpliesEditPart.VISUAL_ID:
			return getGEFWrapper(new ImpliesReorientCommand(req));
		case BiconditionalEditPart.VISUAL_ID:
			return getGEFWrapper(new BiconditionalReorientCommand(req));
		case ExcludesEditPart.VISUAL_ID:
			return getGEFWrapper(new ExcludesReorientCommand(req));
		case UsesEditPart.VISUAL_ID:
			return getGEFWrapper(new UsesReorientCommand(req));
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
