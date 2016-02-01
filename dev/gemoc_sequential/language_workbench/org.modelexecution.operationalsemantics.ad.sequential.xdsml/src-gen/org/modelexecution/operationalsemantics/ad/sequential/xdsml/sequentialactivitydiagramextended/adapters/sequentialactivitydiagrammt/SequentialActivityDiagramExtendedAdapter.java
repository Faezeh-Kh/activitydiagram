package org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.SequentialActivityDiagramMT;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramFactory;

@SuppressWarnings("all")
public class SequentialActivityDiagramExtendedAdapter extends ResourceAdapter implements SequentialActivityDiagramMT {
  public SequentialActivityDiagramExtendedAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public ActivitydiagramFactory getFactory() {
    return new org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramMTFactoryAdapter() ;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}