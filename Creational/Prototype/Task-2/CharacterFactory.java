public class CharacterFactory {
    public GameCharacter createEnemy(GameCharacter template) {
        GameCharacter clone = template.clone();
        clone.setType("Enemy");
        return clone;
    }

    public GameCharacter createBoss(GameCharacter template) {
        GameCharacter clone = template.clone();
        clone.setType("Boss");
        return clone;
    }

    public GameCharacter spawnNPC(GameCharacter template) {
        GameCharacter clone = template.clone();
        clone.setType("NPC");
        return clone;
    }
}
