package additionalMD.productMD;

//move your homework to packages like homework3, homework4 etc.
public class ProductTest {
    public static void main(String[] args) {
        Product newProduct = new Product();
        newProduct.setName("Fish");
        newProduct.setRegularPrice(3.4);
        newProduct.setDiscount(30);
        newProduct.setPriceWithDiscount(newProduct.calculateActualPrice(newProduct.getDiscount(), newProduct.getRegularPrice()));

        newProduct.printInformation();
    }
}
