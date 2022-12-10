- <b>Class</b> -> Template for an object<br>
<b>Object</b> -> an instance of a class<br>
A class creates a new data type that can be used to create objects<br>
Class is a logical construct. An object has physical reality.

- Objects are characterized by three essential properties: <b>state</b>, <b>identity</b>, and <b>behavior</b>.<br>
<b>State</b> -> value from its data type<br>
<b>identity</b> -> distinguishes one object from another, It is useful to think of an object’s identity as the place where its value is stored in memory.<br>
<b>behavior</b> -> the effect of data-type operations<br>

- Dot operator(.)</b> -> links the name of the object with the name of an instance variable

- <b>(new) keyword</b> -> dynamically allocates(allocates at run time)memory/address for an object & returns a reference to it. This reference is then stored in the variable.<br>
Note - In Java, all class objects must be dynamically allocated.

```
Car mycar; // declare reference to object
mycar = new Box(); // allocate a Car object
```
or
```
Car mycar = new Car(); // declair and allocate by using constructer
```
A constructor defines what occurs when an object of a class is created.

Java’s primitive types are not implemented as objects so that we do not use "new" keyword in 'chr' or 'int' etc
