package Step4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     * 
     */
        public static void main(String[] args) throws FileNotFoundException {
            // Print out a running total of all the
            // values in the input file.
            try{
                int sum = 0;
                Scanner fileIn = new Scanner(new File("/Users/dan/Dev/Zipcode/Week 2/FileIOJava/Step4/input.txt"));
                while(fileIn.hasNextInt()){
                    sum += fileIn.nextInt();
                    System.out.println(sum);
                }

            }
            catch (IOException e){
                System.out.println("File wasn't found");
            }

        }
}