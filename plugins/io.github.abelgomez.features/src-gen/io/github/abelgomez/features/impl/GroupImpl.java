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
import io.github.abelgomez.features.Feature;
import io.github.abelgomez.features.FeaturesPackage;
import io.github.abelgomez.features.Group;
import io.github.abelgomez.features.RelatableElement;
import io.github.abelgomez.features.StructuralRelationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.features.impl.GroupImpl#getChilds <em>Childs</em>}</li>
 *   <li>{@link io.github.abelgomez.features.impl.GroupImpl#getConstraintsSet <em>Constraints Set</em>}</li>
 *   <li>{@link io.github.abelgomez.features.impl.GroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.github.abelgomez.features.impl.GroupImpl#getParentFeature <em>Parent Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends BoundableElementImpl implements Group {
	/**
	 * The cached value of the '{@link #getChilds() <em>Childs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChilds()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuralRelationship> childs;

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
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturesPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuralRelationship> getChilds() {
		if (childs == null) {
			childs = new EObjectWithInverseResolvingEList<StructuralRelationship>(StructuralRelationship.class, this, FeaturesPackage.GROUP__CHILDS, FeaturesPackage.STRUCTURAL_RELATIONSHIP__FROM);
		}
		return childs;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturesPackage.GROUP__CONSTRAINTS_SET, oldConstraintsSet, constraintsSet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturesPackage.GROUP__CONSTRAINTS_SET, oldConstraintsSet, newConstraintsSet);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.GROUP__CONSTRAINTS_SET, newConstraintsSet, newConstraintsSet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getParentFeature() {
		if (eContainerFeatureID() != FeaturesPackage.GROUP__PARENT_FEATURE) return null;
		return (Feature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFeature(Feature newParentFeature, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentFeature, FeaturesPackage.GROUP__PARENT_FEATURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFeature(Feature newParentFeature) {
		if (newParentFeature != eInternalContainer() || (eContainerFeatureID() != FeaturesPackage.GROUP__PARENT_FEATURE && newParentFeature != null)) {
			if (EcoreUtil.isAncestor(this, newParentFeature))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFeature != null)
				msgs = ((InternalEObject)newParentFeature).eInverseAdd(this, FeaturesPackage.FEATURE__GROUP, Feature.class, msgs);
			msgs = basicSetParentFeature(newParentFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.GROUP__PARENT_FEATURE, newParentFeature, newParentFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeaturesPackage.GROUP__CHILDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChilds()).basicAdd(otherEnd, msgs);
			case FeaturesPackage.GROUP__CONSTRAINTS_SET:
				if (constraintsSet != null)
					msgs = ((InternalEObject)constraintsSet).eInverseRemove(this, FeaturesPackage.CONSTRAINTS_SET__CONTEXT, ConstraintsSet.class, msgs);
				return basicSetConstraintsSet((ConstraintsSet)otherEnd, msgs);
			case FeaturesPackage.GROUP__PARENT_FEATURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentFeature((Feature)otherEnd, msgs);
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
			case FeaturesPackage.GROUP__CHILDS:
				return ((InternalEList<?>)getChilds()).basicRemove(otherEnd, msgs);
			case FeaturesPackage.GROUP__CONSTRAINTS_SET:
				return basicSetConstraintsSet(null, msgs);
			case FeaturesPackage.GROUP__PARENT_FEATURE:
				return basicSetParentFeature(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FeaturesPackage.GROUP__PARENT_FEATURE:
				return eInternalContainer().eInverseRemove(this, FeaturesPackage.FEATURE__GROUP, Feature.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeaturesPackage.GROUP__CHILDS:
				return getChilds();
			case FeaturesPackage.GROUP__CONSTRAINTS_SET:
				if (resolve) return getConstraintsSet();
				return basicGetConstraintsSet();
			case FeaturesPackage.GROUP__NAME:
				return getName();
			case FeaturesPackage.GROUP__PARENT_FEATURE:
				return getParentFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeaturesPackage.GROUP__CHILDS:
				getChilds().clear();
				getChilds().addAll((Collection<? extends StructuralRelationship>)newValue);
				return;
			case FeaturesPackage.GROUP__CONSTRAINTS_SET:
				setConstraintsSet((ConstraintsSet)newValue);
				return;
			case FeaturesPackage.GROUP__NAME:
				setName((String)newValue);
				return;
			case FeaturesPackage.GROUP__PARENT_FEATURE:
				setParentFeature((Feature)newValue);
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
			case FeaturesPackage.GROUP__CHILDS:
				getChilds().clear();
				return;
			case FeaturesPackage.GROUP__CONSTRAINTS_SET:
				setConstraintsSet((ConstraintsSet)null);
				return;
			case FeaturesPackage.GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FeaturesPackage.GROUP__PARENT_FEATURE:
				setParentFeature((Feature)null);
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
			case FeaturesPackage.GROUP__CHILDS:
				return childs != null && !childs.isEmpty();
			case FeaturesPackage.GROUP__CONSTRAINTS_SET:
				return constraintsSet != null;
			case FeaturesPackage.GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FeaturesPackage.GROUP__PARENT_FEATURE:
				return getParentFeature() != null;
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
		if (baseClass == RelatableElement.class) {
			switch (derivedFeatureID) {
				case FeaturesPackage.GROUP__CHILDS: return FeaturesPackage.RELATABLE_ELEMENT__CHILDS;
				default: return -1;
			}
		}
		if (baseClass == ConstrainableElement.class) {
			switch (derivedFeatureID) {
				case FeaturesPackage.GROUP__CONSTRAINTS_SET: return FeaturesPackage.CONSTRAINABLE_ELEMENT__CONSTRAINTS_SET;
				case FeaturesPackage.GROUP__NAME: return FeaturesPackage.CONSTRAINABLE_ELEMENT__NAME;
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
		if (baseClass == RelatableElement.class) {
			switch (baseFeatureID) {
				case FeaturesPackage.RELATABLE_ELEMENT__CHILDS: return FeaturesPackage.GROUP__CHILDS;
				default: return -1;
			}
		}
		if (baseClass == ConstrainableElement.class) {
			switch (baseFeatureID) {
				case FeaturesPackage.CONSTRAINABLE_ELEMENT__CONSTRAINTS_SET: return FeaturesPackage.GROUP__CONSTRAINTS_SET;
				case FeaturesPackage.CONSTRAINABLE_ELEMENT__NAME: return FeaturesPackage.GROUP__NAME;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GroupImpl
