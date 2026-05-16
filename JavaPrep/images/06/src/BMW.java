public class BMW {

    public static void main(String[] args) {
        System.out.println("BMW is a German automobile manufacturer known for producing luxury vehicles and motorcycles.");

        Car electricCar = new ElectricCar("BMW i3 ok!");
        System.out.println("Driving this cool electric car: " + electricCar.getCarType() + "\n");

        electricCar.speedUp();
        electricCar.slowDown();
    }
}
