package Interface_Ex;

public class Creature implements Flying{

    @Override
    public void glide() {
        System.out.println("*The creature glides to the air*");

    }

    @Override
    public void spread_wings() {
        System.out.println("*Creature spreads wings*");

    }

    @Override
    public void go_up() {
        System.out.println("*Creature goes up, slowly");

    }
}
