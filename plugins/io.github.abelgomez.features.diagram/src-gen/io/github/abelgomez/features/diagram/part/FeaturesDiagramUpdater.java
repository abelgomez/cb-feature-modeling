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

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import io.github.abelgomez.features.Attribute;
import io.github.abelgomez.features.Biconditional;
import io.github.abelgomez.features.ConstrainableElement;
import io.github.abelgomez.features.Constraint;
import io.github.abelgomez.features.ConstraintsSet;
import io.github.abelgomez.features.Excludes;
import io.github.abelgomez.features.Feature;
import io.github.abelgomez.features.FeatureModel;
import io.github.abelgomez.features.FeaturesPackage;
import io.github.abelgomez.features.Group;
import io.github.abelgomez.features.Implies;
import io.github.abelgomez.features.RelatableElement;
import io.github.abelgomez.features.StructuralRelationship;
import io.github.abelgomez.features.Uses;
import io.github.abelgomez.features.diagram.edit.parts.AttributeEditPart;
import io.github.abelgomez.features.diagram.edit.parts.BiconditionalEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ConstrainableElementConstraintsSetEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ConstraintEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ConstraintsSetConstraintsSetBodyEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ConstraintsSetEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ExcludesEditPart;
import io.github.abelgomez.features.diagram.edit.parts.FeatureAttributesEditPart;
import io.github.abelgomez.features.diagram.edit.parts.FeatureEditPart;
import io.github.abelgomez.features.diagram.edit.parts.FeatureModelEditPart;
import io.github.abelgomez.features.diagram.edit.parts.Group2EditPart;
import io.github.abelgomez.features.diagram.edit.parts.GroupEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ImpliesEditPart;
import io.github.abelgomez.features.diagram.edit.parts.StructuralRelationship2EditPart;
import io.github.abelgomez.features.diagram.edit.parts.StructuralRelationshipEditPart;
import io.github.abelgomez.features.diagram.edit.parts.UsesEditPart;
import io.github.abelgomez.features.diagram.providers.FeaturesElementTypes;

/**
 * @generated
 */
public class FeaturesDiagramUpdater {

