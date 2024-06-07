package Main;
import CA_Basics.*;
import CA_Basics.Polymorphism.*;
import CA_Basics.Polymorphism2.Parent;
import CA_Basics.Polymorphism2.Student;
import CA_Basics.Polymorphism2.Teacher;


import java.lang.*;
import java.util.*;


public class HelloWorld {
    public static void main(String[] args) {

        //Print:
        System.out.println("Hello World");
    /*
    (Long notes)
     */


        //Variables:
        int num = 2;

        double numDec = 0.33;

        char letters = 'a';

        String name = "Seby";

        boolean quest = true;

        /*
        // Getting User Input

        You first define the name of your 'new' scanner, and find where you want to obtain it from.
        For just basic practical terms, we'll just tell the scanner we'll be getting the input just from our terminal.

        What other places can i get inputs? As you will further progress in this dreaded java course, you'll eventually
        understand that the UI (User interface) is composed by several buttons and things for the user to do. There
        might be several boxes where the user inputs text, or simply fills out a scale.

        From this input, we then define a scanner to grab the users response and send a 'reply', meaning, if you do
        THIS, THAT happens. This is coding 101 in a nutshell.


         */

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Give me text to print out btch");
        String yourDumbstring = myScanner.nextLine();
        System.out.println( "Here is what you typed you dumb fc: "+ yourDumbstring );


//----------------------------------------------------------------------------------------------------------------------

        //Object-Oriented Programming (OOP) Declaration:

        /*
        All programs require one or more classes that act as a model for the world.
        Classes are a blueprint for objects.
        For example, a program to track student test scores might have Student,
        Course, and Grade classes. Our real-world concerns, students and their grades,
        are inside the program as classes.

        The fundamental concept of object-oriented programming is the class.
        A class is the set of instructions that describe how an instance can behave and what information it contains.

        Java has pre-defined classes such as System (ex: System.out.println --> class = System, .out.println = actions)
       , which we’ve used in logging text to our screen, but we also need to write our own classes for the
       custom needs of a program.

       Definitions:
       - Public = access level modifier that allows other classes to interact with the class
       - Private = access level modifier, opposite to Public, where it restricts other classes to interact with the
       class

       Classes can also have multiple different constructors to prevent constructor-overloading, called a Signature.
       A signature is useful to differentiate different methods, which based on the arguments the user inputs, it
       uses the constructor that matches to the same data type sequence, for ex:

       public MyCar(String carColor, int year){
       }

       public MyCar(boolean electricCar, int year){
       }

       Note: It CANNOT have the same data type in the same order for each new constructor, or else the program won't be
       able to differentiate which one to respectfully choose.

       To call for the argument of your new object, simply do: ObjectName.ConstructorFieldName


         */

        //Jeep is an instance
        MyCar Jeep = new MyCar();
        //vW is an instance
        MyCar vW = new MyCar();

        System.out.println("My jeep is from " + Jeep.year);
        System.out.println("You can see here that I didn't add any brand name, using a default constructor, " +
                "where the default value of the brand is = " + vW.brand);

        /*
        To allow users to input information about their object, we need to create our own
        constructor to assign the attributes (fields) that we made about our object
         */

        MyBrand Wahoo = new MyBrand("Wahoo", "Los Cabos", 2023, 300000);
        MyBrand Rabbix = new MyBrand("Rabbix.com", "South Korea", 2021, 2000000);
        System.out.println(Wahoo.yearR);
        System.out.println(Rabbix.cityName);


//----------------------------------------------------------------------------------------------------------------------

        //Methods:

        /*
        In the last lesson, we learned that objects have state and behavior. We have seen how to give objects
        state through instance fields. Now, we’re going to learn how to create object behavior using methods.

        Methods are also reusable. Imagine we wrote a sandwich-making program that used 20 lines of code to
        make a single sandwich. Our program would become very long, very quickly, if we were making multiple
        sandwiches. By creating a makeSandwich() method, we can make a sandwich anytime simply by calling it.

        If we were to share this sandwich-making program with another person, they wouldn’t have to understand
        how makeSandwich() worked. If we wrote our program well, all they would need to know is that if they
        called makeSandwich(), they would receive a sandwich. This concept is known as procedural abstraction:
        knowing what a method does, but not how it accomplishes it.

        Concepts:
        - Void = there is no specific output from the method

        Everything that goes inside a method from the curly braces "{}" is called a scope.
        Any variable created inside the scope only exists inside the scope, it can't be called in the main() or
        used by other methods. To use a variable for multiple methods inside a class, it needs to be called
        in the instance fields.

        --> Parameters: Similar to how we added parameters to constructors, we can customize all other methods
        to accept parameters.

        Through method overloading, our Java programs can contain multiple methods with the same name as
        long as each method’s parameter list is unique, or its own "signature".



         */
        MyStore lemonadeStand = new MyStore("Lemonade", 3.75);
        double lemonadePrice = lemonadeStand.getPriceWithTax();
        //instead of calling a long-butt name to call for the function, we can just simplify it by calling it with a
        //variable
        //Basically we just save the process of a function without having to call it every time to remember what it did
        //THis can be useful whenever we have to use that variable within other functions
        //If we use the directory of that value it will get quite messy, still possible, just messy
        System.out.println(lemonadePrice);

        //Printing out our object directly:
        System.out.println(lemonadeStand);

        /*
        As you move through more Java material, it will be helpful to frame the tasks you create in terms of methods.
        This will help you think about what inputs you might need and what output you expect.

        Like in the following example for MySavings class:
         */

        MySavings savings = new MySavings(2000);

        // --> Without methods:

        //Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);

        //Withdrawing:
        int afterWithdraw = savings.balance - 300;
        savings.balance = afterWithdraw;
        System.out.println("You just withdrew " + 300);

        //Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);

        //Deposit:
        int afterDeposit = savings.balance + 600;
        savings.balance = afterDeposit;
        System.out.println("You just deposited " + 600);

        //Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);


        // --> With Methods:

        //Check balance:
        savings.checkBalance();

        //Withdrawing:
        savings.withdraw(300);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(600);

        //Check balance:
        savings.checkBalance();

//----------------------------------------------------------------------------------------------------------------------

        // Conditionals and Flow control:


        int x = 0;
        int y = 1;
        int z = 2;
        boolean a = true;
        boolean b = false;

        //By default, the if() statement holds a value and executes it if True

        /*
        Tips to consider:

        a = a + 1;      ==      a++;
        a = a - 1;      ==      a--;
        a = a + b;      ==      a += b;
        a = a - b;      ==      a -= b;


         */

         /*
        NOTE: The conditional statement with multiple conditions  are evaluated from the top down, meaning,
        only one of the code blocks will run
         */

        if (a) {
            System.out.println("He tells the TRUTH");
        }
        if (x > y) {
            System.out.println("x is higher");
        } else if (x < y) {
            System.out.println("y is higher");
        } else {
            System.out.println("same");
        }

        /*
        Example in using methods with conditionals:

        (We have a method to see how much it will affect the price for shipping)
        public double calculateShipping() {
            if(shipping == "Regular"){
              return 0;
            } else if(shipping == "Express"){
              return 1.75;
            } else {
              return 0.50;
            }
            }

            Other method:

            public double calculateShipping() {
            if(shipping.equals("Regular")){
              return 0;
            } else if(shipping.equals("Express")){
              return 1.75;
            } else {
              return 0.50;
            }
            }

         */

        //We can create more complex conditionals by having Nested statements
        //Basically and if within an if

        boolean rain = true;
        boolean umbrella = false;

        if (rain) {
            if (umbrella) {
                System.out.println("Get ur dam umbrella");

            }
        } else {
            System.out.println("Get ur dam sun screen");

        }

        /*
        An alternative to chaining if-then-else conditions together is to
        use the switch statement. This conditional will check a given value
        against any number of conditions and run the code block where there is a match
         */

        char testGrade = 'F';

        switch(testGrade){
            case 'A', 'B':
                System.out.println("U survive, not dizapointed");
                break;

            case 'C':
                System.out.println("You clean dogshit, then cook him");
                break;

            default:
                System.out.println("Yu FAILURE, FAILURE !!!!! HAIAAAAA");

        }

        /*
        The "break" method depends on the scenario of your code. If you want your switch
        to keep looking for other matches, you don't need the break method. However, if your Switch
        only needs to find one value of your code, it can 'exit' the search or 'break' the search for
        other variables.
         */


        //Conditional Operators:
        /*
        AND: &&
        (If the values on both sides are true, then the resulting value is true, otherwise the resulting value is
        false.)

        OR: ||
        (If either of the two values is true, then the resulting value is true, otherwise the resulting value is false.)

        NOT: !
        (variable_1 =! variable_2) "If var1 doesn't equal to var2
        !(variable) --> When variable is false



         */


        //We can run the following code without error despite dividing a number by 0 in the second operand because the
        // first operand had a true value:

        if (1 > 0 || 2 / 0 == 7) {
            System.out.println("No errors here!");
        }

        int restaurantCapacity = 9;
        int guestCount = 8;
        boolean isRestaurantOpen = true;

        if(restaurantCapacity >= guestCount && isRestaurantOpen == true) {
            System.out.println("Reservation confirmed");
        }


        boolean isConfirmed = false;

        if (!isConfirmed){
            System.out.println("Unable to confirm reservation, please contact restaurant.");
        } else {
            System.out.println("Please enjoy your meal!");

        }

        //Here you can play around instances and see how conditionals work
        MyReservation BBQ = new MyReservation(2, 9, true);
        MyReservation Sushi = new MyReservation(8, 9, true);
        MyReservation Mex = new MyReservation(3, 9, false);
        MyReservation Opent = new MyReservation(12, 9, false);

        Sushi.confirmReservation();
        Sushi.informUser();

//----------------------------------------------------------------------------------------------------------------------

        //While-Loops, For-Loops and For-each-loop:

        /*
        A loop is a programming tool that allows developers to repeat the same block of code until some condition is
        met.

        Reasons to use it:
        - Writing the same code over and over is time-consuming.
        - Having less code means having less to debug.


         */

        //While Loop

        /*
        Within the while loop, it will keep repeating the code when true, until the program says the contrary

        In the loop, you can increment a value by 'x++' or reduce it by 'x--'


         */
        int cupsOfCofee = 2;

        while(cupsOfCofee <= 25){

            System.out.println("I had " + cupsOfCofee + " cups of coffee today");
            cupsOfCofee++;

        }

        int pushUps = 10;

        while(pushUps  >= 10){
            System.out.println("I have " + pushUps + " to go");
            pushUps--;
        }

        // For Loop

        /*
        It is basically iteration, where we just repeat the same block of code
        It consists of the following:
            1. The initialization of the loop control variable.
            2. A boolean expression.
            3. An increment or decrement statement.

        Normally, the for-Loop is structured like this:

         */

        for(int i = 0; i < 10; i++){
            System.out.println("This is the printout number " + i);
        }

        //However, it is exactly the same as the following:

        int xyz = 0;

        while(xyz < 10){
            System.out.println("This is the printout number " + xyz);
            xyz++;
        }

        /*
        Note, that i only expressed the variable 'i' outside, and added down in the loop to be 'i++'.
        However, the integer that i created cannot be repeated, when in for-loops it can. Its a variable only a
        ccessible within the loop.
        This way we can't run out of variables

        Even though we can write while loops that accomplish the same task, for loops are useful because they help us
        remember to increment our counter — something that is easy to forget when we increment with a while loop.
         */


        //For-each-loop
        /*

        For-each loops, which are also referred to as enhanced loops, allow us to directly loop through each item in a
         list of items (like an array or ArrayList) and perform some action with each item.

        Its two characteristics:
        - It can iterate the index of an array or list
        - The loop control variable's parameter type is dependent on the array or list

        --> How to call it:
        for(Variable_type loop_control_name : (ARRAY_Name/LIST_Name){

        (parameters to iterate in every index)

        }

        Note: We can use ':' as saying "in", like this: "For each variable (i)  IN this array, do this"

        ***
        PRECAUTION !!! DO NOOOOOOOTTTT USE THIS TO DELETE INDEXES FROM LISTS. I did not hit her. Its not true, its
        bullshit! I did not hit her. I did NOOOOOT... oh hi Mark :D
        ***

        Removing elements during a for loop method for a LIST, we can easily run into an error if we aren’t careful.
        When an element is removed from an ArrayList, all the items that appear after the removed element will have
        their index value shift by negative one — it’s like all elements shifted to the left! We’ll have to be very
        careful with how we use our counter variable to avoid skipping elements.

        Basically to avoid this, we need to stay in the same index position in order to delete all indexes (or any
        specific ones), knowing that everything else will shift to the left, other values will still be left forgotten.
        Another method is going in the last index and going backwards.
        This ensures that nothing is skipped. However, all of this prohibits us from using the 'For-each-loop'
        because forcefully it increments the index.


        Using for-each-loop example:

         */

        List<Double> myPrices = new LinkedList<>();

        myPrices.add(122.5);
        myPrices.add(123.0);
        myPrices.add(100.1);
        myPrices.add(98.0);

        double mostExp = 0;

        for(double i : myPrices){
            if(i > mostExp){
                mostExp = i;
            }
        }

        System.out.println(mostExp);




        // 'Break' & 'Continue'
        // --> Break = The break keyword is used to exit, or break, a loop. Once break is executed, the loop will stop
        // iterating. For example:


        for (int i = 0; i < 10; i++) {
          System.out.println(i);
          if (i == 4) {
            break;
             }
        }

        // Note: it will only print till 4

        // --> Continue = The continue keyword can be placed inside of a loop if we want to skip an iteration.
        // For example:

        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                continue;
            }
            System.out.println(numbers[i]);
        }

        //return

        /*
        If the return keyword was executed inside a loop contained in a method, then the loop iteration would be
        stopped and the method/constructor would be exited.

        Whenever we make a return statement that can have certain conditionals,
        even if the loop is still viable to repeat itself, it will exit from the return statement.

        In other words, a return has like its own 'default' method

        For example:

        for (int i = 0; i < lst.length; i++) {
            System.out.println(lst[i]);
            if (lst[i] == "jacket") {
              return true;
                }
              }
              return false;

       In this loop, suppose that it is within a boolean method, it will take the return statement immediately when
       one of them comes out, regardless if inside or outside a loop


         */



