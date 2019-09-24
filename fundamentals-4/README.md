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



Methods are important so that you **D**on't **R**epeat **Y**ourself.

Try not to have more than 5 arguments in a single method. 

You might not need arguments with a method but you still need to provide the (). 

When you are creating methods, they should only be doing one thing. SRP

**Single Responsibility Principle** - Method should do one thing and do it well. It should also be called what it is doing. Be explicit. 

Methods belong to the object they are attached to.

**SOLID** Principles





## Exceptions and Exception handling




