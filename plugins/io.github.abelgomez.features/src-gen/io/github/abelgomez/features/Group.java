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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.features.Group#getParentFeature <em>Parent Feature</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.features.FeaturesPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends BoundableElement, RelatableElement, ConstrainableElement {
	/**
	 * Returns the value of the '<em><b>Parent Feature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.features.Feature#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Feature</em>' container reference.
	 * @see #setParentFeature(Feature)
	 * @see io.github.abelgomez.features.FeaturesPackage#getGroup_ParentFeature()
	 * @see io.github.abelgomez.features.Feature#getGroup
	 * @model opposite="group" required="true" transient="false"
	 * @generated
	 */
	Feature getParentFeature();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.features.Group#getParentFeature <em>Parent Feature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Feature</em>' container reference.
	 * @see #getParentFeature()
	 * @generated
	 */
	void setParentFeature(Feature value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getName();

} // Group
