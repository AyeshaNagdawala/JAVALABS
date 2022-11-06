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


