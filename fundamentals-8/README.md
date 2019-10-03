# Fundamentals 8
## Enums
Enums are a way of creating constants.
These are classes, not strings so you need to call the `toString()` method on them. 

Enums can have variables inside them by calling `private String variable`. This will then set the enum with initial values which can then be created with a constructor. You will then need a getter to acces them from ourside the enum. 
Enums are grouped with commas and then ended with a semicolon. 
Think of enums like a number as they use the == comparator.

## Classes

Local variables can only be accessed from within the class, but private variables have the capacity to be accessed with a getter.
Only put stuff in the constructors that you know will always need to be used. 

You can create a class inside a class. This is a helpful way to separate your classes to keep the **DRY** principle. 

IF you create a class inside a class and then try and create a new variable with it, you must create a new object outside of the main instantiation.


`final` is a way to create fields which are necessary for the creation of your class. Once you declare a variable with a final keyword, you cannot change it. If a class has a `final` keyword it cannot be extended or instantiated. 
`final` modifies the value so it is immutable. 

toString() is a method that comes from the parent object, you can override this in just the specific object you have overriden it in. 

To inherit from a parent class, use the keyword `extends`.
However you cannot extend multiple classes. The child class doesn't know which it should inherit from. 

Abstract classes cannot be instantiated, but they can be subclassed.An abstract class means you have to provide the implementation for that class in the child class.

## Interface
Interfaces are another example of java classes. You provide a list of abstract methods inside.
Writing an interface is similar to writing a class. But a class describes the attributes and behaviors of an object. And an interface contains behaviors that a class implements.
``` java 
public class Lights implements Controls {
    @Override
    public void switchOn() {
        
    }
    @Override
    public void switchOff() {

    }
} 
```
An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.

You can also put all implementations of controls in an arrayList and can then cycle through them. To print them out to the console you would have to override the toString() method for each of the variabele.

You can also implement more than one interface in a class, unlike when you extend a class.

An abstract method is essentially just the signature of the method. 
