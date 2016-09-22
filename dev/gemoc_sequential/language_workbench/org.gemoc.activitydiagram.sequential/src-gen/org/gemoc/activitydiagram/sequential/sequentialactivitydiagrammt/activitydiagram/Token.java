/**
 */
package org.gemoc.activitydiagram.sequential.sequentialactivitydiagrammt.activitydiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.sequential.sequentialactivitydiagrammt.activitydiagram.Token#getHolder <em>Holder</em>}</li>
 * </ul>
 *
 * @see org.gemoc.activitydiagram.sequential.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getToken()
 * @model
 * @generated
 */
public interface Token extends EObject {
	/**
	 * Returns the value of the '<em><b>Holder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.activitydiagram.sequential.sequentialactivitydiagrammt.activitydiagram.ActivityNode#getHeldTokens <em>Held Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holder</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder</em>' container reference.
	 * @see #setHolder(ActivityNode)
	 * @see org.gemoc.activitydiagram.sequential.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getToken_Holder()
	 * @see org.gemoc.activitydiagram.sequential.sequentialactivitydiagrammt.activitydiagram.ActivityNode#getHeldTokens
	 * @model opposite="heldTokens" required="true" transient="false"
	 * @generated
	 */
	ActivityNode getHolder();

	/**
	 * Sets the value of the '{@link org.gemoc.activitydiagram.sequential.sequentialactivitydiagrammt.activitydiagram.Token#getHolder <em>Holder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holder</em>' container reference.
	 * @see #getHolder()
	 * @generated
	 */
	void setHolder(ActivityNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Token transfer1(ActivityNode holder);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void withdraw1();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isWithdrawn();

} // Token
