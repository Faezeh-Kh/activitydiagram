/**
 */
package activitydiagramTrace.Values;

import activitydiagramTrace.State;

import activitydiagramTrace.Traced.activitydiagram.TracedIntegerValue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Value value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Values.IntegerValue_value_Value#getValue <em>Value</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.IntegerValue_value_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.IntegerValue_value_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Values.ValuesPackage#getIntegerValue_value_Value()
 * @model
 * @generated
 */
public interface IntegerValue_value_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see activitydiagramTrace.Values.ValuesPackage#getIntegerValue_value_Value_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.IntegerValue_value_Value#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Traced.activitydiagram.TracedIntegerValue#getValueTrace <em>Value Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedIntegerValue)
	 * @see activitydiagramTrace.Values.ValuesPackage#getIntegerValue_value_Value_Parent()
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedIntegerValue#getValueTrace
	 * @model opposite="valueTrace" required="true" transient="false"
	 * @generated
	 */
	TracedIntegerValue getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.IntegerValue_value_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedIntegerValue value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.State#getIntegerValue_value_Values <em>Integer Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.Values.ValuesPackage#getIntegerValue_value_Value_States()
	 * @see activitydiagramTrace.State#getIntegerValue_value_Values
	 * @model opposite="integerValue_value_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // IntegerValue_value_Value