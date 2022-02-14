#### Static Variables:
Static variable are variable that are bound to a class and not to objects,
they are created and initialized when the class is loaded into the JMn by the class loader.
They remain unchanged even when objects are garbage collected.

#### Static Methods:
Literally same as static variables.
They provide functionality without the need for an object/instance.
**Static methods do not have access to instance members, they can only access static variables**

[No NPE is thrown when trying to access static members from a null object](https://stackoverflow.com/questions/24800309/can-we-call-a-static-method-with-a-null-object-in-java-if-so-how/24800356#24800356)

Instance variables and instance methods are class members that are bound to an object and not to the class,
and they are created and instantiated when the object is instantiated.

Every time you instantiate a new object from a class, you get a new copy of each of the class's instance variables.