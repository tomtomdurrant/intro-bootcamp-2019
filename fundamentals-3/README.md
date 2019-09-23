# Fundamentals 3

### Assignment statement
`int numberOfTeams = 4;`
### Declarative Statement 
`double interestRate;`

Generally, you do not need to import a class if they are in the same package

Expressions can be made up of variables and operators. E.g.
`a + b = c`

.var on the end of a line will add an = and declare the variable
## Different types of variables in java 
Instance 
Static - this will only be created once in memory, even if you create the class 10 times. Similar to constants. This means that if you create many of them they can all have different values and the compiler doesn’t know which to grab
Local

`Private Static Final ` will create a constant in the class scope that can be called from inside the class.

Static is a class scope.
Java likes to bring in static imports at the top, and then you can just call the variable as you would normally.
`import` brings in a class
`import static` brings in a static variable rather than a class.

The `==` operator looks if the value is equal in a primitive, in a wrapper class it looks if the classes are equal.  BE careful with this. 
Booleans can be re-assigned inside an if statement. `if (booleanVariable = true){}` will reassign the value to true. 

An object is a generic instance of a class

Ternary operator - shorthand if statement
`boolean isHungry = numberOfMealsToday == 1 ? true : false`
if numberOfMealsToday == 1 then evaluate to true. Else it will be false. 
In this example, `true` and `false` have to be whatever the datatype is. E.g.
`int isHungry = numberOfMealsToday == 1 ? 100 : 1000`
The : is essentially an `else` statement. 

