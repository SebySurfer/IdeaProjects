package Interface_Ex;

public class Human implements Armor, Spells{

    @Override
    public void shield() {

        System.out.println("*Human protects himself*");

    }

    @Override
    public void weight() {
        System.out.println("*Armor is heavy*");
    }

    @Override
    public void healing() {

        System.out.println("*Human is healing*");

    }

    @Override
    public void fireball() {

        System.out.println("*Human throws fireball*");

    }

    @Override
    public void lightning() {
        System.out.println("*Human, instead of throwing lightning, gets hit by it*");

    }
}
