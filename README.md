# Java Collections and Exception Handling

## Objective

This project demonstrates the use of Java Collections Framework and Exception Handling concepts. It covers ArrayList, HashMap, HashSet, try-catch blocks, and custom exceptions.

## Features

### Collections Demo

* Uses ArrayList to store student names.
* Uses HashMap to store student IDs and names.
* Uses HashSet to store unique course names.
* Demonstrates basic collection operations and iteration.

### Exception Handling Demo

* Uses try-catch-finally blocks.
* Handles invalid user input.
* Demonstrates creation and usage of a custom exception (`InvalidAgeException`).
* Validates user age before registration.

## Technologies Used

* Java
* Collections Framework

  * ArrayList
  * HashMap
  * HashSet
* Exception Handling
* Custom Exceptions

## Project Structure

```text
CollectionsDemo.java
CustomExceptionDemo.java
README.md
```

## How to Run

### Compile the Programs

```bash
javac CollectionsDemo.java
javac CustomExceptionDemo.java
```

### Run Collections Demo

```bash
java CollectionsDemo
```

### Run Exception Handling Demo

```bash
java CustomExceptionDemo
```

## Sample Output

### Collections Demo

```text
Students (ArrayList):
Neeraj
Rahul
Amit

Students (HashMap):
101 : Neeraj
102 : Rahul
103 : Amit

Courses (HashSet):
Java
Python
```

### Exception Handling Demo

Valid Input:

```text
Enter age: 20
Eligible to register.
Program Finished.
```

Invalid Input:

```text
Enter age: 15
Custom Exception: Age must be 18 or above.
Program Finished.
```

## Concepts Demonstrated

* ArrayList for dynamic lists
* HashMap for key-value storage
* HashSet for unique elements
* Exception handling using try-catch-finally
* Custom exception creation
* Input validation and error handling

## Author

Neeraj Kumar

