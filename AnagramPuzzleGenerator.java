import java.util.*;
import java.io.*;


public class AnagramPuzzleGenerator{

 public static void main(String[] args) throws FileNotFoundException{

  Scanner scannerObj = new Scanner(new FileInputStream(args[0]));
    Random randObj = new Random();
    //Geneates randObj from Random class
    int sizeOfTextFile = scannerObj.nextInt();
    //Declare an int named randNumber and set sizeOfTextFile to first value of input file
    int randNumber = 1 + randObj.nextInt(sizeOfTextFile);
    //Random number from 0 to sizeOfTextFile
    String currentString = "";
    //Declare empty string variable named currentString

    int i = 0; //While loop prints out randNumber of items from input file
    while( i < randNumber ){

     currentString = scannerObj.next();
      //Sets currentString equal to current word of input file

     if( i == randNumber-1 ){ //Once the loop hits the last number:

      StringBuffer theStringBuffer = new StringBuffer(currentString);
      StringBuffer trackerStringBuffer = new StringBuffer(currentString);
      /*
      Create two string buffers:
      one for keeping track of chars used
      and the other for manipulating the currentString
      */

      char setterChar;
      //Initialize an empty char
      int tempRandNum;
      //Initialzie empty int
      int sizeOfString = theStringBuffer.length() - 1;
      //size of string is 1 - its length because computers count from 0

      for (int j = 0; j <= sizeOfString ; j++ ) { //This loops run for the length of the StringBuffer

        tempRandNum = randObj.nextInt(trackerStringBuffer.length());
        //Set random number from 0 to length of trackerStringBuffer

        setterChar = trackerStringBuffer.charAt(tempRandNum);
        //Set the setterChar to a char at index tempRandNum of the trackerStringBuffer


        theStringBuffer.setCharAt(j,setterChar);
        //Set char at index j to a random letter from the trackerStringBuffer

        trackerStringBuffer.deleteCharAt(tempRandNum);
        //Delete the char from the same tempRandIndex of trackerStringBuffer
      }

      System.out.println(theStringBuffer);
      //Once done print out the anagram

      System.out.println("Word that was scrambled: "+currentString);

     }
     i++; //Otherwise run the while loop until last item in list is reached
    }

   }
  }
