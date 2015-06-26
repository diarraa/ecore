/**
 */
package org.occiware.clouddesigner.occi;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.Configuration#getUse <em>Use</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.Configuration#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.OCCIPackage#getConfiguration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AllResourcesKindsInUse AllResourcesMixinsInUse AllResourcesLinksKindsInUse AllResourcesLinksMixinsInUse AllResourcesLinksTargetsInConfiguration'"
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.occi.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference list.
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getConfiguration_Use()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Configuration!use'"
	 * @generated
	 */
	EList<Extension> getUse();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.occi.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getConfiguration_Resources()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Configuration!resources'"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv AllResourcesLinksKindsInUse:\n *   let\n *     severity : Integer[1] = \'Configuration::AllResourcesLinksKindsInUse\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         status : Boolean[1] = use->includesAll(\n *           resources.links.kind.oclContainer())\n *       in\n *         \'Configuration::AllResourcesLinksKindsInUse\'.logDiagnostic(self, diagnostics, context, severity, status, 0)\n *     endif\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Evaluator%> evaluator = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Configuration_c_c_AllResourcesLinksKindsInUse));\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(evaluator, severity_0, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n    symbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n    /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_status;\n    try {\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Extension%>> use = this.getUse();\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_use = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Extension, use);\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Resource%>> resources = this.getResources();\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_resources = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Resource, resources);\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.SEQ_CLSSid_Link);\n        /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = BOXED_resources.iterator();\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect_1;\n        while (true) {\n            if (!ITERATOR__1.hasNext()) {\n                collect_1 = accumulator;\n                break;\n            }\n            /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Resource%> _1 = (<%org.occiware.clouddesigner.occi.Resource%>)ITERATOR__1.next();\n            /**\n             * links\n             \052/\n            if (_1 == null) {\n                throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi\\\'::Resource::links\\\'\");\n            }\n            final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Link%>> links = _1.getLinks();\n            final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_links = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Link, links);\n            //\n            for (Object value : BOXED_links.flatten().getElements()) {\n                accumulator.add(value);\n            }\n        }\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.SEQ_CLSSid_Kind);\n        /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_0 = collect_1.iterator();\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect_0;\n        while (true) {\n            if (!ITERATOR__1_0.hasNext()) {\n                collect_0 = accumulator_0;\n                break;\n            }\n            /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Link%> _1_0 = (<%org.occiware.clouddesigner.occi.Link%>)ITERATOR__1_0.next();\n            /**\n             * kind\n             \052/\n            if (_1_0 == null) {\n                throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi\\\'::Entity::kind\\\'\");\n            }\n            final /*@NonNull\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.occi.Kind%> kind = _1_0.getKind();\n            //\n            accumulator_0.add(kind);\n        }\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.SEQ_CLSSid_OclElement);\n        /*@NonNull\052/ <%java.util.Iterator%><?> ITERATOR__1_1 = collect_0.iterator();\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect;\n        while (true) {\n            if (!ITERATOR__1_1.hasNext()) {\n                collect = accumulator_1;\n                break;\n            }\n            /*@NonNull\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Kind%> _1_1 = (<%org.occiware.clouddesigner.occi.Kind%>)ITERATOR__1_1.next();\n            /**\n             * oclContainer()\n             \052/\n            final /*@Nullable\052/ /*@NonInvalid\052/ <%java.lang.Object%> oclContainer = <%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(evaluator, _1_1);\n            //\n            if (oclContainer instanceof <%org.eclipse.ocl.pivot.values.CollectionValue%>) {\n                for (Object value : ((<%org.eclipse.ocl.pivot.values.CollectionValue%>)oclContainer).flatten().getElements()) {\n                    accumulator_1.add(value);\n                }\n            }\n            else {\n                accumulator_1.add(oclContainer);\n            }\n        }\n        final /*@Thrown\052/ boolean status = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.collection.CollectionIncludesAllOperation%>.INSTANCE.evaluate(BOXED_use, collect).booleanValue());\n        CAUGHT_status = status;\n    }\n    catch (<%java.lang.Exception%> e) {\n        CAUGHT_status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n    }\n    final /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(evaluator, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Configuration_c_c_AllResourcesLinksKindsInUse, this, diagnostics, context, severity_0, CAUGHT_status, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n    symbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean AllResourcesLinksKindsInUse(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv AllResourcesLinksTargetsInConfiguration:\n *   let\n *     severity : Integer[1] = \'Configuration::AllResourcesLinksTargetsInConfiguration\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         status : Boolean[?] = resources.links.target->forAll(r |\n *           r.oclContainer() = self)\n *       in\n *         \'Configuration::AllResourcesLinksTargetsInConfiguration\'.logDiagnostic(self, diagnostics, context, severity, status, 0)\n *     endif\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Evaluator%> evaluator = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Configuration_c_c_AllResourcesLinksTargetsInConfiguration));\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(evaluator, severity_0, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n    symbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n    /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_status;\n    try {\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Resource%>> resources = this.getResources();\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_resources = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Resource, resources);\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.SEQ_CLSSid_Link);\n        /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = BOXED_resources.iterator();\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect_0;\n        while (true) {\n            if (!ITERATOR__1.hasNext()) {\n                collect_0 = accumulator;\n                break;\n            }\n            /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Resource%> _1 = (<%org.occiware.clouddesigner.occi.Resource%>)ITERATOR__1.next();\n            /**\n             * links\n             \052/\n            if (_1 == null) {\n                throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi\\\'::Resource::links\\\'\");\n            }\n            final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Link%>> links = _1.getLinks();\n            final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_links = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Link, links);\n            //\n            for (Object value : BOXED_links.flatten().getElements()) {\n                accumulator.add(value);\n            }\n        }\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.SEQ_CLSSid_Resource);\n        /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_0 = collect_0.iterator();\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect;\n        while (true) {\n            if (!ITERATOR__1_0.hasNext()) {\n                collect = accumulator_0;\n                break;\n            }\n            /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Link%> _1_0 = (<%org.occiware.clouddesigner.occi.Link%>)ITERATOR__1_0.next();\n            /**\n             * target\n             \052/\n            if (_1_0 == null) {\n                throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi\\\'::Link::target\\\'\");\n            }\n            final /*@NonNull\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.occi.Resource%> target = _1_0.getTarget();\n            //\n            accumulator_0.add(target);\n        }\n        /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Object%> accumulator_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n        /*@NonNull\052/ <%java.util.Iterator%><?> ITERATOR_r = collect.iterator();\n        /*@Thrown\052/ boolean status;\n        while (true) {\n            if (!ITERATOR_r.hasNext()) {\n                if (accumulator_1 == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n                    status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n                }\n                else {\n                    throw (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)accumulator_1;\n                }\n                break;\n            }\n            /*@NonNull\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Resource%> r = (<%org.occiware.clouddesigner.occi.Resource%>)ITERATOR_r.next();\n            /**\n             * r.oclContainer() = self\n             \052/\n            final /*@Nullable\052/ /*@NonInvalid\052/ <%java.lang.Object%> oclContainer = <%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(evaluator, r);\n            final /*@NonInvalid\052/ boolean eq = this.equals(oclContainer);\n            //\n            if (eq == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\t\t\t\t\t// Normal unsuccessful body evaluation result\n                status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n                break;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately \n            }\n            else if (eq == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\t\t\t\t// Normal successful body evaluation result\n                ;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n            }\n            else {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n                accumulator_1 = new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(<%org.eclipse.ocl.pivot.messages.PivotMessages%>.NonBooleanBody, \"forAll\");\n            }\n        }\n        CAUGHT_status = status;\n    }\n    catch (<%java.lang.Exception%> e) {\n        CAUGHT_status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n    }\n    final /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(evaluator, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Configuration_c_c_AllResourcesLinksTargetsInConfiguration, this, diagnostics, context, severity_0, CAUGHT_status, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n    symbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean AllResourcesLinksTargetsInConfiguration(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv AllResourcesKindsInUse:\n *   let\n *     severity : Integer[1] = \'Configuration::AllResourcesKindsInUse\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         status : Boolean[1] = use->includesAll(resources.kind.oclContainer())\n *       in\n *         \'Configuration::AllResourcesKindsInUse\'.logDiagnostic(self, diagnostics, context, severity, status, 0)\n *     endif\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Evaluator%> evaluator = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Configuration_c_c_AllResourcesKindsInUse));\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(evaluator, severity_0, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n    symbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n    /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_status;\n    try {\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Extension%>> use = this.getUse();\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_use = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Extension, use);\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Resource%>> resources = this.getResources();\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_resources = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Resource, resources);\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.SEQ_CLSSid_Kind);\n        /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = BOXED_resources.iterator();\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect_0;\n        while (true) {\n            if (!ITERATOR__1.hasNext()) {\n                collect_0 = accumulator;\n                break;\n            }\n            /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Resource%> _1 = (<%org.occiware.clouddesigner.occi.Resource%>)ITERATOR__1.next();\n            /**\n             * kind\n             \052/\n            if (_1 == null) {\n                throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi\\\'::Entity::kind\\\'\");\n            }\n            final /*@NonNull\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.occi.Kind%> kind = _1.getKind();\n            //\n            accumulator.add(kind);\n        }\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.SEQ_CLSSid_OclElement);\n        /*@NonNull\052/ <%java.util.Iterator%><?> ITERATOR__1_0 = collect_0.iterator();\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect;\n        while (true) {\n            if (!ITERATOR__1_0.hasNext()) {\n                collect = accumulator_0;\n                break;\n            }\n            /*@NonNull\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Kind%> _1_0 = (<%org.occiware.clouddesigner.occi.Kind%>)ITERATOR__1_0.next();\n            /**\n             * oclContainer()\n             \052/\n            final /*@Nullable\052/ /*@NonInvalid\052/ <%java.lang.Object%> oclContainer = <%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(evaluator, _1_0);\n            //\n            if (oclContainer instanceof <%org.eclipse.ocl.pivot.values.CollectionValue%>) {\n                for (Object value : ((<%org.eclipse.ocl.pivot.values.CollectionValue%>)oclContainer).flatten().getElements()) {\n                    accumulator_0.add(value);\n                }\n            }\n            else {\n                accumulator_0.add(oclContainer);\n            }\n        }\n        final /*@Thrown\052/ boolean status = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.collection.CollectionIncludesAllOperation%>.INSTANCE.evaluate(BOXED_use, collect).booleanValue());\n        CAUGHT_status = status;\n    }\n    catch (<%java.lang.Exception%> e) {\n        CAUGHT_status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n    }\n    final /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(evaluator, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Configuration_c_c_AllResourcesKindsInUse, this, diagnostics, context, severity_0, CAUGHT_status, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n    symbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean AllResourcesKindsInUse(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv AllResourcesMixinsInUse:\n *   let\n *     severity : Integer[1] = \'Configuration::AllResourcesMixinsInUse\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         status : Boolean[1] = use->includesAll(\n *           resources.mixins.oclContainer())\n *       in\n *         \'Configuration::AllResourcesMixinsInUse\'.logDiagnostic(self, diagnostics, context, severity, status, 0)\n *     endif\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Evaluator%> evaluator = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Configuration_c_c_AllResourcesMixinsInUse));\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(evaluator, severity_0, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n    symbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n    /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_status;\n    try {\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Extension%>> use = this.getUse();\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_use = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Extension, use);\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Resource%>> resources = this.getResources();\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_resources = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Resource, resources);\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.SEQ_CLSSid_Mixin);\n        /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = BOXED_resources.iterator();\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect_0;\n        while (true) {\n            if (!ITERATOR__1.hasNext()) {\n                collect_0 = accumulator;\n                break;\n            }\n            /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Resource%> _1 = (<%org.occiware.clouddesigner.occi.Resource%>)ITERATOR__1.next();\n            /**\n             * mixins\n             \052/\n            if (_1 == null) {\n                throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi\\\'::Entity::mixins\\\'\");\n            }\n            final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Mixin%>> mixins = _1.getMixins();\n            final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_mixins = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Mixin, mixins);\n            //\n            for (Object value : BOXED_mixins.flatten().getElements()) {\n                accumulator.add(value);\n            }\n        }\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.SEQ_CLSSid_OclElement);\n        /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_0 = collect_0.iterator();\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect;\n        while (true) {\n            if (!ITERATOR__1_0.hasNext()) {\n                collect = accumulator_0;\n                break;\n            }\n            /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Mixin%> _1_0 = (<%org.occiware.clouddesigner.occi.Mixin%>)ITERATOR__1_0.next();\n            /**\n             * oclContainer()\n             \052/\n            final /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Object%> oclContainer = <%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(evaluator, _1_0);\n            //\n            if (oclContainer instanceof <%org.eclipse.ocl.pivot.values.CollectionValue%>) {\n                for (Object value : ((<%org.eclipse.ocl.pivot.values.CollectionValue%>)oclContainer).flatten().getElements()) {\n                    accumulator_0.add(value);\n                }\n            }\n            else {\n                accumulator_0.add(oclContainer);\n            }\n        }\n        final /*@Thrown\052/ boolean status = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.collection.CollectionIncludesAllOperation%>.INSTANCE.evaluate(BOXED_use, collect).booleanValue());\n        CAUGHT_status = status;\n    }\n    catch (<%java.lang.Exception%> e) {\n        CAUGHT_status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n    }\n    final /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(evaluator, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Configuration_c_c_AllResourcesMixinsInUse, this, diagnostics, context, severity_0, CAUGHT_status, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n    symbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean AllResourcesMixinsInUse(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv AllResourcesLinksMixinsInUse:\n *   let\n *     severity : Integer[1] = \'Configuration::AllResourcesLinksMixinsInUse\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         status : Boolean[1] = use->includesAll(\n *           resources.links.mixins.oclContainer())\n *       in\n *         \'Configuration::AllResourcesLinksMixinsInUse\'.logDiagnostic(self, diagnostics, context, severity, status, 0)\n *     endif\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Evaluator%> evaluator = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Configuration_c_c_AllResourcesLinksMixinsInUse));\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(evaluator, severity_0, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n    symbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n    /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_status;\n    try {\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Extension%>> use = this.getUse();\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_use = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Extension, use);\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Resource%>> resources = this.getResources();\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_resources = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Resource, resources);\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.SEQ_CLSSid_Link);\n        /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = BOXED_resources.iterator();\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect_1;\n        while (true) {\n            if (!ITERATOR__1.hasNext()) {\n                collect_1 = accumulator;\n                break;\n            }\n            /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Resource%> _1 = (<%org.occiware.clouddesigner.occi.Resource%>)ITERATOR__1.next();\n            /**\n             * links\n             \052/\n            if (_1 == null) {\n                throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi\\\'::Resource::links\\\'\");\n            }\n            final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Link%>> links = _1.getLinks();\n            final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_links = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Link, links);\n            //\n            for (Object value : BOXED_links.flatten().getElements()) {\n                accumulator.add(value);\n            }\n        }\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.SEQ_CLSSid_Mixin);\n        /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_0 = collect_1.iterator();\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect_0;\n        while (true) {\n            if (!ITERATOR__1_0.hasNext()) {\n                collect_0 = accumulator_0;\n                break;\n            }\n            /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Link%> _1_0 = (<%org.occiware.clouddesigner.occi.Link%>)ITERATOR__1_0.next();\n            /**\n             * mixins\n             \052/\n            if (_1_0 == null) {\n                throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi\\\'::Entity::mixins\\\'\");\n            }\n            final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Mixin%>> mixins = _1_0.getMixins();\n            final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_mixins = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Mixin, mixins);\n            //\n            for (Object value : BOXED_mixins.flatten().getElements()) {\n                accumulator_0.add(value);\n            }\n        }\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.SEQ_CLSSid_OclElement);\n        /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_1 = collect_0.iterator();\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect;\n        while (true) {\n            if (!ITERATOR__1_1.hasNext()) {\n                collect = accumulator_1;\n                break;\n            }\n            /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Mixin%> _1_1 = (<%org.occiware.clouddesigner.occi.Mixin%>)ITERATOR__1_1.next();\n            /**\n             * oclContainer()\n             \052/\n            final /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Object%> oclContainer = <%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(evaluator, _1_1);\n            //\n            if (oclContainer instanceof <%org.eclipse.ocl.pivot.values.CollectionValue%>) {\n                for (Object value : ((<%org.eclipse.ocl.pivot.values.CollectionValue%>)oclContainer).flatten().getElements()) {\n                    accumulator_1.add(value);\n                }\n            }\n            else {\n                accumulator_1.add(oclContainer);\n            }\n        }\n        final /*@Thrown\052/ boolean status = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.collection.CollectionIncludesAllOperation%>.INSTANCE.evaluate(BOXED_use, collect).booleanValue());\n        CAUGHT_status = status;\n    }\n    catch (<%java.lang.Exception%> e) {\n        CAUGHT_status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n    }\n    final /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(evaluator, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Configuration_c_c_AllResourcesLinksMixinsInUse, this, diagnostics, context, severity_0, CAUGHT_status, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n    symbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean AllResourcesLinksMixinsInUse(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Configuration
