import java.util.*;

public class FizzBuzz {

    public void displayFizz(List<String> myList) {

        for (int index = 1; index <= 100; index++) {

            if (index % 3 == 0 && index % 5 == 0)
                myList.add("fizzbuzz");
            else if (index % 5 == 0)
                myList.add("buzz");
            else if (index % 3 == 0)
                myList.add("fizz");
            else
                myList.add(Integer.toString(index));

        }

    }

}
