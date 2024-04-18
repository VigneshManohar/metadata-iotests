# Selenium Automation Framework

This repository contains a Selenium automation framework implemented in Java using the Page Object Model pattern. The framework is designed to automate tests for the [DemoBlaze](https://www.demoblaze.com/) website. It includes tests for signing up, adding items to cart, placing orders, and validating categories.

## Setup

1. Clone the repository to your local machine:

    ```bash
    git clone <repository_url>
    ```

2. Import the project into your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse).

3. Install Maven dependencies by running the following command in the project directory:

    ```bash
    mvn clean install
    ```

4. Download appropriate WebDriver executables for your browser (Chrome, Firefox, etc.) and place them in the `drivers/` directory.

## Running Tests

You can run the tests using your IDE's test runner or command-line Maven commands.

### Using IDE Test Runner

1. Open the test classes located in `src/test/java/tests/`.
2. Right-click on the test class file.
3. Select "Run" or "Run As" option to execute the tests.

### Using Maven Commands

To run tests from the command line, use the following Maven command:

```bash
mvn test

## Test Results

After running the tests, you will see the test execution results in the console. Each test will display whether it passed or failed along with any relevant error messages.

## Additional Information

- The framework follows the Page Object Model pattern, ensuring clean and maintainable code.
- Each test file (`TestSignUp.java`, `TestAddToCart.java`, `TestPlaceOrder.java`, `TestValidateCategories.java`) corresponds to a specific test scenario.

