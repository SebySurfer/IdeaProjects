import Interface_Ex.Creature;
import Interface_Ex.Demigod;
import Interface_Ex.Human;

import javax.sound.sampled.Line;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//**********************************************************************************************************************
        //Interfaces
        /*
        Definition = it's a template that can be applied to a class. Similar to inheritance, but specifies what a clas
        has/must do, it cannot say HOW to do it.
        Classes can apply more than one interface, however, inheritance is limited to 1 super class
        (it cant inherit more than one super class)

        In other words, an interface is simply an outline of what an object should have. Once you start creating
        objects, the interface on itself is a guide to what methods should it implement. Every object will implement
        the methods its own way, but will still retain an orderly fashion.

        The cool thing about it, is that objects can implement more than just one interface.

        3 Key rules:
        1 - Abstract Methods = A class implementing an interface MUST provide implementations (overrides) for all
        abstract methods from the interface, or else it will create errors.
        2 - Default Methods = Interfaces can have default methods with actions provided, but it's needed to include
        "default". This means that the class itself has an option to override the method or just keep the default
        setting
        3 - class may choose to use or not use the methods inherited from the interface based on its requirements.
        It is not required to utilize every method declared in the interface.


        Analogy to differentiate between Objects and Interfaces in Java:

        Analogy: Building Construction

        Class as a Blueprint:

        Imagine a blueprint for constructing a house. This blueprint provides detailed instructions on how the house
        should be built, including the layout, dimensions, materials, and features.
        Similarly, a class in Java acts as a blueprint for creating objects. It defines the structure, behavior, and
        state of objects of that class. Just like how a blueprint guides the construction of a house, a class guides
        the creation and behavior of objects.
        Interface as a Contract:

        Now, consider a contract between a homeowner and a construction company. The contract specifies certain
        requirements and expectations that the construction company must fulfill when building the house. For example,
        it might specify the number of rooms, the quality of materials, and the completion timeline.
        Similarly, an interface in Java acts as a contract between different parts of a program. It specifies a set of
        methods that a class implementing the interface must provide. Just like how a contract defines obligations for
        the construction company, an interface defines obligations for implementing classes.
        Relationship:

        In this analogy, the blueprint (class) provides a detailed plan for constructing a specific type of house,
        while the contract (interface) specifies the requirements that any construction company (class) must meet to
        be considered compliant.
        A construction company (class) can work on multiple projects (implement multiple interfaces) by following
        different contracts (implementing different interfaces) for each project. Similarly, a class can implement
        multiple interfaces to fulfill different contractual obligations.
        Flexibility:

        The blueprint (class) dictates the specifics of how the house should be built, providing less flexibility
        for customization during construction.
        The contract (interface), however, allows for more flexibility because it only specifies the required behavior
        without dictating how it should be implemented. This allows different classes to provide their own
        implementations of the required behavior, promoting adaptability and interchangeability.


         */


        Creature goblin = new Creature();

        Demigod Elius = new Demigod();

        Human Knight = new Human();

        goblin.spread_wings();

        Elius.fireball();

        Knight.shield();


//**********************************************************************************************************************
        //Lambdas

        /*
        Its a much shorter way to write anonymous classes with only one method
        Where it needs to use a functional interface or a pre-defined functional interface (Java library), which are
        basically interfaces that contain only one method.

        How to use a lambda expression:
        (arguments) -> {statement/s}



        It simply shortens the amount of code needed to override the one method used when initializing an interface

         */


        /*
        In the following example for button1, it's how we will typically instantiate an interface and use its method
        with an overridden action.
         */

        String name1 = "Tommy";
        MyInterface button1 = new MyInterface() {
            @Override
            public void pressButton(String x) {
                System.out.println("Clicks the button and explodes " +x);

            }
        };
        button1.pressButton(name1);


        /*
        Now, with a lambda, it is much shorter, more efficient and direct. Not saying that you HAVE to use lambdas, but
        it creates optimization in terms of how you write your code.
         */

        String name2 = "Jeffry";

        MyInterface button2 = (z) -> { System.out.println("Clicks a button and frcn dies " + z);};

        button2.pressButton(name2);


//**********************************************************************************************************************
        //Enums

        /*
        Grouping or listing of constants, that behave similarly to objects, but cannot be changed

        For example = days of the week, days of the month, list of planets in our solar system
         */

        //Let's create an enum with the values of the periodic table


        //There's two ways you can carry these values, either with a specified name or the name already listed from
        // the table itself

        System.out.println("Nitrogen, also known as " + PeriodicTable.NITROGEN.chemicalSymbol
                + ", is what largely makes up the atmosphere");

        PeriodicTable substance = PeriodicTable.CARBON;

        System.out.println("Oxygen, with an atomic number of "+substance.atomicNumber
                +", only holds 15 % of our atmosphere");


        //The greatest example is the open java libraries themselves, where people can create their own custom
        //enums to hold values (like the value of PI for example) to make coding a lot easier.




//**********************************************************************************************************************
        //INPUT and OUTPUT

        /*
        System is a class from a package that contains high-level properties and methods of the computer env.


        OUTPUT:
        There are three ways to log out data:

        1. System.out.print() = within the same line
        2. System.out.println() = within a new line
        3. System.out.printf("%s %c %d", a, b, c) = uses formated specifiers, where:
            - %s = string
            - %c = char
            - %d = int
            - a, b, c = variables
         */

        int age = 21;

        System.out.printf("I am %d years old\n", age);

        /*
        INPUT:
        We use the Scanner class, which is predefined code to help read user input. However, we need to say
        what type of user input we are going to be scanning.

        There are two parts of the Scanner class:

        1. Delimiter = the Scanner class breaks up its input by using a delimiter, and by default that delimiter is
        set to whitespace. It can do its best to search for the information that you are looking for.
        2. Blocker = The Scanner will block continued execution until there's user input.

        This is how we allow the Scanner to search for the type of data that we are searching for:


        String myString = scanner.next();
        int myInt = scanner.nextInt();
        ...
        (etc)

        Note: Almost like a wrapper class


       The Scanner class has additional methods to help support data validation and prevent exceptions:

       Code	Function
        - input.hasNext() = This function returns a boolean that indicates if there is another token left to process
        - input.hasNextLine()	= This function returns a boolean that indicates if there is another line in the input
            of the defined scanner.
        - input.hasNextInt() = This function returns a boolean that validates if there is another int in the input of
            the defined scanner.
        - input.useDelimiter(",") = his function helps us specify what delimiters we want to use. A delimiter is used
            to separate data units. This , delimiter can be especially useful when a program is required to read csv
            (comma separated values)


         */

        Scanner myScanner = new Scanner(System.in);

        //Now that we have created out scanner, we need to make

        System.out.println("Give me a numba: ");

        int numba = myScanner.nextInt();

        System.out.printf("Numba %d is not enough bruh, i have ur sis numba", numba);


        /*
        File Reader and File Writer
        ---------------------------

        FileWriter is used to output data from a program into a file on your computer, and FileReader is used to read
        from a file. They both are specifically tailored to reading and writing character/text data to files.

        IOExceptions = are exceptions related to input or output that a program may encounter.
        They can be handled by a programmer using try-catch blocks, and is needed to be used and imported.

        Methods:
        - ready() = makes sure there's content to read
        - read() = reads the file one character at a time
        - close() = It's critically important to close files and input streams, which can tie up memory in the processor
        - write() = accepts a string as an argument


        File Reader:
        ------------

        // 1. Declare and initialize
        FileReader reader = new FileReader(filePath); // where 'filePath' being "../Desktop/.. etc"

        // 2.  Read your file = this is how to effectively print every character

        while (reader.ready()) {
        System.out.print((char) reader.read());
        }

        // 3. Wrapping up loose ends

        reader.close();


        File Writer:
        -----------

        //1. Declare output stream
        FileWriter output = new FileWriter("output.txt");

        //2. Declare statement and write to your file
        String statement = "Hello World!";
        output.write(statement);

        //3. Close file
        output.close();

         */

