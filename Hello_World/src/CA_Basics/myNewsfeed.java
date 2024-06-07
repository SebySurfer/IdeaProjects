package CA_Basics;

import java.util.Arrays;

public class myNewsfeed {
    public String[] topics = {"Opinion", "Tech", "Science", "Health"};
    public int[] views = {0, 0, 0, 0};

    public myNewsfeed(){

    }

    /*
    Basically, as we reviewed before, an array acts the same way as a variable, same goes for when we declare a method

    We can get an input of an Array, and/or return an Array.

     */

    public String[] getTopics(){

        return topics;

        /*
        Because 'topics' is an array, we need a method with the same variable type, being 'String[]', or else it won't be compatible

        In other words, it's like having a method of type 'int' but you return a 'boolean', making no sense at all
         */

    }

    public String getTopTopic(){
        return topics[0];

    }

    public void viewTopic(int topicIndex){
        views[topicIndex] = views[topicIndex] + 1;

    }



}
