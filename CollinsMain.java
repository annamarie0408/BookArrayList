//Anna Collins
//8/22/19
//Java Advanced Assignment 1

//I have abide by GTCC Academic Integrity Policy and/or
//that the program is my original work

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;


public class CollinsMain {

    public static void main(String [] args) throws  FileNotFoundException {

    ArrayList<CollinsBook> arrBookList = new ArrayList<>(4);// the array is set to 4 because the text file
        //has f4 lines. This defines the ArrayList using the object CollinsBook

    try { //starting a try, this way the program still executes if the file is missing

        File fileinput = new File("src/CollinsBookData"); //defining the filepath

        Scanner sc = new Scanner(fileinput); //starting scanner


        while (sc.hasNextLine()) { //This will continue till there is no next line

            //defining variables/attributes and reading through the text file and assigning to the right thing
            //this is defined by the space between the items.
            String publisher = sc.next();
            String title = sc.next();
            String ISBN = sc.next();
            String imageName = sc.next();
            Double price = sc.nextDouble();

            //Instantiating the object
            CollinsBook test = new CollinsBook(publisher, title, ISBN, imageName, price);


            arrBookList.add(test); //assigning the newly created object to the ArrayList
        }

        //Reads through the Arraylist arrBookList and prints out each line
        //using the toString override method in the CollinsBook Class
        for (CollinsBook book : arrBookList) {
            System.out.println(book);

        }
    }
    catch (FileNotFoundException e){ //if the file is not found it will through this exception adn print it to the console
        System.out.println(e.toString());
    }
    }
}