//**********************************************************************************************************************
        //Serialization

        /*
        In OOP, we create objects and we encapsulate their state or data. However, what if we want to share our
        objects to a file, store it in a database or send it over the network? This is where serialization comes in.

        Serialization = describes the process of taking an object’s state and transforming it into a stream of bytes.

        1. A stream is an abstract definition of a sequence of data that is made available over time.
        2. A byte is an 8 bit (0s or 1s) group of data.
        3. A stream of bytes is a sequence of bytes that is made available over time.

        Deserialization = process of taking into a stream of bytes and converting it back into objects

        Key Notes:
        - The stream of bytes created by serialization only includes the member variables of an object and not its
        methods.
        - Deserialization creates a copy of the original object. This copy shares the same state but is an entirely
        new object in memory.
        - Any fields declared as "transient"  or static aren't serialized, they're ignored
            (but they must be used the same way for both classes, or the UID will be different)

        SerialVersionUID = its a unique ID that functions like a version #, where it verifies that the
        sender and receiver of a serialized object has loaded classes for that object that match.
        - It's a way to ensure that to send and receive the data from an object is the same and won't have any errors
        matching the two objects when stripping and unstripping the byte code.
        - A SerialVersionUID will be calculated based on class properties, members, etc.
        You can actually explicitly state what you want these numbers to be or represent.

        NOTE: You are NOT changing the id itself, you're just giving a label to make it easier to manage.
        This way, your computer will assign it to that label every time it calculates a class with exactly that
        unique #ID

        IMPORTANT NOTE: The class that you use for both the Serialization and deserialization have to be exactly the
        same, even in its name. It's just as sensitive as a hash.

        Manual Serialization
        --------------------
        In some cases, you might need to manually serialize a variable that cannot be directly
        serialized by the default methods. For instance, if the variable is transient (which means it
        is not serialized by default) or if it requires special handling, you can serialize it manually.
        This approach is useful for fields that require special treatment or security measures.

        Knowing these topics will improve your mastery of Java and allow you to persist your objects past
        program termination or transport them over a network.



         */


        //You can find an example with the Serialization_Ex package


//**********************************************************************************************************************

//----------------------------------------------------------------------------------------------------------------------
        // Generics

/*
        Have you ever wondered if there could be a Class that can hold ANY kind of variable ?!? READ MORE !!!

        Generics: it gives you the ability to create a class that is flexible for any different type of variable or
        Object
        Quick Example: You create a class just to print String values. What if you want it to have the SAME
        FUNCTIONALITY but for 'int' values ? Then we literally have to recreate that same class but replace the type
        'String' to an 'int' type. What if we want it to hold a boolean value ??
        Basically, it makes repeated code that isn't efficient, causing it to be very extensive.
        That's why we need Generics, where we don't have to repeat our code and simply have a class that can take in
        any variable type and have the same functionality.

        In a nutshell, generics help us accomodate tons of different types of data, but at the same time, the structure
        and the type safety ensures that you stay consistent on what kind of object your adding, specifically with
        the java frameworks like Lists (which will be seen in the next lesson).

         Syntax:

        <T> Return_Type Method_Name(T object_Name){ }

         */

        //Example of Generics:
        // For this ex, I used two instead of just one to make it more fun ;)

        // In between the <> is where we call the type of variable we're going to use, or simply just telling our Class
        // "Hey, I got this kind of food, we're cooking this tonight!"
        Generic_Printer<Integer, Integer> myPrinter = new Generic_Printer<>(2, 2);

        Generic_Printer<String, Integer> myPrint2 = new Generic_Printer<>("Hewo", 9);

        // You CAN do 'new Generic_Printer<String>("Hewo")', but it isn't necessary, its only OPTIONAL. It creates NO
        // errors. Like the following example:

        Generic_Printer<Boolean, Integer> myPrint3 = new Generic_Printer<>(true, 4);


        //Because it can use any type of input, we can also use objects as arguments
        //Lets use a simple class that we already created

        MyRaceCar Mercedes = new MyRaceCar("Mercedes", 1999);


        Generic_Printer<MyRaceCar, Integer> first_car = new Generic_Printer<>(Mercedes, 4);

        first_car.Print();


        //Generics with methods

        /*

        It can also be very helpful to only be using methods with generics instead of being the whole class

        Syntax:


        <Generic> Return_Type Method_Name (Generic x){...}

        Ex: in Generic_Printer.java

         */


        //Upper Bounds
        //------------

        /*

        A perfect example can be provied in package Generic_Racing

       Upper Bounds = A restriction where only the class specified or any class that extends it (being children classes)
       can be used, (as well as interfaces).

       Note that in OOP it can only inherit one parent class and the same case goes to generics, but you can implement
       as many interfaces as you want.

       Syntax for Upper Bounds (using 'extends' keyword):

       <T extends Class_Name & Interface_Name>

       It needs to go in order where the class to inherit goes first, then the interfaces
         */



        // Wildcards & Lower Bounds
        //---------------------------

        /*
        Wildcards = It's basically a way to take an object that holds any generic type instead of a specific type.

        What do i mean by this? Let's say you have a class that holds a list of objects. In a method, you want
        to use a list as an argument to print the list, but have to specify the object type that the list
        holds. Which means, you'll need to create a method for every specific type of object that a list has.
        Now we are going back to the basis of why we should be using generics in the first place. To prevent us from
        doing this repeated task again, we throw in a wildcard "?" that represents any kind of object, for an object.

        Lower Bounds =  A restriction where only the class specified or any super class that it extended from, (being
        its parent classes) can be used, (as well as interfaces).

        Rules of lower bounds:
        - They cannot be used with generic type parameters, only wildcards.
        - A wildcard cannot have both a lower bound and an upper bound. In this case, it’s best to use a
            generic type parameter.

         Syntax for Wildcard:

            Return_Type Method_Name (Object<?> x){...}

         Syntax for Wildcard with Lower Bounds (using 'super' keyword):

            Return_Type Method_Name (Object<? super Class_to_avoid> x){...}

        General Rules for  Wildcards, Upper & Lower Bounds:
        - An upper bound wildcard should be used when the variable is being used to serve some type of data to our code.
        - A lower bound wildcard should be used when the variable is receiving data and holding it for later use.
        - When a variable that serves data is used and only uses Object methods, an unbounded wildcard is preferred.
        - When a variable needs to serve data and store data for later use, a wildcard should not be used (use a type
          parameter instead).


        *** Guidelines for Wildcards (Get-Put Principle) ***
            Upper bound wildcard − If a variable is of 'in' category, use extends keyword with wildcard.
            Lower bound wildcard − If a variable is of 'out' category, use super keyword with wildcard.
            Unbounded wildcard − If a variable can be accessed using Object class method then use an unbound wildcard.
            No wildcard − If code is accessing variable in both 'in' and 'out' category then do not use wildcards.


         */

