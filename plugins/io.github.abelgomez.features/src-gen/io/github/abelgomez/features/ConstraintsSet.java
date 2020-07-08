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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.features.ConstraintsSet#getContext <em>Context</em>}</li>
 *   <li>{@link io.github.abelgomez.features.ConstraintsSet#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.features.FeaturesPackage#getConstraintsSet()
 * @model
 * @generated
 */
public interface ConstraintsSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.features.ConstrainableElement#getConstraintsSet <em>Constraints Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(ConstrainableElement)
	 * @see io.github.abelgomez.features.FeaturesPackage#getConstraintsSet_Context()
	 * @see io.github.abelgomez.features.ConstrainableElement#getConstraintsSet
	 * @model opposite="constraintsSet" required="true"
	 * @generated
	 */
	ConstrainableElement getContext();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.features.ConstraintsSet#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(ConstrainableElement value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.features.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see io.github.abelgomez.features.FeaturesPackage#getConstraintsSet_Constraints()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // ConstraintsSet
