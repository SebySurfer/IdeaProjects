public class My_Magic_The_Gathering {

    public static int Num_of_Cards;


    public static void getNumberOfCards(){
        //If this method weren't static, an instance would've needed to be created in order to use this method

        System.out.println("The number of cards created are: "+Num_of_Cards);

    }

      static class Creature{
        public String name;
        public int attack;
        public int health;
        public String ability;

        public Creature(String name, int attack, int health, String ability){
            this.name = name;
            this.attack = attack;
            this.health = health;
            this.ability = ability;

            Num_of_Cards++;


        }

        /*
        To avoid making a large example, but for good practices, it would've been better to have "getAbilities"
        for a general purpose than for just "Creatures". Instead, I just put it in Creatures because it's the only
        card type that we'll be making.
         */
        public void getAbilities(){
            switch (this.ability){
                case "Deathtouch":
                    Abilities.Deathtouch();
                    break;
                case "Defender":
                    Abilities.Defender();
                    break;
                case "Flying":
                    Abilities.Flying();
                    break;
                case "Reach":
                    Abilities.Reach();
                    break;
                case "Haste":
                    Abilities.Haste();
                    break;
                default:
                    System.out.println("No Abilities");
                    break;

            }
        }

    }
    static final class Abilities{
        public static void Deathtouch(){
            System.out.println("Deathtouch: Any amount of damage dealt by a source with deathtouch is enough " +
                    "to kill the creature receiving the damage, no matter how low the damage is.");
        }

        public static void Defender(){
            System.out.println("Defender: This creature cannot attack.");
        }

        public static void Flying(){
            System.out.println("Flying: Cannot be blocked except by other creatures with either flying or creatures " +
                    "with the static ability Reach.");
        }

        public static void Reach(){
            System.out.println("Reach: Reach is a static ability that means the affected creature can block " +
                    "creatures with flying.");

        }
            public static void Haste(){
            System.out.println("Haste: They can attack and use activated abilities with the tap symbol on the same " +
                    "turn they enter the battlefield.");
        }




    }



}
