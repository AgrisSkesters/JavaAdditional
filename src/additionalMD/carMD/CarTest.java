package additionalMD.carMD;

public class CarTest {
    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.setManufacturer("BMW");
        newCar.setColor("Black");
        newCar.setYear(2006);

        String specifiedManufacturer = newCar.getManufacturer();
        String specifiedColor = newCar.getColor();
        int specifiedYear = newCar.getYear();

        System.out.println("Your car is " + specifiedManufacturer + "\nIt is color is " + specifiedColor + "\nIt is made in " + specifiedYear );
    }
}
