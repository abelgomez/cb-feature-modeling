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

import io.github.abelgomez.features.Attribute;
import io.github.abelgomez.features.ConstrainableElement;
import io.github.abelgomez.features.ConstraintsSet;
import io.github.abelgomez.features.Feature;
import io.github.abelgomez.features.FeatureModel;
import io.github.abelgomez.features.FeaturesPackage;
import io.github.abelgomez.features.Group;
import io.github.abelgomez.features.StructuralRelationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.features.impl.FeatureImpl#getConstraintsSet <em>Constraints Set</em>}</li>
 *   <li>{@link io.github.abelgomez.features.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.github.abelgomez.features.impl.FeatureImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.github.abelgomez.features.impl.FeatureImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link io.github.abelgomez.features.impl.FeatureImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link io.github.abelgomez.features.impl.FeatureImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends RelatableElementImpl implements Feature {
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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected Group group;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected StructuralRelationship parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturesPackage.Literals.FEATURE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturesPackage.FEATURE__CONSTRAINTS_SET, oldConstraintsSet, constraintsSet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturesPackage.FEATURE__CONSTRAINTS_SET, oldConstraintsSet, newConstraintsSet);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.FEATURE__CONSTRAINTS_SET, newConstraintsSet, newConstraintsSet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
		Group oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturesPackage.FEATURE__GROUP, oldGroup, newGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, FeaturesPackage.GROUP__PARENT_FEATURE, Group.class, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, FeaturesPackage.GROUP__PARENT_FEATURE, Group.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.FEATURE__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, FeaturesPackage.FEATURE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModel getOwner() {
		if (eContainerFeatureID() != FeaturesPackage.FEATURE__OWNER) return null;
		return (FeatureModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(FeatureModel newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, FeaturesPackage.FEATURE__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(FeatureModel newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != FeaturesPackage.FEATURE__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, FeaturesPackage.FEATURE_MODEL__FEATURES, FeatureModel.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.FEATURE__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralRelationship getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (StructuralRelationship)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturesPackage.FEATURE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralRelationship basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(StructuralRelationship newParent, NotificationChain msgs) {
		StructuralRelationship oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturesPackage.FEATURE__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(StructuralRelationship newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, FeaturesPackage.STRUCTURAL_RELATIONSHIP__TO, StructuralRelationship.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, FeaturesPackage.STRUCTURAL_RELATIONSHIP__TO, StructuralRelationship.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.FEATURE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeaturesPackage.FEATURE__CONSTRAINTS_SET:
				if (constraintsSet != null)
					msgs = ((InternalEObject)constraintsSet).eInverseRemove(this, FeaturesPackage.CONSTRAINTS_SET__CONTEXT, ConstraintsSet.class, msgs);
				return basicSetConstraintsSet((ConstraintsSet)otherEnd, msgs);
			case FeaturesPackage.FEATURE__GROUP:
				if (group != null)
					msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturesPackage.FEATURE__GROUP, null, msgs);
				return basicSetGroup((Group)otherEnd, msgs);
			case FeaturesPackage.FEATURE__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((FeatureModel)otherEnd, msgs);
			case FeaturesPackage.FEATURE__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, FeaturesPackage.STRUCTURAL_RELATIONSHIP__TO, StructuralRelationship.class, msgs);
				return basicSetParent((StructuralRelationship)otherEnd, msgs);
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
			case FeaturesPackage.FEATURE__CONSTRAINTS_SET:
				return basicSetConstraintsSet(null, msgs);
			case FeaturesPackage.FEATURE__GROUP:
				return basicSetGroup(null, msgs);
			case FeaturesPackage.FEATURE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case FeaturesPackage.FEATURE__OWNER:
				return basicSetOwner(null, msgs);
			case FeaturesPackage.FEATURE__PARENT:
				return basicSetParent(null, msgs);
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
			case FeaturesPackage.FEATURE__OWNER:
				return eInternalContainer().eInverseRemove(this, FeaturesPackage.FEATURE_MODEL__FEATURES, FeatureModel.class, msgs);
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
			case FeaturesPackage.FEATURE__CONSTRAINTS_SET:
				if (resolve) return getConstraintsSet();
				return basicGetConstraintsSet();
			case FeaturesPackage.FEATURE__NAME:
				return getName();
			case FeaturesPackage.FEATURE__GROUP:
				return getGroup();
			case FeaturesPackage.FEATURE__ATTRIBUTES:
				return getAttributes();
			case FeaturesPackage.FEATURE__OWNER:
				return getOwner();
			case FeaturesPackage.FEATURE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
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
			case FeaturesPackage.FEATURE__CONSTRAINTS_SET:
				setConstraintsSet((ConstraintsSet)newValue);
				return;
			case FeaturesPackage.FEATURE__NAME:
				setName((String)newValue);
				return;
			case FeaturesPackage.FEATURE__GROUP:
				setGroup((Group)newValue);
				return;
			case FeaturesPackage.FEATURE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case FeaturesPackage.FEATURE__OWNER:
				setOwner((FeatureModel)newValue);
				return;
			case FeaturesPackage.FEATURE__PARENT:
				setParent((StructuralRelationship)newValue);
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
			case FeaturesPackage.FEATURE__CONSTRAINTS_SET:
				setConstraintsSet((ConstraintsSet)null);
				return;
			case FeaturesPackage.FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FeaturesPackage.FEATURE__GROUP:
				setGroup((Group)null);
				return;
			case FeaturesPackage.FEATURE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case FeaturesPackage.FEATURE__OWNER:
				setOwner((FeatureModel)null);
				return;
			case FeaturesPackage.FEATURE__PARENT:
				setParent((StructuralRelationship)null);
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
			case FeaturesPackage.FEATURE__CONSTRAINTS_SET:
				return constraintsSet != null;
			case FeaturesPackage.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FeaturesPackage.FEATURE__GROUP:
				return group != null;
			case FeaturesPackage.FEATURE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case FeaturesPackage.FEATURE__OWNER:
				return getOwner() != null;
			case FeaturesPackage.FEATURE__PARENT:
				return parent != null;
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
		if (baseClass == ConstrainableElement.class) {
			switch (derivedFeatureID) {
				case FeaturesPackage.FEATURE__CONSTRAINTS_SET: return FeaturesPackage.CONSTRAINABLE_ELEMENT__CONSTRAINTS_SET;
				case FeaturesPackage.FEATURE__NAME: return FeaturesPackage.CONSTRAINABLE_ELEMENT__NAME;
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
		if (baseClass == ConstrainableElement.class) {
			switch (baseFeatureID) {
				case FeaturesPackage.CONSTRAINABLE_ELEMENT__CONSTRAINTS_SET: return FeaturesPackage.FEATURE__CONSTRAINTS_SET;
				case FeaturesPackage.CONSTRAINABLE_ELEMENT__NAME: return FeaturesPackage.FEATURE__NAME;
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

} //FeatureImpl
