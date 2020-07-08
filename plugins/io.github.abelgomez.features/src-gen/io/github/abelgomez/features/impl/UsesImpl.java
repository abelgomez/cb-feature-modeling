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

import io.github.abelgomez.features.BoundableElement;
import io.github.abelgomez.features.ConstrainableElement;
import io.github.abelgomez.features.ConstraintsSet;
import io.github.abelgomez.features.FeaturesPackage;
import io.github.abelgomez.features.Uses;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.features.impl.UsesImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link io.github.abelgomez.features.impl.UsesImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link io.github.abelgomez.features.impl.UsesImpl#getConstraintsSet <em>Constraints Set</em>}</li>
 *   <li>{@link io.github.abelgomez.features.impl.UsesImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.github.abelgomez.features.impl.UsesImpl#getOpposite <em>Opposite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsesImpl extends GenericRelationshipImpl implements Uses {
	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int upperBound = UPPER_BOUND_EDEFAULT;

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
	 * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite()
	 * @generated
	 * @ordered
	 */
	protected Uses opposite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturesPackage.Literals.USES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.USES__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(int newUpperBound) {
		int oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.USES__UPPER_BOUND, oldUpperBound, upperBound));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturesPackage.USES__CONSTRAINTS_SET, oldConstraintsSet, constraintsSet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturesPackage.USES__CONSTRAINTS_SET, oldConstraintsSet, newConstraintsSet);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.USES__CONSTRAINTS_SET, newConstraintsSet, newConstraintsSet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.USES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uses getOpposite() {
		if (opposite != null && opposite.eIsProxy()) {
			InternalEObject oldOpposite = (InternalEObject)opposite;
			opposite = (Uses)eResolveProxy(oldOpposite);
			if (opposite != oldOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturesPackage.USES__OPPOSITE, oldOpposite, opposite));
			}
		}
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uses basicGetOpposite() {
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(Uses newOpposite) {
		Uses oldOpposite = opposite;
		opposite = newOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.USES__OPPOSITE, oldOpposite, opposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeaturesPackage.USES__CONSTRAINTS_SET:
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
			case FeaturesPackage.USES__CONSTRAINTS_SET:
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
			case FeaturesPackage.USES__LOWER_BOUND:
				return getLowerBound();
			case FeaturesPackage.USES__UPPER_BOUND:
				return getUpperBound();
			case FeaturesPackage.USES__CONSTRAINTS_SET:
				if (resolve) return getConstraintsSet();
				return basicGetConstraintsSet();
			case FeaturesPackage.USES__NAME:
				return getName();
			case FeaturesPackage.USES__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
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
			case FeaturesPackage.USES__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case FeaturesPackage.USES__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case FeaturesPackage.USES__CONSTRAINTS_SET:
				setConstraintsSet((ConstraintsSet)newValue);
				return;
			case FeaturesPackage.USES__NAME:
				setName((String)newValue);
				return;
			case FeaturesPackage.USES__OPPOSITE:
				setOpposite((Uses)newValue);
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
			case FeaturesPackage.USES__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case FeaturesPackage.USES__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case FeaturesPackage.USES__CONSTRAINTS_SET:
				setConstraintsSet((ConstraintsSet)null);
				return;
			case FeaturesPackage.USES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FeaturesPackage.USES__OPPOSITE:
				setOpposite((Uses)null);
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
			case FeaturesPackage.USES__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case FeaturesPackage.USES__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case FeaturesPackage.USES__CONSTRAINTS_SET:
				return constraintsSet != null;
			case FeaturesPackage.USES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FeaturesPackage.USES__OPPOSITE:
				return opposite != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BoundableElement.class) {
			switch (derivedFeatureID) {
				case FeaturesPackage.USES__LOWER_BOUND: return FeaturesPackage.BOUNDABLE_ELEMENT__LOWER_BOUND;
				case FeaturesPackage.USES__UPPER_BOUND: return FeaturesPackage.BOUNDABLE_ELEMENT__UPPER_BOUND;
				default: return -1;
			}
		}
		if (baseClass == ConstrainableElement.class) {
			switch (derivedFeatureID) {
				case FeaturesPackage.USES__CONSTRAINTS_SET: return FeaturesPackage.CONSTRAINABLE_ELEMENT__CONSTRAINTS_SET;
				case FeaturesPackage.USES__NAME: return FeaturesPackage.CONSTRAINABLE_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BoundableElement.class) {
			switch (baseFeatureID) {
				case FeaturesPackage.BOUNDABLE_ELEMENT__LOWER_BOUND: return FeaturesPackage.USES__LOWER_BOUND;
				case FeaturesPackage.BOUNDABLE_ELEMENT__UPPER_BOUND: return FeaturesPackage.USES__UPPER_BOUND;
				default: return -1;
			}
		}
		if (baseClass == ConstrainableElement.class) {
			switch (baseFeatureID) {
				case FeaturesPackage.CONSTRAINABLE_ELEMENT__CONSTRAINTS_SET: return FeaturesPackage.USES__CONSTRAINTS_SET;
				case FeaturesPackage.CONSTRAINABLE_ELEMENT__NAME: return FeaturesPackage.USES__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //UsesImpl
