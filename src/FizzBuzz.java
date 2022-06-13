public class FizzBuzz {

    for(int index = 1; index <= 100; index++) {

        if(index % 3 == 0 && index % 5 == 0)
            System.out.println("fizzbuzz");
        else if(index % 5 == 0)
            System.out.println("buzz");
        else if(index % 3 == 0)
            System.out.println("fizz");
        else
            System.out.println(index);

    }

}
