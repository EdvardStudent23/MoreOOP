package lotr;
import java.util.Random;

public class CharacterFactory {
    public Character createCharacter() {
        // Class<? extends Character> character = {Hobbit.class, King.class, Knigt.class, Elf.class};
        Character characters[] ={new Hobbit(), new King(), new Knight(), new Elf()};
        return characters[new Random().nextInt(characters.length)];
    }
}
