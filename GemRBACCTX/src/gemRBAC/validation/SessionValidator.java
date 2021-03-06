/**
 *
 * $Id$
 */
package gemRBAC.validation;

import gemRBAC.Role;
import gemRBAC.User;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link gemRBAC.Session}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SessionValidator {
	boolean validate();

	boolean validateIdSession(String value);
	boolean validateActiveRoles(EList<Role> value);
	boolean validateEnabledRoles(EList<Role> value);
	boolean validateUser(User value);
}
