public class Animal implements AnimalInterface {
    private int  animalDistanceRun, animalDistanceSwim;
    Animal(int animalDistanceRun, int animalDistanceSwim) {
        this.animalDistanceRun = animalDistanceRun;
        this.animalDistanceSwim = animalDistanceSwim;
    }

    @Override
    public boolean run(int value) {
        return animalDistanceRun >= value;
    }



    @Override
    public boolean swim(int value) {
        return animalDistanceSwim >= value;
    }

    double getAnimalDistanceRun() {
        return animalDistanceRun;
    }



    double getAnimalDistanceSwim() {
        return animalDistanceSwim;
    }
}