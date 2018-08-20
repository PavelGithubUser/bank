package com.example.bank.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DoesExistAccountValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface DoesExist {
    String message() default "Account doesn't exist";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
