/*
Before JDK 7, only integral types can be used as selector for switch-case statement.
In JDK 7, you can use a String object as the selector. When we use switch statements instead of nested if then else then java compiler
can generate more efficient code.equals() and hashcode() method from java.lang.String is used in comparison.

*/
public class P2_StringsInSwitch {

    public static void main(String... args){
        String orderState="";

        switch(orderState){
            case "NEW":System.out.println("Order is in new state");
                break;
            case "CANCELLED":System.out.println("Order is in CANCELLED state");
                break;
            case "REPLACED":System.out.println("Order is in REPLACED state");
                break;
            case "FULFILLED":System.out.println("Order is in FULFILLED state");
                break;
            default: System.out.println("Order is in invalid state");
        }

    }
}
