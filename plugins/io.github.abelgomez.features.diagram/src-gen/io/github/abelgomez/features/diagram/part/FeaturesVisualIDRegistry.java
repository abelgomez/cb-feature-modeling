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
package io.github.abelgomez.features.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import io.github.abelgomez.features.FeatureModel;
import io.github.abelgomez.features.FeaturesPackage;
import io.github.abelgomez.features.Group;
import io.github.abelgomez.features.StructuralRelationship;
import io.github.abelgomez.features.diagram.edit.parts.AttributeEditPart;
import io.github.abelgomez.features.diagram.edit.parts.BiconditionalEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ConstraintEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ConstraintsSetConstraintsSetBodyEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ConstraintsSetEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ExcludesEditPart;
import io.github.abelgomez.features.diagram.edit.parts.FeatureAttributesEditPart;
import io.github.abelgomez.features.diagram.edit.parts.FeatureEditPart;
import io.github.abelgomez.features.diagram.edit.parts.FeatureModelEditPart;
import io.github.abelgomez.features.diagram.edit.parts.FeatureNameEditPart;
import io.github.abelgomez.features.diagram.edit.parts.Group2EditPart;
import io.github.abelgomez.features.diagram.edit.parts.GroupEditPart;
import io.github.abelgomez.features.diagram.edit.parts.GroupLowerBoundUpperBound2EditPart;
import io.github.abelgomez.features.diagram.edit.parts.GroupLowerBoundUpperBoundEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ImpliesEditPart;
import io.github.abelgomez.features.diagram.edit.parts.StructuralRelationship2EditPart;
import io.github.abelgomez.features.diagram.edit.parts.StructuralRelationshipEditPart;
import io.github.abelgomez.features.diagram.edit.parts.StructuralRelationshipLowerBoundUpperBound2EditPart;
import io.github.abelgomez.features.diagram.edit.parts.StructuralRelationshipLowerBoundUpperBoundEditPart;
import io.github.abelgomez.features.diagram.edit.parts.UsesEditPart;
import io.github.abelgomez.features.diagram.edit.parts.UsesLowerBoundUpperBoundEditPart;
import io.github.abelgomez.features.diagram.edit.parts.UsesNameEditPart;
import io.github.abelgomez.features.diagram.expressions.FeaturesOCLFactory;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class FeaturesVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "io.github.abelgomez.features.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (FeatureModelEditPart.MODEL_ID.equals(view.getType())) {
				return FeatureModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				FeaturesDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (FeaturesPackage.eINSTANCE.getFeatureModel().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((FeatureModel) domainElement)) {
			return FeatureModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry
				.getModelID(containerView);
		if (!FeatureModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (FeatureModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FeatureModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case FeatureModelEditPart.VISUAL_ID:
			if (FeaturesPackage.eINSTANCE.getFeature().isSuperTypeOf(domainElement.eClass())) {
				return FeatureEditPart.VISUAL_ID;
			}
			if (FeaturesPackage.eINSTANCE.getConstraintsSet().isSuperTypeOf(domainElement.eClass())) {
				return ConstraintsSetEditPart.VISUAL_ID;
			}
			break;
		case FeatureEditPart.VISUAL_ID:
			if (FeaturesPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())
					&& isGroup_3005((Group) domainElement)) {
				return GroupEditPart.VISUAL_ID;
			}
			if (FeaturesPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())
					&& isGroup_3006((Group) domainElement)) {
				return Group2EditPart.VISUAL_ID;
			}
			break;
		case FeatureAttributesEditPart.VISUAL_ID:
			if (FeaturesPackage.eINSTANCE.getAttribute().isSuperTypeOf(domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			break;
		case ConstraintsSetConstraintsSetBodyEditPart.VISUAL_ID:
			if (FeaturesPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
				return ConstraintEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry
				.getModelID(containerView);
		if (!FeatureModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (FeatureModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FeatureModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case FeatureModelEditPart.VISUAL_ID:
			if (FeatureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConstraintsSetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FeatureEditPart.VISUAL_ID:
			if (FeatureNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FeatureAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConstraintsSetEditPart.VISUAL_ID:
			if (ConstraintsSetConstraintsSetBodyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupEditPart.VISUAL_ID:
			if (GroupLowerBoundUpperBoundEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Group2EditPart.VISUAL_ID:
			if (GroupLowerBoundUpperBound2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FeatureAttributesEditPart.VISUAL_ID:
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConstraintsSetConstraintsSetBodyEditPart.VISUAL_ID:
			if (ConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuralRelationshipEditPart.VISUAL_ID:
			if (StructuralRelationshipLowerBoundUpperBoundEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuralRelationship2EditPart.VISUAL_ID:
			if (StructuralRelationshipLowerBoundUpperBound2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UsesEditPart.VISUAL_ID:
			if (UsesNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UsesLowerBoundUpperBoundEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (FeaturesPackage.eINSTANCE.getStructuralRelationship().isSuperTypeOf(domainElement.eClass())
				&& isStructuralRelationship_4008((StructuralRelationship) domainElement)) {
			return StructuralRelationshipEditPart.VISUAL_ID;
		}
		if (FeaturesPackage.eINSTANCE.getStructuralRelationship().isSuperTypeOf(domainElement.eClass())
				&& isStructuralRelationship_4009((StructuralRelationship) domainElement)) {
			return StructuralRelationship2EditPart.VISUAL_ID;
		}
		if (FeaturesPackage.eINSTANCE.getImplies().isSuperTypeOf(domainElement.eClass())) {
			return ImpliesEditPart.VISUAL_ID;
		}
		if (FeaturesPackage.eINSTANCE.getBiconditional().isSuperTypeOf(domainElement.eClass())) {
			return BiconditionalEditPart.VISUAL_ID;
		}
		if (FeaturesPackage.eINSTANCE.getExcludes().isSuperTypeOf(domainElement.eClass())) {
			return ExcludesEditPart.VISUAL_ID;
		}
		if (FeaturesPackage.eINSTANCE.getUses().isSuperTypeOf(domainElement.eClass())) {
			return UsesEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(FeatureModel element) {
		return true;
	}

	/**
	* @generated
	*/
	private static boolean isGroup_3005(Group domainElement) {
		Object result = FeaturesOCLFactory.getExpression(0, FeaturesPackage.eINSTANCE.getGroup(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	* @generated
	*/
	private static boolean isGroup_3006(Group domainElement) {
		Object result = FeaturesOCLFactory.getExpression(3, FeaturesPackage.eINSTANCE.getGroup(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	* @generated
	*/
	private static boolean isStructuralRelationship_4008(StructuralRelationship domainElement) {
		Object result = FeaturesOCLFactory.getExpression(6, FeaturesPackage.eINSTANCE.getStructuralRelationship(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	* @generated
	*/
	private static boolean isStructuralRelationship_4009(StructuralRelationship domainElement) {
		Object result = FeaturesOCLFactory
				.getExpression(10, FeaturesPackage.eINSTANCE.getStructuralRelationship(), null).evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case FeatureAttributesEditPart.VISUAL_ID:
		case ConstraintsSetConstraintsSetBodyEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case FeatureModelEditPart.VISUAL_ID:
			return false;
		case GroupEditPart.VISUAL_ID:
		case Group2EditPart.VISUAL_ID:
		case AttributeEditPart.VISUAL_ID:
		case ConstraintEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/

		public int getVisualID(View view) {
			return io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/

		public String getModelID(View view) {
			return io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/

		public boolean isCompartmentVisualID(int visualID) {
			return io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/

		public boolean isSemanticLeafVisualID(int visualID) {
			return io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
