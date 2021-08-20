import java.io.IOException;
import java.nio.file.*;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Scanner;

public class Reader {

    public static void main(String[] args) {

    	for (String arg : args) {
    		System.out.println(arg); 
    	}
    	
    	Scanner scn = new Scanner(System.in); 
    	System.out.print("Enter the file name that you want to compress: " ); 
    	String filePath = scn.nextLine(); 
    	
    	System.out.println("Reading ... " + filePath); 
    	
        try {



            // file to bytes[]
            byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            
            for (int i=0; i<bytes.length;i++) {
            	char c = (char) bytes[i];
   
            	System.out.print("0" + Integer.toBinaryString(c) + " ");
            }
            
            // process arguments passed to you 
            // -- if first arg == compress
            // --- make sure that there are at least 2 arguments 
            // arg[0] = compress / decompress
            // arg[1] = which file to perform on 
            // arg[2] = which output file? 
            
            
            // if user chose compress, what to do? 
            // -- count freqs
            // -- start building tree 
            // -- start writing to the output file 
            
            // if user chose decompress, what to do ? 
            // -- read the prefix (this tells you how to decode the file)
            // -- reconstruct the tree
            // -- start outputing to the file      
            

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}