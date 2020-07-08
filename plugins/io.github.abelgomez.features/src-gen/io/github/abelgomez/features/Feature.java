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
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.features.Feature#getGroup <em>Group</em>}</li>
 *   <li>{@link io.github.abelgomez.features.Feature#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link io.github.abelgomez.features.Feature#getOwner <em>Owner</em>}</li>
 *   <li>{@link io.github.abelgomez.features.Feature#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.features.FeaturesPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends RelatableElement, ConstrainableElement {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.features.Group#getParentFeature <em>Parent Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(Group)
	 * @see io.github.abelgomez.features.FeaturesPackage#getFeature_Group()
	 * @see io.github.abelgomez.features.Group#getParentFeature
	 * @model opposite="parentFeature" containment="true"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.features.Feature#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.features.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see io.github.abelgomez.features.FeaturesPackage#getFeature_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.features.FeatureModel#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(FeatureModel)
	 * @see io.github.abelgomez.features.FeaturesPackage#getFeature_Owner()
	 * @see io.github.abelgomez.features.FeatureModel#getFeatures
	 * @model opposite="features" required="true" transient="false"
	 * @generated
	 */
	FeatureModel getOwner();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.features.Feature#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(FeatureModel value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.features.StructuralRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(StructuralRelationship)
	 * @see io.github.abelgomez.features.FeaturesPackage#getFeature_Parent()
	 * @see io.github.abelgomez.features.StructuralRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	StructuralRelationship getParent();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.features.Feature#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(StructuralRelationship value);

} // Feature
