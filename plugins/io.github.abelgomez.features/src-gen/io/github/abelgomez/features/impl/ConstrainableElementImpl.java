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
package io.github.abelgomez.features.impl;

import io.github.abelgomez.features.ConstrainableElement;
import io.github.abelgomez.features.ConstraintsSet;
import io.github.abelgomez.features.FeaturesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constrainable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.features.impl.ConstrainableElementImpl#getConstraintsSet <em>Constraints Set</em>}</li>
 *   <li>{@link io.github.abelgomez.features.impl.ConstrainableElementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConstrainableElementImpl extends MinimalEObjectImpl.Container implements ConstrainableElement {
	/**
	 * The cached value of the '{@link #getConstraintsSet() <em>Constraints Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintsSet()
	 * @generated
	 * @ordered
	 */
	protected ConstraintsSet constraintsSet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstrainableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturesPackage.Literals.CONSTRAINABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsSet getConstraintsSet() {
		if (constraintsSet != null && constraintsSet.eIsProxy()) {
			InternalEObject oldConstraintsSet = (InternalEObject)constraintsSet;
			constraintsSet = (ConstraintsSet)eResolveProxy(oldConstraintsSet);
			if (constraintsSet != oldConstraintsSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturesPackage.CONSTRAINABLE_ELEMENT__CONSTRAINTS_SET, oldConstraintsSet, constraintsSet));
			}
		}
		return constraintsSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsSet basicGetConstraintsSet() {
		return constraintsSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintsSet(ConstraintsSet newConstraintsSet, NotificationChain msgs) {
		ConstraintsSet oldConstraintsSet = constraintsSet;
		constraintsSet = newConstraintsSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturesPackage.CONSTRAINABLE_ELEMENT__CONSTRAINTS_SET, oldConstraintsSet, newConstraintsSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintsSet(ConstraintsSet newConstraintsSet) {
		if (newConstraintsSet != constraintsSet) {
			NotificationChain msgs = null;
			if (constraintsSet != null)
				msgs = ((InternalEObject)constraintsSet).eInverseRemove(this, FeaturesPackage.CONSTRAINTS_SET__CONTEXT, ConstraintsSet.class, msgs);
			if (newConstraintsSet != null)
				msgs = ((InternalEObject)newConstraintsSet).eInverseAdd(this, FeaturesPackage.CONSTRAINTS_SET__CONTEXT, ConstraintsSet.class, msgs);
			msgs = basicSetConstraintsSet(newConstraintsSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.CONSTRAINABLE_ELEMENT__CONSTRAINTS_SET, newConstraintsSet, newConstraintsSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.CONSTRAINABLE_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeaturesPackage.CONSTRAINABLE_ELEMENT__CONSTRAINTS_SET:
				if (constraintsSet != null)
					msgs = ((InternalEObject)constraintsSet).eInverseRemove(this, FeaturesPackage.CONSTRAINTS_SET__CONTEXT, ConstraintsSet.class, msgs);
				return basicSetConstraintsSet((ConstraintsSet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeaturesPackage.CONSTRAINABLE_ELEMENT__CONSTRAINTS_SET:
				return basicSetConstraintsSet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeaturesPackage.CONSTRAINABLE_ELEMENT__CONSTRAINTS_SET:
				if (resolve) return getConstraintsSet();
				return basicGetConstraintsSet();
			case FeaturesPackage.CONSTRAINABLE_ELEMENT__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeaturesPackage.CONSTRAINABLE_ELEMENT__CONSTRAINTS_SET:
				setConstraintsSet((ConstraintsSet)newValue);
				return;
			case FeaturesPackage.CONSTRAINABLE_ELEMENT__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FeaturesPackage.CONSTRAINABLE_ELEMENT__CONSTRAINTS_SET:
				setConstraintsSet((ConstraintsSet)null);
				return;
			case FeaturesPackage.CONSTRAINABLE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FeaturesPackage.CONSTRAINABLE_ELEMENT__CONSTRAINTS_SET:
				return constraintsSet != null;
			case FeaturesPackage.CONSTRAINABLE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConstrainableElementImpl
