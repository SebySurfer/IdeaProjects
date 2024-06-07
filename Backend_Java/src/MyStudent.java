import java.util.LinkedList;

public class MyStudent {
    public String name;
    public int age;
    public int grade;

    public LinkedList<Double> testScores;

    public String[] reportCards;

    public MyStudent(String name, int age, int grade, LinkedList<Double> testScores, String[] reportCards){

        this.name = name;
        this.age = age;
        this.grade = grade;
        this.testScores = testScores;
        this.reportCards = reportCards;


    }

    public double yourAv(LinkedList<Double> scores){

        double count = 0.0;

        for(Double i : scores){
            count = count + i;

        }

        double av = count / scores.size();

        return av;

    }

}
