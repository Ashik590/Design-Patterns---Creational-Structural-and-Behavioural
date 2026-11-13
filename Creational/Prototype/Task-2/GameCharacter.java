public abstract class GameCharacter {
    private String name, health, weapon, armor, skillSet, animationProfile;
    private String type;

    public GameCharacter(String name, String health, String type) {
        this.name = name;
        this.health = health;
        this.type = type;
    }

    public void displayCharacterInfo() {
        System.out.println("Name = " + name);
        System.out.println("Health = " + health);
        System.out.println("Type = " + type);

    }

    public GameCharacter(GameCharacter template) {
        this(template.name, template.health, template.type);
    }

    public abstract GameCharacter clone();

    public void setType(String type) {
        this.type = type;
    }
}
