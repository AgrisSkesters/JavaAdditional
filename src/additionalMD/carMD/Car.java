package additionalMD.carMD;

import java.awt.*;   //unused import - remove

//do not use latvian acronyms and capital letter in package name
//move your homework to packages like homework3, homework4 etc.
public class Car {
    public String color;
    public String manufacturer;
    public int year;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {return this.manufacturer;}

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    }
