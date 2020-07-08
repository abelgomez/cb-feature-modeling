
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

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import io.github.abelgomez.features.diagram.providers.FeaturesElementTypes;

/**
 * @generated
 */
public class FeaturesPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createFeatures1Group());
		paletteRoot.add(createGroups2Group());
		paletteRoot.add(createRelationships3Group());
		paletteRoot.add(createConstraints4Group());
	}

	/**
	* Creates "Features" palette tool group
	* @generated
	*/
	private PaletteContainer createFeatures1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Features1Group_title);
		paletteContainer.setId("createFeatures1Group"); //$NON-NLS-1$
		paletteContainer.add(createFeature1CreationTool());
		paletteContainer.add(createAttribute2CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Groups" palette tool group
	* @generated
	*/
	private PaletteContainer createGroups2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Groups2Group_title);
		paletteContainer.setId("createGroups2Group"); //$NON-NLS-1$
		paletteContainer.add(createAlternativeGroup1CreationTool());
		paletteContainer.add(createSelectionGroup2CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Relationships" palette tool group
	* @generated
	*/
	private PaletteContainer createRelationships3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Relationships3Group_title);
		paletteContainer.setId("createRelationships3Group"); //$NON-NLS-1$
		paletteContainer.add(createMandatory1CreationTool());
		paletteContainer.add(createOptional2CreationTool());
		paletteContainer.add(createImplies3CreationTool());
		paletteContainer.add(createBiconditional4CreationTool());
		paletteContainer.add(createExcludes5CreationTool());
		paletteContainer.add(createUses6CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Constraints" palette tool group
	* @generated
	*/
	private PaletteContainer createConstraints4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Constraints4Group_title);
		paletteContainer.setId("createConstraints4Group"); //$NON-NLS-1$
		paletteContainer.add(createConstraintsSet1CreationTool());
		paletteContainer.add(createExpression2CreationTool());
		paletteContainer.add(createConstraintLink3CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createFeature1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Feature1CreationTool_title,
				Messages.Feature1CreationTool_desc, Collections.singletonList(FeaturesElementTypes.Feature_2003));
		entry.setId("createFeature1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FeaturesElementTypes.getImageDescriptor(FeaturesElementTypes.Feature_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttribute2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Attribute2CreationTool_title,
				Messages.Attribute2CreationTool_desc, Collections.singletonList(FeaturesElementTypes.Attribute_3007));
		entry.setId("createAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FeaturesElementTypes.getImageDescriptor(FeaturesElementTypes.Attribute_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAlternativeGroup1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AlternativeGroup1CreationTool_title, null,
				Collections.singletonList(FeaturesElementTypes.Group_3006));
		entry.setId("createAlternativeGroup1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FeaturesDiagramEditorPlugin.findImageDescriptor("icons/obj16/AlternativeGroup.png")); //$NON-NLS-1$
		entry.setLargeIcon(FeaturesDiagramEditorPlugin.findImageDescriptor("icons/obj16/AlternativeGroup.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSelectionGroup2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SelectionGroup2CreationTool_title,
				Messages.SelectionGroup2CreationTool_desc, Collections.singletonList(FeaturesElementTypes.Group_3005));
		entry.setId("createSelectionGroup2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FeaturesDiagramEditorPlugin.findImageDescriptor("icons/obj16/SelectionGroup.png")); //$NON-NLS-1$
		entry.setLargeIcon(FeaturesDiagramEditorPlugin.findImageDescriptor("icons/obj16/SelectionGroup.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMandatory1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Mandatory1CreationTool_title,
				Messages.Mandatory1CreationTool_desc,
				Collections.singletonList(FeaturesElementTypes.StructuralRelationship_4008));
		entry.setId("createMandatory1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				FeaturesDiagramEditorPlugin.findImageDescriptor("icons/obj16/MandatoryBinaryRelationship.png")); //$NON-NLS-1$
		entry.setLargeIcon(
				FeaturesDiagramEditorPlugin.findImageDescriptor("icons/obj16/MandatoryBinaryRelationship.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOptional2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Optional2CreationTool_title,
				Messages.Optional2CreationTool_desc,
				Collections.singletonList(FeaturesElementTypes.StructuralRelationship_4009));
		entry.setId("createOptional2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				FeaturesDiagramEditorPlugin.findImageDescriptor("icons/obj16/OptionalBinaryRelationship.png")); //$NON-NLS-1$
		entry.setLargeIcon(
				FeaturesDiagramEditorPlugin.findImageDescriptor("icons/obj16/OptionalBinaryRelationship.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImplies3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Implies3CreationTool_title,
				Messages.Implies3CreationTool_desc, Collections.singletonList(FeaturesElementTypes.Implies_4010));
		entry.setId("createImplies3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FeaturesElementTypes.getImageDescriptor(FeaturesElementTypes.Implies_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createBiconditional4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Biconditional4CreationTool_title,
				Messages.Biconditional4CreationTool_desc,
				Collections.singletonList(FeaturesElementTypes.Biconditional_4011));
		entry.setId("createBiconditional4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FeaturesElementTypes.getImageDescriptor(FeaturesElementTypes.Biconditional_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExcludes5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Excludes5CreationTool_title,
				Messages.Excludes5CreationTool_desc, Collections.singletonList(FeaturesElementTypes.Excludes_4012));
		entry.setId("createExcludes5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FeaturesElementTypes.getImageDescriptor(FeaturesElementTypes.Excludes_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUses6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Uses6CreationTool_title, null,
				Collections.singletonList(FeaturesElementTypes.Uses_4013));
		entry.setId("createUses6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FeaturesElementTypes.getImageDescriptor(FeaturesElementTypes.Uses_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConstraintsSet1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ConstraintsSet1CreationTool_title, null,
				Collections.singletonList(FeaturesElementTypes.ConstraintsSet_2004));
		entry.setId("createConstraintsSet1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FeaturesElementTypes.getImageDescriptor(FeaturesElementTypes.ConstraintsSet_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExpression2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Expression2CreationTool_title, null,
				Collections.singletonList(FeaturesElementTypes.Constraint_3008));
		entry.setId("createExpression2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FeaturesElementTypes.getImageDescriptor(FeaturesElementTypes.Constraint_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConstraintLink3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ConstraintLink3CreationTool_title, null,
				Collections.singletonList(FeaturesElementTypes.ConstrainableElementConstraintsSet_4014));
		entry.setId("createConstraintLink3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FeaturesDiagramEditorPlugin.findImageDescriptor("icons/obj16/ConstraintLink.png")); //$NON-NLS-1$
		entry.setLargeIcon(FeaturesDiagramEditorPlugin.findImageDescriptor("icons/obj16/ConstraintLink.png")); //$NON-NLS-1$
		return entry;
	}

}