//----------------------------------------------------------------------------------------------------------------------

        //Arrays

        /*
        We have seen how to store single pieces of data in variables. What happens when we need to store a group of
        data?
        What if we have a list of students in a classroom? Or a ranking of the top 10 horses finishing a horse race?

        --> Arrays: An array holds a fixed number of values of one type. Arrays hold doubles, ints,
        booleans, or any other primitives. Arrays can also contain Strings as well as object references!

        *Note = Arrays have the same behaviour as variables

        --> Method to printing a variable of the Array:
        Within the square braces [], we define the location

        *Note = The index value starts with "0", as in [0]. To store 5 variables, the highest index of the array is 4,
        counting as [0], [1], [2], [3], [4]

         */

        String[] menu = {"Pizza", "Hot-Dog", "Soda"};

         /*
        --> Getting an element by Index:
        (Remember, the index of an array starts at 0 and ends at an index of one less than the number of elements in
        the array.)
         */

        System.out.println("I will have item two please, being a " + menu[0]); // Its going to select Pizza

        /*

       --> Method to printing an Array:
        Fortunately, within Java's library, it already has a class and a method built purposely to print an array,
        instead of giving us the task to create a new class and waste a lot of time

        String printRight = Arrays.toString(object);

        System.out.println(printRight);

       Where:
        Arrays --> Class
        toString() --> Method

        */

        String menuDisplay = Arrays.toString(menu);

        System.out.println("The menu is " + menuDisplay);


        /*

        --> Creating an Empty Array:
        Empty arrays have to be initialized with a fixed size. Once you declare this size, it cannot be changed!

        Normally when you declare an array, you define its memory by how many variables you add in. However, to create
        an empty array, we have to predefine the memory storage it's going to take

        How to declare one:
        String myList[] = new String[n]

        Where "n" is the size of the array. DONT CONFUSE THIS WITH THE ARRAY'S INDEX ! This is only to determine its
        size. which will have n variables


        When we use new to create an empty array, each element of the array is initialized with a specific value
        depending on what type the element is: (Or better said, its default values when it's not assigned)
        int --> 0
        double --> 0.0
        boolean --> false
        String --> null;

        */

        double[] grades = new double[3];

        grades[0] = 9.8;
        grades[1] = 7.5;
        grades[2] = 6.0;

        System.out.println("The number of grades is " + grades.length);


        /*
        *Note:
        Square brackets [] are used only when your creating a new array, or referencing specifically within the index
        (Ex= menu[5])
        HOWEVER, whenever you play with the array, don't make the mistake of referencing its index, or an empty index
        without a purpose

        For example:

        - Wrong way:
            int a = myList[] + 3;

            Or:

            System.out.println(myList[].length);

        - Right way:
            int a = myList[2] + 3;

            Or:

            System.out.println(myList.length);

         */

        //Here you can play with Arrays by using instances of a class



        myNewsfeed sampleFeed = new myNewsfeed();

        System.out.println("The top topic is "+ sampleFeed.getTopTopic());

        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(3);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(1);

        System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");

