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
package io.github.abelgomez.features.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import io.github.abelgomez.features.FeatureModel;
import io.github.abelgomez.features.diagram.edit.parts.AttributeEditPart;
import io.github.abelgomez.features.diagram.edit.parts.BiconditionalEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ConstrainableElementConstraintsSetEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ConstraintEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ConstraintsSetEditPart;
import io.github.abelgomez.features.diagram.edit.parts.ExcludesEditPart;
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
import io.github.abelgomez.features.diagram.edit.parts.UsesNameEditPart;
import io.github.abelgomez.features.diagram.part.FeaturesDiagramEditorPlugin;
import io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry;
import io.github.abelgomez.features.diagram.providers.FeaturesElementTypes;
import io.github.abelgomez.features.diagram.providers.FeaturesParserProvider;

/**
 * @generated
 */
public class FeaturesNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		FeaturesDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		FeaturesDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof FeaturesNavigatorItem && !isOwnView(((FeaturesNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof FeaturesNavigatorGroup) {
			FeaturesNavigatorGroup group = (FeaturesNavigatorGroup) element;
			return FeaturesDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof FeaturesNavigatorItem) {
			FeaturesNavigatorItem navigatorItem = (FeaturesNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (FeaturesVisualIDRegistry.getVisualID(view)) {
		case FeatureModelEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://io.github.abelgomez/features/1.0?FeatureModel", //$NON-NLS-1$
					FeaturesElementTypes.FeatureModel_1000);
		case FeatureEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://io.github.abelgomez/features/1.0?Feature", //$NON-NLS-1$
					FeaturesElementTypes.Feature_2003);
		case ConstraintsSetEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://io.github.abelgomez/features/1.0?ConstraintsSet", //$NON-NLS-1$
					FeaturesElementTypes.ConstraintsSet_2004);
		case GroupEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://io.github.abelgomez/features/1.0?Group", //$NON-NLS-1$
					FeaturesElementTypes.Group_3005);
		case Group2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://io.github.abelgomez/features/1.0?Group", //$NON-NLS-1$
					FeaturesElementTypes.Group_3006);
		case AttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://io.github.abelgomez/features/1.0?Attribute", //$NON-NLS-1$
					FeaturesElementTypes.Attribute_3007);
		case ConstraintEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://io.github.abelgomez/features/1.0?Constraint", //$NON-NLS-1$
					FeaturesElementTypes.Constraint_3008);
		case StructuralRelationshipEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://io.github.abelgomez/features/1.0?StructuralRelationship", //$NON-NLS-1$
					FeaturesElementTypes.StructuralRelationship_4008);
		case StructuralRelationship2EditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://io.github.abelgomez/features/1.0?StructuralRelationship", //$NON-NLS-1$
					FeaturesElementTypes.StructuralRelationship_4009);
		case ImpliesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://io.github.abelgomez/features/1.0?Implies", //$NON-NLS-1$
					FeaturesElementTypes.Implies_4010);
		case BiconditionalEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://io.github.abelgomez/features/1.0?Biconditional", //$NON-NLS-1$
					FeaturesElementTypes.Biconditional_4011);
		case ExcludesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://io.github.abelgomez/features/1.0?Excludes", //$NON-NLS-1$
					FeaturesElementTypes.Excludes_4012);
		case UsesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://io.github.abelgomez/features/1.0?Uses", //$NON-NLS-1$
					FeaturesElementTypes.Uses_4013);
		case ConstrainableElementConstraintsSetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://io.github.abelgomez/features/1.0?ConstrainableElement?constraintsSet", //$NON-NLS-1$
					FeaturesElementTypes.ConstrainableElementConstraintsSet_4014);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = FeaturesDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && FeaturesElementTypes.isKnownElementType(elementType)) {
			image = FeaturesElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof FeaturesNavigatorGroup) {
			FeaturesNavigatorGroup group = (FeaturesNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof FeaturesNavigatorItem) {
			FeaturesNavigatorItem navigatorItem = (FeaturesNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (FeaturesVisualIDRegistry.getVisualID(view)) {
		case FeatureModelEditPart.VISUAL_ID:
			return getFeatureModel_1000Text(view);
		case FeatureEditPart.VISUAL_ID:
			return getFeature_2003Text(view);
		case ConstraintsSetEditPart.VISUAL_ID:
			return getConstraintsSet_2004Text(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3005Text(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3006Text(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3007Text(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3008Text(view);
		case StructuralRelationshipEditPart.VISUAL_ID:
			return getStructuralRelationship_4008Text(view);
		case StructuralRelationship2EditPart.VISUAL_ID:
			return getStructuralRelationship_4009Text(view);
		case ImpliesEditPart.VISUAL_ID:
			return getImplies_4010Text(view);
		case BiconditionalEditPart.VISUAL_ID:
			return getBiconditional_4011Text(view);
		case ExcludesEditPart.VISUAL_ID:
			return getExcludes_4012Text(view);
		case UsesEditPart.VISUAL_ID:
			return getUses_4013Text(view);
		case ConstrainableElementConstraintsSetEditPart.VISUAL_ID:
			return getConstrainableElementConstraintsSet_4014Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getFeatureModel_1000Text(View view) {
		FeatureModel domainModelElement = (FeatureModel) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			FeaturesDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFeature_2003Text(View view) {
		IParser parser = FeaturesParserProvider.getParser(FeaturesElementTypes.Feature_2003,
				view.getElement() != null ? view.getElement() : view,
				FeaturesVisualIDRegistry.getType(FeatureNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FeaturesDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConstraintsSet_2004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getGroup_3005Text(View view) {
		IParser parser = FeaturesParserProvider.getParser(FeaturesElementTypes.Group_3005,
				view.getElement() != null ? view.getElement() : view,
				FeaturesVisualIDRegistry.getType(GroupLowerBoundUpperBoundEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FeaturesDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3006Text(View view) {
		IParser parser = FeaturesParserProvider.getParser(FeaturesElementTypes.Group_3006,
				view.getElement() != null ? view.getElement() : view,
				FeaturesVisualIDRegistry.getType(GroupLowerBoundUpperBound2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FeaturesDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAttribute_3007Text(View view) {
		IParser parser = FeaturesParserProvider.getParser(FeaturesElementTypes.Attribute_3007,
				view.getElement() != null ? view.getElement() : view,
				FeaturesVisualIDRegistry.getType(AttributeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FeaturesDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConstraint_3008Text(View view) {
		IParser parser = FeaturesParserProvider.getParser(FeaturesElementTypes.Constraint_3008,
				view.getElement() != null ? view.getElement() : view,
				FeaturesVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FeaturesDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStructuralRelationship_4008Text(View view) {
		IParser parser = FeaturesParserProvider.getParser(FeaturesElementTypes.StructuralRelationship_4008,
				view.getElement() != null ? view.getElement() : view,
				FeaturesVisualIDRegistry.getType(StructuralRelationshipLowerBoundUpperBoundEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FeaturesDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStructuralRelationship_4009Text(View view) {
		IParser parser = FeaturesParserProvider.getParser(FeaturesElementTypes.StructuralRelationship_4009,
				view.getElement() != null ? view.getElement() : view,
				FeaturesVisualIDRegistry.getType(StructuralRelationshipLowerBoundUpperBound2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FeaturesDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImplies_4010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getBiconditional_4011Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getExcludes_4012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUses_4013Text(View view) {
		IParser parser = FeaturesParserProvider.getParser(FeaturesElementTypes.Uses_4013,
				view.getElement() != null ? view.getElement() : view,
				FeaturesVisualIDRegistry.getType(UsesNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FeaturesDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConstrainableElementConstraintsSet_4014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return FeatureModelEditPart.MODEL_ID.equals(FeaturesVisualIDRegistry.getModelID(view));
	}

}
