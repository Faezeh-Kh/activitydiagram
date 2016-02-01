package org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.Activity;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedMTAdaptersFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivityEdge;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivityNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Trace;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Variable;

@SuppressWarnings("all")
public class ActivityAdapter extends EObjectAdapter<Activity> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Activity {
  private SequentialActivityDiagramExtendedMTAdaptersFactory adaptersFactory;
  
  public ActivityAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  private EList<ActivityNode> nodes;
  
  @Override
  public EList<ActivityNode> getNodes() {
    if (nodes == null)
    	nodes = EListAdapter.newInstance(adaptee.getNodes(), adaptersFactory) ;
    return nodes;
  }
  
  private EList<ActivityEdge> edges;
  
  @Override
  public EList<ActivityEdge> getEdges() {
    if (edges == null)
    	edges = EListAdapter.newInstance(adaptee.getEdges(), adaptersFactory) ;
    return edges;
  }
  
  private EList<Variable> locals;
  
  @Override
  public EList<Variable> getLocals() {
    if (locals == null)
    	locals = EListAdapter.newInstance(adaptee.getLocals(), adaptersFactory) ;
    return locals;
  }
  
  private EList<Variable> inputs;
  
  @Override
  public EList<Variable> getInputs() {
    if (inputs == null)
    	inputs = EListAdapter.newInstance(adaptee.getInputs(), adaptersFactory) ;
    return inputs;
  }
  
  private Trace trace;
  
  @Override
  public Trace getTrace() {
    return (Trace) adaptersFactory.createAdapter(adaptee.getTrace(), eResource) ;
  }
  
  @Override
  public void setTrace(final Trace o) {
    if (o != null)
    	adaptee.setTrace(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.TraceAdapter) o).getAdaptee()) ;
    else adaptee.setTrace(null) ;
  }
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivity();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NAME:
    		return getName();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NODES:
    		return getNodes();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.ACTIVITY__EDGES:
    		return getEdges();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.ACTIVITY__LOCALS:
    		return getLocals();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.ACTIVITY__INPUTS:
    		return getInputs();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.ACTIVITY__TRACE:
    		return getTrace();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NAME:
    		setName((String) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NODES:
    		getNodes().clear();
    		getNodes().addAll((Collection<? extends ActivityNode>) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.ACTIVITY__EDGES:
    		getEdges().clear();
    		getEdges().addAll((Collection<? extends ActivityEdge>) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.ACTIVITY__LOCALS:
    		getLocals().clear();
    		getLocals().addAll((Collection<? extends Variable>) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.ACTIVITY__INPUTS:
    		getInputs().clear();
    		getInputs().addAll((Collection<? extends Variable>) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.ACTIVITY__TRACE:
    		setTrace((Trace) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NAME:
    		setName((String) null);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NODES:
    		getNodes().clear();
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.ACTIVITY__EDGES:
    		getEdges().clear();
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.ACTIVITY__LOCALS:
    		getLocals().clear();
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.ACTIVITY__INPUTS:
    		getInputs().clear();
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.ACTIVITY__TRACE:
    		setTrace((Trace) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}