//----------------------------------------------------------------------------------------------------------------------
        //2D Arrays

        /*
        In Java, arrays are considered Objects; therefore, we can also have an array of arrays.


        To declare it, we have two brackets: '[][]'
            This is called 'an array of arrays'

            Remember, because an array is an object, we are actually calling an object in another sense, like so:
            'VARIABLE_TYPE'[][]
            THIS is a type object.

         */

        char[][] list1 = {{'a', 'b'}, {'c', 'd'}, {'e', 'f'}};

        //(Basically this is an array of char[] arrays)


        // * Initializing an empty 2D arrays:
        /*

        int[][] List = new int[row][column];

        Remember:

        Rows are lines, or filas (horizontal)
        Columns are like vertical columns, or pillars like the 5 pilars of Islam (vertical)

         */

        int[][] list_a = new int[3][5];

        //Why are we asking for a 'new int' like an object ? Oh sorry, you forgot ... ITS A GOD DAM OBJECT !


        /*Additionally, we can have 2D arrays which are not rectangular in shape.
        These are called 'jagged' arrays:

        {1, 2}
        {4, 5, 6}
        {7, 8, 9, 10}

         */
        int[][] list2 = {{1, 2}, {4, 5, 6}, {7, 8, 9, 10}};

        //Note: Arrays don't have to perfectly have the same size, because remember, ... arrays are also OBJECTS !!!

        //How to assign a new value, also known as 'Initializer list values'?

      String[][] mygrades;
      mygrades = new String[][]{{"Math", "A+"}, {"Dinamics", "A-"}};

      /* It's a mistake if we do String[2][2], because the size is already created by adding in the variables

      However, you CANT first initialize it with a fixed size, like:
       char[][] alp = new char[2][2];
       alp = {{'a', 'c'},{'d', 'e'}};

       You initialize it with a fixed size when you want to start out an empty 2D list
       Adding more to the note, to add values we simply doing it by calling its coordinate, like how we did it before.
       This brings us to the next topic...

       Locating the coordinates:
       The first way of thinking is that the first value represents a row and the second value represents a
       column in the matrix
       The second way of thinking is that the first value represents which subarray to access from the main array
       and the second value represents which element of the subarray is accessed

       * Size of an array:

       Note: It doesn't automatically gives us the total number, we need to calculate it by the number of arrays inside
       the list and the size of every array.

       For rows:
       int rowSize = list.length;

       For columns:
       int columnSize = list[index_of_array_you_want_to_calculate].length;

       */

        //For-Loops:

        /*

        We can organize ourselves by simply defining the "outer" and "inner" loop

            - Outer = Segment outside (how many times it is divided)
            - Inner = Segnemnt inside (how many variables inside each division)

        From these key points, we can determine how the sequence can iterate through our
        2D arrat for any case scenario.

        Lets see how this works:

         */

        // 1. Finding the sum of net profit for each list, being its own row
        int[][] net_profit = {
                //First Month:
                 {25563, 24839, -94833, 24990, -1000},
                //Second Month:
                 {24000, -9800,   200,  15000, -12000}};

        int sum1 = 0;

        for(int outer = 0; outer < net_profit.length; outer++){
            sum1 = 0;
            for(int inner = 0; inner < net_profit[0].length; inner++){

                sum1 +=  net_profit[outer][inner];

            }
            System.out.println("The profit that we made for month " + (outer + 1) + " is " + sum1 + " roopies");


        }

        // 2. Summing the average temperature of the day, each day being its own column

        double[][] weather_Forecast = {
              //Day_1 Day_2  Day_3 Day_4  Day_5
                {31.2, 29.9, 24.2, 21.2, 18.5},
                {33.3, 28.2, 23.0, 20.0, 19.9},
                {32.5, 27.1, 21.9, 19.8, 20.0}};

        double average_temp = 0;
        double sum2 = 0;

        for(int outer = 0; outer < weather_Forecast[0].length; outer++){
            average_temp = 0;
            sum2 = 0;

            for(int inner = 0; inner < weather_Forecast.length; inner++){
                sum2 += weather_Forecast[inner][outer];

            }
            average_temp = sum2 / weather_Forecast.length;

            System.out.println("Today in day " + (outer + 1) + ", its average is about "+ average_temp+" degrees " +
                    "celcius");
        }



        //The following is a great activity from code academy:

        //First, declare and initialize a 4x3 2D array of doubles called `scores` which will contain the exam data for
        // four students. The rows will represent the student and the columns will represent the exam number.
        // You already know the first exam scores (80.4, 96.2, 100.0, 78.9). Use initializer lists to store the first
        // exam scores in the first column and -1 for the remaining exams. Use the provided print statement to print
        // the result in the console.
        double[][] scores = {
                {80.4, -1, -1},
                {96.2, -1, -1},
                {100.0, -1, -1},
                {78.9, -1, -1}} ;



        System.out.println(Arrays.deepToString(scores));

        //The next set of exams have occurred. Using 4 lines of code, manually enter the scores (89.7, 90.5, 93.6, 88.1)
        // for the second exam (column 1). Use the provided print statement to print the updated 2D array as well.
        scores[0][1] = 89.7;
        scores[1][1] = 90.5;
        scores[2][1] = 93.6;
        scores[3][1] = 88.1;

        System.out.println(Arrays.deepToString(scores));

        //You have realized that you will only be keeping track of 2 exam grades instead of 3. Declare and initialize
        // an empty 4x2 2D array of double values  called newScores

        double[][] newScores = new double[4][2];

        for(int outer = 0; outer < newScores.length; outer++){
            for(int inner = 0; inner < newScores[0].length; inner++){
                newScores[outer][inner] = scores[outer][inner];


            }
        }


        //Using loops, copy all of the scores for exam 1 and 2 into the new 2D array. (do not include the -1 values)


        System.out.println(Arrays.deepToString(newScores));

        //You have allowed the students to complete an extra credit activity to contribute towards their scores.
        // For all exam grades less than 90, add 2 additional points to the grade in `newScores`

        for(int outer = 0; outer < newScores.length; outer++){
            for(int inner = 0; inner < newScores[0].length; inner++){
                if(newScores[outer][inner] < 90){
                    newScores[outer][inner] += 2;
                }


            }
        }


        System.out.println(Arrays.deepToString(newScores));

//----------------------------------------------------------------------------------------------------------------------
        // --> String Methods


        /*

        length() = finds the total length of a string - and yes, this also accounts for the spaces.
        Every part of a string is a memory space, its counts that memory space.


        concat() = "Link together in a chain or series". It links two strings together.

        substring() = it extracts a substring from a string by its index. It is made up like this: substring(Initial
        index, final index)
        When substring() is called with two arguments, the first argument is inclusive and the second is exclusive.

        equals() = Because we can't check equality between two strings like "==", we use this method. It returns a
        boolean type.
        equalsIgnoreCase() = same of the last method but ignores the upper/lower cases

        indexOf() = Its to find the index of the first occurence of a character in a string.
        If you want to find the occurance of a whole substring, it will find the first index of that substring.
        However, if it doesn't find anything, it will print out "-1"

        charAt() = method returns the character located at a String‘s specified index.

        toUpperCase() / toLowerCase()

         */

        String text1 = "Toda una Vida";
        String text2 = ", Me gustaria estar contigo";

        System.out.println(text1.length()); //13

        System.out.println(text1.concat(text2)); // Toda una Vida, Me gustaria estar contigo

        System.out.println(text1.equals(text2)); //false

        System.out.println(text2.indexOf("e")); //It gets the index of the first "e"

        System.out.println(text2.charAt(3)); //e

        System.out.println(text2.toUpperCase()); // , ME GUSTARIA ESTAR CONTIGO

