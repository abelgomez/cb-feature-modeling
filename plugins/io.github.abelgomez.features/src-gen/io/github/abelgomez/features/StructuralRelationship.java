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
 * A representation of the model object '<em><b>Structural Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.features.StructuralRelationship#getFrom <em>From</em>}</li>
 *   <li>{@link io.github.abelgomez.features.StructuralRelationship#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.features.FeaturesPackage#getStructuralRelationship()
 * @model
 * @generated
 */
public interface StructuralRelationship extends Relationship, BoundableElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.features.RelatableElement#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(RelatableElement)
	 * @see io.github.abelgomez.features.FeaturesPackage#getStructuralRelationship_From()
	 * @see io.github.abelgomez.features.RelatableElement#getChilds
	 * @model opposite="childs" required="true"
	 * @generated
	 */
	RelatableElement getFrom();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.features.StructuralRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(RelatableElement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.features.Feature#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Feature)
	 * @see io.github.abelgomez.features.FeaturesPackage#getStructuralRelationship_To()
	 * @see io.github.abelgomez.features.Feature#getParent
	 * @model opposite="parent" required="true"
	 * @generated
	 */
	Feature getTo();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.features.StructuralRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Feature value);

} // StructuralRelationship
