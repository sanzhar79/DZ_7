public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic(100, 15, "Fire blast");
        heroes[1] = new Medic(150, 0, "Blessing of the priests");
        heroes[2] = new Warrior(255, 33, "Critical damage");
        for (Hero hero : heroes) {
            hero.applySuperAbility();
        }

    }
}