//----------------------------------------------------------------------------------------------------------------------

        //Access and Scope

        /*
       --> Access Modifiers:

        The public and private keywords and how they relate to Classes, variables, constructors, and methods

        * Void = has no return type

        * Static = a value or method that must be the same or be shared amongst your class. It is created so that no
            matter what object instance you create, it will share the same value. If you try to change that value from
            one object instance, it will change the same value for all other object instances.
            For example: All cats "meow". If we want to call for any Cat object of a method, they will all do the same
            thing. So we can leave it as static, because it will never change, independantly of how different every cat
            is like.

            BASICALLY: Static methods are methods that belong to an entire class, not a specific object of the class.
            Static methods are called using the class name and the "." operator.

             PURPOSE = is to have a function without having the need of creating a new class object

            or example: random() is a static method that belongs to the Math class. We didn’t need to create a Math
            object (like Math myMathObject = new Math()) in order to use that method. We could just call it using the
            class name. There is no need to create an object because they'll all be the same within the method.
            So instead, we just refer to it in its blueprint (meaning the class)

            One important rule to note is that static methods can’t interact with non-static instance variables.

        * Public = any class has access

        * Private = When a Class’ instance variable or method is marked as private, that means that you can only
            access those structures from elsewhere inside that same class
            Concept: By limiting access by using the private keyword, we are able to segment, or encapsulate, our code
            into individual units.
            - What's the point?: It enables us to segment and organize our code, where we dont want classes to affect
              other classes. In other words, not let the access of one class change anything by accident from another.
              It prevents having access to unecessary variables,that at the same time, could be at risk of being
              changed without prior acknowledgement

              Note: "private" variables can be used within the same class if its called within the class.
              Same goes for methods if its called INSIDE the method.
              HOWEVER, it cannot be USED OUTSIDE THE AREA SPACE where it was claimed.

        * Final = means that you can’t change the variable’s value after creating it. Any class cannot be extended or
        overrided if used Final

        * Protected = it gives access to all the classes that it is contained within a package



        --> The concept of encapsulation:

            Encapsulation is a technique used to keep implementation details hidden from other classes.
            Its aim is to create small bundles of logic.

            Think of it as a house and a key.

            If you have different locks inside the  house, you can only unlock them being in the house.
            In other words, having a class with private variables can only be accessed by the class, or so called,
            its capsule.

            Another way of understanding it is a hierarchy, like so (in terms of being 'inside of'):

                * Packages <HAS ACCESS TO> == (Private Classes) (Public Classes)
                --> Classes have access to others by being in the SAME package

                * Classes   <HAS ACCESS TO> == (Private Methods & Variables) (Public Methods & Variables)
                --> Methods and variables can use other methods and variables of the SAME class

                * Methods  <HAS ACCESS TO> == (Other Private Methods & Variables) (Other Public Methods & Variables)


            HOWEVER: We can't have access two paths down the line. Meaning that i cant have direct access to a
            private variable of a class. But there is a way ...


            * Accessor methods, sometimes known as “getters”:

            You make a variable that is private, and for other classes to have access to it, you create a method
            instead of accidentally calling them, which is prevented from being private, we can call them from methods.
            Just like the java library !!!


            * Mutator methods, sometimes known as “setters”:
            You make a variable that is private, and for other classes to CHANGE IT, you create a method to have access
            to it

        --> Scope:
            Local variables vs. instance variables

            * Local variables = variables that are defined within a parameter cannot be called outside of it, in onther
            words, outside its 'scope'. Such as a method, local variables inside of it cannot be called out.

           Note: Can I call a local variable public and then use it ? What if i call it private ?

            If you try to declare a local variable with an access modifier like public or private
            within a method in Java, you'll get a compilation error. Local variables cannot have access modifiers in
            Java. They are inherently limited to the scope in which they are declared.

        Is it possible to have methods inside other methods?
        No, in most programming languages, including Java, you cannot directly nest methods within other methods.
        Methods are typically declared at the class level, not within the scope of another method.
        However, you can call one method from another method, creating a form of method hierarchy or composition.

            */

        MyRemoteTV Roku = new MyRemoteTV("Roku",20, 50);

        MyRemoteTV Chromecast = new MyRemoteTV();

        System.out.println("My "+Roku.getName()+" control has a volume of "+Roku.getVolume());

        //Setting the volume up
        Roku.setVolume(80);

        System.out.println("Is my tv on? ");

        if(MyRemoteTV.isIsOn() == false){
            MyRemoteTV.setIsOn(true);
            /*Note: We shouldnt use the name of the object, but the blueprint class, because setting the TV on or off
            affects ALL of the classes, not just that object (it is static). We need to avoid any confusion to think
            that we are setting up just one of the objects when we change a static variable,
            because that isn't the true true.
            */
        } else {
            System.out.println("Ja, it was already on... im fcn lonely *cries eyes out* ");
        }

        MyRemoteTV.giveDefaultInstructions();

        MyRemoteTV.islimitOfChannels(99);
        MyRemoteTV.islimitOfChannels(200);
        MyRemoteTV.islimitOfChannels(-45);



        /*
        --> The 'this' keyword
            The 'this' keyword calls the instance of the object

            - For variables:
            Because there will be many cases that we'll be using the same name for both instance and local variables,
            our program can accidentally print out the unintended variable because by default it has preference to its
            local variable.
            If you want to refer to the instance variable, you do:

            this.VAR_NAME //Instance name

            VAR_NAME //Local name

            - For methods:
            We can  call for different methods inside a method by using 'this'. Instead of having to create a new
            method with the same functionality as others, we can just call existing methods of the objects instance.

            Ex:

            public void setBrightness(int inputBrightness){
                this.brightness = inputBrightness;
            }

            public void setVolume(int inputVolume){
                this.volume = inputVolume;
            }

            public void resetSettings(){
                this.setBrightness(0);
                this.setVolume(0);
          }


            - For objects:
            The "this" keyword is literally referencing the instance object, so for any method that has an input for an
            object, we can use the "this" keyword


         */

