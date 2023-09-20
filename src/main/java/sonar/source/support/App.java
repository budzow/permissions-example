package sonar.source.support;


import org.springframework.lang.Nullable;

public class App 
{
	private boolean existingPermissionValue;

	public void apply(@Nullable Boolean updatePermissionValue) {
	    if (updatePermissionValue != null && updatePermissionValue && !existingPermissionValue) {
	    }
	  }
}
