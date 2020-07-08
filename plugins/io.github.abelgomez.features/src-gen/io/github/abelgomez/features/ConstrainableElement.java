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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constrainable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.features.ConstrainableElement#getConstraintsSet <em>Constraints Set</em>}</li>
 *   <li>{@link io.github.abelgomez.features.ConstrainableElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.features.FeaturesPackage#getConstrainableElement()
 * @model abstract="true"
 * @generated
 */
public interface ConstrainableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraints Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.features.ConstraintsSet#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints Set</em>' reference.
	 * @see #setConstraintsSet(ConstraintsSet)
	 * @see io.github.abelgomez.features.FeaturesPackage#getConstrainableElement_ConstraintsSet()
	 * @see io.github.abelgomez.features.ConstraintsSet#getContext
	 * @model opposite="context"
	 * @generated
	 */
	ConstraintsSet getConstraintsSet();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.features.ConstrainableElement#getConstraintsSet <em>Constraints Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints Set</em>' reference.
	 * @see #getConstraintsSet()
	 * @generated
	 */
	void setConstraintsSet(ConstraintsSet value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see io.github.abelgomez.features.FeaturesPackage#getConstrainableElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.features.ConstrainableElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ConstrainableElement
