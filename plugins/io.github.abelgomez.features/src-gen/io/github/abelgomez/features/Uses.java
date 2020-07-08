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
 * A representation of the model object '<em><b>Uses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.features.Uses#getOpposite <em>Opposite</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.features.FeaturesPackage#getUses()
 * @model
 * @generated
 */
public interface Uses extends GenericRelationship, BoundableElement, ConstrainableElement {
	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Uses)
	 * @see io.github.abelgomez.features.FeaturesPackage#getUses_Opposite()
	 * @model
	 * @generated
	 */
	Uses getOpposite();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.features.Uses#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Uses value);

} // Uses
