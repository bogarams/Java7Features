/*
In JDK 7, you can express literal values in binary with prefix '0b' (or '0B') for integral types (byte, short, int and long).
Before JDK 7, you can only use octal values (with prefix '0') or hexadecimal values (with prefix '0x' or '0X').
 */
public class P5_BinaryLiterals {
    public static void main(String... args){
        int eleven=0B1011;
        System.out.println(eleven);

        //Underscores are allowed in numeric literals for better readability from java 7.
        int three=0b0_11;
        System.out.println(three);

        //Negative binary literal
        int seven = -0B111;
        System.out.println(seven);
    }
}