//----------------------------------------------------------------------------------------------------------------------
        //Objects inside Methods (Passing Objects as arguments within methods):

        /*
        As we recall before, objects can behave the same way as variables... it's no different.
        Technically speaking, a String is actually an object, so unconsciously you've already done this before

        For an example, we'll create a School and a Student class:

         */

        MySchool Delmar = new MySchool("Delmar");

        MySchoolgirl Tatiana = new MySchoolgirl("Tati", 15, 8);

        MySchoolgirl Isabella = new MySchoolgirl("Isa", 17, 11);

        MySchoolgirl Regina = new MySchoolgirl("Regi", 19, 12);

        Delmar.isRegistered(Tatiana);
        Delmar.isRegistered(Isabella);
        Delmar.isRegistered(Regina);

        MySchool Liceo = new MySchool("LICEO");

        MySchoolgirl Abbigail = new MySchoolgirl("Abi", 20, 12);

        Liceo.isRegistered(Abbigail);


//----------------------------------------------------------------------------------------------------------------------
        //--> Inheritance

        /*
        Inheritance is basically gaining all the methods and instances of the parent class, king class, super class ...
        however you may call it.

        It works by using the keyword "extends" when creating a subclass from the parent class

        We create an “is-a” relationship from the subclass to the superclass.

            A car "is a" vehicle
            A bicycle "is a" vehicle

            (assuming that we have class car, bicycle and vehicle)

        In java terms:

            public class vehicle { ... } (Parent class)

            public class car extends vehicle  { ... } (Child class)

            public class bicycle extends vehicle { ... } (Child class)

            everything that the class vehicle has, it is inherited to its child classes

        PURPOSE: its main objective is to avoid any unnecessary repetition on methods and instances that many classes
        have alike. Probably your creating several types of buttons but they have almost the same functionality


        For an example, lets create a super class called Animal


         */

        RaceCar william = new RaceCar("William", 2020, 330, 22.5, 10);

        Bike Harleys = new Bike("Harleys", 1989, 220, 2);

        william.engineNoise();
        william.switchTires();

        Harleys.makeNoise();

        LinkedList<Vehicle>  Garage = new LinkedList<>();
        Garage.add(william);
        Garage.add(Harleys);

        System.out.println(Garage);
        //Note: Overriding on how an object is printed out affects both lists and arraylists

        /*
        HOWEVER, we get a problem if we want to gain access of a parent's private method or variable. Because its
        outside its class, it isn't shared, regardless if you're the fav child.

        But there is another access modifier we can use to keep a parent class member accessible to its child classes
        and to files in the package it’s contained in — and otherwise private: protected.

        *Protected = as we reviewed before, protected grants access to all classes within the same file
        Protected changes access based on what packet you're on

        QUESTION: Is it possible to have access to protected variables or methods in a subclass from a superclass from
        a different package ?
        Yes, if the subclass is in a different package but is also a subclass of the superclass,
        it can access the protected members inherited from the superclass.

         */

        //--> Polymorphism

        /*

        From the inheritance of a parent class, you get all the actions and behaviours a parent class does.
        However, there will be times that certain actions will be different to many child classes, ... this is where we
        get into many different forms of a parent class. "Many" for poly-, "morphism' for many shapes.

        Polymorphism is simply having many versions of the same method prioritizing the method of the child class.

        We can change these actions by ocverriding the actions of the parent class.
        NOTE: this does NOT change all the other actions from different child classes or parent classes ...
        it is unique on only the child class your working on.

        The override is written as so:

        @Override

        For good practice, we write this line to let it known that we changed something from the parent class.
        Its not fancy or anything, we literally just put the same method or variable and give our own unique variables
        or actions


         */

        RaceCar r1 = new RaceCar("Redbull", 2020, 320, -20, 10);

        //This is just an example of how methods can take in objects with a reference to a parent class, where you can
        // add its subclasses

        System.out.println(r1.racer(r1));

        //Even though it is too simple and not needed, you can at least know how it works.


        //Question: By putting by default super(), would it give automatically the cariables for its child class?

        Student Max = new Student("Max", 15, 9, 'a', 8.5);

        /* No. You need to explicitly call them.
        You need to input the name that you assigned it in the order that you had it in the constructor

        View the example in the package Polymorphism2 for the subclass "Student"

        Feel free to play around with these classes, that's its purpose that it serves

        IMPORTANT NOTE:

        We can reference methods of the parent class, even though we override them from the child class

        Like the following example:

         */

        Teacher Pedro = new Teacher("Pedro", 29, "Mathematics", 250000.50);

        Parent Sussana = new Parent("Sussana", 38, "susi89@gmail.com", "6243980097");

        Max.introduceYourself();
        Pedro.introduceYourself();
        Sussana.introduceYourself();





