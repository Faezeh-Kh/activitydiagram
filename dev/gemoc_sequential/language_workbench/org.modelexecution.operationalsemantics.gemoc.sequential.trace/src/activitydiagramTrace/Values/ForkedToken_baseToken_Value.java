/**
 */
package activitydiagramTrace.Values;

import activitydiagramTrace.State;

import activitydiagramTrace.Traced.activitydiagram.TracedForkedToken;
import activitydiagramTrace.Traced.activitydiagram.TracedToken;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forked Token base Token Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Values.ForkedToken_baseToken_Value#getBaseToken <em>Base Token</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.ForkedToken_baseToken_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.ForkedToken_baseToken_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Values.ValuesPackage#getForkedToken_baseToken_Value()
 * @model
 * @generated
 */
public interface ForkedToken_baseToken_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Token</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Token</em>' reference.
	 * @see #setBaseToken(TracedToken)
	 * @see activitydiagramTrace.Values.ValuesPackage#getForkedToken_baseToken_Value_BaseToken()
	 * @model required="true"
	 * @generated
	 */
	TracedToken getBaseToken();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.ForkedToken_baseToken_Value#getBaseToken <em>Base Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Token</em>' reference.
	 * @see #getBaseToken()
	 * @generated
	 */
	void setBaseToken(TracedToken value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Traced.activitydiagram.TracedForkedToken#getBaseTokenTrace <em>Base Token Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedForkedToken)
	 * @see activitydiagramTrace.Values.ValuesPackage#getForkedToken_baseToken_Value_Parent()
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedForkedToken#getBaseTokenTrace
	 * @model opposite="baseTokenTrace" required="true" transient="false"
	 * @generated
	 */
	TracedForkedToken getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.ForkedToken_baseToken_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedForkedToken value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.State#getForkedToken_baseToken_Values <em>Forked Token base Token Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.Values.ValuesPackage#getForkedToken_baseToken_Value_States()
	 * @see activitydiagramTrace.State#getForkedToken_baseToken_Values
	 * @model opposite="forkedToken_baseToken_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // ForkedToken_baseToken_Value
