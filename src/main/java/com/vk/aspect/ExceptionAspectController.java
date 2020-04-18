package com.vk.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExceptionAspectController {

    /**
     * The object for logging information.
     */
    private final static Logger LOGGER = Logger.getLogger(ExceptionAspectController.class);

    /**
     * The method will be called in the event of exceptional situations,
     * logged information about the exception.
     *
     * @param exception the object of the Exception class or any subclasses.
     */
    @AfterThrowing(
            pointcut = "execution(* com.vk..controller..*(..))",
            throwing = "exception"
    )
    public void afterThrowingAdvice(final Exception exception) {
        LOGGER.error("EXCEPTION IN METHOD -> " + exception.getClass());
    }
}
