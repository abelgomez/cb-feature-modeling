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
package io.github.abelgomez.features.provider;


import io.github.abelgomez.features.FeatureModel;
import io.github.abelgomez.features.FeaturesFactory;
import io.github.abelgomez.features.FeaturesPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link io.github.abelgomez.features.FeatureModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureModelItemProvider extends ConstrainableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRootFeaturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Root Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureModel_rootFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureModel_rootFeature_feature", "_UI_FeatureModel_type"),
				 FeaturesPackage.Literals.FEATURE_MODEL__ROOT_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FeaturesPackage.Literals.FEATURE_MODEL__FEATURES);
			childrenFeatures.add(FeaturesPackage.Literals.FEATURE_MODEL__RELATIONSHIPS);
			childrenFeatures.add(FeaturesPackage.Literals.FEATURE_MODEL__MODEL_CONSTRAINTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FeatureModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FeatureModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FeatureModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FeatureModel_type") :
			getString("_UI_FeatureModel_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FeatureModel.class)) {
			case FeaturesPackage.FEATURE_MODEL__FEATURES:
			case FeaturesPackage.FEATURE_MODEL__RELATIONSHIPS:
			case FeaturesPackage.FEATURE_MODEL__MODEL_CONSTRAINTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(FeaturesPackage.Literals.FEATURE_MODEL__FEATURES,
				 FeaturesFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(FeaturesPackage.Literals.FEATURE_MODEL__RELATIONSHIPS,
				 FeaturesFactory.eINSTANCE.createStructuralRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(FeaturesPackage.Literals.FEATURE_MODEL__RELATIONSHIPS,
				 FeaturesFactory.eINSTANCE.createBiconditional()));

		newChildDescriptors.add
			(createChildParameter
				(FeaturesPackage.Literals.FEATURE_MODEL__RELATIONSHIPS,
				 FeaturesFactory.eINSTANCE.createImplies()));

		newChildDescriptors.add
			(createChildParameter
				(FeaturesPackage.Literals.FEATURE_MODEL__RELATIONSHIPS,
				 FeaturesFactory.eINSTANCE.createExcludes()));

		newChildDescriptors.add
			(createChildParameter
				(FeaturesPackage.Literals.FEATURE_MODEL__RELATIONSHIPS,
				 FeaturesFactory.eINSTANCE.createUses()));

		newChildDescriptors.add
			(createChildParameter
				(FeaturesPackage.Literals.FEATURE_MODEL__MODEL_CONSTRAINTS,
				 FeaturesFactory.eINSTANCE.createConstraintsSet()));
	}

}