//----------------------------------------------------------------------------------------------------------------------

        //Arrays with Objects

        /*
        Whenever we create multiple objects, it will create a clutter of them without having to track how many objects
        you've created. Maybe you only need to create only one or two objects at most from a class, but what if we had
        more than 20 cars being registered for a race ? We are going to have a class for Car to create every unique
        object, but it will come down to be a great disorder when we need to find them in our code.
        What do we do ? We create a list of those objects.

        How? Instead of adding primitive data types (int, String, boolean) to arrange our type of array, we can assign
         it its CLASS name

        Lets see the following example, using our class "MyRaceCar":

         */

        //We first create 3 objects

        MyRaceCar ferrari = new MyRaceCar("Ferrari", 1990);
        MyRaceCar nissan = new MyRaceCar("Nissan", 2003);
        MyRaceCar ford = new MyRaceCar("Ford", 1998);

        //Then we create an 'Object' list :

        //You can see here that instead of using the primitive type, it's the object type

        MyRaceCar[] raceFinalists = new MyRaceCar[3];

        raceFinalists[0] = ferrari;
        raceFinalists[1] = nissan;
        raceFinalists[2] = ford;


        //Lets create another list but all the participants of the race
        MyRaceCar vw = new MyRaceCar("VW", 2001);
        MyRaceCar Mercedes = new MyRaceCar("Mercedes", 1999);

        MyRaceCar[] totalRacers = new MyRaceCar[5];
        totalRacers[0] = ferrari;
        totalRacers[1] = nissan;
        totalRacers[2] = ford;
        totalRacers[3] = vw;
        totalRacers[4] = Mercedes;


        /*
        However, because its a normal Array, we cannot change the size of the list.
        Eventually we will see more on how an Array CAN change size
         */


