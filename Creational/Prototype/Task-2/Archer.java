public class Archer extends GameCharacter {

    public Archer(String name, String health, String type) {
        super(name, health, type);
    }

    public Archer(Archer template) {
        super(template);
    }

    @Override
    public Archer clone() {
        return new Archer(this);
    }
}