//----------------------------------------------------------------------------------------------------------------------
        // Wrapper Classes

        /*

        Wrapper classes were created in Java to provide a way to use primitive data types (such as int, boolean, char,
        etc.) as objects. This is necessary because Java is an object-oriented language and many features of the
        language require objects rather than primitives.

        Here are the main reasons why wrapper classes were introduced:

            1. Object-Oriented Design = Java is fundamentally an object-oriented language, and many components of
            the language work only with objects. For example, collections such as ArrayList, HashMap, and others can
            only store objects. Primitive types cannot be used directly in these collections.

            2. Utility Methods = Wrapper classes provide useful methods for converting between strings and primitive
            types, performing comparisons, and more. For instance, the Integer class provides methods like parseInt,
            valueOf, and compare.

            3. Nullability = Primitive types in Java cannot be null, but sometimes a null value is needed to represent
            the absence of a value, particularly in databases and collections. Wrapper classes allow you to have a
            null value.

            4. Autoboxing and Unboxing = Simplifying the code by automatically converting between primitives and
            their wrapper objects.

            5. Consistent API Design = Wrapper classes ensure a consistent API design by allowing all types to be
            treated as objects. This is especially useful when designing generic algorithms and data structures that
            operate on any type.




        Here are the following wrapper classes:
        ---------------------------------------

        int --> Integer
        double --> Double
        char --> Character
        String (same)
        boolean --> "Boolean"
        byte --> "Byte"
        etc


        //Boxing
        It allows wrapper classes to take primitive values and convert them to their corresponding wrapper
        object, and vise-versa, by automatically calling the valueOf() method
        For ex:

        */

        //Autoboxing
        Integer boxed = 24;

        //Unboxing
        int unboxed = boxed;

//----------------------------------------------------------------------------------------------------------------------
        //Collections Framework

        /*
        The collections framework, in a nutshell, is a Java library provided for us to make our lives much easier.
        There are many repetitive tasks involving the use of arrays, which the library helps us avoid. The collections
        framework allows us to focus on the important parts of our program and not on low-level implementation details.

        We can even do our own collections framework ourselves, because its no different from the generic objects and
        instances we've created. It's just more convenient to have them, the same way it'll be convenient for us to
        lay out a structured generic classes/instances to organize a school system. Because everything is predefined,
        a school creating their software won't have to start from scratch. In a broader perspectuve, new schools
        that have to create their own software need to repeat exaclty the same tasks as we would of. Why not help
        everyone and have the predefined code for their own? That's exactly what the developers of Java did for their
        fellow programmers.
         */


        //Collections Interface
        //---------------------

        /*
        The collection interface in itself is what keeps all the other interfaces compatible

        It amounts to be compatible if you want to use interfaces to 'collectively' interact with other
        interfaces (pun intended).

        For example, you want to make a method that can take in any kind of interface as an argument, this is where
        Collections can be very suitable, (and no, you cannot use a wildcard because its for the input data tyoe of a
        class/interface)

         */

        Collection<String> someNames = new Stack<>();
        someNames.add("Ramona");
        someNames.add("Santi");

        //Notice that its not necessary to add by using the "push" keyword ? It's by using the general Collections
        // interface

        Collection<Integer> someNumbers = new ArrayList<>();
        someNumbers.add(1);
        someNumbers.add(5);


        MyCollectionPrinter<Collection> printer = new MyCollectionPrinter<>();

        printer.printCollection(someNames);
        printer.printCollection(someNumbers);








//----------------------------------------------------------------------------------------------------------------------

        //Lists

        /*
        List is an interface from java library that enables you to modify the storage capacity of an array,
        basically just acting as a list

        Difference with just normal arrays:
        - It is dynamic, not static, meaning that it can change size without only having a fixed size array
        - However, it depends on its use because the 'resize' operation in ArrayList slows down the performance.
        - Instead of having to create a for/loop method to create a new list, copy the last one and past it with the
        new list, the ArrayList already does it for you within its class from the Java library
        - Great benefit = You don't have to modify the toString method, you can DIRECTLY print out the actual list

        * The variable type has to be declared in its full name, in other words,
        it doesn't use primitive types (meaning int, double, char, etc... How we usually call them).
        These are called 'Wrapper Class':


        ********************************************* IMPORTANT NOTE!!! ************************************************

        Lists are defined either:
        - Variable types
        - Object types
        - Null (collection of undefined elements, that could be either Variables or Objects)

        Later in the lesson we will see EACH of these cases, so don't worry, relax and enjoy the ride !

        ****************************************************************************************************************

        * How to declare it:
        List< 'Variable_Type' > Array_Name = new ArrayList< Variable_Type >();
            (or)
        List< 'Variable_Type' > Array_Name = new LinkedList< Variable_Type >();

       Note: in List<>, you can also name it ArrayList or LinkedList, it doesn't make a difference, like so:
        ArrayList< 'Variable_Type' > Array_Name = new ArrayList< Variable_Type >();


        * Within this interface, there are two types of concrete classes that make up Lists:
        --> ArrayList:
        - It's excellent at locating and retrieving values
        - But is worse at adding and removing values
        - PURPOSE: it's more for extensive lists that don't need much modifying in its capacity,
          but is much quicker on finding values

              => How it works:
              - When asked for a value, it immediately goes to the value's index
              - However, when adding or removing a new element - in other words, the storage capacity -
              it creates a new list

              CON: So everytime you add or subtract an element, it has to copy the previous one, make a new empty array
              with the modified storage capacity, and THEN paste the new modified array. Wasting a lot of time.


        --> LinkedList
        - It's excellent at adding and removing values
        - But it is worse at locating and retrieving values
        - PURPOSE: it's more focused on having to add or remove things from your list
          (especially faster if it's the beginning or the end)

              => How it works:
              - Every index is connected in between each other by reference points, or so called 'pointers'
              - These pointers can reference forwards or backwards
              - When asked for a value, it starts at the beginning and ending value, and if it needs to get
              in between the index, it has to follow these 'next' or 'previous' pointers to get the value it wants.

              CON: So if it needs to find the 400th element, it won't go directly there. It has to start at the first
              element and keep getting the next values until reaching the 400th element. THIS is why its not as
              efficient when dealing with long lists

              PRO: However, it doesn't create a new list. It only adds in to its capacity.

              */


        //Lists declaration:

        //You can see here that we don't need to specify the size of the list
        List<String> carShow = new LinkedList<>(Arrays.asList("Ferrari", "Porche", "Mitzubishi", "Lamburghini"));


        /*
        Why 'Arrays.asList' ?

        Its within the Java Framework Interface, where it holds its own methods


         */

        //--> Here are the following actions you can do to a List:

        //Get length/size
        System.out.println(carShow.size());

        //Get element (by index)
        System.out.println(carShow.get(0));

        //Add element
        //With no specified index, by default, it is added in the very end of the list
        carShow.add("Volkswagen");
        //With specified index. Note: It moves all other elements to the right. HOWEVER, you CAN'T add it in
        // an index that hasn't been created yet.
        carShow.add(0, "Jeep");

        //Set/replace an element
        carShow.set(3, "Nissan");

        //Remove element
        carShow.remove(4);
        carShow.remove("Porche");

        //Find element
        carShow.indexOf(1);

        //Clear Elements
        carShow.clear();

        //Print list = It automatically prints the actual list without you having to mess with the toString over-ride
        // method
        System.out.println(carShow);


        ArrayList<String> friends = new ArrayList<>(Arrays.asList("Jacob", "Sabrina", "Roberto", "Fernando", "Mario"));


        //Lists with Objects:

        /*

        *How to declare it:

        List < 'OBJECT' > list_Name = new List_TYPE<>();

        Note: After this, you add in your objects as you would add variables.
        HOWEVER, I still haven't found a method to add objects inside the '()' directly like the example above of List
        "friends"

         */

        //Let's create the object list beforehand:
        List<MyLittleStore> shopping_Mall = new LinkedList<>();

        //It will take objects from the class "MyLittleStore"

        //Now is time to create our objects:
        MyLittleStore SARAH = new MyLittleStore("SARAH", 2020, 2500.50);
        MyLittleStore WongSushi = new MyLittleStore("WongSushi", 2019, 3000.50);
        MyLittleStore GoKartMania = new MyLittleStore("GoKartMania", 2023, 5240.00);

        shopping_Mall.add(SARAH);
        shopping_Mall.add(WongSushi);
        shopping_Mall.add(GoKartMania);

        System.out.println(shopping_Mall);
        //Because a list can sometimes be messy by printing them out in a whole line, i recommend to make a for/loop

        for(int i = 0; i < shopping_Mall.size(); i++){
            System.out.println(shopping_Mall.get(i));

        }

        //Arrays without specified element type

        /*
        There could be times when we don't want a specific primitive/wrapper type  or an  object.
        Sometimes, we may just want a bundle of things chummed together.

        In the following snippet, assortment is an ArrayList that can store different values
        because we do not specify its type during initialization.

         */

        MyRaceCar ferrari = new MyRaceCar("Ferrari", 1990);

        ArrayList assortment = new ArrayList<>();
        assortment.add("Hello"); // String
        assortment.add(12); // Integer
        assortment.add(ferrari); // reference to MyRaceCar

        System.out.println(assortment);
        // assortment holds ["Hello", 12, MyRaceCar@378bf509]



        //Lists with Classes

        /*
        Arrays always act like variables, ... same goes for Lists

        It's not complicated at all to have a method that gains a list.

         You simply:
         1. Tell the input type of list
         2. Add in the parenthesis '()' if your going to insert a list type or have it empty
         3. Do whatever modifications of the list inside the method
         4. Return the list back

         For example:

         */

        //We're going to make an object that holds a list of numbers

        MyNumberList odds = new MyNumberList();
        MyNumberList evens = new MyNumberList();

        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(5);
        myList.add(3);
        myList.add(2);
        myList.add(7);
        myList.add(13);
        myList.add(4);

        System.out.println(myList);

        System.out.println(odds.removeEvens(myList));
        System.out.println(evens.removeOdds(myList));

        /*
        Because we are using the same list, it will affect it in both ways:
        - First, removing evens
        - Then, removing odds
        Finally, you have a list without any integers

        Note: it wont really matter what object you use, by using the same list you'll get the same result

        However, in this situation we only used a class with a default constuctor

        In the next example, we will shwcase how to get input of an Array and a List


         */

        //In this example, we will make a class that registers students by name, age, grade and test scores

        LinkedList<Double> JuanList = new LinkedList<>();
        JuanList.add(6.9);
        JuanList.add(8.4);
        JuanList.add(8.9);

        String[] JuanReports = new String[3];
        JuanReports[0] = "Student misconduct";
        JuanReports[1] = "Sleeps with teacher";
        JuanReports[2] = "The teacher is pregnant";