//----------------------------------------------------------------------------------------------------------------------

        // --> Bugs

        /*

        * Syntax errors = represent grammar errors in the use of the programming language.
        They are the easiest to find and correct. The compiler will tell you where it got into trouble,
        and its best guess as to what you did wrong.

        * Run-time Errors = Errors which happen during program execution (run-time) after successful
        compilation are called run-time errors. Run-time errors occur when a program with no compile-time errors
        asks the computer to do something that the computer is unable to reliably do.

            - Exceptions = Java uses exceptions to handle errors and other exceptional events.
            Exceptions are the conditions that occur at runtime and may cause the termination of the program.
            W
            hen an exception occurs, Java displays a message that includes the name of the exception,
            the line of the program where the exception occurred, and a stack trace. The stack trace includes:
                The method that was running
                The method that invoked it
                The method that invoked that one
                and so on…

                Common ones to cross over:
                - ArithmeticException: Something went wrong during an arithmetic operation; for example, division by
                    zero.
                - NullPointerException: You tried to access an instance variable or invoke a method on an object that
                    is currently null.
                - ArrayIndexOutOfBoundsException: The index you are using is either negative or greater than the last
                    index of the array (i.e., array.length-1).
                - FileNotFoundException: Java didn’t find the file it was looking for.

          *Logic errors = its a design flaw in your program. It preforms perfectly fine but outputs something that
            isn't expected.


          IMPORTANT NOTE/STRATEGY: one way to fix a bug, you can use the keyboard shortcut 'command' + '/' to comment
          it out
          What you do is you comment out half your code, and if the error stops, you know that the error is originating
          from the code you just commented. If not, you keed commenting half your code until it stops.


         */






    }
}







