package Interface_Ex;

public class Demigod implements Flying, Spells{

    @Override
    public void glide() {
        System.out.println("*The demigod glides fast*");

    }

    @Override
    public void spread_wings() {

        System.out.println("Demigod has large wings");


    }

    @Override
    public void go_up() {
        System.out.println("*Demigod goes up really fast");

    }

    @Override
    public void healing() {
        System.out.println("*Demigod heals with gold*");

    }

    @Override
    public void fireball() {
        System.out.println("*Demigod thows fireball*");

    }

    @Override
    public void lightning() {

        System.out.println("* Demigod throws lightning*");

    }
}
