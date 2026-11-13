public class Mage extends GameCharacter {
    public void castSpell() {
        // ..
    }

    public void manaRecharge() {
        // ..
    }

    public Mage(String name, String health, String type) {
        super(name, health, type);
    }

    public Mage(Mage template) {
        super(template);
    }

    @Override
    public Mage clone() {
        return new Mage(this);
    }
}
