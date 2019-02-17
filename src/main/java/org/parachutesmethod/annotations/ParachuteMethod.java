package org.parachutesmethod.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface ParachuteMethod {

    public enum Provider {
        AWS_LAMBDA, MS_AF, GF
    }

    Provider targetProvider() default Provider.AWS_LAMBDA;
}
