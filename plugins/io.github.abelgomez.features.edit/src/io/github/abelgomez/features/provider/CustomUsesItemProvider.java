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


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import io.github.abelgomez.features.FeaturesPackage;
import io.github.abelgomez.features.Uses;

public class CustomUsesItemProvider extends UsesItemProvider {

	public CustomUsesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	protected void addOppositePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Uses_opposite_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Uses_opposite_feature", "_UI_Uses_type"),
				FeaturesPackage.Literals.USES__OPPOSITE, true, false, true,
				null,
				null,
				null) {

			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Uses thisUses = (Uses) object;
				@SuppressWarnings("unchecked")
				Collection<Uses> result = new ArrayList<Uses>((Collection<? extends Uses>) super.getChoiceOfValues(object));
				for (Iterator<Uses> i = result.iterator(); i.hasNext();) {
					Uses uses = i.next();
					if (uses != null) {
						if (uses.equals(thisUses)) {
							i.remove();
						} else if (!uses.getTo().equals(thisUses.getFrom())
								|| !uses.getFrom().equals(thisUses.getTo())) {
							i.remove();
						}
					}
				}
				return result;
			}

			@Override
			public void resetPropertyValue(Object object) {
				setPropertyValue(object, null);
			}

			public void setPropertyValue(Object object, Object value) {
				Uses thisUses = (Uses) object;
				Uses newUses = (Uses) value;
				EditingDomain editingDomain = getEditingDomain(thisUses);
				if (editingDomain == null) {
					Uses oldUsesOpposite = thisUses.getOpposite();
					if (oldUsesOpposite != null) {
						oldUsesOpposite.setOpposite(null);
					}
					if (newUses != null) {
						Uses oldUsesOppositeOpposite = newUses.getOpposite();
						if (oldUsesOppositeOpposite != null) {
							oldUsesOppositeOpposite.setOpposite(null);
						}
						newUses.setOpposite(thisUses);
					}
					thisUses.setOpposite(newUses);
				} else {
					CompoundCommand compoundCommand = new CompoundCommand(CompoundCommand.LAST_COMMAND_ALL);
					Uses oldUsesOpposite = thisUses.getOpposite();
					if (oldUsesOpposite != null) {
						compoundCommand.append(
								SetCommand.create(editingDomain, getCommandOwner(oldUsesOpposite), feature, null));
					}
					if (newUses != null) {
						Uses oldUsesOppositeOpposite = newUses.getOpposite();
						if (oldUsesOppositeOpposite != null) {
							compoundCommand.append(SetCommand.create(editingDomain,
									getCommandOwner(oldUsesOppositeOpposite), feature, null));
						}
						compoundCommand
								.append(SetCommand.create(editingDomain, getCommandOwner(newUses), feature, thisUses));
					}
					compoundCommand
							.append(SetCommand.create(editingDomain, getCommandOwner(thisUses), feature, newUses));
					editingDomain.getCommandStack().execute(compoundCommand);
				}
			}
		});
	}

	@Override
	public String getText(Object object) {
		Uses usesRelationship = ((Uses)object);
		String label = usesRelationship.getName();
		StringBuilder result = new StringBuilder();
		result.append(label == null || label.length() == 0 ?
			getString("_UI_Uses_type") :
			getString("_UI_Uses_type") + " " + label);
		
		result.append(" <");
		result.append(usesRelationship.getFrom() != null ? usesRelationship.getFrom().getName() : "null");
		result.append("->");
		result.append(usesRelationship.getTo() != null ? usesRelationship.getTo().getName() : "null");
		result.append(">");
		
		return result.toString();
	}
}
