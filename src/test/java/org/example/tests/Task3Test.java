package org.example.tests;

import io.qameta.allure.junit4.DisplayName;
import org.example.basetestclass.BaseTests;
import org.example.framework.managers.TestPropManager;
import org.junit.Test;

public class Task3Test extends BaseTests {

    @DisplayName("Проверка создания командировки")
    @Test
    public void exampleTest() {
        app.getAuthPage()
                .fillField("Логин", TestPropManager.getTestPropManager().getProperty("login"))
                .fillField("Пароль", TestPropManager.getTestPropManager().getProperty("password"))
                .confirmLogin()
                .checkOpenMainPage("Панель быстрого запуска")
                .selectBaseMenu("Расходы")
                .selectSubMenu("Командировки")
                .createBusinessTrip()
                .checkOpenCreateBusinessTripPage("Создать командировку")
                .chooseUnit("Администрация Ада")
                .chooseOrganisation("Applana")
                .turnOnCheckbox()
                .fillInCities("Новосибирск, Россия", "Шанхай, Китай")
                .fillInDates("11.11.2022", "31.12.2023")
                .checkMainAlert("Список командируемых сотрудников не может быть пустым");

    }
}
