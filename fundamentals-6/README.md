# Fundamentals 6

## Exceptions 

2 types of exceptions: 

- Runtime 
- Compiler (checked or unchecked)

The compiler tries to check the code & exceptions in real time, and will check this. 

If the code is relying on something the compiler cannot check then it is an unchecked error. 

`try` and `catch` are usually more helpful errors to either users or other members of your code. 

`throw` sends the exception back to the user as an unhelpful exception



Back end do not try and second guess user requests. They are only waiting for the call from front end. You only give what you are requested. 

Front end often do thing 1 whilst waiting for thing 2 to return from either the user or the back end. 







## TDD



Ensure you refactor your test code. 

Usually should only have 1 assertion per unit test 

Tests mean you don't need to create a main method. 