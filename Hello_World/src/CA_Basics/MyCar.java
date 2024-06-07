package CA_Basics;
//Packages are equal to folders, where they organize classes (equal to files) as you desire

/*
 Remember:
     Package = folder
     Class = file

 */


//Constructor:
public class MyCar{

     //Instance Fields:
     public int year = 1995;
     public String brand;

     /*
     This class has a default constructor that we haven't assigned.
     If we didn't set any value to our fields, then the value 'year' will be Null

     If we only use these fields to assign the attributes of our object, we will never really create or customize every object
     'uniquely', instead, they'll all be clones with the same assigned values or no values at all (being NUll)

     To give assigned values from the user to its object, which is the whole purpose of OOP, we should build a constructor that assigns
     fields to its parameters

     Parameters are the fields inside the constructor

      */
}

/*
Every public class needs a constructor, which forces the name of the Public Name()
to be the same as the file of the class

 */



