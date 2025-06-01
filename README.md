# Java Bank Project

This simple cli java application uses effective testing and clean code (screenshots found in folder)

## Testing

JUnit 5 is used to test and veify main functionalities. The tests are as followed:

1. testDeposit - Ensures updated balance is correct after deposit
2. testWithdrawal - Ensures updated balance is correct after withdrawal
3. testInsufficientFunds - Validates exception after invalid withdrawal
4. testZeroDeposit - Ensures Deposits are a valid, positive value

## Clean code examples

1. Meaningful method and variable names - Methods are named clearly to describe given scenario
   Exception given is descriptive of the error encountered

2. Single reponsibility - Methods are individual to one task/scenario making them easy to read and test

3. Isolated Test Setup - Using @BeforeEach ensures everything is wiped and clean prior to commencing any test

## Dependencies

The project required the JUnit 5 Maven dependency to ensure effective and efficient testing can be regularly completed.
I used this dependency from examples given in class.

## Github Actions

Added github actions to ensure testing is completed after every pull request
