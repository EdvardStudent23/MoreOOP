package lotr;

public class Elf extends Character{
    public Elf() {
        super(10,10);
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            c.setHp(0);
        } else {
            int newPower = c.getPower() - 1;
            c.setPower(Math.max(newPower, 0));
        }
    }
}

