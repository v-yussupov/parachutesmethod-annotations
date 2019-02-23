package org.parachutesmethod.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface ParachuteMethod {
    /**
     * Retain annotations in extracted functionality.
     * False by default.
     */
    boolean retainParachuteAnnotations() default false;

    /**
     * Specification of overprovisioning factor for router configuration.
     */
    double overProvisioningFactor();

    /**
     * Example condition for rerouting on specific day.
     */
    String rerouteOnDay();
}