//----------------------------------------------------------------------------------------------------------------------
        /*
        --> Casting

        Casting in programming refers to the process of converting a value from one data type to another.
        It's like telling the compiler to treat a variable as if it were of a different type.

        In the context of arrays and ArrayLists in Java, casting is often necessary when retrieving elements,
        especially if the data type of the elements is broader than what the variable can directly hold.

        Because you initialized your list only as a List, and in your constructors your currently trying to get an
        input as a "linked" list, then you have to make a CASTING to the program that can take a List (undefined) as a
        LinkedList

        If you already predefined it as a LinkList, you don't have to make this casting, because literally your giving
        the constructor a linked list, and it expects a linked list. So no need to cast.

        Another example of casting could be giving your program an integer when it expects a double.
        Because if it expects a double, you can convert the information of type double to type int by "casting it",
        like a magic spell

        You cast a spell where you convert variable types. BUT WARNING !! sometimes this can lose variable information

        Ex: Double x = 2.2

        System.out,println( (int)x  ) ;

        It will print out --> 2
        (Which looses information of the decimal point)


         */


        /*
        Because we already modified that our original list is a LinkedList, we don't need a cast, this is why they are
        shown in gray (we can just delete them if we want to). For purposes of showing how the casting SHOULD of worked
        if we predefined our list as List.

         */
        MyStudent Juan = new MyStudent("Juan", 13, 7, (LinkedList<Double>) JuanList, JuanReports);

        System.out.println("Juans scores is " + Juan.yourAv((LinkedList<Double>) JuanList));

//----------------------------------------------------------------------------------------------------------------------

        // --> 2D Arraylists

        LinkedList<LinkedList<Character>> abc = new LinkedList<>();








