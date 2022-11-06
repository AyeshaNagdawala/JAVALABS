# JAVALABS

import java.util.*

import java.lang.* is for implements runnable or extends thread

import java.util.Scanner  is for scanner or input

 The static keyword in Java is used to share the same variable or method of a given class. The users can apply static keywords with variables, methods, blocks, and nested classes. The static keyword belongs to the class than an instance of the class. (used for overloading)
 
 a method is a function within a class
 method overloading is same as function overloading and no object needs to be created to call it
 
 for constructor overloading name of class is same as constructors(constructs are like methods but difference is they share name of the class they are in). object needs to be created for calling.
 
 for string
taking input:
String s = sc.next();
functons:
s.length()
s.charAt(4)
s.toUpperCase()

## List of Programs
- [x] Floyds, Armstrong And Pattern
- [x] Control structure (fibo, fact)
- [x] Method overloading amd constructor overloading
- [x] Arrays (matrix)
- [x] Vectors and strings
- [x] Inheritance
- [ ] Interfaces
- [ ] Packages
- [x] Exception handling (/0 and Index)
- [x] Multithreading
- [ ] I/O stream
- [ ] Calc using AWT
- [ ] Student form using swing
- [ ] GUI
- [ ] Login using JavaFX


## Things to Remember



#### Import Libraries

```java
import java.util.*;
// for input
import java.util.Scanner;
// for implements runnable or extends thread
import java.lang.*
```

#### Main Class Structure

```java
public class Main {
    public static void main(String args[]) {
       // code
    }
}
```

#### Scanner
```java
Scanner sc = new Scanner (System.in);
int n=sc.nextInt(); // store input to integer n
String s = sc.next(); //  store input to string s
sc.close(); // close to prevent memory leaking
```

#### Executing

```
javac Main.java
java Main
```

## Vectors

### Creating

```java
// Create Vector with Capacity 10
Vector name = new Vector();
// Create Vector with Capacity 15 and default steps
Vector name2 = new Vector(15);
// Create Vector with Capacity 20 and step size of 5
Vector name3 = new Vector(20,5);
```

### Add

```java
// add int
v_new.add(25);
// add string
v_new.add("Java");
// add using index
v_new.add(1, "Java");
```

### Remove

```java
// remove index
v_new.remove(0);
// remove element
v_new.remove("Java");
```

### Functions

```java
// prints the current 
v_new.size();
// prints the capacity
v_new.capacity();
// trim to size
v_new.trimToSize();
```

