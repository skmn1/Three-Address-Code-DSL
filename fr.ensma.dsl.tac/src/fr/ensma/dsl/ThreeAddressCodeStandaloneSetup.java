/*
 * generated by Xtext 2.25.0
 */
package fr.ensma.dsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class ThreeAddressCodeStandaloneSetup extends ThreeAddressCodeStandaloneSetupGenerated {

	public static void doSetup() {
		new ThreeAddressCodeStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}