//**********************************************************************************************************************
        //Threads

        /*

        * YouTube Notes:
        - Program = line of code that achieves some tasks. The program itself is stored within a Hard-Disk, or your
        local memory (x.java).

        - Process = Once a program is executed, it takes the RAM, or the Main Memory.

        Local Hard-Disk                                 RAM
            x.java          ----- Executing ---->
          "Program"                                    Process


        - Multi-processing = process of being able to execute two or more processes of computational jobs at a time

        - Threads = are used to preform a task within a Process.
        - Multiple threads = allows to preform multiple tasks at the same time, in a Process
        There are (or can have) multiple threads in a single process, and each thread independent of the other
            Real ex = YouTube preforms multiple tasks, such as = playing the video, giving adds, creating related
            videos, creating the comment section, etc. Each one of these is called a thread.

        A process can have multiple threads, but threads have their own local variables and local memory.

        Thread Life-cycle:
        New --> Runnable --> Running --> Waiting --> Dead --> (Repeat)

        1. New = it will not start executing until a process is being assigned to it
        2. Runnable = thread is assigned to a process and engaged
        3. Running = the code is executed
        4. Waiting = still in the running stage, but it needs a response
        5. Dead = process is terminated when received the response, or finishes the task by itself


        * Code Academy:
        Sequential Programs = programs that run instructions in a defined order, with a beginning and an end

        For most applications, the primary requierements are: being fast and efficient
        To meet this goal, we have to implement concurrent programs.

        Concurrent Programs = enables the execution of multiple tasks at the same time

        Threads = they are the building blocks of Concurrent Programs. A single thread has a beginning and an end,
        with only a single point of execution.

        A program can have multiple threads running simultaneously

        By default, a process has a single thread of execution, being the main thread. From the initial thread, we can
        create more threads to launch different independent tasks. The process isn't considered finished until all
        threads have finished.

        PURPOSE:
        Whenever we have a web page or an application without threads, people will confront the problem of having to
        wait for all the tasks to be completed sequentially before being able to preform any other actions on the site.

        Using a multithreaded program, however, it can stack independent actions while still allowing you to do other
        tasks simultaneously. In other words, it allows actions to do things in parallel with one-another.
        It prevents your program’s main thread to become unresponsive or unusable while the tasks are being performed.

        CONTEXT:

        Programs Context = it includes variables, function names, etc.

        Context of threads can run independently, or dependently (between threads as well)

        Problem that arises:
        When reading shared information in a multi-threaded program, there's nothing to worry about when managing
        SHARED STATE. However, when multiple threads are modifying the same source, we can run into issues on changing
        values from threads that have out-of-date variables.

        - Thread Synchronization = it's the solution when facing this problem of managing issues of Shared State.


         */




        /*
        Using threads example:
        We are using a class example with Printer
         */

        Printer smallPrinter = new Printer(2, "You can't see this because its white", false);
        Printer bigPrinter = new Printer(10, "Text", true);

        //bigPrinter.printText();
        //smallPrinter.printText();


        //In this way, the program will run sequentially on the order that you placed the commands


        //However, to prioritize on the ones that execute sooner from less processing time, we use our threads as so:

        //bigPrinter.start();
        //smallPrinter.start();

        //Here you can see clearly that even though the big printer started first, the small printer gained priority
        // for running the least amount of code first



        // ---------

        /*
        Bro Code:

        Each thread can execute parts of your code in parallel with the main thread

        Each thread has a priority.

        Threads with higher priority are executed in preference compared to threads with a lower priority

        The Java cirtual machine continues to execute threads until either one of the following occurs:
            1. The exit method of class Runtime has been called
            2. All user threads have died

            When the Java VM starts up, there is a thread which calls the main method, which is a thread that
            is called "main"


         */

        //System.out.println(Thread.activeCount());

        /*
        If you can see, the active counts has a value of 2. How ?
        It is including the main thread, and the other class thread we made, named "Printer"
        Any objects created within that class isn't a new thread, they're elements within the same thread.
         */

        Thread.currentThread().setName("Main Thread");

        //System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setPriority(9);

        // Priorities are set between the numbers of 1 - 10

        //System.out.println(Thread.currentThread().getPriority());
        //System.out.println(Thread.currentThread().isAlive());

        MyThread thread3 = new MyThread();
        //thread3.start();

        /*
        Whenever we create a new thread, we have to start it. Regarldess if you use the run() method, it's still
        going to be inactive
         */

        //System.out.println(thread3.isAlive());
        thread3.setName("Third Thread");
        //System.out.println(thread3.getName());

        thread3.setPriority(4);

        //System.out.println(thread3.getPriority());

         /*
        You will notice that it has the same priority as the one we set for the main. This is because it inherits
        the priority of the thread that created it
         */


        //System.out.println(Thread.activeCount());

        /*
        2 types of threads:
            1. Normal/User threads (that are already assigned by default)
            2. Daemon threads = low priority thrraad that runs in the background to perform tasks such as garbage
            collection and the JVM terminates itself when all user threads (non-daemon threads) finish their execution
         */

        MyThread thread4 = new MyThread();


        /*
        IMPORTANT NOTE = You cannot set a thread as a daemon after it has already been started.
        Once a thread has been started, you cannot change its daemon status.


         */

        thread4.setDaemon(true);
        //thread4.start();
        //System.out.println(thread4.isDaemon());

        //System.out.println(Thread.activeCount());

        /*
        If you noticed so far, once you let all the print statements to run at the same time, it doesn't quite go
        sequentially. This is where you indirectly applied multi-threading
         */

        //Multi-Threading
        /*
        Concept = process of executing multiple threads simultaneously
        Helps maximum utilization of CPU
        Threads are independent, they don't affect the execution of other threads
        An exception in one thread will not interrupt other threads
        It is useful to serving multiple clients, multiplayer games, or other mutually independent tasks

        Benefits of Multi-Threading:
        If one of the threads encounters an exception and gets interrupted, the other threads will still continue.

         */

        //Method 1 of making a thread
        /*
        Creating a subclass of the Thread class
        Why use this method ?

        It's suitable when you want to create a thread that is tightly coupled with its behavior and do not need
        to extend any other class, as Java doesn't support multiple inheritance.

        It can implement another interface, for ex:
        MyThread extends Thread implements x
         */
        MyThreadCounter thread1 = new MyThreadCounter();

        //Method 2 of making a thread
        /*
        Create a class that implements the runnable interface, and then you take this instance and pass it as an
        argument to the constructor of the thread class, and that's how you get your other thread

         Why do this method ?

         Unlike extending Thread, implementing Runnable allows a class to extend another class while implementing
         the Runnable interface, overcoming Java's single inheritance limitation.

         Inheritance can be allowed through this method by:
         Class 'extends' another_class implements Runnable
         */
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);



        /*
        Now lets take into the test when a thread encounters an exception.
        We added a print statement where a number divided by 0 in MyRunnable class.

        We can even do it to the main thread, and the other threads are still going to run independently


         */

        //System.out.println(1/0);

        /*
        join() Method

        calling thread (x: main) will wait until the specified thread dies and/or for x amount of miliseconds

        thread_waiting_to_die.join(miliseconds_to_wait);

        The JVM will wait for all threads to be finished before exiting the program.

         */

        //thread1.start();

        //thread1.join(3000);

        //thread2.start();


        /*
        Demon Threads

        However, the JVM will NOT wait for the daemon threads to be finished before exiting the program.

        The JVM only needs at least one user thread to start running, but will exit regarldess if there's any daemon
        threads or not



         */


        /*
        Additional Notes:
        Prefer implementing Runnable over extending Thread as it provides better separation of concerns and allows
        for more flexibility in class design.

        Extending Thread: Allows you to create unique threads by subclassing the Thread class directly. Each instance
        of your subclass represents a separate thread of execution. This method doesn't necessarily restrict
        inheritance; you can still inherit from other classes, but it does limit your ability to extend other classes
        because Java doesn't support multiple inheritance. Extending Thread doesn't require
        additional inheritance, but it doesn't restrict inheritance either.

        Implementing Runnable: Allows you to create threads by implementing the Runnable interface. This method
        separates the thread's behavior (defined in the run() method) from the thread itself, which promotes better
        code organization and flexibility. Unlike extending Thread, implementing Runnable doesn't restrict your ability
        to extend other classes because it's just an interface, not a class. Implementing
        Runnable allows for creating threads that can inherit from other classes.

        Let's use an analogy involving building construction to explain the differences between extending Thread and
        implementing Runnable:

        Imagine you're constructing two types of buildings: houses and skyscrapers.

        Extending Thread (House Construction):

        When you extend Thread, it's like building a unique house from scratch. Each house (thread) has its own
        distinctive design and functionality, such as the number of rooms and layout. You don't need any pre-existing
        structure (inheritance) because you're starting fresh with each house.
        However, if you decide to build a house with an attached garage later on, you'll have to demolish and rebuild
        the entire house because Java doesn't support adding additional inheritance to a class that already extends
        Thread. Implementing Runnable (Skyscraper Construction):

        Implementing Runnable is akin to constructing skyscrapers using standardized floor plans. Each skyscraper
        (thread) follows the same basic blueprint (the Runnable interface) but can have different interior designs and
        functions (the run() method implementation). Since you're not tied to a specific building design (class
        inheritance), you can choose to build a residential skyscraper with apartments or a commercial skyscraper with
        office spaces without any restrictions. Additionally, if you decide to add extra features like a rooftop garden
        to all your skyscrapers, you can easily incorporate it into the existing blueprint (implementing interfaces
        doesn't restrict other class inheritance).

        In essence:

        Extending Thread creates unique threads (houses) with their own characteristics but doesn't easily allow for
        additional features or inheritance. Implementing Runnable creates threads (skyscrapers) based on a standard
        blueprint, allowing for consistency and flexibility in design and inheritance.
         */







//**********************************************************************************************************************
        //String Types

        /*
        Strings = it cannot be changed or modified. Every time you need a modification, you need to create or it will
        create a new String object or a String variable. This is the common one that we always use
         */


        /*
        String Buffers = strings that CAN be modified. It's thread-safe and synchronized, allowing you to modify the
        contents of a string without creating a new object every time.
         */

        StringBuffer mybuffer = new StringBuffer("Your name");

        mybuffer.append(", and me");
        //System.out.println(mybuffer);

        /*
        String Builder = strings can ALSO be modified. Faster than StringBuffer and consumes less memory, but NOT
        thread-safe
         */

        /*
        Key Differences between String Builders and String Buffers:

        Thread Safety:

        StringBuffer is synchronized, meaning it is thread-safe. This ensures that multiple threads cannot access it
        simultaneously, which prevents data corruption or inconsistent results in a multithreaded environment.
        StringBuilder is not synchronized, making it faster in single-threaded environments but potentially unsafe
        in multithreaded scenarios.

        Performance:

        StringBuffer is generally slower than StringBuilder due to its synchronized nature. When multiple threads are
        not involved, using StringBuffer can introduce unnecessary overhead.
        StringBuilder is faster in single-threaded scenarios because it lacks the synchronization overhead of
        StringBuffer. It's typically preferred when thread safety is not a concern.

        Mutability and Flexibility:

        Both StringBuffer and StringBuilder are mutable, meaning that the content of the string they hold can be
        modified after it's created.
        StringBuilder offers the same functionality as StringBuffer, but without the synchronization overhead.
        Therefore, it's often the preferred choice unless thread safety is explicitly required.

         */


