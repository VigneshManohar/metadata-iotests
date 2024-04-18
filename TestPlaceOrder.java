// src/test/java/tests/TestPlaceOrder.java
package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.PhonesPage;
import pages.CartPage;
import pages.ConfirmationPage;
import org.junit.jupiter.api.Assertions;

public class TestPlaceOrder {

    @Test
    public void testPlaceOrder() {
        HomePage homePage = new HomePage();
        homePage.goTo();
        LoginPage loginPage = new LoginPage();
        loginPage.login("username", "password");

        PhonesPage phonesPage = new PhonesPage();
        phonesPage.goToPhones();
        phonesPage.addToCartFirstPhone();
        phonesPage.addToCartSecondPhone();

        CartPage cartPage = new CartPage();
        cartPage.goToCart();
        cartPage.placeOrder();

        ConfirmationPage confirmationPage = new ConfirmationPage();
        Assertions.assertTrue(confirmationPage.isChargedInfoCorrect(), "Charged information should be correct");
    }
}
