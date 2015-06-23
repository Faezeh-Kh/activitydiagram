/**
 */
package activitydiagramTrace.Steps.impl;

import activitydiagramTrace.ActivitydiagramTracePackage;
import activitydiagramTrace.State;

import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1;
import activitydiagramTrace.Steps.SmallStep;
import activitydiagramTrace.Steps.StepsPackage;

import activitydiagramTrace.Traced.activitydiagram.TracedActivityNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activitydiagram Activity Node Send Offers1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1Impl#getPrecedingState <em>Preceding State</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1Impl#getThis <em>This</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Activitydiagram_ActivityNode_SendOffers1Impl extends Activitydiagram_ActivityNode_Execute_AbstractSubEventImpl implements Activitydiagram_ActivityNode_SendOffers1 {
	/**
	 * The cached value of the '{@link #getPrecedingState() <em>Preceding State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedingState()
	 * @generated
	 * @ordered
	 */
	protected State precedingState;

	/**
	 * The cached value of the '{@link #getThis() <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThis()
	 * @generated
	 * @ordered
	 */
	protected TracedActivityNode this_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Activitydiagram_ActivityNode_SendOffers1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getPrecedingState() {
		if (precedingState != null && precedingState.eIsProxy()) {
			InternalEObject oldPrecedingState = (InternalEObject)precedingState;
			precedingState = (State)eResolveProxy(oldPrecedingState);
			if (precedingState != oldPrecedingState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__PRECEDING_STATE, oldPrecedingState, precedingState));
			}
		}
		return precedingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetPrecedingState() {
		return precedingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecedingState(State newPrecedingState, NotificationChain msgs) {
		State oldPrecedingState = precedingState;
		precedingState = newPrecedingState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__PRECEDING_STATE, oldPrecedingState, newPrecedingState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedingState(State newPrecedingState) {
		if (newPrecedingState != precedingState) {
			NotificationChain msgs = null;
			if (precedingState != null)
				msgs = ((InternalEObject)precedingState).eInverseRemove(this, ActivitydiagramTracePackage.STATE__FOLLOWING_STEP, State.class, msgs);
			if (newPrecedingState != null)
				msgs = ((InternalEObject)newPrecedingState).eInverseAdd(this, ActivitydiagramTracePackage.STATE__FOLLOWING_STEP, State.class, msgs);
			msgs = basicSetPrecedingState(newPrecedingState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__PRECEDING_STATE, newPrecedingState, newPrecedingState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityNode getThis() {
		if (this_ != null && this_.eIsProxy()) {
			InternalEObject oldThis = (InternalEObject)this_;
			this_ = (TracedActivityNode)eResolveProxy(oldThis);
			if (this_ != oldThis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__THIS, oldThis, this_));
			}
		}
		return this_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityNode basicGetThis() {
		return this_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThis(TracedActivityNode newThis) {
		TracedActivityNode oldThis = this_;
		this_ = newThis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__THIS, oldThis, this_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__PRECEDING_STATE:
				if (precedingState != null)
					msgs = ((InternalEObject)precedingState).eInverseRemove(this, ActivitydiagramTracePackage.STATE__FOLLOWING_STEP, State.class, msgs);
				return basicSetPrecedingState((State)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__PRECEDING_STATE:
				return basicSetPrecedingState(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__PRECEDING_STATE:
				if (resolve) return getPrecedingState();
				return basicGetPrecedingState();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__THIS:
				if (resolve) return getThis();
				return basicGetThis();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__PRECEDING_STATE:
				setPrecedingState((State)newValue);
				return;
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__THIS:
				setThis((TracedActivityNode)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__PRECEDING_STATE:
				setPrecedingState((State)null);
				return;
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__THIS:
				setThis((TracedActivityNode)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__PRECEDING_STATE:
				return precedingState != null;
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__THIS:
				return this_ != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SmallStep.class) {
			switch (derivedFeatureID) {
				case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__PRECEDING_STATE: return StepsPackage.SMALL_STEP__PRECEDING_STATE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SmallStep.class) {
			switch (baseFeatureID) {
				case StepsPackage.SMALL_STEP__PRECEDING_STATE: return StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__PRECEDING_STATE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //Activitydiagram_ActivityNode_SendOffers1Impl
