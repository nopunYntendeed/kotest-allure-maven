# kotest-examples-allure

## Requirements
- Java 17
- Allure cli

Example project using Kotest, Maven and Allure https://github.com/allure-framework

Clone this repo, execute:

```
./mvnw test
allure generate allure-results -o allure-report --clean
allure open allure-report
```