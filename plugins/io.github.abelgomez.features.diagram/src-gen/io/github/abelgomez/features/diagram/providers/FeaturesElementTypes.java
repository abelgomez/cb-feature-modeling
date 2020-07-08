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
package io.github.abelgomez.features.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import io.github.abelgomez.features.FeaturesPackage;
import io.github.abelgomez.features.diagram.edit.parts.AttributeEditPart;
import io.github.abelgomez.features.diagram.edit.parts.BiconditionalEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ConstrainableElementConstraintsSetEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ConstraintEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ConstraintsSetEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ExcludesEditPart;
import io.github.abelgomez.features.diagram.edit.parts.FeatureEditPart;
import io.github.abelgomez.features.diagram.edit.parts.FeatureModelEditPart;
import io.github.abelgomez.features.diagram.edit.parts.Group2EditPart;
import io.github.abelgomez.features.diagram.edit.parts.GroupEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ImpliesEditPart;
import io.github.abelgomez.features.diagram.edit.parts.StructuralRelationship2EditPart;
import io.github.abelgomez.features.diagram.edit.parts.StructuralRelationshipEditPart;
import io.github.abelgomez.features.diagram.edit.parts.UsesEditPart;
import io.github.abelgomez.features.diagram.part.FeaturesDiagramEditorPlugin;

/**
 * @generated
 */
public class FeaturesElementTypes {

	/**
	* @generated
	*/
	private FeaturesElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			FeaturesDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType FeatureModel_1000 = getElementType(
			"io.github.abelgomez.features.diagram.FeatureModel_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Feature_2003 = getElementType("io.github.abelgomez.features.diagram.Feature_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConstraintsSet_2004 = getElementType(
			"io.github.abelgomez.features.diagram.ConstraintsSet_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3005 = getElementType("io.github.abelgomez.features.diagram.Group_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3006 = getElementType("io.github.abelgomez.features.diagram.Group_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Attribute_3007 = getElementType(
			"io.github.abelgomez.features.diagram.Attribute_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Constraint_3008 = getElementType(
			"io.github.abelgomez.features.diagram.Constraint_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType StructuralRelationship_4008 = getElementType(
			"io.github.abelgomez.features.diagram.StructuralRelationship_4008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType StructuralRelationship_4009 = getElementType(
			"io.github.abelgomez.features.diagram.StructuralRelationship_4009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Implies_4010 = getElementType("io.github.abelgomez.features.diagram.Implies_4010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Biconditional_4011 = getElementType(
			"io.github.abelgomez.features.diagram.Biconditional_4011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Excludes_4012 = getElementType(
			"io.github.abelgomez.features.diagram.Excludes_4012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Uses_4013 = getElementType("io.github.abelgomez.features.diagram.Uses_4013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConstrainableElementConstraintsSet_4014 = getElementType(
			"io.github.abelgomez.features.diagram.ConstrainableElementConstraintsSet_4014"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(FeatureModel_1000, FeaturesPackage.eINSTANCE.getFeatureModel());

			elements.put(Feature_2003, FeaturesPackage.eINSTANCE.getFeature());

			elements.put(ConstraintsSet_2004, FeaturesPackage.eINSTANCE.getConstraintsSet());

			elements.put(Group_3005, FeaturesPackage.eINSTANCE.getGroup());

			elements.put(Group_3006, FeaturesPackage.eINSTANCE.getGroup());

			elements.put(Attribute_3007, FeaturesPackage.eINSTANCE.getAttribute());

			elements.put(Constraint_3008, FeaturesPackage.eINSTANCE.getConstraint());

			elements.put(StructuralRelationship_4008, FeaturesPackage.eINSTANCE.getStructuralRelationship());

			elements.put(StructuralRelationship_4009, FeaturesPackage.eINSTANCE.getStructuralRelationship());

			elements.put(Implies_4010, FeaturesPackage.eINSTANCE.getImplies());

			elements.put(Biconditional_4011, FeaturesPackage.eINSTANCE.getBiconditional());

			elements.put(Excludes_4012, FeaturesPackage.eINSTANCE.getExcludes());

			elements.put(Uses_4013, FeaturesPackage.eINSTANCE.getUses());

			elements.put(ConstrainableElementConstraintsSet_4014,
					FeaturesPackage.eINSTANCE.getConstrainableElement_ConstraintsSet());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(FeatureModel_1000);
			KNOWN_ELEMENT_TYPES.add(Feature_2003);
			KNOWN_ELEMENT_TYPES.add(ConstraintsSet_2004);
			KNOWN_ELEMENT_TYPES.add(Group_3005);
			KNOWN_ELEMENT_TYPES.add(Group_3006);
			KNOWN_ELEMENT_TYPES.add(Attribute_3007);
			KNOWN_ELEMENT_TYPES.add(Constraint_3008);
			KNOWN_ELEMENT_TYPES.add(StructuralRelationship_4008);
			KNOWN_ELEMENT_TYPES.add(StructuralRelationship_4009);
			KNOWN_ELEMENT_TYPES.add(Implies_4010);
			KNOWN_ELEMENT_TYPES.add(Biconditional_4011);
			KNOWN_ELEMENT_TYPES.add(Excludes_4012);
			KNOWN_ELEMENT_TYPES.add(Uses_4013);
			KNOWN_ELEMENT_TYPES.add(ConstrainableElementConstraintsSet_4014);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case FeatureModelEditPart.VISUAL_ID:
			return FeatureModel_1000;
		case FeatureEditPart.VISUAL_ID:
			return Feature_2003;
		case ConstraintsSetEditPart.VISUAL_ID:
			return ConstraintsSet_2004;
		case GroupEditPart.VISUAL_ID:
			return Group_3005;
		case Group2EditPart.VISUAL_ID:
			return Group_3006;
		case AttributeEditPart.VISUAL_ID:
			return Attribute_3007;
		case ConstraintEditPart.VISUAL_ID:
			return Constraint_3008;
		case StructuralRelationshipEditPart.VISUAL_ID:
			return StructuralRelationship_4008;
		case StructuralRelationship2EditPart.VISUAL_ID:
			return StructuralRelationship_4009;
		case ImpliesEditPart.VISUAL_ID:
			return Implies_4010;
		case BiconditionalEditPart.VISUAL_ID:
			return Biconditional_4011;
		case ExcludesEditPart.VISUAL_ID:
			return Excludes_4012;
		case UsesEditPart.VISUAL_ID:
			return Uses_4013;
		case ConstrainableElementConstraintsSetEditPart.VISUAL_ID:
			return ConstrainableElementConstraintsSet_4014;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return io.github.abelgomez.features.diagram.providers.FeaturesElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return io.github.abelgomez.features.diagram.providers.FeaturesElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return io.github.abelgomez.features.diagram.providers.FeaturesElementTypes.getElement(elementTypeAdapter);
		}
	};

}
