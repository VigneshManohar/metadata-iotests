// src/test/java/tests/TestValidateCategories.java
package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.CategoryPage;
import org.junit.jupiter.api.Assertions;

public class TestValidateCategories {

    @Test
    public void testValidateCategories() {
        HomePage homePage = new HomePage();
        homePage.goTo();
        LoginPage loginPage = new LoginPage();
        loginPage.login("username", "password");

        CategoryPage categoryPage = new CategoryPage();
        for (String mainCategory : categoryPage.getMainCategories()) {
            for (String subCategory : categoryPage.getSubCategories(mainCategory)) {
                Assertions.assertTrue(categoryPage.validateSubCategoryItems(mainCategory, subCategory),
                        "Main category should contain all items from subcategory");
            }
        }
    }
}
