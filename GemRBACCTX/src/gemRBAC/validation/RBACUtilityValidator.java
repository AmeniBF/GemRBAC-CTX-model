/**
 *
 * $Id$
 */
package gemRBAC.validation;

import gemRBAC.Operation;
import gemRBAC.Permission;
import gemRBAC.RelativeTimePoint;
import gemRBAC.TimePoint;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link gemRBAC.RBACUtility}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RBACUtilityValidator {
	boolean validate();

	boolean validateMaxPermission(int value);
	boolean validateMaxActiveRole(int value);
	boolean validateMaxRole(int value);
	boolean validateBusinessTaskList(EList<Operation> value);
	boolean validateBoundedPermissions(EList<Permission> value);
	boolean validateCurrentT(TimePoint value);
	boolean validateCurrentDay(RelativeTimePoint value);
}