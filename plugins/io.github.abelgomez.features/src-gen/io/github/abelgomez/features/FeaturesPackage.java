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
package io.github.abelgomez.features;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see io.github.abelgomez.features.FeaturesFactory
 * @model kind="package"
 *        annotation="Anotaciones Mandatory_Optional='Las relaciones \"Mandatory\" y \"Optional\" no aparecen de forma expl\355cita puesto que una relaci\363n estructural ser\341 de un tipo u otro dependiendo del valor del atributo \"lowerBound\".' Structural_vs_Restriction='Se diferencia entre relaciones estructurales y restricciones puesto que las relaciones estructurales tienen una sem\341ntica adicional.\r\nPor ejemplo, una relaci\363n \"Mandatory\" tiene el mismo siginificado que una \"Bicondicional\" en cuanto a la existencia de instancias (ambos casos la existencia de la caracter\355stica de uno de los extremos implica la existencia de la caracter\355stica al otro lado y viceversa).\r\nNo obstante, la relaci\363n Mandatory tiene asociado el significado de pertenencia (es decir, A -----Mandatory---&gt; B supone que B es parte de A).' RelatableElement='Aunque en principio toda relaci\363n es entre dos caracter\355sticas se ha a\361adido la clase \"RelatableElement\" por simplicidad, pudiendo decir que una relaci\363n es entre una caracter\355stica y otra, o entre un grupo y otra caracter\355stica.\r\nSi se optara por un dise\361o donde \"Relation\" es siempre entre \"Features\", manteniendo la clase Group (y su asociaci\363n relationships), ser\355a necesaria l\363gica adicional (OCL) para garantizar que las caracter\355sticas que hay en el grupo de una feature realmente relacionan esa feature con otra.' Rol_to_diferenciado='El rol to se encuentra duplicado en las clases StructuralRelationship y RestrictionRelationship de forma deliberada.\r\nEsto se debe a que se desea restringir en el metamodelo que una Feature s\363lo pueda tener un padre de tipo estructural, para mantener la estructura en \341rbol.'"
 * @generated
 */
