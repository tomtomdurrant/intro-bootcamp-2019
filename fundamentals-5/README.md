# Fundamentals 5

https://github.com/astb01/bootcamp-2019

Where you think you might get a null value, you can use a wrapper class.

| Wrapper class | Primitive type |
| ------------- | -------------- |
| Boolean       | boolean        |
| Byte          | byte           |
| Character     | char           |
| Float         | float          |
| Integer       | int            |
| Long          | long           |
| Short         | short          |
| Double        | double         |

If there are no imports at the head of the code, you are obviously using a method in the same package. 

If the class or variable is static, this will only have it's memory location assigned once, so even if you call it 10000 times it will remember the value called the first time. (Kind of like static vs dynamic IP addresses. )

Object & instance of the object.

It is only an instance when you use the new keyword.

When you are calling a method on a variable, you need to call it on the variable you have just created. 

Static methods have to be accessed at the class level.

## Exceptions

Exception is an unwanted event that happens whilst the program is executing. The program will still run but will provide an exception.

If you have caught an exception you can use `System.err.println();` 

```java
public void debitAccount( double amount ) throws Exception {
    
}
```

Throwables can provide `Errors` or `Exceptions` 

When an exception is provided you can create a variable of this and then print it out. The variable will be the **stack trace**. 

Use try and catch when you think it might throw an exception at run time. 

In javadoc, it will explain what exception this method **might** throw. `ctrl + q` to see this, 

You can then use `throw` and the exception you might expect. 

It is better to know which exceptions you are expecting and explicitly state them with a throw, rather than just a blanket statement which covers any exception. 

You can also have multiple throws & exceptions, if you want a specific exception to take a specific path.

**DON'T** just print out the error message as it might not be as descriptive as you want it to be.

Order of catches matters, catch the most obvious/common exceptions first. 

Don't call an exception either throwable or exception.

Don't have an empty catch either. 

You can use `finally` at the end of your `try` and `catch` statements. No matter what you have done in the try and catch statements. 

## Testing

- Functional Testing - make sure it works

  - Manual testing - manually - not good
  - Integration testing - tests written by the developer
  - Smoke testing - tests written by someone other than the developer, such as QA.

- Non Functional Testing - how it works

  - Performance testing - how it performs - works to kpis. 
  - Load tasting - Can the application handle the data
  - Stress testing - can it work outside the boundaries set, number of users etc
    - Can you make it scalable? Is an example of this.

- Unit testing - Writing a test just for one method

  - Multiple unit testing is called a 'Test Suite'

  100% code coverage is when every single line of code has been used. There are no superfluous lines. > 85% is good. 

  - This can be achieved with TDD.

**A**rrange tests

**A**ct on your tests

**A**ssert your tests.

Dependencies & libraries are essentially the same thing. It is someone else's code that you are relying on. 

When testing, important to annotate tests. 

Junit is a library so you can run your tests. 

A diagram of tdd:

Test Driven Development:![](C:\Users\uktdur\level4SoftwareDeveloper\bootcamp2019\fundamentals-5\tdd.png)

WRITE YOUR TESTS FIRST.

