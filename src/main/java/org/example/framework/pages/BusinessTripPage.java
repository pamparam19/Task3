package org.example.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessTripPage extends BasePage {
    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    private WebElement btTitle;

    @FindBy(xpath = "//a[@title='Создать командировку' and text() = 'Создать командировку']")
    private WebElement createBTbutton;

//    public BusinessTripPage checkOpenBusinessTripPage() {
//        waitUntilVisible(btTitle);
//        Assert.assertEquals("Заголовок отсутствует или не соответствует требуемому",
//                "Все Командировки", btTitle.getText());
//        return this;
//    }

    public CreateBusinessTripPage createBusinessTrip() {
        waitUntilClickable(createBTbutton).click();
        return pageManager.getCreateBusinessTripPage();
    }
}
