package com.eniastoscode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithFiles {
    public static void main(String[] args) {
        // Creating a file
        String filename = "src/Data.csv";

        File file = new File(filename);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println(file.getName() + " created");
            } catch (IOException e) {
                System.out.println("Error creating file ");
                System.out.println(e);
            }

        }
// Writing to a file
               try {
                   FileWriter fileWriter =
                           new FileWriter(filename); // ,append true
                   PrintWriter printWriter = new PrintWriter(fileWriter);

                   printWriter.println("id, name, email");
                   printWriter.println("1, Jamila, Jamila@gmail.com");
                   printWriter.println("2, Alex, Alex@hotmail.com");
                   printWriter.println("3, Musa, Musa@hotmail.com");
                   printWriter.println("4, Ahmed, Ahmed@yahoo.com");


                   printWriter.close();
                   printWriter.flush();
                   System.out.println("Contents added to file");

               } catch(IOException e) {
                   System.out.println(e);
               }
// Reading a file

               try {
                   FileReader fileReader = new FileReader(file);
                   BufferedReader reader =
                           new BufferedReader(fileReader);
                   String line = "";
                   //To skip the first line as header.
                   System.out.println("Header = " + reader.readLine());
                   // Adding the objects to a list.
                   List<User> users = new ArrayList<>();
                   //Looping through the contents of the file.
                   while ((line = reader.readLine()) != null){
                      // System.out.println(contents);
                       //Splitting the contents by comma.
                       String[] split = line.split(",");
                       //new User(Integer.parseInt(split[0]), split[1], split[2]);
                       int id = Integer.parseInt(split[0]);
                       String name = split[1];
                       String email = split[2];
                       User user = new User(id, name, email);
                       //System.out.println(user);
                       users.add(user);
                   }
                   reader.close();
                   System.out.println("Looping through users list");
                   users.forEach(System.out::println);

               } catch (IOException e) {
                   System.out.println(e);
               }

    }
}


// How to create , read files and write to files.
// There are many ways.
// We have a bunch of methods to work with file.
// createNewFile() is an exception
// if(!file.exists()) >>> If file do not create and file and print.

// Question >>> Which exception are we catching here.?


// Using PrintWriter class to write to a file.
// This is one of the many ways to write to a file.
// You can append using FileWriter(filename, append true)

// using BufferedReader class to read from a file and FileReader to read the
// actual contents of the file.

//Parsing files
//-------------------
// Representing the contents of our csv file into list of objects that
// we can work with. For example modelling a user Class User.
// We can now work with the Objects from a csv file.



