/*
 * generated by Xtext 2.9.1
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.input.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractActivityDiagramInputValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://org.gemoc.activitydiagram.sequential.xactivitydiagram/activitydiagram/"));
		return result;
	}
	
}
