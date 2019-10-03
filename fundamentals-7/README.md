# Fundamentals 7 

Recap

## 10 Characteristics of becoming a good developer

1. Patience
2. Problem solving away from coding
3. Passion
4. Philomath - love to learn
5. Team player
6. Don't be arrogant
7. Be proud, but humble
8. Good time management
9. Focus
10. Listen

## Mocking 

Rely on a 3rd party method but you replace the 3rd party with your own code. A mock is something that you will replace when you create the real application. 

## Creating a maven file

Group Id is the package (com.manchesterdigital), other id is the name. 

```xml
<properties>
    <maven.compiler.target>1.8</maven.compiler.target>
    <maven.compiler.source>1.8</maven.compiler.source>
</properties><maven.compiler.target>1.8</maven.compiler.target>
<dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>

        <dependency>
            <groupId>org.assertj</groupId>
            <artifactId>assertj-core</artifactId>
            <version>3.9.1</version>
        </dependency>

        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-all</artifactId>
            <version>1.9.5</version>
        </dependency>
        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <version>1.10.19</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```

These are found on the maven repository. 
A maven project has a src main and a src test. This is where you build your tests, obviously.

System under test - what you are actually testing.

TDD - **Red -> Green -> Refactor**

Create all the pre-requesites such as classes and methods in the test, then export them to the main. 

Bind constructor parameters to fields -> creates a `this` for the 

Generate equals and hashcode, this creates 2 methods which will override the equals and hashcode methods. 

Whattf is mockito. It is a way to pretend, for the sake of the test, that you have additional functionality that your program does not have yet. Such as sign in for facebook. 

`setUp()` and `tearDown()` allow you to create 'constants' for you to use in your tests. 

Look into claimants service



## ArrayList

<> is a method to remove generics from java. Don't need to put the <> on the right hand side. 

- Inside the <> there needs to be a non primitive. NOT int. 

Using `ArrayList.add(3, "Variable")` you can add Variable at a specific location. 

You will still have an index runtime exception if you have missed a value in the array list. 

Using `ArrayList.remove()` you can remove elements from the list. This will take in either the index or the reference. (such as the "String"). The boolean reference value only returns `true` but the index method returns the actual value removed. 

`ArrayList.contains()` returns a boolean, true if it contains. **Case Sensitive**

`Collections` class is very useful in sorting arrays. Such as alphabetical. Not ASCII.



## For loops

If you are using a variable that is accesible outside of the for loop you can then access the final variable value outside of it. 

Loops are good as they adhere to **DRY**. 

When you have a collection of something you will usually use a for each loop. Such as an array or an arraylist.

### While loops

Use while loops if you don't know how many times you need to iterate your loop. 

Boxing 

```java
Double tempPopulation = population * (1 + growthRate);
population = tempPopulation.intValue()
```

