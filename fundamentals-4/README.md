# Fundamentals 4

private static int will return an int

private static void will not return anything. 

## Control flow

Use constants to give values a meaning, rather than 0, 1 or 2.

## Methods

similar to a function.

Syntax is 

```java
public static final int exampleMethod(int arg1, int arg2) throws Exception
```

```java
public final int milesToWalk(...)
```





Access modifiers: 

- public - open to anyone/thing
- private - only open to those inside the class
- protected -  Only available inside the package level it is defined in.

This is a table to show the access 

|              | private | default | protected | public |
| ------------ | ------- | ------- | --------- | ------ |
| Class        | No      | Yes     | No        | Yes    |
| Nested Class | Yes     | Yes     | Yes       | Yes    |
| Constructor  | Yes     | Yes     | Yes       | Yes    |
| Method       | Yes     | Yes     | Yes       | Yes    |
| Field        | Yes     | Yes     | Yes       | Yes    |

If `void` then the class will not return anything. 

You can also have private variables which will only be accessible inside the class.

Methods are important so that you **D**on't **R**epeat **Y**ourself.

Try not to have more than 5 arguments in a single method. 

You might not need arguments with a method but you still need to provide the (). 

When you are creating methods, they should only be doing one thing. SRP

**Single Responsibility Principle** - Method should do one thing and do it well. It should also be called what it is doing. Be explicit. 

Methods belong to the object they are attached to.

**SOLID** Principles

### Scanner

Scanner is a class which allows the console to take a `System.in` input 

It's important to create a local variable if one of your method returns a value. It then saves you having to print out the method and then it getting lost in the debugging process.

### Method Overloading

Jars are libraries, javadoc contains a lot of different jdk's 

You can have different methods that have the same name, as long as they have different numbers of arguments.

This is often used with legacy code, and backwards compatibility. 

### Getters and Setters

`getVariable` returns the variable from that class

`setVariable` sets the variable in the class, like a constructor. 

### Method Override 

You can override inbuilt java methods by explicitly defining a new method in your code. 

```java
public String toString() {
    return
        "name= " + etc.etc.etc.
}
```

This will create a new toString() method instead of using the out of the box in java. 

## Exceptions and Exception handling




