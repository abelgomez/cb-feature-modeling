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
 * A representation of the model object '<em><b>Relatable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.features.RelatableElement#getChilds <em>Childs</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.features.FeaturesPackage#getRelatableElement()
 * @model abstract="true"
 * @generated
 */
public interface RelatableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Childs</b></em>' reference list.
	 * The list contents are of type {@link io.github.abelgomez.features.StructuralRelationship}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.features.StructuralRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Childs</em>' reference list.
	 * @see io.github.abelgomez.features.FeaturesPackage#getRelatableElement_Childs()
	 * @see io.github.abelgomez.features.StructuralRelationship#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<StructuralRelationship> getChilds();

} // RelatableElement
