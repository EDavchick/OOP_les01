public class Main {
    public static void main(String[] args) {
        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine();
        machine.addProduct(new BottleOfWater("Water01", 100, 5));
        machine.addProduct(new BottleOfWater("Water02", 10, 0.5));
        machine.addProduct(new BottleOfWater("Water03", 1, 1));
        machine.addProduct(new BottleOfWater("Water04", 1000, 50));
//        printProductByName(machine, "Water01"); // BottleOfWater{name='Water01', cost=100.0'volume=5.0}

        /* В main проинициализировать несколько ГорячихНапитков и
        ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе */
        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine();
        hotDrinkVendingMachine.addProduct(new HotDrink("Cappuccino", 300, 200, 60));
        hotDrinkVendingMachine.addProduct(new HotDrink("Espresso", 200, 100, 90));
//        hotDrinkVendingMachine.addProduct(new HotDrink("Latte", 500, 350, 70));

        printProductByName(hotDrinkVendingMachine, "Cappuccino");
//        // HotDrink{name='Cappuccino', cost=300.0'volume=200.0'temperature=60}
        printProductByName(hotDrinkVendingMachine, "Espresso");
////        HotDrink{name='Espresso', cost=200.0'volume=100.0'temperature=90}
//        printProductByName(hotDrinkVendingMachine, "Latte");
////        HotDrink{name='Latte', cost=500.0'volume=350.0'temperature=70}

        hotDrinkVendingMachine.getHotProduct("Latte", 350, 70);

    }

    public static void printProductByName(VendingMachine vendingMachine,
                                          String name){
        System.out.println(vendingMachine.getProduct(name));
    }
    public static void printHotDrink(HotDrinkVendingMachine hotDrink,
                                          String name, double volume, int temperature){
        System.out.println(hotDrink.getHotProduct(name, volume, temperature));
    }
}
