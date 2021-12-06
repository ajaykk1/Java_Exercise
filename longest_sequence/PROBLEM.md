## Problem Statement: Find the length of the longest sequence of zeros in binary representation of a positive integer. ##

**Given a positive number, find the length of the longest sequence of zeros in binary representation of a positive integer using conditional statements and loops**

**This exercise contains a class named LongestSequence with the following methods:**

    +inputAcceptor() : void
        -Should accept input from the console
        -Should call inputValidator method with given input
------------------------------------------------------        
    +inputValidator(int) : void
        -Should accept input as int and validates the input
        -Should print error message "Give proper input not negative number" if Number(N) is negative
        -Should print error message "Give proper input not zero" if Number(N) is zero
        -Should call method findLongestSequence method with input
        -Should print result as int like 4 
------------------------------------------------------
    +findLongestSequence(int) : int
        -Should get number as input and return length of the longest sequence of zeros in binary representation of number as int
        -Should find length of the longest sequence of zeros in binary representation
        -Should return length of the longest sequence of zeros in binary representation if found otherwise return -1
------------------------------------------------------
    +outputPrinter(Object) : void
        -Should accept any type as input and print it

## Example
    Sample Input:
    7
    
    Expected Output:   
    0
--------------------------------------------------------
    Sample Input:
    5
    
    Expected Output:
    1
--------------------------------------------------------
    Sample Input:
    -20
    
    Expected Output:
    Give proper input not negative number
--------------------------------------------------------
    Sample Input:
    0
    
    Expected Output:
    Give proper input not zero
--------------------------------------------------------
    Sample Input:
    8
    
    Expected Output:
    3
## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding
