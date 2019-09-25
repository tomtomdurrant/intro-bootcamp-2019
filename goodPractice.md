# Good Practice

Be descriptive with names of variables. Not 1 character.

## Java
Classes use Pascal Case 
`public class StudentAverageGradeCalculator`
Variables use camel case
`String newStudent`
**Don’t use:**
`variable + " " + variable2`
**Do use StringBuilder**
If using doubles or floats ensure you add ‘d’ or ‘f’ to the end of the assignment
When declaring boolean it is good practice to call it like `isVariable = true`
Start with a private method unless you need to make it public
Constants use all caps with underscores to separate words. `CONSTANT_IS_HERE`

You should have as few exit points as possible in your code. (return statements)

With regards to this, it is good to initialise a variable at the top of the method and then change the variable value throughout the method. Then you can have one return (break point) at the bottom of the method.

