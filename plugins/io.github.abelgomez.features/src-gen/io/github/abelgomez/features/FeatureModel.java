/**
 * Copyright (c) 2020 Abel Gómez.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Abel Gómez (abel@gomez.llana.me) - initial API and implementation
 */
package io.github.abelgomez.features;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.features.FeatureModel#getFeatures <em>Features</em>}</li>
 *   <li>{@link io.github.abelgomez.features.FeatureModel#getRootFeature <em>Root Feature</em>}</li>
 *   <li>{@link io.github.abelgomez.features.FeatureModel#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link io.github.abelgomez.features.FeatureModel#getModelConstraints <em>Model Constraints</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.features.FeaturesPackage#getFeatureModel()
 * @model
 * @generated
 */
public interface FeatureModel extends ConstrainableElement {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.features.Feature}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.features.Feature#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see io.github.abelgomez.features.FeaturesPackage#getFeatureModel_Features()
	 * @see io.github.abelgomez.features.Feature#getOwner
	 * @model opposite="owner" containment="true" required="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Root Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Feature</em>' reference.
	 * @see #setRootFeature(Feature)
	 * @see io.github.abelgomez.features.FeaturesPackage#getFeatureModel_RootFeature()
	 * @model required="true"
	 * @generated
	 */
	Feature getRootFeature();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.features.FeatureModel#getRootFeature <em>Root Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Feature</em>' reference.
	 * @see #getRootFeature()
	 * @generated
	 */
	void setRootFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.features.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see io.github.abelgomez.features.FeaturesPackage#getFeatureModel_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

	/**
	 * Returns the value of the '<em><b>Model Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.features.ConstraintsSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Constraints</em>' containment reference list.
	 * @see io.github.abelgomez.features.FeaturesPackage#getFeatureModel_ModelConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstraintsSet> getModelConstraints();

} // FeatureModel
