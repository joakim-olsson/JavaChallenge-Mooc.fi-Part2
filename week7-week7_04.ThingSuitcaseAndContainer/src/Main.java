
public class Main {

    public static void main(String[] args) {

    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 1; i <= 100; i++) {
            Thing thing = new Thing("Brick", i);
            Suitcase suitcase = new Suitcase(i + 1);

            suitcase.addThing(thing);
            container.addSuitcase(suitcase);
        }
    }
}