public abstract class Hero implements HavingSuperAbility {
    private int heroHealth;
    private int heroDamage;

    public Hero(int heroHealth, int heroDamage, String heroUltimate) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }


}


