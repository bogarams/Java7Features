/*
Java 7 introduced automatic resource management with try-with-resource statement.

 */

import java.io.*;

public class P3_TryWithResources
{
    public static void main(String... args)
    {
    /*
Before JDK 7, we need to use a finally block, to ensure that a resource is closed regardless of whether the try statement completes normally or
abruptly, for example while reading files and streams, we need to close them into finally block, which result in lots of boiler plate and messy code.
*/
        FileInputStream fis = null;
        BufferedReader br = null;
        try
        {
            fis = new FileInputStream("info.xml");
            if(br.ready()){
                String line1=br.readLine();
                System.out.println(line1);
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("File info.xml is not found \n" + ex);
        } catch (IOException ex)
        {
            System.out.println("Error reading File info.xml \n" + ex);
        } finally
        {
            try
            {
                if(fis != null) fis.close();
            }
            catch (Exception ex)
            {
                   ex.printStackTrace();
            }
        }

/*
The try-with-resources statement is a try statement that declares one or more resources(objects).
The try-with-resources statement ensures that each resource is closed at the end of the statement execution.
You can pass any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable.Ex:e.g. Streams,
Files, Socket handles, database connections etc..
You can use catch and finally blocks with try-with-resources statement just like an ordinary try statement. But finally block will execute after the
resources are closed.
try-with-resources statement, which ensures that each of the resources in try(resources) is closed at the end of the statement by calling
close() method of AutoClosable.

In a try-with-resources statement, catch or finally block executes after closing of the declared resources.

*/
        try(
               FileInputStream fis1=new FileInputStream("info.xml");
               BufferedReader br1=new BufferedReader(new InputStreamReader(fis));
        ){
                if(br1.ready()){
                    System.out.println(br1.readLine());
                }

        }catch(FileNotFoundException ex){   //Called after resources are closed.
            ex.printStackTrace();
        }catch(IOException ex){         //Called after resources are closed.
            ex.printStackTrace();
        }finally{
            System.out.println("Catch and Finally are called after resources are closed.");
        }

    }

}