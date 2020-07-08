/*
 * Copyright (c) 2020 Abel Gómez.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Abel Gómez (abel@gomez.llana.me) - initial API and implementation
 */
package io.github.abelgomez.features.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import io.github.abelgomez.features.diagram.edit.policies.ConstrainableElementConstraintsSetItemSemanticEditPolicy;

/**
 * @generated
 */
public class ConstrainableElementConstraintsSetEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4014;

	/**
	* @generated
	*/
	public ConstrainableElementConstraintsSetEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ConstrainableElementConstraintsSetItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new ConstraintLinkFigure();
	}

	/**
	* @generated
	*/
	public ConstraintLinkFigure getPrimaryShape() {
		return (ConstraintLinkFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ConstraintLinkFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ConstraintLinkFigure() {
			this.setLineStyle(Graphics.LINE_DASH);

		}

	}

}
