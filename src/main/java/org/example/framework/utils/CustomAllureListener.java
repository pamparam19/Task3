package org.example.framework.utils;

import io.qameta.allure.junit4.AllureJunit4;
import org.example.framework.managers.DriverManager;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CustomAllureListener extends AllureJunit4 {
    @Override
    public void testFailure(Failure failure) {
        byte[] byteImage = ((TakesScreenshot) DriverManager.getDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
        getLifecycle().addAttachment("Screenshot", "image/png", null, byteImage);
        super.testFailure(failure);
    }
}
