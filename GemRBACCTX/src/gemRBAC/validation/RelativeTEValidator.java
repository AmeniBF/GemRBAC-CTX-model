/**
 *
 * $Id$
 */
package gemRBAC.validation;

import gemRBAC.ActivationDuration;

/**
 * A sample validator interface for {@link gemRBAC.RelativeTE}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RelativeTEValidator {
	boolean validate();

	boolean validateIdRelativeTE(String value);
	boolean validateD2(ActivationDuration value);
}
