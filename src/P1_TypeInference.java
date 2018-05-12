/*
Diamond operator <> is used for type inference.
Prior to JAVA 7, the type inference was made available to methods only and not for constructors.
From Java 7, type inference is made available for constructors too.
*/

import java.util.*;

public class P1_TypeInference {
    public static void main(String args[])
    {
        //Prior to Java 7, Type had to be specified at both left and right hand sides of object creation expressions.
        Map<String, List<String>> employeeDetails_m = new HashMap<String, List<String>>();
        employeeDetails_m.put("S8165927C",Arrays.asList("Sandeep Bogaram","36"));
        System.out.println(employeeDetails_m.get("S8165927C"));

        //In Java 7, specifying type at left hand side alone is enough. Hence you have to type less in java 7 while working
        // with collections.
        Map<String, List<String>> employeeDetails_f = new HashMap<>();
        employeeDetails_f.put("S8582554B",Arrays.asList("Swathi Aspally","32"));
        System.out.println(employeeDetails_f.get("S8582554B"));
    }
}
