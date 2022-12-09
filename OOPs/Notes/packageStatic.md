- <b>PACKAGE</b> are containers for classes. <br>
The package is both a naming and a visibility control mechanism.

- How does the Java run-time system know where to look for packages that you create? The answer has three parts.
   1. First, by default, the Java run-time system uses the current working directory as its starting point.
Thus, if your package is in a subdirectory of the current directory, it will be found.
   2. Second, you can specify a directory path or paths by setting the CLASSPATH environmental variable.
   3. Third, you can use the -classpath option with java and javac to specify the path to your classes.


- When a member is declared <b>STATIC</b>, it can be accessed before any objects of its class are created,
and without reference to any object. <br>You can declare both methods and variables to be static.
The most common example of a static member is main( ).
It is declared as static because it must be called before any objects exist.<br>
Static method in Java is a method which belongs to the class and not to the object.
