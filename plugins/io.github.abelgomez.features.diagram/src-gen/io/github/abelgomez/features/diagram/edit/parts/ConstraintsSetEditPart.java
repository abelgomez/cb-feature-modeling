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

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import io.github.abelgomez.features.diagram.edit.policies.ConstraintsSetItemSemanticEditPolicy;
import io.github.abelgomez.features.diagram.part.FeaturesVisualIDRegistry;
import io.github.abelgomez.features.diagram.providers.FeaturesElementTypes;

/**
 * @generated
 */
public class ConstraintsSetEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2004;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public ConstraintsSetEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(FeaturesVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ConstraintsSetItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new ConstraintsSetFigure();
	}

	/**
	* @generated
	*/
	public ConstraintsSetFigure getPrimaryShape() {
		return (ConstraintsSetFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ConstraintsSetConstraintsSetBodyEditPart) {
			IFigure pane = getPrimaryShape().getFigureConstraintsSetBodyFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ConstraintsSetConstraintsSetBodyEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ConstraintsSetConstraintsSetBodyEditPart) {
			IFigure pane = getPrimaryShape().getFigureConstraintsSetBodyFigure();
			pane.remove(((ConstraintsSetConstraintsSetBodyEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof ConstraintsSetConstraintsSetBodyEditPart) {
			return getPrimaryShape().getFigureConstraintsSetBodyFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == FeaturesElementTypes.Constraint_3008) {
				return getChildBySemanticHint(
						FeaturesVisualIDRegistry.getType(ConstraintsSetConstraintsSetBodyEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class ConstraintsSetFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureConstraintsSetLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureConstraintsSetBodyFigure;

		/**
		 * @generated
		 */
		public ConstraintsSetFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setForegroundColor(ColorConstants.white);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			FoldedRectangle constraintsSetLabelFigure0 = new FoldedRectangle();

			constraintsSetLabelFigure0.setForegroundColor(ColorConstants.black);
			constraintsSetLabelFigure0.setBackgroundColor(CONSTRAINTSSETLABELFIGURE0_BACK);
			constraintsSetLabelFigure0.setMinimumSize(new Dimension(getMapMode().DPtoLP(100), getMapMode().DPtoLP(0)));

			constraintsSetLabelFigure0.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(10)));
			constraintsSetLabelFigure0.setFoldSize(10);

			this.add(constraintsSetLabelFigure0, BorderLayout.TOP);

			GridLayout layoutConstraintsSetLabelFigure0 = new GridLayout();
			layoutConstraintsSetLabelFigure0.numColumns = 1;
			layoutConstraintsSetLabelFigure0.makeColumnsEqualWidth = true;
			layoutConstraintsSetLabelFigure0.horizontalSpacing = 0;
			layoutConstraintsSetLabelFigure0.verticalSpacing = 0;
			layoutConstraintsSetLabelFigure0.marginWidth = 0;
			layoutConstraintsSetLabelFigure0.marginHeight = 0;
			constraintsSetLabelFigure0.setLayoutManager(layoutConstraintsSetLabelFigure0);

			fFigureConstraintsSetLabelFigure = new WrappingLabel();

			fFigureConstraintsSetLabelFigure.setText("Constraints");

			fFigureConstraintsSetLabelFigure.setBorder(new MarginBorder(getMapMode().DPtoLP(1), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(1), getMapMode().DPtoLP(0)));

			GridData constraintFFigureConstraintsSetLabelFigure = new GridData();
			constraintFFigureConstraintsSetLabelFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureConstraintsSetLabelFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureConstraintsSetLabelFigure.horizontalIndent = 0;
			constraintFFigureConstraintsSetLabelFigure.horizontalSpan = 0;
			constraintFFigureConstraintsSetLabelFigure.verticalSpan = 0;
			constraintFFigureConstraintsSetLabelFigure.grabExcessHorizontalSpace = true;
			constraintFFigureConstraintsSetLabelFigure.grabExcessVerticalSpace = false;
			constraintsSetLabelFigure0.add(fFigureConstraintsSetLabelFigure,
					constraintFFigureConstraintsSetLabelFigure);

			fFigureConstraintsSetBodyFigure = new RectangleFigure();

			fFigureConstraintsSetBodyFigure.setForegroundColor(ColorConstants.black);
			fFigureConstraintsSetBodyFigure.setBackgroundColor(FFIGURECONSTRAINTSSETBODYFIGURE_BACK);

			this.add(fFigureConstraintsSetBodyFigure, BorderLayout.CENTER);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConstraintsSetLabelFigure() {
			return fFigureConstraintsSetLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureConstraintsSetBodyFigure() {
			return fFigureConstraintsSetBodyFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color CONSTRAINTSSETLABELFIGURE0_BACK = new Color(null, 248, 249, 209);

	/**
	 * @generated
	 */
	static final Color FFIGURECONSTRAINTSSETBODYFIGURE_BACK = new Color(null, 248, 249, 209);

}
