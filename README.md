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
  2. The *power operator* is set to be right associative so that it reflects the way it is used in mathematics. 2^2^3 is 2^(2^3).
  3. I decided that I will handle null pointer exceptions by default using the same technique as *KOTLIN*. When declaring a variable one can apply a modifier called *"nullable"* to it which defines that that variable can accept NULL values. Otherwise, no variables can be NULL so this way you'll spot the error before it occurs.
  4. Comments are not parsed

### 3. Sample program explanations

Please find the explanation of the sample programs below. For the sake of simplifying my explanations I will start at the bottom of the program (which is actually the top, you know what I mean...).
##### Program 1
This program stores prices in an array, asks the user how many prices
