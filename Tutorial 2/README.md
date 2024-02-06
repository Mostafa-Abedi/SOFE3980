# Tutorial 2: The Rhythms of TDD

**SOFTWARE QUALITY | Ontario Tech University | CRN 74663 | SECTION 005**

**Date:** February 5th, 2024

**Author:** Mostafa Abedi (100787034)  
**Email:** mostafa.abedi@ontariotechu.net

## Table of Contents
1. [Introduction](#introduction)
2. [Learning Objectives](#learning-objectives)
3. [Tasks](#tasks)
   - [Task 1](#task-1)
   - [Task 2](#task-2)
   - [Task 3](#task-3)
4. [Questions and Answers](#questions-and-answers)
   - [Question 1](#question-1)
   - [Question 2](#question-2)
   - [Question 3](#question-3)
5. [Links](#links)
   - [Github](#github)
6. [Conclusion](#conclusion)

---

## Introduction
This tutorial delves deeper into Test Driven Development (TDD), focusing on the Wordz Application and emphasizing readability improvement.

## Learning Objectives
1. Understand Test-Driven Development and the RGR cycle.
2. Gain experience writing JUnit Tests with Java, including writing tests, making implementations, and refactoring.

## Tasks

### Task 1
Test Driven Development begins with creating a test for a word game with specific requirements:
- Correct letter in the correct position: black background
- Correct letter in the wrong position: gray background
- Incorrect letter not present: white background

![Tests for a correct single letter](./images/figure_2.1.1.png)

Quick implementations of missing classes are demonstrated, as shown in Figures 2.1.2, 2.1.3, and 2.1.4.

![Quick implementation](./images/figure_2.1.2.png)  
![Implementation of Word and Score class](./images/figure_2.1.3.png)  
![Implementation of Score class](./images/figure_2.1.4.png)

### Task 2
Moving from red to green by adding a test for a single correct letter to the class.

![Full implementation of the word class](./images/figure_2.2.1.png)  
![Full implementation of Score class](./images/figure_2.2.2.png)  
Improving the test by considering readability, as shown in Figure 2.2.3.

### Task 3
Creating a test for the second letter being in the wrong position (red phase).

![Adding a new test for second wrong letter](./images/figure_2.3.1.png)

In the green phase, all required classes for the test are added to the main class, as shown in Figure 2.3.2.

![New implementation](./images/figure_2.3.2.png)

Finally, executing the test results in successful runs (Figure 2.3.3).

![Test success](./images/figure_2.3.3.png)

## Questions and Answers

### Question 1
What TDD cycle is illustrated by writing a failing test, making it pass with production code, and then refactoring the code?

The TDD cycle illustrated is the Red-Green-Refactor cycle:
- Red: Write a failing test.
- Green: Write the minimum code to make the test pass.
- Refactor: Improve the code without changing its behavior.

### Question 2
Which TDD cycle step involves reviewing the code for 'code smells’?

The TDD cycle step that involves reviewing the code for 'code smells' is the Refactor step. It is done after making the test pass, examining the code for potential improvements in readability, maintainability, or efficiency.

### Question 3
What does the term 'refactoring' imply in the context of TDD?

In the context of TDD, 'refactoring' implies making changes to the existing code to improve its structure, design, and readability without altering its external behavior. It aims to enhance maintainability, reduce duplication, and address any identified 'code smells.'

## Links

### Github
The code from each tutorial can be found [here](https://github.com/Mostafa-Abedi/SOFE3980.git).

## Conclusion
In conclusion, this tutorial provides a hands-on exploration of Test-Driven Development (TDD) using the Wordz Application. The emphasis on the Red-Green-Refactor cycle ensures a comprehensive understanding of writing tests, implementing code, and improving code quality.
