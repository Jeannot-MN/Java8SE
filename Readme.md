### Static Variables:
Static variable are variable that are bound to a class and not to objects,
they are created and initialized when the class is loaded into the JMn by the class loader.
They remain unchanged even when objects are garbage collected.

### Static Methods:
Literally same as static variables.
They provide functionality without the need for an object/instance.
**Static methods do not have access to instance members, they can only access static variables**

[No NPE is thrown when trying to access static members from a null object](https://stackoverflow.com/questions/24800309/can-we-call-a-static-method-with-a-null-object-in-java-if-so-how/24800356#24800356)

Instance variables and instance methods are class members that are bound to an object and not to the class,
and they are created and instantiated when the object is instantiated.

Every time you instantiate a new object from a class, you get a new copy of each of the class's instance variables.

### Static Initialization Block:
Similar to a regular  Static Initialization block, but the code in this block is executed only once when the class is loaded in the JVM,
while for regular  Static Initialization block, the code is executed whenever we instantiate a new object.

**In short STATIC just binds a variable/method/block to the class**

### Packages:
Just away to organize your code ,avoid naming conflicts, help control access to the code.
The package statement should always be listed at the top of the file.
it is not recommended that you add classes to the default package, due to namespace collisions.

In Java imports do not impact the size of your application but may impact compilation time.
import * does not include classes in sub-packages.

java.lang is imported by default

The classpath is a system variable that allows you to tell the compiler and the class loader where you store your files
(the bytecode and the other application files).

### Primitives:
In Java we have 8 primitives: **byte, short, int, long, float, double, boolean, char**

### Operators:
##### Binary operators:
Binary operators are <, >, <=, >=, !, !=, ==

y = y++ ; y will keep the old value;
y = ++y; y will be incremented;

### Yes we have labels in JAVA

### Enums
Did you know about ordinal on Enums??

### Strings
String immutable in Java, thus if your program does a lot of string manipulations, you might have a lot of unreferenced
object in memory thus impacting performance because the garbage collector will be running quite often.
To go around that developers are advised to use the **StringBuilder** and **StringBuffer** classes as they provide mutable
strings.

StringBuffer is thread-safe whereas StringBuilder is not.
StringBuffer is less efficient than StringBuilder.

### Passing by value/reference
In Java variables are passed by value.
In case of a primitive a copy of the primitive is made.
In case of an object a copy of a reference is made. 