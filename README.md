## 🚀 Selenium-Spring Boot Framework

Welcome to the **Java Selenium Spring Boot** framework! 🎉 This repository is built for automated testing of web applications. With **Selenium WebDriver**, **Cucumber**, and **Spring Boot**, this framework is ready to tackle a wide range of test scenarios and even supports parallel execution using **TestNG**.

### ✨ Features

- **Spring Boot integration**: Seamlessly handle configuration and dependency injection, ensuring scalability and flexibility.
- **Selenium WebDriver**: Automate browsers like a pro for web app testing.
- **Cucumber BDD**: Write clear, human-readable feature files in Gherkin to drive behavior-driven development (BDD).
- **TestNG for parallel execution**: Speed up your tests with parallel execution using TestNG's `@DataProvider`.
- **Custom Annotations & Configs**: Ready-to-use configs for WebDriver, waits, and more! ⚙️
- **HTML Reports**: Automatically generates detailed HTML reports for easy analysis.

### 🛠️ Prerequisites

Before you begin, make sure you have these installed:
- **Java 8+**
- **Maven**
- **Docker** (if you want to run the tests in containers 🐳)
- **ChromeDriver** (or your favorite WebDriver for browser automation)

### 🚀 Getting Started

#### Clone the Repository

Get the code up and running with these simple steps:

```bash
git clone https://github.com/YehorYehorychev/Selenium-Spring.git
cd Selenium-Spring
```

### 🧪 Running Tests

Update the configuration: Ensure that the application.properties or environment-specific .properties files contain the correct settings for the WebDriver and target environment.

Build the project:

```bash
mvn clean install
```

### Execute tests:

```bash
mvn test
```

### 🐳 Running Tests in Docker

- To run the tests inside a Docker container, follow these steps:

Build the Docker image:

```bash
docker build -t selenium-spring .
```

Run the container:

```bash
docker run -it selenium-spring
```

### Project Structure

- **src/main/java**:
  - Contains the Java source files, including the configuration classes (e.g., `WebDriverConfig`), page objects, and services.
  
- **src/test/java**:
  - Contains Cucumber step definitions, test runners, and feature files for BDD scenarios.

- **resources**:
  - Holds the application properties, test data, and Cucumber feature files.

- **target**:
  - Automatically generated directory after Maven builds, including reports and logs.

### 📊 Reports

Test results are saved in the `target/test-output` folder. You can view the test report by opening `cucumber-report.html` in a browser.


## 🙌 Contribution

Feel free to fork this repository, create a feature branch, and send pull requests for any improvements or bug fixes.


