/*
 * generated by Xtext 2.25.0
 */
package fr.ensma.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractThreeAddressCodeValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(fr.ensma.dsl.threeAddressCode.ThreeAddressCodePackage.eINSTANCE);
		return result;
	}
}
