import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cars> cars = new ArrayList<Cars>();
        cars.add(new Cars(true,false,120,
                "Q7",1992,"BMW",true,12));
        cars.add(new Cars(false,true,455,
                "e-tron",2019,"Audi",false,0));
        cars.add(new Cars(true,true,298,
                "i3",2019,"BMW",true,2));
        cars.add(new Cars(false,false,143,
                "Spark EV",2013,"Chevrolet",true,3));
        cars.add(new Cars(true,true,320,
                "C-Zero",2014,"Citroen",true,0));
        cars.add(new Cars(false,true,415,
                "Focus Electric",2011,"Ford",false,4));
        cars.add(new Cars(false,false,110,
                "a4",2008,"Audi",false,2));
        cars.add(new Cars(true,false,400,
                "Fit Ev",2014,"Honda",true,0));
        cars.add(new Cars(false,true,310,
                "Konda Electric",2017,"Hyundai",false,9));
        cars.add(new Cars(false,true,399,
                "Buddy",2019,"Kewet",true,2));

    }

    public static void printCars(ArrayList<Cars> cars){
        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }

    public static void printCarsHasFastCharging(ArrayList<Cars> cars){
        System.out.println("\nCars that have fast charging: ");
        for (int i = 0; i < cars.size(); i++){
            if (cars.get(i).isFastCharging()== true){
                System.out.println(cars.get(i));
            }
        }
    }

    public static void printCarsInStock(ArrayList<Cars> cars){
        System.out.println("\nCars that are in stock: ");
        for (int i = 0; i <cars.size(); i++){
            if (cars.get(i).isInStock() == true){
                System.out.println(cars.get(i));
            }
        }
    }
}