//**********************************************************************************************************************
        //Collection Framework

        /*

        Provides an architecture to store and manipulate a group of objects

        Analogy:
            Piggy Bank = Collection framework

            Coins = Objects

        The collection framework subdivides into three parts:
        1. Interfaces = (top most position of the hierarchy), holds abstract classes
        2. Classes
        3. Algorithms


        The Java Collections Framework holds 3 kinds of interfaces, and objects to their respective interface:
        1. List:
        - ArrayList
        - LinkedList
        - Vector

        2. Queue:
        - ArrayDeque
            Deque:
            - PriorityQueue

        3. Set:
        - HashSet
        - LinkedHashSet
            SortedSet:
            - TreeSet

         */

//**********************************************************************************************************************
        //Vector Class (Implements List interface)

        /*
        Vectors are exactly the same as ArrayLists and LinkedLists, however, there's a great difference in performance.

        Main difference between the other object list classes and vectors:
        A Vector is thread-safe and the other lists isn't.
        Operations on a List aren't synchronized, they are not thread-safe.
        To operate multi-threads on a List at the same time results in completely non-deterministic
        behaviour and exceptions.


        Disadvantages of Vectors:
        I's slower in adding a very large number of items in the list (Vector) in one single thread

        Advantages:
        It is thread safe and synchronized, meaning that it can handle multi-Threads
        This thread safety does come with a performance cost.

        Generally, just use ArrayLists = in the relatively rare circumstances that you need to synchronize those
        individual operations across a bunch of different threads, you can just use a synchronized list wrapper
        to take care of that.

         */

        //Single-Thread Environment: Here we showcase an example on the preformance

        int size = 1000000;

        ArrayList<Integer> arrayList = new ArrayList<>();

        //currentTimeMills sets for the currrent time of the system in miliseconds

        long start = System.currentTimeMillis();

        for(int i = 0; i < size; i++){
            arrayList.add(i);
        }

        long end = System.currentTimeMillis();

        //System.out.println("Time for ArrayList: " + (end - start) + " ms" );


        start = System.currentTimeMillis();

        Vector<Integer> vector= new Vector<>();

        for(int i = 0; i < size; i++){
            vector.add(i);
        }

        end = System.currentTimeMillis();

        //System.out.println("Time for Vector: " + (end - start) + " ms" );


        //As you can notice, the Vector takes twice as much time as the ArrayList


        //Multi-Threaded environment

        // First we create two threads to engage at the same time for an ArrayList

        ArrayList<Integer> multiThread_List = new ArrayList<>();
        start = System.currentTimeMillis();



        Thread t1 = new Thread(() -> {
            for(int i = 0; i < size; i++){
                multiThread_List.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < size; i++){
                multiThread_List.add(i);
            }
        });

        t1.start();
        t2.start();
        //The join() method makes sure that until both of those threads are completed, we can continue our work bellow

        t1.join();
        t2.join();

        end = System.currentTimeMillis();
        //System.out.println("Time for multi-threaded Arraylist: " + (end - start) + "ms");

        //System.out.println("Added elements in a multithreaded way by an ArrayList ");
        //System.out.println("Size is: " + multiThread_List.size());



        // Then we create two threads to engage at the same time for a Vector


        Vector<Integer> multiThread_Vector = new Vector<>();
        start = System.currentTimeMillis();



        Thread ta = new Thread(() -> {
            for(int i = 0; i < size; i++){
                multiThread_Vector.add(i);
            }
        });

        Thread tb = new Thread(() -> {
            for(int i = 0; i < size; i++){
                multiThread_Vector.add(i);
            }
        });

        ta.start();
        tb.start();

        ta.join();
        tb.join();

        end = System.currentTimeMillis();
        //System.out.println("Time for multi-threaded Vector: " + (end - start) + "ms");

        //System.out.println("Added elements in a multithreaded way by a Vector ");
        //System.out.println("Size is: " + multiThread_Vector.size());

        /*
        You can see here that the Vector still took a tole on the time.
        However, once we uncover the number of items in each lists, we'll uncover something quite surprising.

        Logically, we'll have 2 million items for every list. Beacuse a List is not thread-safe, it has errors in its
        compilation
         */

//**********************************************************************************************************************
        //Stack Class

        /*
        In simple terms, think of a stack like a pile of plates in a cafeteria. When you add a new plate, you put it
        on top of the pile. When you want to take a plate, you take the one that's on the top of the pile.

        Last-In First-Out

        In programming, a stack is a data structure that works similarly. It follows the Last In, First Out (LIFO)
        principle, which means the last item added to the stack is the first one to be removed. You can add items to
        the stack (push) or remove items from the stack (pop), but you can only do these operations on the top item of
        the stack.

        For example, if you have a stack of integers:

        You can push the numbers 5, 10, and 15 onto the stack.
        Then, if you pop an item from the stack, you'll get 15, because it was the last one added.
        If you pop another item, you'll get 10, and so on.
        It's a handy way to manage data when you need to keep track of the order in which items were added and
        retrieved.


         */

        Stack<Integer> bingo = new Stack<>();

        System.out.println(bingo.size());

        //push = adds item to the stack
        bingo.push(10);
        bingo.push(15);
        bingo.push(99);
        bingo.push(69);

        System.out.println(bingo);
        System.out.println("Size: "+ bingo.size());

        //pop = gets (grabs temporarily) the top item of the stack and removes it
        System.out.println("Item popped: "+ bingo.pop());

        System.out.println(bingo);

        //peek = looks at the top item of the stack without removing it

        System.out.println("Current item on top of stack: "+bingo.peek());

        //empty = checks if its empty or not
        System.out.println("Is empty?: "+bingo.empty());

        System.out.println(bingo);

        // search = searches for item (starting point of index 1, NOT 0)
        System.out.println(bingo.search(15));


        /*
        What's the point or its use ?

        1. undo/redo features in text editors
        2. moving back/forward thorugh browser history
        3. backtracking algorithms (maze, file directories)
        4, calling functions (call stack)


         */

