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

import org.eclipse.emf.ecore.EcorePackage;

import io.github.abelgomez.features.FeaturesPackage;
import io.github.abelgomez.features.Group;
import io.github.abelgomez.features.StructuralRelationship;
import io.github.abelgomez.features.diagram.expressions.FeaturesAbstractExpression;
import io.github.abelgomez.features.diagram.expressions.FeaturesOCLFactory;
import io.github.abelgomez.features.diagram.part.FeaturesDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public void init_Group_3005(Group instance) {
		try {
			Object value_0 = FeaturesOCLFactory.getExpression(1, FeaturesPackage.eINSTANCE.getGroup(), null)
					.evaluate(instance);

			value_0 = FeaturesAbstractExpression.performCast(value_0, EcorePackage.eINSTANCE.getEInt());
			instance.setLowerBound(((Integer) value_0).intValue());
			Object value_1 = FeaturesOCLFactory.getExpression(2, FeaturesPackage.eINSTANCE.getGroup(), null)
					.evaluate(instance);

			value_1 = FeaturesAbstractExpression.performCast(value_1, EcorePackage.eINSTANCE.getEInt());
			instance.setUpperBound(((Integer) value_1).intValue());
		} catch (RuntimeException e) {
			FeaturesDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_Group_3006(Group instance) {
		try {
			Object value_0 = FeaturesOCLFactory.getExpression(4, FeaturesPackage.eINSTANCE.getGroup(), null)
					.evaluate(instance);

			value_0 = FeaturesAbstractExpression.performCast(value_0, EcorePackage.eINSTANCE.getEInt());
			instance.setLowerBound(((Integer) value_0).intValue());
			Object value_1 = FeaturesOCLFactory.getExpression(5, FeaturesPackage.eINSTANCE.getGroup(), null)
					.evaluate(instance);

			value_1 = FeaturesAbstractExpression.performCast(value_1, EcorePackage.eINSTANCE.getEInt());
			instance.setUpperBound(((Integer) value_1).intValue());
		} catch (RuntimeException e) {
			FeaturesDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_StructuralRelationship_4008(StructuralRelationship instance) {
		try {
			Object value_0 = FeaturesOCLFactory
					.getExpression(7, FeaturesPackage.eINSTANCE.getStructuralRelationship(), null).evaluate(instance);

			value_0 = FeaturesAbstractExpression.performCast(value_0, EcorePackage.eINSTANCE.getEInt());
			instance.setLowerBound(((Integer) value_0).intValue());
			Object value_1 = FeaturesOCLFactory
					.getExpression(8, FeaturesPackage.eINSTANCE.getStructuralRelationship(), null).evaluate(instance);

			value_1 = FeaturesAbstractExpression.performCast(value_1, EcorePackage.eINSTANCE.getEInt());
			instance.setUpperBound(((Integer) value_1).intValue());
		} catch (RuntimeException e) {
			FeaturesDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_StructuralRelationship_4009(StructuralRelationship instance) {
		try {
			Object value_0 = FeaturesOCLFactory
					.getExpression(11, FeaturesPackage.eINSTANCE.getStructuralRelationship(), null).evaluate(instance);

			value_0 = FeaturesAbstractExpression.performCast(value_0, EcorePackage.eINSTANCE.getEInt());
			instance.setLowerBound(((Integer) value_0).intValue());
			Object value_1 = FeaturesOCLFactory
					.getExpression(12, FeaturesPackage.eINSTANCE.getStructuralRelationship(), null).evaluate(instance);

			value_1 = FeaturesAbstractExpression.performCast(value_1, EcorePackage.eINSTANCE.getEInt());
			instance.setUpperBound(((Integer) value_1).intValue());
		} catch (RuntimeException e) {
			FeaturesDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = FeaturesDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			FeaturesDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
