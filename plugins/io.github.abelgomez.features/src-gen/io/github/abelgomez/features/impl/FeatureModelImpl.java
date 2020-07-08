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

import io.github.abelgomez.features.ConstraintsSet;
import io.github.abelgomez.features.Feature;
import io.github.abelgomez.features.FeatureModel;
import io.github.abelgomez.features.FeaturesPackage;
import io.github.abelgomez.features.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.features.impl.FeatureModelImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link io.github.abelgomez.features.impl.FeatureModelImpl#getRootFeature <em>Root Feature</em>}</li>
 *   <li>{@link io.github.abelgomez.features.impl.FeatureModelImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link io.github.abelgomez.features.impl.FeatureModelImpl#getModelConstraints <em>Model Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureModelImpl extends ConstrainableElementImpl implements FeatureModel {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getRootFeature() <em>Root Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature rootFeature;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationships;

	/**
	 * The cached value of the '{@link #getModelConstraints() <em>Model Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintsSet> modelConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturesPackage.Literals.FEATURE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, FeaturesPackage.FEATURE_MODEL__FEATURES, FeaturesPackage.FEATURE__OWNER);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getRootFeature() {
		if (rootFeature != null && rootFeature.eIsProxy()) {
			InternalEObject oldRootFeature = (InternalEObject)rootFeature;
			rootFeature = (Feature)eResolveProxy(oldRootFeature);
			if (rootFeature != oldRootFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturesPackage.FEATURE_MODEL__ROOT_FEATURE, oldRootFeature, rootFeature));
			}
		}
		return rootFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetRootFeature() {
		return rootFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootFeature(Feature newRootFeature) {
		Feature oldRootFeature = rootFeature;
		rootFeature = newRootFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.FEATURE_MODEL__ROOT_FEATURE, oldRootFeature, rootFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<Relationship>(Relationship.class, this, FeaturesPackage.FEATURE_MODEL__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintsSet> getModelConstraints() {
		if (modelConstraints == null) {
			modelConstraints = new EObjectContainmentEList<ConstraintsSet>(ConstraintsSet.class, this, FeaturesPackage.FEATURE_MODEL__MODEL_CONSTRAINTS);
		}
		return modelConstraints;
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
			case FeaturesPackage.FEATURE_MODEL__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
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
			case FeaturesPackage.FEATURE_MODEL__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case FeaturesPackage.FEATURE_MODEL__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
			case FeaturesPackage.FEATURE_MODEL__MODEL_CONSTRAINTS:
				return ((InternalEList<?>)getModelConstraints()).basicRemove(otherEnd, msgs);
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
			case FeaturesPackage.FEATURE_MODEL__FEATURES:
				return getFeatures();
			case FeaturesPackage.FEATURE_MODEL__ROOT_FEATURE:
				if (resolve) return getRootFeature();
				return basicGetRootFeature();
			case FeaturesPackage.FEATURE_MODEL__RELATIONSHIPS:
				return getRelationships();
			case FeaturesPackage.FEATURE_MODEL__MODEL_CONSTRAINTS:
				return getModelConstraints();
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
			case FeaturesPackage.FEATURE_MODEL__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case FeaturesPackage.FEATURE_MODEL__ROOT_FEATURE:
				setRootFeature((Feature)newValue);
				return;
			case FeaturesPackage.FEATURE_MODEL__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case FeaturesPackage.FEATURE_MODEL__MODEL_CONSTRAINTS:
				getModelConstraints().clear();
				getModelConstraints().addAll((Collection<? extends ConstraintsSet>)newValue);
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
			case FeaturesPackage.FEATURE_MODEL__FEATURES:
				getFeatures().clear();
				return;
			case FeaturesPackage.FEATURE_MODEL__ROOT_FEATURE:
				setRootFeature((Feature)null);
				return;
			case FeaturesPackage.FEATURE_MODEL__RELATIONSHIPS:
				getRelationships().clear();
				return;
			case FeaturesPackage.FEATURE_MODEL__MODEL_CONSTRAINTS:
				getModelConstraints().clear();
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
			case FeaturesPackage.FEATURE_MODEL__FEATURES:
				return features != null && !features.isEmpty();
			case FeaturesPackage.FEATURE_MODEL__ROOT_FEATURE:
				return rootFeature != null;
			case FeaturesPackage.FEATURE_MODEL__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
			case FeaturesPackage.FEATURE_MODEL__MODEL_CONSTRAINTS:
				return modelConstraints != null && !modelConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureModelImpl
