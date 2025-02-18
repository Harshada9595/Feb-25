/*
Write a program that uses a nested switch statement to print out the day of the week based on an
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it
is a weekday or weekend. */

//---------------------------------------------------
public class Week{
public static void main(String[] args){
int s=1;
String e={"weekday=1, weekend=7"}
switch(s) {
switch(e){
case 1:

    System.out.println("monday");
    System.out.println("weekday");
break;
case 2:
    System.out.println("tuesday");
System.out.println("weekday");
break;
case 3:
    System.out.println("wednesday");
System.out.println("weekday");
break;
case 4:
    System.out.println("thursday");
System.out.println("weekday");
break;
case 5:
    System.out.println("friday");
System.out.println("weekday");
break;
case 6:
    System.out.println("saturday");
System.out.println("weekday");
break;
case 7:
    System.out.println("sunday");
System.out.println("weekend");
}
}
}
}