/**
 */
package org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityNode#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityNode#isRunning <em>Running</em>}</li>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityNode#getHeldTokens <em>Held Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface ActivityNode extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivityNode_Outgoing()
	 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityEdge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ActivityEdge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivityNode_Incoming()
	 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityEdge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ActivityEdge> getIncoming();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Activity#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivityNode_Activity()
	 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Activity#getNodes
	 * @model opposite="nodes" required="true" transient="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityNode#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivityNode_Running()
	 * @model required="true"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityNode#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
	void setRunning(boolean value);

	/**
	 * Returns the value of the '<em><b>Held Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Token}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Token#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held Tokens</em>' containment reference list.
	 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivityNode_HeldTokens()
	 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Token#getHolder
	 * @model opposite="holder" containment="true"
	 * @generated
	 */
	EList<Token> getHeldTokens();

} // ActivityNode