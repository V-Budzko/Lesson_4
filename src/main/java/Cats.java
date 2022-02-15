public class Cats {
    private final String name;
    private final int appetite;
    private boolean satiety;

    String getName() {
        return name;
    }

    int getAppetite() {
        return appetite;
    }



    boolean getSatiety() {
        return satiety;
    }

    void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    Cats(String name, int appetite, boolean satiety) {

        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    void eat(Plate p) {
        p.decreaseFood(appetite);
        satiety = true ;
    }

}