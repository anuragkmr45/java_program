<h1>Keywords in java</h1>
<h3>this keyword</h3>
- Sometimes a method will need to refer to the object that invoked it. To allow this, Java defines the this keyword.<br>
- "this" can be used inside any method to refer to the current object i.e., this is always a reference to the object on
which the method was invoked.

<h3>final keyword</h3>
- A field keyword prevents its contents from being modified, making it a constant .This means that you must initialize a final field when it is declared. <br>
- final guarantees immutability only when instance variables are primitive types, not reference types <br>
- If an instance variable of a reference type has the final modifier, the value of that instance variable (the reference
to an object) will never change it will always refer to the same object but the value of the object itself can change.

<h3>finalize( ) Method</h3>
- By using finalization you can define specific actions that will occur when an object is just about to be reclaimed by the garbage collector.
- Java run time calls that method whenever it is about to recycle an object of that class
  
  ```
  protected void finalize( ) {
    // finalization code here
  }
  ```
  
<h3>new keyword</h3>
- Dynamically allocates(allocates at run time)memory/address for an object & returns a reference to it. This reference is then stored in the variable.<br>
Note - In Java, all class objects must be dynamically allocated.

```
Car mycar = new Car(); // declair and allocate by using constructer
```
- A constructor defines what occurs when an object of a class is created.
- Java’s primitive types are not implemented as objects so that we do not use "new" keyword in 'chr' or 'int' etc