//**********************************************************************************************************************
        //Queue Interface

        /*

        First-In First-Out (ex. a line of people)

        - Linear data structure
        - Where the HEAD is the first in line, and the TAIL is the last in line
        - As items stack, the first ones get attended first and the newest ones last, like any other normal line.


        The Queue interface follows other methods to prevent from throwing exceptions when:

        add() - there is no space for the element (of course, with a statically sized queue)
        remove() - there are no elements to remove
        element() - there are no elements to get

        So instead of getting errors, we also do the following actions before the ones above (with its returns):

        offer() - false there is no space for the element
        poll() - null there are no elements to remove
        peek() - null there are no elements to get

         */

        /*Note: Queue is only an interface and cannot be used to create instances, so in the Java Collections, the
        class associated with a queue is a LinkedList. If we were to try to use Queue as an instance, we'll need to
        override all the methods within that interface (tried it myself, extremely unnecessary)


        */

        System.out.println("\n"+"Queue");

        Queue<String> coffeeShop = new LinkedList<String>();

        coffeeShop.offer("Jenny");
        coffeeShop.offer("Linda");
        coffeeShop.offer("Karen");
        coffeeShop.offer("Manuel");

        System.out.println(coffeeShop);

        System.out.println("Removing: "+coffeeShop.poll());

        System.out.println(coffeeShop);

        System.out.println("Going to add a Chris");

        coffeeShop.offer("Chris");

        System.out.println(coffeeShop);

        System.out.println("Removing: "+coffeeShop.poll());

        System.out.println(coffeeShop);

        System.out.println("Next in line: "+coffeeShop.peek());


        /*
        Where are queues useful?

        1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        2. Printer Queue (Print jobs should be completed in order)
        3 Used in LnkedLists, PriorityQueues, Breadth-first search


         */


        // Priority Queue
        /*
        PriorityQueue always ensures a priority of the elements in the queue  (or some custom ordering policy you
        provide).

        Custom ordering:
            We can accomplish this with a comparator.
            * Comparators = used to order the objects of user-defined classes. A comparator object is capable of
            comparing two objects of the same class.


        Point:
        - Efficient Priority Handling: When you need to process elements based on priority rather than in the order
            they were added.
        - Dynamic Ordering: It dynamically orders elements, making it suitable for scenarios like scheduling tasks,
            pathfinding algorithms, or anytime you need to handle elements with varying levels of priority.
         */

        Queue<String> LineForStarbucks = new PriorityQueue<>( /*Here you instantiate the comparator*/);

        LineForStarbucks.add("Zetra");
        LineForStarbucks.add("Steven");
        LineForStarbucks.add("Karen");
        LineForStarbucks.add("Marcil");
        LineForStarbucks.add("ALex");

        System.out.println(LineForStarbucks);




        //Deque

        /*

        Deque stands for double-ended-queue, meaning, that it allows us to access methods from both the front and the
        back of the queue.

        It can be implemented for the LinkedList and more specifically, the ArrayDeque.
        It is quite preffered to use the ArrayDeque


        The following are some of the available methods and the exceptions they throw:

        - addFirst(), addLast() - there is no space to add an element.
        - removeFirst(), removeLast() - there is no element to remove.
        - getFirst(), getLast() - there is no element to get.

        The following methods return a special value to check before using the ones above:

        - offerFirst(), offerLast() - false when there is no space to add an element.
        - pollFirst(), pollLast() - null when there is no element to remove.
        - peekFirst(), peekLast() - null when there is no element to get.

         */

        //In this example  have a list of truths/falses/nulls.
        // I just want to add the truths in the front, the nulls and falses last

        Deque<Boolean> ansQuestions = new ArrayDeque<>();
        ansQuestions.add(true);
        ansQuestions.add(false);
        ansQuestions.add(false);
        ansQuestions.add(true);
        ansQuestions.add(false);
        ansQuestions.add(false);

        Deque<Boolean> newOrder = new ArrayDeque<>();

        //adding the values to the new order
        for(Boolean x : ansQuestions){
            if(x == true){
                newOrder.addFirst(x);

            } else {
                newOrder.addLast(x);
            }
        }

        System.out.println(ansQuestions);
        System.out.println(newOrder);





//**********************************************************************************************************************
        //Map Interface

         /*

        The map interface is present in java.util package represents a mapping between a key and a value.

        In Java, the Map interface is a way to store data in a structured format that consists of key-value pairs.
        Think of it like a dictionary: you have words (keys) and their corresponding definitions (values).

        Here's a simple breakdown:
        Key: This is like the word in a dictionary. It's what you use to look up information.
        Value: This is like the definition of the word. It's the information associated with the key.

        Ordered like so:
        (key, value)

        The Map interface allows you to store these key-value pairs and perform various operations like adding new
        entries, removing entries, and looking up values based on their keys.


        --> Classes:

        * HashMap:
        Purpose: Implements the Map interface to store key-value pairs, where keys must be unique. It allows quick operations like insertion, search, and deletion based on the key index.
        Ordering: Does not maintain any order of insertion.
        Note: Not synchronized, allows null elements, but only one null key.

        * LinkedHashMap:
        Purpose: Similar to HashMap but maintains the order of insertion of elements.
        Ordering: Maintains the insertion order of elements.
        Note: Provides quick insertion, search, and deletion, while also preserving the order of insertion.

        * WeakHashMap:
        Purpose: Implements the Map interface to store weak references to its keys, allowing entries to be garbage-collected when their keys are no longer referenced.
        Ordering: Behaves similarly to HashMap but removes entries when keys are no longer strongly referenced.
        Note: Useful for implementing registry-like data structures.

        * EnumMap

        --> Interfaces:

        # SortedMap:
        Purpose: An interface extending the Map interface, providing a total ordering of its elements based on the natural order of keys.
        Ordering: Stores elements in sorted order based on keys.
        Note: Implemented by TreeMap.

        # NavigableMap:
        Purpose: An extension of SortedMap, providing navigation methods like lowerKey, floorKey, ceilingKey, and higherKey, along with sub-map creation methods.
        Ordering: Supports methods for navigation and sub-map creation based on keys.
        Note: Provides convenient ways to navigate through map elements.

        Implementations:

        - TreeMap:
        Purpose: Implements both the Map and NavigableMap interfaces, storing key-value pairs sorted according to the natural ordering of keys or a provided comparator.
        Ordering: Orders elements based on the natural ordering of keys or a custom comparator.
        Note: Provides efficient sorting and storing of key-value pairs.

        - ConcurrentHashMap:
        Purpose: Implements the Map interface, providing a thread-safe alternative to HashMap for concurrent access by multiple threads.
        Ordering: Does not guarantee any particular order of elements.
        Note: Introduced in Java 5, offers better performance in multi-threaded environments compared to HashMap.


         */




        //--> Classes

        // * HashMap

        System.out.println("\n" + "Hashmap");

        HashMap<Integer, String> studentList = new HashMap<>();

        //put = adds items
        studentList.put(1, "Alex");
        studentList.put(2, "Carlos");
        studentList.put(3, "Diego");
        studentList.put(4, "Fernanda");
        studentList.put(5, "Gregorio");

        System.out.println(studentList);

        //remove = removes, but it is based on its key

        studentList.remove(2);

        System.out.println("Removed key 2");

        //clear = clears out hashmap
        //studentList.clear();

        System.out.println("Size: "+studentList.size());

        //replace = (key, value to replace for the key)

        studentList.replace(1, "Alejandra");

        System.out.println(studentList);

        System.out.println(studentList.get(3));






        // * LinkedHashMap

        LinkedHashMap<Character, Integer>   alphaLinked = new LinkedHashMap<>();
        alphaLinked.put('e', 1);
        alphaLinked.put('a', 53);
        alphaLinked.put('z', 3);
        alphaLinked.put('b', 22);
        alphaLinked.put('g', 999);



        for(Character x : alphaLinked.keySet()){
            System.out.println(alphaLinked.get(x));
        }

        /*
        Now, in the following example, we will demonstrate that whenever we print out the Map entirely, but for an
        unlinked list, it will print in disorder. NOTE: If you order the keys by using integers, it will come ordered.
         */
        HashMap<Character, Integer>   alphaUnlinked = new HashMap<>();

        System.out.println("\n");

        alphaUnlinked.put('e', 1);
        alphaUnlinked.put('a', 53);
        alphaUnlinked.put('z', 3);
        alphaUnlinked.put('b', 22);
        alphaUnlinked.put('g', 999);



        for(Character x : alphaUnlinked.keySet()){
            System.out.println(alphaUnlinked.get(x));

        }




        // * WeakHashMap

        /*
        A WeakHashMap is a special implementation of the Map interface provided in Java that uses weak references for
        its keys. Unlike regular HashMaps, which hold strong references to their keys, WeakHashMaps hold weak
        references to their keys. This means that if there are no other strong references to a key, it can be garbage
        collected even if it's still stored in the WeakHashMap.

        Garbage Collection: One common use case for WeakHashMap is when you need to associate some data with objects
        that are subject to garbage collection. By using weak references for keys, you can ensure that the entries in
        the WeakHashMap won't prevent the associated keys from being garbage collected when they are no longer needed
        elsewhere in the program.

        Imagine you have a regular HashMap where you store some objects as keys. In Java, when you store objects in a
        HashMap, they are held with a strong reference. This means that as long as the object is stored in the HashMap,
        it won't be garbage collected, even if you're not using it anymore in your program.

        Now, let's say you have a situation where you want to associate some additional information or data with these
        objects, but you also want these objects to be able to be garbage collected when they're not needed anymore.

        This is where a WeakHashMap comes in. In a WeakHashMap, the keys are held using weak references instead of
        strong references. A weak reference to an object allows the object to be garbage collected if there are no
        other strong references to it.

        So, the point of using a WeakHashMap is that it allows you to associate data with objects while still allowing
        those objects to be garbage collected when they're no longer needed elsewhere in your program. This can be
        useful in scenarios where you want to avoid memory leaks or unnecessary memory usage by allowing unused objects
        to be cleaned up by the garbage collector.
                 In a WeakHashMap, the keys are held using weak references, which means they can be garbage collected
                 if there are no other strong references to them elsewhere in the program.

        So, if you have a key stored in a WeakHashMap and it's also referenced by some other variables, methods, or
        other parts of your program, then it won't be garbage collected because there are still strong references to it.
        However, if there are no other strong references to the key, and the only reference to it is held by the
        WeakHashMap, then it can be garbage collected.

         */

        WeakHashMap<String, Double> client_listings = new WeakHashMap<>();

        client_listings.put("Jacob", 5000000.00);
        client_listings.put("Andres", 23000.00);
        client_listings.put("Lucia", 45000000.00);
        client_listings.put("Pedro", 90000.00);
        client_listings.put("Juan", 430000.00);

        System.out.println(client_listings);

        //For this example, you are a real estate agent who wants the most important clients, and assume we finish the
        // deals with the top 3 best clients
        //However, we ignore the other two clients with the smallest buying price

        double total_comission = (client_listings.get("Jacob") + client_listings.get("Lucia") + client_listings.get("Juan")) * 0.06;

        //Now, lets disregard the clients we didn't tour in our list.

        //This is a garbage collection by forcing it
        //System.gc();

        /*
        NOTE: In Java, you cannot directly force the garbage collection of specific objects or keys, including
        weakly referenced keys in a WeakHashMap. Garbage collection is managed by the Java Virtual Machine (JVM),
        and while you can suggest garbage collection using System.gc(), there's no guarantee that it will result in
        immediate garbage collection of specific objects.
         */

        //However, you get the jizz. In order to be garbage collected, you need to turn the linked value of the key to
        // NULL, and this process still doesn't ensure fully that it would do so.


        client_listings.replace("Andres", 23000.00, null);
        client_listings.replace("Pedro", 90000.00, null);

        System.out.println(client_listings);
        System.gc();
        System.out.println(client_listings);

        //Update: it didn't :D



        // * EnumMap

        EnumMap<PeriodicTable, Double> substancePercentages = new EnumMap<PeriodicTable, Double>(PeriodicTable.class);

        substancePercentages.put(PeriodicTable.OXYGEN, 21.0);
        substancePercentages.put(PeriodicTable.NITROGEN, 79.0);

        System.out.println(substancePercentages);

        //keyset = prints only keys
        System.out.println(substancePercentages.keySet());

        //vaues = prints only values of the keys
        System.out.println(substancePercentages.values());

        // entryset = same sht as printing the table itself
        System.out.println(substancePercentages.entrySet());



        // --> Interfaces:

        // # SortedMap

        /*
        Advantages:
        - Sorted Order
        - Search Performance
        - Predictable Iteration Order

        Methods:
        comparator() = returns a comparator that can be used to order keys in a map
        firstKey()
        lastKey()
        headMap(key) = returns all the entries of a map whose keys are less than the specified key
        tailMap(key) = returns all the entries of a map whose keys are greater than or equal to specified key
        subMap(key1, key2) = returns all the entries of a map whose keys lies in between key1 and key2 including key1

         */

        SortedMap<String, Integer> groceryProducts = new TreeMap<String, Integer>();

        groceryProducts.put("Milk", 1);
        groceryProducts.put("Cookies", 2);
        groceryProducts.put("Carrot", 3);
        groceryProducts.put("Bread", 4);

        System.out.println(groceryProducts.firstKey());
        System.out.println(groceryProducts.lastKey());
        System.out.println(groceryProducts.headMap("Cookies"));
        System.out.println(groceryProducts.tailMap("Cookies"));

        //You need to ensure that the starting key is less than the ending key
        System.out.println(groceryProducts.subMap("Carrot", "Milk"));

        /*
        To fix this, you need to ensure that the starting key is less than the ending key. In your example,
        "Milk" comes alphabetically before "Carrot", so the correct range for the subMap method would be from
        "Milk" to "Cookies" or from "Milk" to "Carrot".
         */


        // # NavigableMap

        /*
        Can be easily accessed and traversed in their ascending or descending key order

        Methods:
        ceilingEntry(K key) = returns a key-value mapping associated with the least key which is greater than or equal
        to the specified key

        ceilingKey(K key) = returns the least key which is greater than or equal to the specified key
        descendingKeySet() = returns the reverse order of the mapping
        descendingMap()
        firstEntry() = returns key-value mapping associated with the least key in the given map
         */

        System.out.println("\n");

        NavigableMap<String, Integer> numbers = new TreeMap<String, Integer>();

        numbers.put("One",1);
        numbers.put("Three",3);
        numbers.put("Two",2);

        System.out.println(numbers);
        System.out.println(numbers.ceilingEntry("One"));
        System.out.println(numbers.ceilingKey("One"));
        System.out.println(numbers.descendingKeySet());
        System.out.println(numbers.descendingMap());
        System.out.println(numbers.firstEntry());




        //--> Implementations

        // - Treemap

        TreeMap<Integer, Character> roomNumbers = new TreeMap<>();

        roomNumbers.put(24, 'b');
        roomNumbers.put(95, 'c');
        roomNumbers.put(11, 'a');
        roomNumbers.put(5, 'z');

        //here it wont be added
        roomNumbers.putIfAbsent(95, 'c');

        //here it would be added
        roomNumbers.putIfAbsent(69, 'd');


        System.out.println(roomNumbers);


