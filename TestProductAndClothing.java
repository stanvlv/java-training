public class TestProductAndClothing {

    public static void main(String[] args) {
        Product product = new Product("Shrit", "Blue", 29.99);
        Clothing clothing = new Clothing("Shirt", "Blue", 29.99, 42, "Cotton");

        // toString and getPriceWithTax
        System.out.println("The product: " + product);
        System.out.println("The product with tax: " + product.getPriceWithTax());

        System.out.println("Clothing: " + clothing);
        System.out.println("Clothing with tax: " + clothing.getPriceWithTax());
    }
}
