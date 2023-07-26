
# Turnkey Assesment 

## Deliverables

- Write a program to generate the fibonacci sequence
- Write A program to get the largest difference in a list
- Debug a program that calulates average
- Write an SQl statement that returns employees who meet certain criteria

## Fibonacci.java

The fibonci prgrams first requests user to give input.
The user input is checked if it is postive and greater than zero, if not error messages are displayed. 
The fibonaci method then initializes previous virables prev and current,
it adds prev and current and updates the values of prev and current until the nth value or nth fib number

## Average Calculator

The calculateAverage method had an error in which the calulated average although declared as 
a double will be of type integer sice total and numbers.length are integers. 
To solve this I have explicitly cast one of the operands to double before division 
thus making the result a double. By doing this we will not lose decimal precision.


## MaximumDifference.java

Here we first initialize the lowest minimum value and the highest maximum value. 
Next we use a For Each loop to iterate through each element in the list, 
if the numbers in the list are lower then the least and maximum possible elements 
initialized we replace them as the minimim and maximum elements. We then find the difference between the maximum and minimum elements

## employee_query.sql

In this task we use a select query to get employees whose age is above 30 and salary above 50000.

## Resources

- [GoldenLifeHospital](https://goldenlifekenya.org/donate)
- [Online E-Commerce Shop](https://github.com/HarryLekishon/ProShop/tree/master)
