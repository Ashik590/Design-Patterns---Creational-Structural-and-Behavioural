public class Warrior extends GameCharacter {     
    public void equipSword() {
        // ..
    }

    public void shieldBlock() {
        // ..
    }

    public Warrior(String name, String health, String type) {
        super(name, health, type);
    }

    public Warrior(Warrior template) {
        super(template);
    }

    @Override
    public Warrior clone() {
        return new Warrior(this);
    }
}
