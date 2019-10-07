# Fundamentals 11

Functional Programming

Imperative programming is where you have to explicitly tell the compiler what it needs to do at every step of the way. 

Lambda Expressions

lambda expressions are added in Java 8 and provide below functionalities.

- Enable to treat functionality as a method argument, or code as data.

- A function that can be created without belonging to any class.

- A lambda expression can be passed around as if it was an object and executed on demand.

  A lambda expression must come from an interface with only 1 abstract method in it. 
  Because of this you can use the `@Functional Interface` annotation to denote that this shouldn't be messed with in the future. If you did it would break your Lambda function. 

This means that functions become first class objects.

## Function

Uses the inbuilt JDK methods as they are more robust than ones that have been created/overriden by the user. Also they are immutable. 

`Function<Input, Output> variableName= Class::Method`

`.andThen` is a way to chain together functions

`.compose` is a method that takes precedent 

If your function is taking more than one parameter, you need to create a class which contains both of those parameters. 

Pure/High order function