# Test Factorial

The goal of this exercise is to become familiar with unit testing and the JUnit 5 approach. 

1. Design and code a `factorial` method in the [Factorial](src/main/java/com/epam/rd/autotasks/Factorial.java) class. The requirements are as follows: 

- The method takes a `String` as a parameter, transforms it into an integer value, and counts its factorial. 
- he method returns the result as a `String`.
- The string parameter `n` must be a non-negative integer. If not, an `IllegalArgumentException` should be thrown.

Complete the test classes:

- [FactorialBadInputTesting](src/main/java/com/epam/rd/autotasks/FactorialBadInputTesting.java)\
  You must complete four empty methods:
    - `testNullInput` - test null input cases
    - `testNegativeInput` - test negative number input cases
    - `testFractionalInput` - test fractional cases
    - `testNonDigitalInput` - test non-digit cases
- [FactorialCsvParametrizedTesting](src/main/java/com/epam/rd/autotasks/FactorialCsvParametrizedTesting.java)\
  This is a parameterized test that takes arguments from the [csvCases.csv](src/main/resources/csvCases.csv) file.
  Do not change the csv file; just implement the method.
- [FactorialMethodSourceParametrizedTesting](src/main/java/com/epam/rd/autotasks/FactorialMethodSourceParametrizedTesting.java)\
  This is a parameterized test that takes arguments from the `testCases` method. Complete the test method and introduce a method that provides the following cases: 
    - "1", "1"
    - "2", "2"
    - "5", "120"
- [FactorialRegularInputTesting](src/main/java/com/epam/rd/autotasks/FactorialRegularInputTesting.java)\
This is a test class where you can add regular test cases. Consider covering cases that are not present in other test classes. 

To complete the exercise successfully, your tests must correctly detect flaws in some other implementations. Several classes contain special tests that apply your tests to your implementation and any incorrect implementations:
- [FactorialTestingsTest](src/test/java/com/epam/rd/autotasks/FactorialTestingsTest.java)
- [LazyFactorialTestingsTest](src/test/java/com/epam/rd/autotasks/LazyFactorialTestingsTest.java)
- [WrongOperationConcatIntFactorialTestingsTest](src/test/java/com/epam/rd/autotasks/WrongOperationConcatIntFactorialTestingsTest.java)
- [WrongOperationSumIntFactorialTestingsTest](src/test/java/com/epam/rd/autotasks/WrongOperationSumIntFactorialTestingsTest.java)

Your solution method must pass your tests, while some other implementations must fail them. 

Also, there is one more secret test class that you do not have access to. It will be applied to your solution once you submit it to Autocode. So, make sure to consider a variety of possible cases. 

Hint: [Factorial reference](https://en.wikipedia.org/wiki/Factorial)
