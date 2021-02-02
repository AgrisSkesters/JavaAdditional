package additionalMD.productMD;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;
    private double priceWithDiscount;

    public void setName (String name) { this.name = name; }
    public void setRegularPrice (double regularPrice) { this.regularPrice = regularPrice; }
    public double getRegularPrice () { return regularPrice; }
    public void setDiscount (double discount) { this.discount = discount; }
    public double getDiscount () { return discount; }
    public void setPriceWithDiscount (double priceWithDiscount) { this.priceWithDiscount = priceWithDiscount;}

    public double calculateActualPrice (double regularPrice, double discount) {
        double priceWithDiscount = regularPrice - (regularPrice * discount % 100);
        return priceWithDiscount;
    }

    public void printInformation () {
        System.out.println("Product: name = "+name+", regular price = "+regularPrice+" EUR, discount = "+discount+"%, actual price = "+priceWithDiscount+" EUR");
    }

}
