// src/test/java/tests/TestAddToCart.java
package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.PhonesPage;
import pages.CartPage;
import org.junit.jupiter.api.Assertions;

public class TestAddToCart {

    @Test
    public void testAddToCart() {
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
        cartPage.removeOneItem();
        Assertions.assertEquals(1, cartPage.getCartItemCount(), "Cart item count should be 1");
    }
}