public interface FeaturesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "features";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://io.github.abelgomez/features/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "features";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeaturesPackage eINSTANCE = io.github.abelgomez.features.impl.FeaturesPackageImpl.init();

	/**
	 * The meta object id for the '{@link io.github.abelgomez.features.impl.ConstrainableElementImpl <em>Constrainable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.features.impl.ConstrainableElementImpl
	 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getConstrainableElement()
	 * @generated
	 */
	int CONSTRAINABLE_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Constraints Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINABLE_ELEMENT__CONSTRAINTS_SET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINABLE_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Constrainable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINABLE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constrainable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.features.impl.FeatureModelImpl <em>Feature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.features.impl.FeatureModelImpl
	 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getFeatureModel()
	 * @generated
	 */
	int FEATURE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Constraints Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__CONSTRAINTS_SET = CONSTRAINABLE_ELEMENT__CONSTRAINTS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__NAME = CONSTRAINABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__FEATURES = CONSTRAINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__ROOT_FEATURE = CONSTRAINABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__RELATIONSHIPS = CONSTRAINABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__MODEL_CONSTRAINTS = CONSTRAINABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_FEATURE_COUNT = CONSTRAINABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_OPERATION_COUNT = CONSTRAINABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.features.impl.RelatableElementImpl <em>Relatable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.features.impl.RelatableElementImpl
	 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getRelatableElement()
	 * @generated
	 */
	int RELATABLE_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATABLE_ELEMENT__CHILDS = 0;

	/**
	 * The number of structural features of the '<em>Relatable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relatable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.features.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.features.impl.FeatureImpl
	 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CHILDS = RELATABLE_ELEMENT__CHILDS;

	/**
	 * The feature id for the '<em><b>Constraints Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONSTRAINTS_SET = RELATABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = RELATABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__GROUP = RELATABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ATTRIBUTES = RELATABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNER = RELATABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PARENT = RELATABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = RELATABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = RELATABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.features.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.features.impl.RelationshipImpl
	 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 2;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.features.impl.BoundableElementImpl <em>Boundable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.features.impl.BoundableElementImpl
	 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getBoundableElement()
	 * @generated
	 */
	int BOUNDABLE_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDABLE_ELEMENT__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDABLE_ELEMENT__UPPER_BOUND = 1;

	/**
	 * The number of structural features of the '<em>Boundable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDABLE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Boundable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.features.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.features.impl.GroupImpl
	 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 3;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LOWER_BOUND = BOUNDABLE_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__UPPER_BOUND = BOUNDABLE_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CHILDS = BOUNDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONSTRAINTS_SET = BOUNDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = BOUNDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PARENT_FEATURE = BOUNDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = BOUNDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___GET_NAME = BOUNDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = BOUNDABLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.features.impl.StructuralRelationshipImpl <em>Structural Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.features.impl.StructuralRelationshipImpl
	 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getStructuralRelationship()
	 * @generated
	 */
	int STRUCTURAL_RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_RELATIONSHIP__LOWER_BOUND = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_RELATIONSHIP__UPPER_BOUND = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_RELATIONSHIP__FROM = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_RELATIONSHIP__TO = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Structural Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Structural Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_RELATIONSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.features.impl.GenericRelationshipImpl <em>Generic Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.features.impl.GenericRelationshipImpl
	 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getGenericRelationship()
	 * @generated
	 */
	int GENERIC_RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RELATIONSHIP__FROM = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RELATIONSHIP__TO = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generic Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Generic Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RELATIONSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.features.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.features.impl.AttributeImpl
	 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.features.impl.RestrictionRelationshipImpl <em>Restriction Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.features.impl.RestrictionRelationshipImpl
	 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getRestrictionRelationship()
	 * @generated
	 */
	int RESTRICTION_RELATIONSHIP = 13;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_RELATIONSHIP__FROM = GENERIC_RELATIONSHIP__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_RELATIONSHIP__TO = GENERIC_RELATIONSHIP__TO;

	/**
	 * The number of structural features of the '<em>Restriction Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_RELATIONSHIP_FEATURE_COUNT = GENERIC_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Restriction Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_RELATIONSHIP_OPERATION_COUNT = GENERIC_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.features.impl.BiconditionalImpl <em>Biconditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.features.impl.BiconditionalImpl
	 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getBiconditional()
	 * @generated
	 */
	int BICONDITIONAL = 9;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL__FROM = RESTRICTION_RELATIONSHIP__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL__TO = RESTRICTION_RELATIONSHIP__TO;

	/**
	 * The number of structural features of the '<em>Biconditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_FEATURE_COUNT = RESTRICTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Biconditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_OPERATION_COUNT = RESTRICTION_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.features.impl.ImpliesImpl <em>Implies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.features.impl.ImpliesImpl
	 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getImplies()
	 * @generated
	 */
	int IMPLIES = 10;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES__FROM = RESTRICTION_RELATIONSHIP__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES__TO = RESTRICTION_RELATIONSHIP__TO;

	/**
	 * The number of structural features of the '<em>Implies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_FEATURE_COUNT = RESTRICTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Implies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATION_COUNT = RESTRICTION_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.features.impl.ExcludesImpl <em>Excludes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.features.impl.ExcludesImpl
	 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getExcludes()
	 * @generated
	 */
	int EXCLUDES = 11;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDES__FROM = RESTRICTION_RELATIONSHIP__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDES__TO = RESTRICTION_RELATIONSHIP__TO;

	/**
	 * The number of structural features of the '<em>Excludes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDES_FEATURE_COUNT = RESTRICTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Excludes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDES_OPERATION_COUNT = RESTRICTION_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.features.impl.UsesImpl <em>Uses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.features.impl.UsesImpl
	 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getUses()
	 * @generated
	 */
	int USES = 12;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__FROM = GENERIC_RELATIONSHIP__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__TO = GENERIC_RELATIONSHIP__TO;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__LOWER_BOUND = GENERIC_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__UPPER_BOUND = GENERIC_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__CONSTRAINTS_SET = GENERIC_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__NAME = GENERIC_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__OPPOSITE = GENERIC_RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Uses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_FEATURE_COUNT = GENERIC_RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Uses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_OPERATION_COUNT = GENERIC_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.features.impl.ConstraintsSetImpl <em>Constraints Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.features.impl.ConstraintsSetImpl
	 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getConstraintsSet()
	 * @generated
	 */
	int CONSTRAINTS_SET = 15;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_SET__CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_SET__CONSTRAINTS = 1;

	/**
	 * The number of structural features of the '<em>Constraints Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_SET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraints Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.features.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.features.impl.ConstraintImpl
	 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 16;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__BODY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.features.FeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model</em>'.
	 * @see io.github.abelgomez.features.FeatureModel
	 * @generated
	 */
	EClass getFeatureModel();

	/**
	 * Returns the meta object for the containment reference list '{@link io.github.abelgomez.features.FeatureModel#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see io.github.abelgomez.features.FeatureModel#getFeatures()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_Features();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.features.FeatureModel#getRootFeature <em>Root Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Feature</em>'.
	 * @see io.github.abelgomez.features.FeatureModel#getRootFeature()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_RootFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link io.github.abelgomez.features.FeatureModel#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see io.github.abelgomez.features.FeatureModel#getRelationships()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_Relationships();

	/**
	 * Returns the meta object for the containment reference list '{@link io.github.abelgomez.features.FeatureModel#getModelConstraints <em>Model Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Constraints</em>'.
	 * @see io.github.abelgomez.features.FeatureModel#getModelConstraints()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_ModelConstraints();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.features.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see io.github.abelgomez.features.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference '{@link io.github.abelgomez.features.Feature#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see io.github.abelgomez.features.Feature#getGroup()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link io.github.abelgomez.features.Feature#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see io.github.abelgomez.features.Feature#getAttributes()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Attributes();

	/**
	 * Returns the meta object for the container reference '{@link io.github.abelgomez.features.Feature#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see io.github.abelgomez.features.Feature#getOwner()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Owner();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.features.Feature#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see io.github.abelgomez.features.Feature#getParent()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Parent();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.features.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see io.github.abelgomez.features.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.features.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see io.github.abelgomez.features.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the container reference '{@link io.github.abelgomez.features.Group#getParentFeature <em>Parent Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Feature</em>'.
	 * @see io.github.abelgomez.features.Group#getParentFeature()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_ParentFeature();

	/**
	 * Returns the meta object for the '{@link io.github.abelgomez.features.Group#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see io.github.abelgomez.features.Group#getName()
	 * @generated
	 */
	EOperation getGroup__GetName();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.features.StructuralRelationship <em>Structural Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Relationship</em>'.
	 * @see io.github.abelgomez.features.StructuralRelationship
	 * @generated
	 */
	EClass getStructuralRelationship();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.features.StructuralRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see io.github.abelgomez.features.StructuralRelationship#getFrom()
	 * @see #getStructuralRelationship()
	 * @generated
	 */
	EReference getStructuralRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.features.StructuralRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see io.github.abelgomez.features.StructuralRelationship#getTo()
	 * @see #getStructuralRelationship()
	 * @generated
	 */
	EReference getStructuralRelationship_To();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.features.GenericRelationship <em>Generic Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Relationship</em>'.
	 * @see io.github.abelgomez.features.GenericRelationship
	 * @generated
	 */
	EClass getGenericRelationship();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.features.GenericRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see io.github.abelgomez.features.GenericRelationship#getFrom()
	 * @see #getGenericRelationship()
	 * @generated
	 */
	EReference getGenericRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.features.GenericRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see io.github.abelgomez.features.GenericRelationship#getTo()
	 * @see #getGenericRelationship()
	 * @generated
	 */
	EReference getGenericRelationship_To();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.features.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see io.github.abelgomez.features.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.features.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.github.abelgomez.features.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.features.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see io.github.abelgomez.features.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.features.BoundableElement <em>Boundable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boundable Element</em>'.
	 * @see io.github.abelgomez.features.BoundableElement
	 * @generated
	 */
	EClass getBoundableElement();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.features.BoundableElement#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see io.github.abelgomez.features.BoundableElement#getLowerBound()
	 * @see #getBoundableElement()
	 * @generated
	 */
	EAttribute getBoundableElement_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.features.BoundableElement#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see io.github.abelgomez.features.BoundableElement#getUpperBound()
	 * @see #getBoundableElement()
	 * @generated
	 */
	EAttribute getBoundableElement_UpperBound();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.features.RelatableElement <em>Relatable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relatable Element</em>'.
	 * @see io.github.abelgomez.features.RelatableElement
	 * @generated
	 */
	EClass getRelatableElement();

	/**
	 * Returns the meta object for the reference list '{@link io.github.abelgomez.features.RelatableElement#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Childs</em>'.
	 * @see io.github.abelgomez.features.RelatableElement#getChilds()
	 * @see #getRelatableElement()
	 * @generated
	 */
	EReference getRelatableElement_Childs();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.features.Biconditional <em>Biconditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biconditional</em>'.
	 * @see io.github.abelgomez.features.Biconditional
	 * @generated
	 */
	EClass getBiconditional();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.features.Implies <em>Implies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implies</em>'.
	 * @see io.github.abelgomez.features.Implies
	 * @generated
	 */
	EClass getImplies();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.features.Excludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excludes</em>'.
	 * @see io.github.abelgomez.features.Excludes
	 * @generated
	 */
	EClass getExcludes();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.features.Uses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses</em>'.
	 * @see io.github.abelgomez.features.Uses
	 * @generated
	 */
	EClass getUses();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.features.Uses#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see io.github.abelgomez.features.Uses#getOpposite()
	 * @see #getUses()
	 * @generated
	 */
	EReference getUses_Opposite();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.features.RestrictionRelationship <em>Restriction Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction Relationship</em>'.
	 * @see io.github.abelgomez.features.RestrictionRelationship
	 * @generated
	 */
	EClass getRestrictionRelationship();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.features.ConstrainableElement <em>Constrainable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constrainable Element</em>'.
	 * @see io.github.abelgomez.features.ConstrainableElement
	 * @generated
	 */
	EClass getConstrainableElement();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.features.ConstrainableElement#getConstraintsSet <em>Constraints Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraints Set</em>'.
	 * @see io.github.abelgomez.features.ConstrainableElement#getConstraintsSet()
	 * @see #getConstrainableElement()
	 * @generated
	 */
	EReference getConstrainableElement_ConstraintsSet();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.features.ConstrainableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.github.abelgomez.features.ConstrainableElement#getName()
	 * @see #getConstrainableElement()
	 * @generated
	 */
	EAttribute getConstrainableElement_Name();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.features.ConstraintsSet <em>Constraints Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints Set</em>'.
	 * @see io.github.abelgomez.features.ConstraintsSet
	 * @generated
	 */
	EClass getConstraintsSet();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.features.ConstraintsSet#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see io.github.abelgomez.features.ConstraintsSet#getContext()
	 * @see #getConstraintsSet()
	 * @generated
	 */
	EReference getConstraintsSet_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link io.github.abelgomez.features.ConstraintsSet#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see io.github.abelgomez.features.ConstraintsSet#getConstraints()
	 * @see #getConstraintsSet()
	 * @generated
	 */
	EReference getConstraintsSet_Constraints();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.features.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see io.github.abelgomez.features.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.features.Constraint#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see io.github.abelgomez.features.Constraint#getBody()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Body();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.features.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.github.abelgomez.features.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeaturesFactory getFeaturesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link io.github.abelgomez.features.impl.FeatureModelImpl <em>Feature Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.features.impl.FeatureModelImpl
		 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getFeatureModel()
		 * @generated
		 */
		EClass FEATURE_MODEL = eINSTANCE.getFeatureModel();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__FEATURES = eINSTANCE.getFeatureModel_Features();

		/**
		 * The meta object literal for the '<em><b>Root Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__ROOT_FEATURE = eINSTANCE.getFeatureModel_RootFeature();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__RELATIONSHIPS = eINSTANCE.getFeatureModel_Relationships();

		/**
		 * The meta object literal for the '<em><b>Model Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__MODEL_CONSTRAINTS = eINSTANCE.getFeatureModel_ModelConstraints();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.features.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.features.impl.FeatureImpl
		 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__GROUP = eINSTANCE.getFeature_Group();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ATTRIBUTES = eINSTANCE.getFeature_Attributes();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__OWNER = eINSTANCE.getFeature_Owner();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__PARENT = eINSTANCE.getFeature_Parent();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.features.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.features.impl.RelationshipImpl
		 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.features.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.features.impl.GroupImpl
		 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Parent Feature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__PARENT_FEATURE = eINSTANCE.getGroup_ParentFeature();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GROUP___GET_NAME = eINSTANCE.getGroup__GetName();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.features.impl.StructuralRelationshipImpl <em>Structural Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.features.impl.StructuralRelationshipImpl
		 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getStructuralRelationship()
		 * @generated
		 */
		EClass STRUCTURAL_RELATIONSHIP = eINSTANCE.getStructuralRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_RELATIONSHIP__FROM = eINSTANCE.getStructuralRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_RELATIONSHIP__TO = eINSTANCE.getStructuralRelationship_To();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.features.impl.GenericRelationshipImpl <em>Generic Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.features.impl.GenericRelationshipImpl
		 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getGenericRelationship()
		 * @generated
		 */
		EClass GENERIC_RELATIONSHIP = eINSTANCE.getGenericRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_RELATIONSHIP__FROM = eINSTANCE.getGenericRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_RELATIONSHIP__TO = eINSTANCE.getGenericRelationship_To();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.features.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.features.impl.AttributeImpl
		 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.features.impl.BoundableElementImpl <em>Boundable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.features.impl.BoundableElementImpl
		 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getBoundableElement()
		 * @generated
		 */
		EClass BOUNDABLE_ELEMENT = eINSTANCE.getBoundableElement();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDABLE_ELEMENT__LOWER_BOUND = eINSTANCE.getBoundableElement_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDABLE_ELEMENT__UPPER_BOUND = eINSTANCE.getBoundableElement_UpperBound();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.features.impl.RelatableElementImpl <em>Relatable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.features.impl.RelatableElementImpl
		 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getRelatableElement()
		 * @generated
		 */
		EClass RELATABLE_ELEMENT = eINSTANCE.getRelatableElement();

		/**
		 * The meta object literal for the '<em><b>Childs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATABLE_ELEMENT__CHILDS = eINSTANCE.getRelatableElement_Childs();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.features.impl.BiconditionalImpl <em>Biconditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.features.impl.BiconditionalImpl
		 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getBiconditional()
		 * @generated
		 */
		EClass BICONDITIONAL = eINSTANCE.getBiconditional();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.features.impl.ImpliesImpl <em>Implies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.features.impl.ImpliesImpl
		 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getImplies()
		 * @generated
		 */
		EClass IMPLIES = eINSTANCE.getImplies();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.features.impl.ExcludesImpl <em>Excludes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.features.impl.ExcludesImpl
		 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getExcludes()
		 * @generated
		 */
		EClass EXCLUDES = eINSTANCE.getExcludes();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.features.impl.UsesImpl <em>Uses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.features.impl.UsesImpl
		 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getUses()
		 * @generated
		 */
		EClass USES = eINSTANCE.getUses();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES__OPPOSITE = eINSTANCE.getUses_Opposite();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.features.impl.RestrictionRelationshipImpl <em>Restriction Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.features.impl.RestrictionRelationshipImpl
		 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getRestrictionRelationship()
		 * @generated
		 */
		EClass RESTRICTION_RELATIONSHIP = eINSTANCE.getRestrictionRelationship();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.features.impl.ConstrainableElementImpl <em>Constrainable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.features.impl.ConstrainableElementImpl
		 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getConstrainableElement()
		 * @generated
		 */
		EClass CONSTRAINABLE_ELEMENT = eINSTANCE.getConstrainableElement();

		/**
		 * The meta object literal for the '<em><b>Constraints Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINABLE_ELEMENT__CONSTRAINTS_SET = eINSTANCE.getConstrainableElement_ConstraintsSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINABLE_ELEMENT__NAME = eINSTANCE.getConstrainableElement_Name();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.features.impl.ConstraintsSetImpl <em>Constraints Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.features.impl.ConstraintsSetImpl
		 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getConstraintsSet()
		 * @generated
		 */
		EClass CONSTRAINTS_SET = eINSTANCE.getConstraintsSet();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINTS_SET__CONTEXT = eINSTANCE.getConstraintsSet_Context();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINTS_SET__CONSTRAINTS = eINSTANCE.getConstraintsSet_Constraints();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.features.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.features.impl.ConstraintImpl
		 * @see io.github.abelgomez.features.impl.FeaturesPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__BODY = eINSTANCE.getConstraint_Body();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

	}

} //FeaturesPackage
