package org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanBinaryOperator;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanVariable;

@SuppressWarnings("all")
public class BooleanBinaryExpressionAdapter extends /* EObjectAdapter<org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.BooleanBinaryExpression> */ implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanBinaryExpression {
  private org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedMTAdaptersFactory adaptersFactory;
  
  public BooleanBinaryExpressionAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanBinaryOperator getOperator() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanBinaryOperator.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanBinaryOperator o) {
    adaptee.setOperator(org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.BooleanBinaryOperator.get(o.getValue())) ;
  }
  
  private org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanVariable assignee;
  
  @Override
  public org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanVariable getAssignee() {
    return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanVariable) adaptersFactory.createAdapter(adaptee.getAssignee(), eResource) ;
  }
  
  @Override
  public void setAssignee(final org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanVariable o) {
    if (o != null)
    	adaptee.setAssignee(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.BooleanVariableAdapter) o).getAdaptee()) ;
    else adaptee.setAssignee(null) ;
  }
  
  private org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanVariable operand1;
  
  @Override
  public org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanVariable getOperand1() {
    return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanVariable) adaptersFactory.createAdapter(adaptee.getOperand1(), eResource) ;
  }
  
  @Override
  public void setOperand1(final org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanVariable o) {
    if (o != null)
    	adaptee.setOperand1(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.BooleanVariableAdapter) o).getAdaptee()) ;
    else adaptee.setOperand1(null) ;
  }
  
  private org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanVariable operand2;
  
  @Override
  public org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanVariable getOperand2() {
    return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanVariable) adaptersFactory.createAdapter(adaptee.getOperand2(), eResource) ;
  }
  
  @Override
  public void setOperand2(final org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanVariable o) {
    if (o != null)
    	adaptee.setOperand2(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.BooleanVariableAdapter) o).getAdaptee()) ;
    else adaptee.setOperand2(null) ;
  }
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getBooleanBinaryExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION__ASSIGNEE:
    		return getAssignee();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND1:
    		return getOperand1();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND2:
    		return getOperand2();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION__ASSIGNEE:
    		setAssignee((BooleanVariable) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND1:
    		setOperand1((BooleanVariable) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND2:
    		setOperand2((BooleanVariable) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION__OPERATOR:
    		setOperator((BooleanBinaryOperator) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION__ASSIGNEE:
    		setAssignee((BooleanVariable) null);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND1:
    		setOperand1((BooleanVariable) null);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND2:
    		setOperand2((BooleanVariable) null);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION__OPERATOR:
    		setOperator((BooleanBinaryOperator) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}