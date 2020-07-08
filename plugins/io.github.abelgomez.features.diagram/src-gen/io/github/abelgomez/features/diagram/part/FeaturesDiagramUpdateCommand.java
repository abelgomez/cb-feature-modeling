/*
* Copyright (c) 2020 Abel G�mez.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v2.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v20.html
* 
* Contributors:
*     Abel G�mez (abel@gomez.llana.me) - initial API and implementation
*/
package io.github.abelgomez.features.diagram.part;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;

/**
 * @generated
 */
public class FeaturesDiagramUpdateCommand implements IHandler {

	/**
	* @generated
	*/
	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	/**
	* @generated
	*/
	public void dispose() {
	}

	/**
	* @generated
	*/
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
				.getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() != 1) {
				return null;
			}
			if (structuredSelection.getFirstElement() instanceof EditPart
					&& ((EditPart) structuredSelection.getFirstElement()).getModel() instanceof View) {
				EObject modelElement = ((View) ((EditPart) structuredSelection.getFirstElement()).getModel())
						.getElement();
				List editPolicies = CanonicalEditPolicy.getRegisteredEditPolicies(modelElement);
				for (Iterator it = editPolicies.iterator(); it.hasNext();) {
					CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it.next();
					nextEditPolicy.refresh();
				}

			}
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean isEnabled() {
		return true;
	}

	/**
	* @generated
	*/
	public boolean isHandled() {
		return true;
	}

	/**
	* @generated
	*/
	public void removeHandlerListener(IHandlerListener handlerListener) {
	}

}
