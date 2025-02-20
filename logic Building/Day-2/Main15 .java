//Snippet 16:
public class Main15 {
 public static void main(String[] args) {
 int num = 10;
 double result = num / 4;
 System.out.println(result);
 }
}
/*
 What is the result of this operation? Is the output what you expected?
-floating-point result, you need to ensure at least one operand is a double or float.
-since both operands (10 and 4) are integers, Java performs integer division, which discards the decimal part.
-----------------------------------------------------------public class Main {
    public static void main(String[] args) {
        int num = 10;
        double result = num / 4.0; 
        System.out.println(result);  
    }
}

*/