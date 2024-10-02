package lotr;

public class GameManager {
    public void fight(Character c1, Character c2){
        System.out.println("The fight starts. There are " + c1 + " and " + c2);

        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1 + " kicks " + c2);
            c1.kick(c2);
            if (!c2.isAlive()) {
                System.out.println(c1 + " killed " + c2);
                break;
            }

            c2.kick(c1);
            if (!c2.isAlive()) {
                System.out.println(c2 + " killed " + c1);
                break;
            }
        }
        System.out.println("The game finished");   
    }
}
