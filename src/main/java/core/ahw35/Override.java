package core.ahw35;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)

public @interface Override {
	int id() default 0;
}
