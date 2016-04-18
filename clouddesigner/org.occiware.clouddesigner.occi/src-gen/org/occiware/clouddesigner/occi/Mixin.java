/**
 * Copyright (c) 2015-2016 Obeo, Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mixin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.Mixin#getActions <em>Actions</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.Mixin#getDepends <em>Depends</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.Mixin#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.Mixin#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.OCCIPackage#getMixin()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ActionTermUnicity CorrectScheme NoCyclicInheritance AttributesNameNotAlreadyDefinedInDepends'"
 * @generated
 */
public interface Mixin extends Category {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.occi.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getMixin_Actions()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Mixin!actions'"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Depends</b></em>' reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.occi.Mixin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' reference list.
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getMixin_Depends()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Mixin!depends'"
	 * @generated
	 */
	EList<Mixin> getDepends();

	/**
	 * Returns the value of the '<em><b>Applies</b></em>' reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.occi.Kind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies</em>' reference list.
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getMixin_Applies()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Mixin!applies'"
	 * @generated
	 */
	EList<Kind> getApplies();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.occi.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getMixin_Entities()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='/**\n * Entity.allInstances()->select(mixins->includes(self))\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Evaluator%> evaluator = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Class%> TYP_occi_c_c_Entity_0 = idResolver.getClass(<%org.occiware.clouddesigner.occi.OCCITables%>.CLSSid_Entity, null);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.SetValue%> allInstances = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.SET_CLSSid_Entity, TYP_occi_c_c_Entity_0));\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSetAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.SET_CLSSid_Entity);\n/*@NonNull\052/ <%java.util.Iterator%><?> ITERATOR__1 = allInstances.iterator();\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%> select;\nwhile (true) {\n    if (!ITERATOR__1.hasNext()) {\n        select = accumulator;\n        break;\n    }\n    /*@NonNull\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Entity%> _1 = (<%org.occiware.clouddesigner.occi.Entity%>)ITERATOR__1.next();\n    /**\n     * mixins->includes(self)\n     \052/\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Mixin%>> mixins = _1.getMixins();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_mixins = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Mixin, mixins);\n    final /*@Thrown\052/ boolean includes = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%>.INSTANCE.evaluate(BOXED_mixins, this).booleanValue());\n    //\n    if (includes == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n        accumulator.add(_1);\n    }\n}\nfinal <%java.util.List%><<%org.occiware.clouddesigner.occi.Entity%>> UNBOXED_select = select.asEcoreObjects(idResolver, org.occiware.clouddesigner.occi.Entity.class);\nassert UNBOXED_select != null;\nreturn (<%org.eclipse.emf.common.util.EList<org.occiware.clouddesigner.occi.Entity>%>)UNBOXED_select;'"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv ActionTermUnicity:\n *   let severity : Integer[1] = \'Mixin::ActionTermUnicity\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let status : OclAny[1] = actions->isUnique(term)\n *       in\n *         \'Mixin::ActionTermUnicity\'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)\n *     endif\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Evaluator%> evaluator = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Mixin_c_c_ActionTermUnicity));\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(evaluator, severity_0, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n    symbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n    /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_status;\n    try {\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Action%>> actions = this.getActions();\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_actions = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Action, actions);\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSetAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Action);\n        /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = BOXED_actions.iterator();\n        /*@Thrown\052/ boolean status;\n        while (true) {\n            if (!ITERATOR__1.hasNext()) {\n                status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n                break;\n            }\n            /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Action%> _1 = (<%org.occiware.clouddesigner.occi.Action%>)ITERATOR__1.next();\n            /**\n             * term\n             \052/\n            if (_1 == null) {\n                throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::Category::term\\\'\");\n            }\n            final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> term = _1.getTerm();\n            //\n            if (accumulator.includes(term) == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n                status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\t\t\t// Abort after second find\n                break;\n            }\n            else {\n                accumulator.add(term);\n            }\n        }\n        CAUGHT_status = status;\n    }\n    catch (<%java.lang.Exception%> e) {\n        CAUGHT_status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n    }\n    final /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(evaluator, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Mixin_c_c_ActionTermUnicity, this, null, diagnostics, context, null, severity_0, CAUGHT_status, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n    symbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean ActionTermUnicity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv NoCyclicInheritance:\n *   let severity : Integer[1] = \'Mixin::NoCyclicInheritance\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         status : OclAny[1] = depends->closure(depends)\n *         ->excludes(self)\n *       in\n *         \'Mixin::NoCyclicInheritance\'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)\n *     endif\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Evaluator%> evaluator = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.StandardLibrary%> standardLibrary = idResolver.getStandardLibrary();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Mixin_c_c_NoCyclicInheritance));\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(evaluator, severity_0, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n/*@NonInvalid\052/ boolean symbol_1;\nif (le) {\n    symbol_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n    /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_status;\n    try {\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Mixin%>> depends = this.getDepends();\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_depends = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Mixin, depends);\n        final /*@NonNull\052/ <%org.eclipse.ocl.pivot.Class%> TYPE_closure_0 = evaluator.getStaticTypeOf(BOXED_depends);\n        final /*@NonNull\052/ <%org.eclipse.ocl.pivot.library.LibraryIteration%> IMPL_closure_0 = (<%org.eclipse.ocl.pivot.library.LibraryIteration%>)TYPE_closure_0.lookupImplementation(standardLibrary, <%org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables%>.Operations._OrderedSet__closure);\n        final /*@NonNull\052/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Mixin, <%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Mixin);\n        /**\n         * Implementation of the iterator body.\n         \052/\n        final /*@NonNull\052/ <%org.eclipse.ocl.pivot.library.AbstractBinaryOperation%> BODY_closure_0 = new <%org.eclipse.ocl.pivot.library.AbstractBinaryOperation%>()\n        {\n            /**\n             * depends\n             \052/\n            @Override\n            public /*@Nullable\052/ Object evaluate(final /*@NonNull\052/ <%org.eclipse.ocl.pivot.evaluation.Evaluator%> evaluator, final /*@NonNull\052/ <%org.eclipse.ocl.pivot.ids.TypeId%> typeId, final /*@Nullable\052/ Object BOXED_depends, final /*@Nullable\052/ /*@NonInvalid\052/ <%java.lang.Object%> _1) {\n                final /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Mixin%> symbol_0 = (<%org.occiware.clouddesigner.occi.Mixin%>)_1;\n                if (symbol_0 == null) {\n                    throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::Mixin::depends\\\'\");\n                }\n                final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Mixin%>> depends_0 = symbol_0.getDepends();\n                final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_depends_0 = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Mixin, depends_0);\n                return BOXED_depends_0;\n            }\n        };\n        final /*@NonNull\052/  <%org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager%> MGR_closure_0 = new <%org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager%>(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Mixin, BODY_closure_0, BOXED_depends, ACC_closure_0);\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> closure = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState((<%org.eclipse.ocl.pivot.values.OrderedSetValue%>)IMPL_closure_0.evaluateIteration(MGR_closure_0));\n        final /*@Thrown\052/ boolean status = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.collection.CollectionExcludesOperation%>.INSTANCE.evaluate(closure, this).booleanValue());\n        CAUGHT_status = status;\n    }\n    catch (<%java.lang.Exception%> e) {\n        CAUGHT_status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n    }\n    final /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(evaluator, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Mixin_c_c_NoCyclicInheritance, this, null, diagnostics, context, null, severity_0, CAUGHT_status, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n    symbol_1 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_1;'"
	 * @generated
	 */
	boolean NoCyclicInheritance(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv CorrectScheme:\n *   let severity : Integer[1] = \'Mixin::CorrectScheme\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         status : OclAny[1] = let owner : OclElement[?] = self.oclContainer()\n *         in\n *           if owner.oclIsTypeOf(Extension)\n *           then\n *             let\n *               ownerScheme : String[1] = owner.oclAsType(Extension).scheme\n *             in\n *               scheme.substring(1, ownerScheme.size() - 1) =\n *               ownerScheme.substring(1, ownerScheme.size() - 1)\n *           else true\n *           endif\n *       in\n *         \'Mixin::CorrectScheme\'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)\n *     endif\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Evaluator%> evaluator = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Mixin_c_c_CorrectScheme));\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(evaluator, severity_0, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n/*@NonInvalid\052/ boolean symbol_1;\nif (le) {\n    symbol_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n    /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_symbol_0;\n    try {\n        final /*@Nullable\052/ /*@NonInvalid\052/ <%java.lang.Object%> owner = <%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(evaluator, this);\n        final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Class%> TYP_occi_c_c_Extension_0 = idResolver.getClass(<%org.occiware.clouddesigner.occi.OCCITables%>.CLSSid_Extension, null);\n        final /*@Thrown\052/ boolean oclIsTypeOf = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%>.INSTANCE.evaluate(evaluator, owner, TYP_occi_c_c_Extension_0).booleanValue());\n        /*@Thrown\052/ boolean symbol_0;\n        if (oclIsTypeOf) {\n            final /*@NonNull\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.occi.Extension%> oclAsType = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState((<%org.occiware.clouddesigner.occi.Extension%>)<%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%>.INSTANCE.evaluate(evaluator, owner, TYP_occi_c_c_Extension_0));\n            final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> ownerScheme = oclAsType.getScheme();\n            final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> size_0 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.StringSizeOperation%>.INSTANCE.evaluate(ownerScheme));\n            final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> diff_0 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState((<%org.eclipse.ocl.pivot.values.IntegerValue%>)<%org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation%>.INSTANCE.evaluate(size_0, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_1));\n            final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> scheme = this.getScheme();\n            final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> substring = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.StringSubstringOperation%>.INSTANCE.evaluate(scheme, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_1, diff_0));\n            final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> substring_0 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.StringSubstringOperation%>.INSTANCE.evaluate(ownerScheme, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_1, diff_0));\n            final /*@Thrown\052/ boolean eq = substring.equals(substring_0);\n            symbol_0 = eq;\n        }\n        else {\n            symbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n        }\n        CAUGHT_symbol_0 = symbol_0;\n    }\n    catch (<%java.lang.Exception%> e) {\n        CAUGHT_symbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n    }\n    final /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(evaluator, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Mixin_c_c_CorrectScheme, this, null, diagnostics, context, null, severity_0, CAUGHT_symbol_0, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n    symbol_1 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_1;'"
	 * @generated
	 */
	boolean CorrectScheme(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv AttributesNameNotAlreadyDefinedInDepends:\n *   let\n *     severity : Integer[1] = \'Mixin::AttributesNameNotAlreadyDefinedInDepends\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         status : OclAny[1] = attributes.name->excludesAll(\n *           depends->closure(depends).attributes.name)\n *       in\n *         \'Mixin::AttributesNameNotAlreadyDefinedInDepends\'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)\n *     endif\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Evaluator%> evaluator = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.StandardLibrary%> standardLibrary = idResolver.getStandardLibrary();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Mixin_c_c_AttributesNameNotAlreadyDefinedInDepends));\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(evaluator, severity_0, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n/*@NonInvalid\052/ boolean symbol_1;\nif (le) {\n    symbol_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n    /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_status;\n    try {\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Attribute%>> attributes = this.getAttributes();\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_attributes = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Attribute, attributes);\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.SEQ_PRIMid_String);\n        /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = BOXED_attributes.iterator();\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect;\n        while (true) {\n            if (!ITERATOR__1.hasNext()) {\n                collect = accumulator;\n                break;\n            }\n            /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Attribute%> _1 = (<%org.occiware.clouddesigner.occi.Attribute%>)ITERATOR__1.next();\n            /**\n             * name\n             \052/\n            if (_1 == null) {\n                throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::Attribute::name\\\'\");\n            }\n            final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> name = _1.getName();\n            //\n            accumulator.add(name);\n        }\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Mixin%>> depends = this.getDepends();\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_depends = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Mixin, depends);\n        final /*@NonNull\052/ <%org.eclipse.ocl.pivot.Class%> TYPE_closure_0 = evaluator.getStaticTypeOf(BOXED_depends);\n        final /*@NonNull\052/ <%org.eclipse.ocl.pivot.library.LibraryIteration%> IMPL_closure_0 = (<%org.eclipse.ocl.pivot.library.LibraryIteration%>)TYPE_closure_0.lookupImplementation(standardLibrary, <%org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables%>.Operations._OrderedSet__closure);\n        final /*@NonNull\052/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Mixin, <%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Mixin);\n        /**\n         * Implementation of the iterator body.\n         \052/\n        final /*@NonNull\052/ <%org.eclipse.ocl.pivot.library.AbstractBinaryOperation%> BODY_closure_0 = new <%org.eclipse.ocl.pivot.library.AbstractBinaryOperation%>()\n        {\n            /**\n             * depends\n             \052/\n            @Override\n            public /*@Nullable\052/ Object evaluate(final /*@NonNull\052/ <%org.eclipse.ocl.pivot.evaluation.Evaluator%> evaluator, final /*@NonNull\052/ <%org.eclipse.ocl.pivot.ids.TypeId%> typeId, final /*@Nullable\052/ Object BOXED_depends, final /*@Nullable\052/ /*@NonInvalid\052/ <%java.lang.Object%> _1_0) {\n                final /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Mixin%> symbol_0 = (<%org.occiware.clouddesigner.occi.Mixin%>)_1_0;\n                if (symbol_0 == null) {\n                    throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::Mixin::depends\\\'\");\n                }\n                final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Mixin%>> depends_0 = symbol_0.getDepends();\n                final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_depends_0 = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Mixin, depends_0);\n                return BOXED_depends_0;\n            }\n        };\n        final /*@NonNull\052/  <%org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager%> MGR_closure_0 = new <%org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager%>(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Mixin, BODY_closure_0, BOXED_depends, ACC_closure_0);\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> closure = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState((<%org.eclipse.ocl.pivot.values.OrderedSetValue%>)IMPL_closure_0.evaluateIteration(MGR_closure_0));\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.SEQ_CLSSid_Attribute);\n        /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_1 = closure.iterator();\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect_1;\n        while (true) {\n            if (!ITERATOR__1_1.hasNext()) {\n                collect_1 = accumulator_0;\n                break;\n            }\n            /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Mixin%> _1_1 = (<%org.occiware.clouddesigner.occi.Mixin%>)ITERATOR__1_1.next();\n            /**\n             * attributes\n             \052/\n            if (_1_1 == null) {\n                throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::Category::attributes\\\'\");\n            }\n            final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Attribute%>> attributes_0 = _1_1.getAttributes();\n            final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_attributes_0 = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Attribute, attributes_0);\n            //\n            for (Object value : BOXED_attributes_0.flatten().getElements()) {\n                accumulator_0.add(value);\n            }\n        }\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.SEQ_PRIMid_String);\n        /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_2 = collect_1.iterator();\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect_0;\n        while (true) {\n            if (!ITERATOR__1_2.hasNext()) {\n                collect_0 = accumulator_1;\n                break;\n            }\n            /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Attribute%> _1_2 = (<%org.occiware.clouddesigner.occi.Attribute%>)ITERATOR__1_2.next();\n            /**\n             * name\n             \052/\n            if (_1_2 == null) {\n                throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::Attribute::name\\\'\");\n            }\n            final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> name_0 = _1_2.getName();\n            //\n            accumulator_1.add(name_0);\n        }\n        final /*@Thrown\052/ boolean status = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.collection.CollectionExcludesAllOperation%>.INSTANCE.evaluate(collect, collect_0).booleanValue());\n        CAUGHT_status = status;\n    }\n    catch (<%java.lang.Exception%> e) {\n        CAUGHT_status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n    }\n    final /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(evaluator, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Mixin_c_c_AttributesNameNotAlreadyDefinedInDepends, this, null, diagnostics, context, null, severity_0, CAUGHT_status, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n    symbol_1 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_1;'"
	 * @generated
	 */
	boolean AttributesNameNotAlreadyDefinedInDepends(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Mixin
