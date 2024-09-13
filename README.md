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