	/**
	* @generated
	*/
	public static List<FeaturesNodeDescriptor> getSemanticChildren(View view) {
		switch (FeaturesVisualIDRegistry.getVisualID(view)) {
		case FeatureModelEditPart.VISUAL_ID:
			return getFeatureModel_1000SemanticChildren(view);
		case FeatureEditPart.VISUAL_ID:
			return getFeature_2003SemanticChildren(view);
		case FeatureAttributesEditPart.VISUAL_ID:
			return getFeatureAttributes_7003SemanticChildren(view);
		case ConstraintsSetConstraintsSetBodyEditPart.VISUAL_ID:
			return getConstraintsSetConstraintsSetBody_7004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<FeaturesNodeDescriptor> getFeatureModel_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		FeatureModel modelElement = (FeatureModel) view.getElement();
		LinkedList<FeaturesNodeDescriptor> result = new LinkedList<FeaturesNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFeatures().iterator(); it.hasNext();) {
			Feature childElement = (Feature) it.next();
			int visualID = FeaturesVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FeatureEditPart.VISUAL_ID) {
				result.add(new FeaturesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getModelConstraints().iterator(); it.hasNext();) {
			ConstraintsSet childElement = (ConstraintsSet) it.next();
			int visualID = FeaturesVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConstraintsSetEditPart.VISUAL_ID) {
				result.add(new FeaturesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<FeaturesNodeDescriptor> getFeature_2003SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Feature modelElement = (Feature) view.getElement();
		LinkedList<FeaturesNodeDescriptor> result = new LinkedList<FeaturesNodeDescriptor>();
		{
			Group childElement = modelElement.getGroup();
			int visualID = FeaturesVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GroupEditPart.VISUAL_ID) {
				result.add(new FeaturesNodeDescriptor(childElement, visualID));
			}
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new FeaturesNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<FeaturesNodeDescriptor> getFeatureAttributes_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Feature modelElement = (Feature) containerView.getElement();
		LinkedList<FeaturesNodeDescriptor> result = new LinkedList<FeaturesNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = FeaturesVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new FeaturesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<FeaturesNodeDescriptor> getConstraintsSetConstraintsSetBody_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConstraintsSet modelElement = (ConstraintsSet) containerView.getElement();
		LinkedList<FeaturesNodeDescriptor> result = new LinkedList<FeaturesNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it.hasNext();) {
			Constraint childElement = (Constraint) it.next();
			int visualID = FeaturesVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConstraintEditPart.VISUAL_ID) {
				result.add(new FeaturesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<FeaturesLinkDescriptor> getContainedLinks(View view) {
		switch (FeaturesVisualIDRegistry.getVisualID(view)) {
		case FeatureModelEditPart.VISUAL_ID:
			return getFeatureModel_1000ContainedLinks(view);
		case FeatureEditPart.VISUAL_ID:
			return getFeature_2003ContainedLinks(view);
		case ConstraintsSetEditPart.VISUAL_ID:
			return getConstraintsSet_2004ContainedLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3005ContainedLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3006ContainedLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3007ContainedLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3008ContainedLinks(view);
		case StructuralRelationshipEditPart.VISUAL_ID:
			return getStructuralRelationship_4008ContainedLinks(view);
		case StructuralRelationship2EditPart.VISUAL_ID:
			return getStructuralRelationship_4009ContainedLinks(view);
		case ImpliesEditPart.VISUAL_ID:
			return getImplies_4010ContainedLinks(view);
		case BiconditionalEditPart.VISUAL_ID:
			return getBiconditional_4011ContainedLinks(view);
		case ExcludesEditPart.VISUAL_ID:
			return getExcludes_4012ContainedLinks(view);
		case UsesEditPart.VISUAL_ID:
			return getUses_4013ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<FeaturesLinkDescriptor> getIncomingLinks(View view) {
		switch (FeaturesVisualIDRegistry.getVisualID(view)) {
		case FeatureEditPart.VISUAL_ID:
			return getFeature_2003IncomingLinks(view);
		case ConstraintsSetEditPart.VISUAL_ID:
			return getConstraintsSet_2004IncomingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3005IncomingLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3006IncomingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3007IncomingLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3008IncomingLinks(view);
		case StructuralRelationshipEditPart.VISUAL_ID:
			return getStructuralRelationship_4008IncomingLinks(view);
		case StructuralRelationship2EditPart.VISUAL_ID:
			return getStructuralRelationship_4009IncomingLinks(view);
		case ImpliesEditPart.VISUAL_ID:
			return getImplies_4010IncomingLinks(view);
		case BiconditionalEditPart.VISUAL_ID:
			return getBiconditional_4011IncomingLinks(view);
		case ExcludesEditPart.VISUAL_ID:
			return getExcludes_4012IncomingLinks(view);
		case UsesEditPart.VISUAL_ID:
			return getUses_4013IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<FeaturesLinkDescriptor> getOutgoingLinks(View view) {
		switch (FeaturesVisualIDRegistry.getVisualID(view)) {
		case FeatureEditPart.VISUAL_ID:
			return getFeature_2003OutgoingLinks(view);
		case ConstraintsSetEditPart.VISUAL_ID:
			return getConstraintsSet_2004OutgoingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3005OutgoingLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3006OutgoingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3007OutgoingLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3008OutgoingLinks(view);
		case StructuralRelationshipEditPart.VISUAL_ID:
			return getStructuralRelationship_4008OutgoingLinks(view);
		case StructuralRelationship2EditPart.VISUAL_ID:
			return getStructuralRelationship_4009OutgoingLinks(view);
		case ImpliesEditPart.VISUAL_ID:
			return getImplies_4010OutgoingLinks(view);
		case BiconditionalEditPart.VISUAL_ID:
			return getBiconditional_4011OutgoingLinks(view);
		case ExcludesEditPart.VISUAL_ID:
			return getExcludes_4012OutgoingLinks(view);
		case UsesEditPart.VISUAL_ID:
			return getUses_4013OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getFeatureModel_1000ContainedLinks(View view) {
		FeatureModel modelElement = (FeatureModel) view.getElement();
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_StructuralRelationship_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_StructuralRelationship_4009(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implies_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Biconditional_4011(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Excludes_4012(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Uses_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_ConstraintsSet_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getFeature_2003ContainedLinks(View view) {
		Feature modelElement = (Feature) view.getElement();
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_ConstraintsSet_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getConstraintsSet_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getGroup_3005ContainedLinks(View view) {
		Group modelElement = (Group) view.getElement();
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_ConstraintsSet_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getGroup_3006ContainedLinks(View view) {
		Group modelElement = (Group) view.getElement();
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_ConstraintsSet_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getAttribute_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getConstraint_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getStructuralRelationship_4008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getStructuralRelationship_4009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getImplies_4010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getBiconditional_4011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getExcludes_4012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getUses_4013ContainedLinks(View view) {
		Uses modelElement = (Uses) view.getElement();
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_ConstraintsSet_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getFeature_2003IncomingLinks(View view) {
		Feature modelElement = (Feature) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_StructuralRelationship_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_StructuralRelationship_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implies_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Biconditional_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Excludes_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Uses_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getConstraintsSet_2004IncomingLinks(View view) {
		ConstraintsSet modelElement = (ConstraintsSet) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ConstrainableElement_ConstraintsSet_4014(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getGroup_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getGroup_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getAttribute_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getConstraint_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getStructuralRelationship_4008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getStructuralRelationship_4009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getImplies_4010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getBiconditional_4011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getExcludes_4012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getUses_4013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getFeature_2003OutgoingLinks(View view) {
		Feature modelElement = (Feature) view.getElement();
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_StructuralRelationship_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_StructuralRelationship_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implies_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Biconditional_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Excludes_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Uses_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_ConstraintsSet_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getConstraintsSet_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getGroup_3005OutgoingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_StructuralRelationship_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_StructuralRelationship_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_ConstraintsSet_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getGroup_3006OutgoingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_StructuralRelationship_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_StructuralRelationship_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_ConstraintsSet_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getAttribute_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getConstraint_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getStructuralRelationship_4008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getStructuralRelationship_4009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getImplies_4010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getBiconditional_4011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getExcludes_4012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeaturesLinkDescriptor> getUses_4013OutgoingLinks(View view) {
		Uses modelElement = (Uses) view.getElement();
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_ConstraintsSet_4014(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<FeaturesLinkDescriptor> getContainedTypeModelFacetLinks_StructuralRelationship_4008(
			FeatureModel container) {
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof StructuralRelationship) {
				continue;
			}
			StructuralRelationship link = (StructuralRelationship) linkObject;
			if (StructuralRelationshipEditPart.VISUAL_ID != FeaturesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getTo();
			RelatableElement src = link.getFrom();
			result.add(new FeaturesLinkDescriptor(src, dst, link, FeaturesElementTypes.StructuralRelationship_4008,
					StructuralRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<FeaturesLinkDescriptor> getContainedTypeModelFacetLinks_StructuralRelationship_4009(
			FeatureModel container) {
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof StructuralRelationship) {
				continue;
			}
			StructuralRelationship link = (StructuralRelationship) linkObject;
			if (StructuralRelationship2EditPart.VISUAL_ID != FeaturesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getTo();
			RelatableElement src = link.getFrom();
			result.add(new FeaturesLinkDescriptor(src, dst, link, FeaturesElementTypes.StructuralRelationship_4009,
					StructuralRelationship2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<FeaturesLinkDescriptor> getContainedTypeModelFacetLinks_Implies_4010(
			FeatureModel container) {
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Implies) {
				continue;
			}
			Implies link = (Implies) linkObject;
			if (ImpliesEditPart.VISUAL_ID != FeaturesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getTo();
			Feature src = link.getFrom();
			result.add(new FeaturesLinkDescriptor(src, dst, link, FeaturesElementTypes.Implies_4010,
					ImpliesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<FeaturesLinkDescriptor> getContainedTypeModelFacetLinks_Biconditional_4011(
			FeatureModel container) {
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Biconditional) {
				continue;
			}
			Biconditional link = (Biconditional) linkObject;
			if (BiconditionalEditPart.VISUAL_ID != FeaturesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getTo();
			Feature src = link.getFrom();
			result.add(new FeaturesLinkDescriptor(src, dst, link, FeaturesElementTypes.Biconditional_4011,
					BiconditionalEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<FeaturesLinkDescriptor> getContainedTypeModelFacetLinks_Excludes_4012(
			FeatureModel container) {
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Excludes) {
				continue;
			}
			Excludes link = (Excludes) linkObject;
			if (ExcludesEditPart.VISUAL_ID != FeaturesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getTo();
			Feature src = link.getFrom();
			result.add(new FeaturesLinkDescriptor(src, dst, link, FeaturesElementTypes.Excludes_4012,
					ExcludesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<FeaturesLinkDescriptor> getContainedTypeModelFacetLinks_Uses_4013(
			FeatureModel container) {
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Uses) {
				continue;
			}
			Uses link = (Uses) linkObject;
			if (UsesEditPart.VISUAL_ID != FeaturesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getTo();
			Feature src = link.getFrom();
			result.add(
					new FeaturesLinkDescriptor(src, dst, link, FeaturesElementTypes.Uses_4013, UsesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeaturesLinkDescriptor> getIncomingTypeModelFacetLinks_StructuralRelationship_4008(
			Feature target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != FeaturesPackage.eINSTANCE.getStructuralRelationship_To()
					|| false == setting.getEObject() instanceof StructuralRelationship) {
				continue;
			}
			StructuralRelationship link = (StructuralRelationship) setting.getEObject();
			if (StructuralRelationshipEditPart.VISUAL_ID != FeaturesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			RelatableElement src = link.getFrom();
			result.add(new FeaturesLinkDescriptor(src, target, link, FeaturesElementTypes.StructuralRelationship_4008,
					StructuralRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeaturesLinkDescriptor> getIncomingTypeModelFacetLinks_StructuralRelationship_4009(
			Feature target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != FeaturesPackage.eINSTANCE.getStructuralRelationship_To()
					|| false == setting.getEObject() instanceof StructuralRelationship) {
				continue;
			}
			StructuralRelationship link = (StructuralRelationship) setting.getEObject();
			if (StructuralRelationship2EditPart.VISUAL_ID != FeaturesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			RelatableElement src = link.getFrom();
			result.add(new FeaturesLinkDescriptor(src, target, link, FeaturesElementTypes.StructuralRelationship_4009,
					StructuralRelationship2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeaturesLinkDescriptor> getIncomingTypeModelFacetLinks_Implies_4010(Feature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != FeaturesPackage.eINSTANCE.getGenericRelationship_To()
					|| false == setting.getEObject() instanceof Implies) {
				continue;
			}
			Implies link = (Implies) setting.getEObject();
			if (ImpliesEditPart.VISUAL_ID != FeaturesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature src = link.getFrom();
			result.add(new FeaturesLinkDescriptor(src, target, link, FeaturesElementTypes.Implies_4010,
					ImpliesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeaturesLinkDescriptor> getIncomingTypeModelFacetLinks_Biconditional_4011(Feature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != FeaturesPackage.eINSTANCE.getGenericRelationship_To()
					|| false == setting.getEObject() instanceof Biconditional) {
				continue;
			}
			Biconditional link = (Biconditional) setting.getEObject();
			if (BiconditionalEditPart.VISUAL_ID != FeaturesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature src = link.getFrom();
			result.add(new FeaturesLinkDescriptor(src, target, link, FeaturesElementTypes.Biconditional_4011,
					BiconditionalEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeaturesLinkDescriptor> getIncomingTypeModelFacetLinks_Excludes_4012(Feature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != FeaturesPackage.eINSTANCE.getGenericRelationship_To()
					|| false == setting.getEObject() instanceof Excludes) {
				continue;
			}
			Excludes link = (Excludes) setting.getEObject();
			if (ExcludesEditPart.VISUAL_ID != FeaturesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature src = link.getFrom();
			result.add(new FeaturesLinkDescriptor(src, target, link, FeaturesElementTypes.Excludes_4012,
					ExcludesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeaturesLinkDescriptor> getIncomingTypeModelFacetLinks_Uses_4013(Feature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != FeaturesPackage.eINSTANCE.getGenericRelationship_To()
					|| false == setting.getEObject() instanceof Uses) {
				continue;
			}
			Uses link = (Uses) setting.getEObject();
			if (UsesEditPart.VISUAL_ID != FeaturesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature src = link.getFrom();
			result.add(new FeaturesLinkDescriptor(src, target, link, FeaturesElementTypes.Uses_4013,
					UsesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeaturesLinkDescriptor> getIncomingFeatureModelFacetLinks_ConstrainableElement_ConstraintsSet_4014(
			ConstraintsSet target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == FeaturesPackage.eINSTANCE.getConstrainableElement_ConstraintsSet()) {
				result.add(new FeaturesLinkDescriptor(setting.getEObject(), target,
						FeaturesElementTypes.ConstrainableElementConstraintsSet_4014,
						ConstrainableElementConstraintsSetEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<FeaturesLinkDescriptor> getOutgoingTypeModelFacetLinks_StructuralRelationship_4008(
			RelatableElement source) {
		FeatureModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof FeatureModel) {
				container = (FeatureModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof StructuralRelationship) {
				continue;
			}
			StructuralRelationship link = (StructuralRelationship) linkObject;
			if (StructuralRelationshipEditPart.VISUAL_ID != FeaturesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getTo();
			RelatableElement src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new FeaturesLinkDescriptor(src, dst, link, FeaturesElementTypes.StructuralRelationship_4008,
					StructuralRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<FeaturesLinkDescriptor> getOutgoingTypeModelFacetLinks_StructuralRelationship_4009(
			RelatableElement source) {
		FeatureModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof FeatureModel) {
				container = (FeatureModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof StructuralRelationship) {
				continue;
			}
			StructuralRelationship link = (StructuralRelationship) linkObject;
			if (StructuralRelationship2EditPart.VISUAL_ID != FeaturesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getTo();
			RelatableElement src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new FeaturesLinkDescriptor(src, dst, link, FeaturesElementTypes.StructuralRelationship_4009,
					StructuralRelationship2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<FeaturesLinkDescriptor> getOutgoingTypeModelFacetLinks_Implies_4010(Feature source) {
		FeatureModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof FeatureModel) {
				container = (FeatureModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Implies) {
				continue;
			}
			Implies link = (Implies) linkObject;
			if (ImpliesEditPart.VISUAL_ID != FeaturesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getTo();
			Feature src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new FeaturesLinkDescriptor(src, dst, link, FeaturesElementTypes.Implies_4010,
					ImpliesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<FeaturesLinkDescriptor> getOutgoingTypeModelFacetLinks_Biconditional_4011(
			Feature source) {
		FeatureModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof FeatureModel) {
				container = (FeatureModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Biconditional) {
				continue;
			}
			Biconditional link = (Biconditional) linkObject;
			if (BiconditionalEditPart.VISUAL_ID != FeaturesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getTo();
			Feature src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new FeaturesLinkDescriptor(src, dst, link, FeaturesElementTypes.Biconditional_4011,
					BiconditionalEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<FeaturesLinkDescriptor> getOutgoingTypeModelFacetLinks_Excludes_4012(Feature source) {
		FeatureModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof FeatureModel) {
				container = (FeatureModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Excludes) {
				continue;
			}
			Excludes link = (Excludes) linkObject;
			if (ExcludesEditPart.VISUAL_ID != FeaturesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getTo();
			Feature src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new FeaturesLinkDescriptor(src, dst, link, FeaturesElementTypes.Excludes_4012,
					ExcludesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<FeaturesLinkDescriptor> getOutgoingTypeModelFacetLinks_Uses_4013(Feature source) {
		FeatureModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof FeatureModel) {
				container = (FeatureModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Uses) {
				continue;
			}
			Uses link = (Uses) linkObject;
			if (UsesEditPart.VISUAL_ID != FeaturesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getTo();
			Feature src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(
					new FeaturesLinkDescriptor(src, dst, link, FeaturesElementTypes.Uses_4013, UsesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<FeaturesLinkDescriptor> getOutgoingFeatureModelFacetLinks_ConstrainableElement_ConstraintsSet_4014(
			ConstrainableElement source) {
		LinkedList<FeaturesLinkDescriptor> result = new LinkedList<FeaturesLinkDescriptor>();
		ConstraintsSet destination = source.getConstraintsSet();
		if (destination == null) {
			return result;
		}
		result.add(new FeaturesLinkDescriptor(source, destination,
				FeaturesElementTypes.ConstrainableElementConstraintsSet_4014,
				ConstrainableElementConstraintsSetEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/

		public List<FeaturesNodeDescriptor> getSemanticChildren(View view) {
			return FeaturesDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/

		public List<FeaturesLinkDescriptor> getContainedLinks(View view) {
			return FeaturesDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/

		public List<FeaturesLinkDescriptor> getIncomingLinks(View view) {
			return FeaturesDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/

		public List<FeaturesLinkDescriptor> getOutgoingLinks(View view) {
			return FeaturesDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