//**********************************************************************************************************************
        // Set Interface

        /*
        - From the Java Collections Framework
        - Doesn't allow any duplicate items (even if you add duplicates)
        - Has no order of a list, or in any relation to an index


        What is it used for, or when is it applied in ?
        Whenever you want a collection of items and you don't want any duplicates and you don't particularly care
        in what order they're in

        Syntax = it is equal to using LinkedLists

        Special Methods:
        addAll() = allows you to get any collection and add all of its elements to another collection.
        How ?

        Set<WRAPPER_CLASS> NAME_OF_COLLECTION = new HashSet<>(OTHER_COLLECTION_TO_SET)

        Implementations:

        (Principle)

        - HashSet = best preformance time inserting or retrieving, but with no ordering

        - LinkedHashSet = slower, but keeps insertion ordering

        - TreeSet = much slower, but the elements put into this set will be in their natural ordering


        (Others)

        - EnumSet
        - SortedHashSet
        - NavigableHash






         */


        //Hashet
        Set<String> groceries = new HashSet<>();

        groceries.add("Potato");
        groceries.add("Salt");
        groceries.add("Bread");
        groceries.add("Butter");
        groceries.add("Apple");

        //Now lets try to add a few of the same items
        groceries.add("Salt");
        groceries.add("Butter");

        System.out.println("HashSet List: "+groceries);


        //LinkedHashet
        Set<String> ordered_groceries = new LinkedHashSet<>(groceries);

        System.out.println("LinkedHashSet List: "+ordered_groceries);

        //HashMap

        Set<String> nat_ord_groceries = new TreeSet<>(groceries);

        System.out.println("TreeSet List: "+nat_ord_groceries);


        //Here's another example in how you can first create a List and then add it to a Set

        List<Integer> rep_numbers = new LinkedList<>();

        rep_numbers.add(3);
        rep_numbers.add(2);
        rep_numbers.add(1);
        rep_numbers.add(2);
        rep_numbers.add(3);
        rep_numbers.add(2);

        System.out.println("List before adding to a Set: "+rep_numbers);

        Set<Integer> unrep_numbers = new HashSet<>(rep_numbers);

        System.out.println("List after adding to a Set: " + unrep_numbers);










    }
}