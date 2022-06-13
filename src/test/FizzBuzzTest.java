package test;

import data.FizzBuzz;

import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FizzBuzzTest {

    FizzBuzz fb = new FizzBuzz();
    List<String> myList, resultList;
    File myObj;
    Scanner myReader;
    final int LIST_SIZE = 100;

    @org.junit.jupiter.api.BeforeEach
    void setUp() throws FileNotFoundException {

        fb = new FizzBuzz();
        myList = new ArrayList<>();
        resultList = new ArrayList<>();
        myObj = new File("FBResults.txt");
        myReader = new Scanner(myObj);

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

        fb = null;
        myList = resultList = null;

    }

    @org.junit.jupiter.api.Test
    void displayFizz() {

        try {

            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                resultList.add(data);

            }

            assertEquals(LIST_SIZE, resultList.size());

            fb.displayFizz(myList);

            for(int index = 0; index < myList.size(); index++) {
                assertEquals(resultList.get(index), myList.get(index));
            }

        }

        catch(Exception e) {

            System.out.println("An error occurred.");
            e.printStackTrace();

        }

    }
}