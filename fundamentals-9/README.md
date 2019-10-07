# Fundamentals 9
## Object orientation
When one object communicates with another object, and how this happens. 

A constructor takes in the parameters from the outside of the class, this enables you to have private variables inside a public class.

A behaviour is something that your class **does**. 

When you use the *extends* keyword you are saying that this class **is a type** of the parent class.
You then use the keyword **super** to describe that those variables have come from the *immediate* parent class. 

If you are wanting to edit an older class, it is better to extend the class as you don't know what is relying on it. 

An interface is a way to contain all the methods relating to particular classes. If something uses it, it can do that. 

The difference between implements and extends is that child A and child B both extend the parent class, but only child A can swim. You would then have a swimming interface that only child A implements. 

**You can extend 1 class but you can implement as many as you want**

You can create an arrayList of type child class. 

#### Abstraction
Creating an abstract class is a way of specifying a template which cannot be instantiated but has a set of characteristics that all of its children must abide by.

You can create as many layers as abstraction as necessary.

### 4 pillars of OO:
#### Inheritance
done through interface way or abstract class way *extends*
#### Encapsulation
Containing things in an object that are only required to the object. 
Keeps objects relevant
#### Abstraction
Keeping objects safe and private so that the outside world cannot change a private variable. 
#### Polymorphism
Many forms of the object. Being able to change things into many forms without breaking stuff. 

## SOLID

### S) Srp 
Single responsibility principle.
A class has 1 responsibility and should only have 1 reason to change.
1. This means you have fewer tests to write. 
2. Lower coupling - fewer dependencies and less relying on other classes which have a relationship with it. 
3. Organises your code. 

### O) Open for extensions, closed for modification
Classes that you create should be able to be extended but should not be modified in place. Someone might be relying on this class and if you change it it will break their class. 

If you do extend an available class, don't then make that abstract. 

### L) Liskov substitution principle
If class A is subclass of class B, then we should be able to replace B with A without breaking the main application. 

`In programming, the Liskov substitution principle states that if S is a subtype of T, then objects of type T may be replaced (or substituted) with objects of type S`

### I) Interface Segragation principle
In programming, the interface segregation principle states that no client should be forced to depend on methods it does not use.
Put more simply: Do not add additional functionality to an existing interface by adding new methods.
Instead, create a new interface and let your class implement multiple interfaces if needed.
Larger interfaces should be split into smaller ones. By doing so we can ensure that implementing classes only need to be concerned about the methods that are interest to them.

### D) Dependency 
This principle states that
    High-level modules should not depend on low-level modules. Both should depend on abstractions.
    Abstractions should not depend on details. Details should depend on abstractions.
    
    Rather than class A depending on class B, class A & class B should depend on abstraction A. 

## Maps

A map is a way to store data with key value pairs. A map cannot contain duplicate keys and if the key is mutated then the value may become very difficult to access. 

The key is stored as a hashcode, as that is what the compiler uses to search through the hashmap. 

Good practice to have 
`Map<String, String> ...` rather than
`HashMap<String, String>` 
As this is allows more forms of the object. 

Map is an interface, i.e. an abstract "thing" that defines how something can be used. HashMap is an implementation of that interface.

When using a for each wanting to return the key and value pair, iterating over a map, you need to use Map.Entry<Data type, Data Type> and then use the .entrySet() method on the map.
You cannot just return the name, as you have to call a method on it. 


## Sets

