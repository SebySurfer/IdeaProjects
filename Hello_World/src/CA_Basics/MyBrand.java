package CA_Basics;


//The class is the template or blueprint for creating a new object
public class MyBrand{

    //The following are Instance Fields:
    public String compName;
    public String cityName;
    public int yearR;
    public double netW;

    //The following are parameters (Assigned values inside the constructor)
    public MyBrand(String name, String city, int year, double net){
        compName = name;
        cityName = city;
        yearR = year;
        netW = net;

    }

}

/*

A constructor is a method that builds every new object, called instances.
An instance of a class refers to an object that is created based on the blueprint

Constructors are almost similar to methods except for two things -
its name is the same as the class name, and it has no return type.
Sometimes constructors are also referred to as special methods to initialize an object.

--> Common confusion:

You  CANNOT create a class as a method, both a class "file" and a method "function"
are two separate things. We can't literally have our class file as a method,
we create one within it with the same name, being a constructor.

Ex:
---------------
--> Wrong:

public class CA_Basics (String compName, String cityName){
}
File name ≠ class "CA_Basics"(arg)
(The file name itself cannot have arguments, it's literally the NAME of the file)

---------------
--> Right:

public class CA_Basics{

(We first declare the attributes, or the blueprint of the object that we're going to use)

String compName
String cityName

(Then we create a method, a special one that is named or referred to as a constructor, where it allows us to finally
add variables to our class/object/blueprint, creating an instance or object from that blueprint)

public CA_Basics(String comp, String city){
compName = comp;
cityName = city;

}
---------------

If we want to have the same Field and Parameter name, theres a function we can use:

public class CA_Basics{
String comp
String city

public CA_Basics(String comp, String city){
this.comp = comp;
this.city = city;

--> Where "this" refers to the variable made for the fields of the object.
(Take THIS name field and equal it to that variable that has the same name)

 */
