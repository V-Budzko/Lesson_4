import java.util.Scanner;

public class Park {
    public static Scanner ob = new Scanner(System.in);
    public info info;
    public String park;

    public Park() {
        System.out.print("Введите название парка: ");
        setPark(ob.next());
        info = new info();
    }

    public String getPark() {
        return park;
    }

    public void setPark(String park) {
        this.park = park;
    }

    public class info {
        int atr, time;
        float coast;

        public info() {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите количество атракционов: ");
            atr = in.nextInt();

            System.out.print("Введите стоимость абонемента на одно посещение: ");
            coast = in.nextFloat();

            System.out.print("Введите время работы парка: ");
            time = in.nextInt();
            in.close();

        }

        public int getAtr() {
            return atr;
        }


        public int getTime() {
            return time;
        }


        public float getCoast() {
            return coast;
        }


        public void print() {
            System.out.print("В парке " + getPark() + " " + getAtr() + " атракционов." + " Время работы парка: " + getTime() + " часов" + ". Cтоимость абонемента на одно посещение " + getCoast() + " рублей");
        }
    }

    static public void main(String[] args) {
        Park park = new Park();
        park.info.print();
    }
}