package HerenciaPolimorfismo;

public class Main {
    public static void main(String[] args) {
        SmartDevice smartDevice;

        smartDevice = new SmartPhone("2023",231,true,true,"OS Android", "Xiaomi"
        ,true,true, 5000.4,"Xiaomi charger", true);

        System.out.println(smartDevice + "\n");

        smartDevice = new SmartWatch("2022",234,true, true, "Wear OS"
        , "Xiaomi", true, false, true);

        System.out.println(smartDevice);

    }
}