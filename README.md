## Selenium-Spring Boot Framework

This repository contains a **Java Selenium Spring Boot** framework designed for automated testing of web applications. The framework is built using **Selenium WebDriver**, **Cucumber**, and **Spring Boot** to support a wide range of test scenarios, including integration with TestNG for parallel execution.

### Features

- **Spring Boot integration**: Allows easier configuration and dependency injection, enhancing scalability.
- **Selenium WebDriver**: Handles browser automation for web application testing.
- **Cucumber BDD**: Supports behavior-driven development (BDD) using feature files written in Gherkin syntax.
- **TestNG for parallel execution**: Facilitates running tests in parallel using TestNG's `@DataProvider`.
- **Custom Annotations & Configs**: Includes reusable configuration files for WebDriver, waits, and other browser settings.
- **HTML Reports**: Automatically generates detailed HTML reports for test runs.

### Prerequisites

To use this project, ensure you have the following installed:
- **Java 8+**
- **Maven**
- **Docker** (for running in containers)
- **ChromeDriver** or another WebDriver executable for browser testing

### Getting Started

#### Clone the Repository

```bash
git clone https://github.com/YehorYehorychev/Selenium-Spring.git
cd Selenium-Spring
```

### Running Tests

Update the configuration: Ensure that the application.properties or environment-specific .properties files contain the correct settings for the WebDriver and target environment.

Build the project:

```bash
mvn clean install
```

### Execute tests:

```bash
mvn test
```

### Running Tests in Docker

- To run the tests inside a Docker container, follow these steps:

Build the Docker image:

```bash
docker build -t selenium-spring .
```

Run the container:

```bash
docker run -it selenium-spring
```

- Project Structure
src/main/java:

- Contains the Java source files, including the configuration classes (e.g., WebDriverConfig), page objects, and services.
src/test/java:

 - Contains Cucumber step definitions, test runners, and feature files for BDD scenarios.
resources:

- Holds the application properties, test data, and Cucumber feature files.
target:

- Automatically generated directory after Maven builds, including reports and logs.
Reports
Test results are saved in the target/test-output folder. You can view the test report by opening cucumber-report.html in a browser.

Contribution
Feel free to fork this repository, create a feature branch, and send pull requests for any improvements or bug fixes.


