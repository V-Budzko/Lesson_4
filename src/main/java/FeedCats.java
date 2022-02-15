
public class FeedCats {

    public static void main(String[] args) {

        Cats[] cats = new Cats[4];
        cats[0] = new Cats("Барсик", 4, false);
        cats[1] = new Cats("Персик", 6, false);
        cats[2] = new Cats("Мурзик", 3, true);
        cats[3] = new Cats("Кошак", 5, false);
        Plate plate = new Plate(10);
        System.out.println("Существует четыре кота: " + cats[0].getName()+ ", " + cats[1].getName()+", " + cats[2].getName()+" и " +  cats[3].getName() +  " которые хотят есть");
        System.out.println("У кого-то аппетит сильнее, у кого-то слабее. Изначально в миске " + plate.getFood() + " единиц кошачьего корма. Отправляем котов есть.");


            for (Cats i : cats) {

                if (!i.getSatiety()) {

                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }

                    //кот ест
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " единиц кошачьего корма и статус его сытости -  "+ (i.getSatiety())+ ". В миске осталось " + plate.getFood() + " единиц кошачьего корма");
                } else System.out.println("Кот " + i.getName()+ " не голоден. Статус его сытости -  " + (i.getSatiety()));

            }




    }
}


