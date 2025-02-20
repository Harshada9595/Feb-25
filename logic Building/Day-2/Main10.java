//Snippet 11:
public class Main 10{
 public static void main(String[] args) {
 int[] arr = {1, 2, 3};
 System.out.println(arr[5]);
 }
}
/*
 What runtime exception do you encounter? Why does it occur?
-out of bound exception
-array has only 3 numbers  then it is out of range
-----------------------------------
public class Main 10{
 public static void main(String[] args) {
 int[] arr = {1, 2, 3};
 System.out.println(arr[1]);
 }
}
*/