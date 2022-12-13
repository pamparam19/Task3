package org.example.tests;

import org.example.basetestclass.BaseTests;
import org.example.framework.managers.TestPropManager;
import org.junit.Test;

public class Task2Test extends BaseTests {

    @Test
    public void exampleTest() {
        app.getAuthPage()
                .fillField("Логин", TestPropManager.getTestPropManager().getProperty("login"))
                .fillField("Пароль", TestPropManager.getTestPropManager().getProperty("password"))
                .confirmLogin()
                .checkOpenMainPage()
                .selectBaseMenu("Расходы")
                .selectSubMenu("Командировки")
                .createBusinessTrip()
                .checkOpenCreateBusinessTripPage()
                .chooseUnit("Администрация Ада")
                .chooseOrganisation("Applana")
                .turnOnCheckbox()
                .fillInCities("Новосибирск, Россия", "Шанхай, Китай")
                .fillInDates("11.11.2022", "31.12.2023")
                .checkMainAlert();

    }
}
