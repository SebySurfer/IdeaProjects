package CA_Basics;

public class MyRemoteTV {

    private String name;
    private int volume;

    private int bright;

    private static boolean isOn = false;

    private static int hdmi = 1;

    public MyRemoteTV(){
        this.volume = 30;
        this.bright = 10;
    }

    /*
    Why doesn't it create an error if i have access by inputting its values initially when i just encapsulated it ?
    The constructor allows you to set its initial value when you create an object of MyRemoteTv.
    This way, you control how the object is initialized while keeping the variable private.
     */
    public MyRemoteTV(String name, int volume, int bright){
        this.name = name;
        this.volume = volume;
        this.bright = bright;

    }


    //Static methods doesn't use any object instances

    public static void giveDefaultInstructions(){
        System.out.println("Please stop fcn with the control ... or else");

        /*
        It will create an error if we try to put in variable instances because it doesn't use existing objects... its always static
         */
    }

    public static void islimitOfChannels(int x){

        if(x > 101){
            System.out.println("Yeah thats passing the limit");

        } else if (x > 0){
            System.out.println("Your good bro");
        } else {
            System.out.println("Bro ur having a frcn stroke, what kind of fcn number is that?");
        }
    }



    //Example of Setter
    public void setVolume(int v){
        this.volume = v;
    }

    //Example of Getter
    public int getVolume(){
        return this.volume;
    }

    public static int getHdmi() {
        return hdmi;
    }

    public static void setHdmi(int hdmi) {
        MyRemoteTV.hdmi = hdmi;
    }

    public static boolean isIsOn() {
        return isOn;
    }

    public static void setIsOn(boolean isOn) {
        MyRemoteTV.isOn = isOn;
    }

    public int getBright() {
        return bright;
    }

    public void setBright(int bright) {
        this.bright = bright;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
