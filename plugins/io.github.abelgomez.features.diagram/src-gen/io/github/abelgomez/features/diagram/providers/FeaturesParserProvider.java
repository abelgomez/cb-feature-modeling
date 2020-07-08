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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import io.github.abelgomez.features.FeaturesPackage;
import io.github.abelgomez.features.diagram.edit.parts.AttributeEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ConstraintEditPart;
import io.github.abelgomez.features.diagram.edit.parts.FeatureNameEditPart;
import io.github.abelgomez.features.diagram.edit.parts.GroupLowerBoundUpperBound2EditPart;
import io.github.abelgomez.features.diagram.edit.parts.GroupLowerBoundUpperBoundEditPart;
import io.github.abelgomez.features.diagram.edit.parts.StructuralRelationshipLowerBoundUpperBound2EditPart;
import io.github.abelgomez.features.diagram.edit.parts.StructuralRelationshipLowerBoundUpperBoundEditPart;
import io.github.abelgomez.features.diagram.edit.parts.UsesLowerBoundUpperBoundEditPart;
import io.github.abelgomez.features.diagram.edit.parts.UsesNameEditPart;
import io.github.abelgomez.features.diagram.parsers.MessageFormatParser;
import io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry;

/**
 * @generated
 */
public class FeaturesParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser featureName_5006Parser;

	/**
	* @generated
	*/
	private IParser getFeatureName_5006Parser() {
		if (featureName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { FeaturesPackage.eINSTANCE.getConstrainableElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			featureName_5006Parser = parser;
		}
		return featureName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser groupLowerBoundUpperBound_5004Parser;

	/**
	* @generated
	*/
	private IParser getGroupLowerBoundUpperBound_5004Parser() {
		if (groupLowerBoundUpperBound_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { FeaturesPackage.eINSTANCE.getBoundableElement_LowerBound(),
					FeaturesPackage.eINSTANCE.getBoundableElement_UpperBound() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("[{0}..{1,choice,-1#*|-1<{1}}]"); //$NON-NLS-1$
			parser.setEditorPattern("[{0}..{1,choice,-1#*|-1<{1}}]"); //$NON-NLS-1$
			parser.setEditPattern("[{0}..{1}]"); //$NON-NLS-1$
			groupLowerBoundUpperBound_5004Parser = parser;
		}
		return groupLowerBoundUpperBound_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser groupLowerBoundUpperBound_5005Parser;

	/**
	* @generated
	*/
	private IParser getGroupLowerBoundUpperBound_5005Parser() {
		if (groupLowerBoundUpperBound_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { FeaturesPackage.eINSTANCE.getBoundableElement_LowerBound(),
					FeaturesPackage.eINSTANCE.getBoundableElement_UpperBound() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("[{0}..{1,choice,-1#*|-1<{1}}]"); //$NON-NLS-1$
			parser.setEditorPattern("[{0}..{1,choice,-1#*|-1<{1}}]"); //$NON-NLS-1$
			parser.setEditPattern("[{0}..{1}]"); //$NON-NLS-1$
			groupLowerBoundUpperBound_5005Parser = parser;
		}
		return groupLowerBoundUpperBound_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser attribute_3007Parser;

	/**
	* @generated
	*/
	private IParser getAttribute_3007Parser() {
		if (attribute_3007Parser == null) {
			EAttribute[] features = new EAttribute[] { FeaturesPackage.eINSTANCE.getAttribute_Name(),
					FeaturesPackage.eINSTANCE.getAttribute_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			attribute_3007Parser = parser;
		}
		return attribute_3007Parser;
	}

	/**
	* @generated
	*/
	private IParser constraint_3008Parser;

	/**
	* @generated
	*/
	private IParser getConstraint_3008Parser() {
		if (constraint_3008Parser == null) {
			EAttribute[] features = new EAttribute[] { FeaturesPackage.eINSTANCE.getConstraint_Body() };
			MessageFormatParser parser = new MessageFormatParser(features);
			constraint_3008Parser = parser;
		}
		return constraint_3008Parser;
	}

	/**
	* @generated
	*/
	private IParser structuralRelationshipLowerBoundUpperBound_6005Parser;

	/**
	* @generated
	*/
	private IParser getStructuralRelationshipLowerBoundUpperBound_6005Parser() {
		if (structuralRelationshipLowerBoundUpperBound_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { FeaturesPackage.eINSTANCE.getBoundableElement_LowerBound(),
					FeaturesPackage.eINSTANCE.getBoundableElement_UpperBound() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("[{0}..{1,choice,-1#*|-1<{1}}]"); //$NON-NLS-1$
			parser.setEditorPattern("[{0}..{1,choice,-1#*|-1<{1}}]"); //$NON-NLS-1$
			parser.setEditPattern("[{0}..{1}]"); //$NON-NLS-1$
			structuralRelationshipLowerBoundUpperBound_6005Parser = parser;
		}
		return structuralRelationshipLowerBoundUpperBound_6005Parser;
	}

	/**
	* @generated
	*/
	private IParser structuralRelationshipLowerBoundUpperBound_6006Parser;

	/**
	* @generated
	*/
	private IParser getStructuralRelationshipLowerBoundUpperBound_6006Parser() {
		if (structuralRelationshipLowerBoundUpperBound_6006Parser == null) {
			EAttribute[] features = new EAttribute[] { FeaturesPackage.eINSTANCE.getBoundableElement_LowerBound(),
					FeaturesPackage.eINSTANCE.getBoundableElement_UpperBound() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("[{0}..{1,choice,-1#*|-1<{1}}]"); //$NON-NLS-1$
			parser.setEditorPattern("[{0}..{1,choice,-1#*|-1<{1}}]"); //$NON-NLS-1$
			parser.setEditPattern("[{0}..{1}]"); //$NON-NLS-1$
			structuralRelationshipLowerBoundUpperBound_6006Parser = parser;
		}
		return structuralRelationshipLowerBoundUpperBound_6006Parser;
	}

	/**
	* @generated
	*/
	private IParser usesName_6007Parser;

	/**
	* @generated
	*/
	private IParser getUsesName_6007Parser() {
		if (usesName_6007Parser == null) {
			EAttribute[] features = new EAttribute[] { FeaturesPackage.eINSTANCE.getConstrainableElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			usesName_6007Parser = parser;
		}
		return usesName_6007Parser;
	}

	/**
	* @generated
	*/
	private IParser usesLowerBoundUpperBound_6008Parser;

	/**
	* @generated
	*/
	private IParser getUsesLowerBoundUpperBound_6008Parser() {
		if (usesLowerBoundUpperBound_6008Parser == null) {
			EAttribute[] features = new EAttribute[] { FeaturesPackage.eINSTANCE.getBoundableElement_LowerBound(),
					FeaturesPackage.eINSTANCE.getBoundableElement_UpperBound() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("[{0}..{1,choice,-1#*|-1<{1}}]"); //$NON-NLS-1$
			parser.setEditorPattern("[{0}..{1,choice,-1#*|-1<{1}}]"); //$NON-NLS-1$
			parser.setEditPattern("[{0}..{1}]"); //$NON-NLS-1$
			usesLowerBoundUpperBound_6008Parser = parser;
		}
		return usesLowerBoundUpperBound_6008Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case FeatureNameEditPart.VISUAL_ID:
			return getFeatureName_5006Parser();
		case GroupLowerBoundUpperBoundEditPart.VISUAL_ID:
			return getGroupLowerBoundUpperBound_5004Parser();
		case GroupLowerBoundUpperBound2EditPart.VISUAL_ID:
			return getGroupLowerBoundUpperBound_5005Parser();
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3007Parser();
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3008Parser();
		case StructuralRelationshipLowerBoundUpperBoundEditPart.VISUAL_ID:
			return getStructuralRelationshipLowerBoundUpperBound_6005Parser();
		case StructuralRelationshipLowerBoundUpperBound2EditPart.VISUAL_ID:
			return getStructuralRelationshipLowerBoundUpperBound_6006Parser();
		case UsesNameEditPart.VISUAL_ID:
			return getUsesName_6007Parser();
		case UsesLowerBoundUpperBoundEditPart.VISUAL_ID:
			return getUsesLowerBoundUpperBound_6008Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(FeaturesVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(FeaturesVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (FeaturesElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
