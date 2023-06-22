public class Warrior extends Hero{

    public Warrior(int heroHealth, int heroDamage, String heroUltimate) {
        super(heroHealth, heroDamage, heroUltimate);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("WARRIOR применил способность CRITICAL DAMAGE!!!");
    }
}
