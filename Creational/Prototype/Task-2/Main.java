public class Main {
    public static void main(String[] args) {
        Archer archer = new Archer("archer 1", "90", "NPC");

        // archer.displayCharacterInfo();

        CharacterFactory cf = new CharacterFactory();

        Archer cloneArcher = (Archer) cf.createBoss(archer);

        cloneArcher.displayCharacterInfo();
    }
}
