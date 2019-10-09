# Fundamentals 12

## Optional

A container to place a value that may or may not exist. A safety net so that null pointers aren't as frequent. Null checks *are not* required. 

Don't set an optional to be null. That defeats the whole point of the optional. 

implement your .getVariable() method and then use the .orElseThrow() method. 

Optionals are best use sparingly, you use 4 times the amount of memory when you are creating the class. 

Also, using an optional is masking the fact that you have a null pointer. As well as the fact that sometimes you want to have a null.

`Optional.ofNullable` is dangerous as you are masking the 

### Static blocks

Static blocks are initialised before the rest of the code.  



## Streams

Streams are similar to loops, in that they evaluate through an object( array etc). However streams cannot mutate the object, but you can mutate the object values - however this is not best practice. 

`.filter()` is an intermediate operation, you can have as many intermediaries as you want, however you can only have one terminator. 
`.count()` is a terminal operation and returns the number of values which match all the filters. 
Very important to know which stream operators and stuff you can have. 

A filter has a lambda expression inside it. 

You can have a stream of streams and inside that you can use the `.flatMap()` method to remove the hierarchy



## Predicate

Predicate is an evaluator for something that matches a criteria against something that you are wishing it to match against. You can then pass it around and use it as a reusable method. 

Predicate is doing the filtering and matching some expression to be true. 

Predicate is something that refactors the filter criteria. 



## External libraries

