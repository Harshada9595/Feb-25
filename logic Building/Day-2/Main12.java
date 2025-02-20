//Snippet 13:
public class Main12 {
 public static void main(String[] args) {
 String str = null;
 System.out.println(str.length());
 }
}
/*
 What exception is thrown? Why does it occur?
it will throw a NullPointerException because you're trying to invoke the length() method on a null object.

str is assigned a value of null, meaning it does not point to any valid object in memory.
The method str.length() tries to access the length of a string, but since str is null, the JVM cannot call a method on a null reference, leading to a NullPointerException.
-----------------------------------------------------
public class Main12 {
    public static void main(String[] args) {
        String str = null;
        if (str != null) {
            System.out.println(str.length());
        } else {
            System.out.println("The string is null.");
        }
    }
}
*/