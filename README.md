```

          ___     __   __                   _   __    ___   ______  ____ _    __    ______
         /   |   / /  / /_  ___    _____   / | / /   /   | /_  __/ /  _/| |  / /   / ____/
        / /| |  / /  / __/ / _ \  / ___/  /  |/ /   / /| |  / /    / /  | | / /   / __/
       / ___ | / /  / /_  /  __/ / /     / /|  /   / ___ | / /   _/ /   | |/ /   / /___
      /_/  |_|/_/   \__/  \___/ /_/     /_/ |_/   /_/  |_|/_/   /___/   |___/   /_____/

      A language that's "flippin" weird...                created by   Gergo Kekesi
                                                                  ******************
 ```

 # Documentation

 ### 1. Introduction
 **AlterNATIVE** is a language that was designed to hurt your brain a little. We are so used to thinking top down, left to right that we struggle to see things any other way. A lot of programming languages use very similar keywords and are typed top-down, left to right. Fear not however, **AlterNATIVE** is at your rescue!

 With **AlterNATIVE** you start at the end. Just let that sink in a little. I know right?! Most of the symbols you are used to using are also replaced with an alternative (Hint: See why it's called **AlterNATIVE**?). The program beings execution at the "START" word and ends at "FINISH".

 ### 2. Grammar/Language features
 As for the grammar, I have done some research so that I can expand it and make it as accurate as possible. Here is a list of what I found and applied in the **AlterNATIVE** grammar:
  1. The lexer rules are listed in order of precedence so that for example '*when*' is matched first instead of *CHARACTER*. The same with boolean and number operations.
  2. The *power operator* is set to be right associative so that it reflects the way it is used in mathematics. `2^2^3 is 2^(2^3).`
  3. I decided that I will handle null pointer exceptions by default using the same technique as *KOTLIN*. When declaring a variable one can apply a modifier called *"nullable"* to it which defines that that variable can accept NULL values. Otherwise, no variables can be NULL so this way you'll spot the error before it occurs.
  4. Comments are not parsed
  5. Other:
   1. Boolean operations such as greater than or less than are read from left to right, just the same way as in other languages. ``(10 >> 2)`` evaluates to true. ``(4+(4*2) <<==> 11)`` evaluates to false.
   2. Array indexes however start from the right. ``<<"Index 3","Index 2", "Index 1", "Index 0">> ==> anArray text<<4>>``
   3. Various array operations:
      1. `merge` -> merges two arrays removing the duplicates
      2. `join` -> joins two arrays without removing duplicates
      3. `quantity` -> returns the length of the array
      4. `extract from` -> returns an array with the values in-between the supplied indexes. First value from left is the high value, second is the low value. (3,0) is between index 0 and 3.
    4. Various string operations
      1. `concatinate` -> using the ++ operator strings can be concatinated
      2. `quantity` -> returns the number of characters in the strings
      3. `exists` -> checkes whether a squence of characters exist in the string returning true or false based on the result
      4. `extract from` -> returns a string with the values in-between the supplied indexes

### 3. Sample program explanations

Please find the explanation of the sample programs below. For the sake of simplifying my explanations I will start at the bottom of the program (which is actually the top, you know what I mean...).
##### Program 1
This program stores prices in an array, asks the user how many prices they would like to input, applies VAT to those prices and stores them at the appropriate index. The user is able to select which index they want to start inputting prices from. If the price is lower than 0 or greater than 100 an error is show before asking the user again. There are various features that are present in this program:

* Single line comments
* costArray is declared as a global empty float array and set to nullable as initially each index is null. Also a few other global variables
* Void function getInput that takes two parameters
* Combined boolean expressions used in the first while(as long as) loop.
* array.length function used to retrieve length of costArray -> "`(costArray)quantity`"
* The user inputs a value for price -> `(price)userinput`
* The returned value from a decimal function is rounded to 2 decimal places and then assigned to an index in the costArray -> `(2,(price)applyVAT call)precision ==> costArray<<start>>`
* A number function is called to increment the value of start -> `++==>start`
* If(when), else if(or when) and else(otherwise) are used to validate the input
* Void function call in the main program
* Variable is declared and initailised to what the user inputs `()userinput ==> start decimal`
* Strings are concatenated in the print statement -> `("To many items! Enter " ++ (prices)quantity ++ " or less items.")nloutput`

##### Program 2
In this example program there aren't many features that have not been demonstrated in Program 1.This program calculates a number and then asks the user to guess it. When the correct number is guessed, the program terminates. The main features that can be seen here are:

* For loop. In **AlterNATIVE** it is declared backwards `<-(++==> i; i << 10; 0 ==> i decimal) for`
* Case statement is used to evaluate the guessed number and decide what to do
* default statement is used to display "Invalid" if none of the other checks work.

##### Program 3
Program 3 showcases what can be done with arrays in **AlterNATIVE**. From an array of racers, first the place "Greg" finished at is printed. Then, using the `extract from` function, a new array of three racers is created and then printed index by index. After this, is user defined method called disqualify is called. This function removes the person passed it from the originalRacers and returns the new array.
Features seen here:

* Create array functions that return arrays
* Extract values into a new array
* Assign returned array to a new array in one line
