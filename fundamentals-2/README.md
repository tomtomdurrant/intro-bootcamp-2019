# Fundamentals 2

## Git
`git checkout` changes branches on your machine -\> important that you then use
`git pull` then pulls the changes that have been made
`git branch` -a shows all branches
When committing, it is better for commit messages to be overall rather than saying every little thing. 
Once you have merged the branches, you have only merged this locally. You need to push it to the remote repository.

If someone has made changes to the master branch, and you’re working on a feature branch, you need to merge the master branch first so you are up to date and then merge the feature branch.

## Coding Standards
Creating packages uses canonical format 
Classes use _PascalCase_
`{}` braces
`()` parenthesis 
`[]` square brackets

### Styling
Some orgs use styling files & styling references specific to them.

## Java
`// /* /**`
Different comment types
Max length should be 80 characters wide
`public static void main(String[] args)` - shortcut *psvm*
`System.out.println();` prints line to the terminal - shortcut *sout*

### Java Variables
Different data types have different sizes
`<data_type> <variable_name>`
Can declare multiple variables of the same type, eg `int i1, i2, i3;` however these do not have any value. 
Make sure you use the correct data type for your variable.
You cannot declare 2 data types on the same line
Primitive vs non-primitive
#### Primitive 
- only has size & type
- char can be the character or ASCII
#### Non-primitive or reference
 - more complex variables. 
- can be null

#### Printing strings 
Should not do:
`System.out.println("Name: " + firstName + " " + lastName)` The space has memory allocated and the system does not know when to not use it.
Should do:
`System.out.println(String.format("Name: %s %s", firstName, lastName)) ` The %s relates to the first string after the comma.
As String is a class in java, it has methods you can call on it. Such as String.format - a nicer way to print with no chance of memory leaks.

StringBuilder is a class you can use to build new strings from old names. An even nicer way to print.
```java
StringBuilder outputVariable = new StringBuilder();

        outputVariable.append(firstName);
        outputVariable.append(" ");
        outputVariable.append(lastName);
System.out.println(outputVariable.toString());

```
`System.out.println` provides the `.toString()` method implicitly, although it can be overridden if you want to call a different method. 

### Arrays
When initialising an array you must tell java how much memory to allocate to the array. Because of this, after initialisation, array length is **fixed**. 
E.g.
```java
int [] numbers = new int[10];
numbers [0] = 99;		
```
This would initialise an array of integers. You can initialise an array of other types.
If you need an array with a variable length you would use the java utility ArrayList.

#### Date
In java there are a few different `Date` types. There are many different types of utility classes. If you look into them you can see which package they come from. 
When you have reference classes, such as Date, you can use the keyword `new` to initialise them. 

### Wrapper Classes
Wrapper classes use primitives as objects. E.g. int vs Integer
We use the wrapper classes more frequently. Hence why Java is considered an Object Oriented Programming Language.
In these wrapper classes there are methods that call constant values, such as `Integer.MAX_VALUE`



Claimants api annotations created

