public class Magic extends Hero{
    public Magic(int heroHealth, int heroDamage, String heroUltimate) {
        super(heroHealth, heroDamage, heroUltimate);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("MAGIC применил способность FIRE BLAST!!!");
    }
}
