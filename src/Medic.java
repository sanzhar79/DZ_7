public class Medic  extends Hero{


    public Medic(int heroHealth, int heroDamage, String heroUltimate) {
        super(heroHealth, heroDamage, heroUltimate);
    }


    @Override
    public void applySuperAbility() {
        System.out.println("MEDIC применил способность BLESSING OF THE PRIEST!!!");
    }
}
