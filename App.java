import monpackage.Test;

public class App{
    public static void main(String[] args){
        Test ts = new Test("voici mon test");
        System.out.println(ts);
        // affiche thread, espace alloué à var: Test@2f92e0f4
    }
}