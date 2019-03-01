package org.parachutesmethod.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface ParachuteMethod {
    /**
     * Retain other annotations in extracted functionality. False by default.
     */
    boolean retainAnnotations() default false;

    /**
     * Retain parachute annotations in extracted functionality. False by default.
     */
    boolean retainParachuteAnnotations() default false;

    /**
     * Configure the method to be a backup route.
     */
    boolean backupRoute() default false;

    /**
     * Specification of overprovisioning factor for router configuration.
     */
    String overProvisioningFactor() default "[unassigned]";

    /**
     * Example condition for rerouting on specific day.
     */
    String rerouteOnDay() default "[unassigned]";
}
