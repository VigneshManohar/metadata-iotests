// src/test/java/tests/TestSignUp.java
package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LoginPage;
import org.junit.jupiter.api.Assertions;

public class TestSignUp {

    @Test
    public void testSignUp() {
        HomePage homePage = new HomePage();
        homePage.goTo();
        homePage.goToSignUp();

        LoginPage loginPage = new LoginPage();
        loginPage.signUp("testuser", "testpassword");

        Assertions.assertTrue(loginPage.isModalDisplayed(), "Modal should be displayed");
    }
}
