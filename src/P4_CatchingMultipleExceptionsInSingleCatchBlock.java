/*
In JDK 7, a single catch block can handle more than one exception types with exception types separated by '|'.

 */

import java.io.*;

public class P4_CatchingMultipleExceptionsInSingleCatchBlock {

 public static void main(String... args) {
     try (
             FileReader fr = new FileReader("info.xml");
             BufferedReader br = new BufferedReader(fr);
     ) {
         String line;
         while ((line = br.readLine()) != null) {
             System.out.println(line);
         }
         //Alternatives in a multi-catch statement cannot be related by sub classing(they should be disjoint). For example a multi-catch statement
         // like below will throw compile time error. This is because FileNotFoundException is a subclass of IOException.
         //Catch block which handles more than one exception type makes the catch parameter implicitly final. In the above example,
         // the catch parameter "ex" is final and therefore you cannot assign any value to it.
     } //catch (FileNotFoundException | IOException ex) { //throws compile time error
        // ex.printStackTrace();
     //}
     catch (Exception ex){
         //ex=null;  // This is allowed in a catch block where multiple exceptions are not handled.
         ex.printStackTrace();
     }
 }
}
