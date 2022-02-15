public class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    int getFood() {
        return food;
    }

    void decreaseFood(int n) {
        food -= n;
    }

    void increaseFood() {
        this.food += 10;
        System.out.println("В миску добавили 10 единиц кошачьего корма");
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }

}
