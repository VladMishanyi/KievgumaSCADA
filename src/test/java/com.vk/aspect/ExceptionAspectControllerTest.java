package com.vk.aspect;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Executable;

/**
 * Created by KIP-PC99 on 31.07.2018.
 */
public final class ExceptionAspectControllerTest {

    private static ExceptionAspectController exceptionAspectController;

    @BeforeClass
    public static void beforeClass(){
        exceptionAspectController = new ExceptionAspectController();
    }

    @Test
    public void afterThrowingAdviceTest() throws Exception{
        Assert.assertNotNull(exceptionAspectController);
        exceptionAspectController.afterThrowingAdvice(new Exception());
    }
}
