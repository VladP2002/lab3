import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setProductsMadeInFirstYear(100);
        product1.setProductsSoldInFirstYear(80);
        product1.setProductsMadeInSecondYear(90);
        product1.setProductsSoldInSecondYear(90);

        Product product2 = new Product();
        product2.setProductsMadeInFirstYear(150);
        product2.setProductsSoldInFirstYear(80);
        product2.setProductsMadeInSecondYear(190);
        product2.setProductsSoldInSecondYear(120);

        Product product3 = new Product();
        product3.setProductsMadeInFirstYear(230);
        product3.setProductsSoldInFirstYear(80);
        product3.setProductsMadeInSecondYear(80);
        product3.setProductsSoldInSecondYear(10);

        double[] productList = {product1.calculateDemand(), product2.calculateDemand(), product3.calculateDemand()};
        Arrays.sort(productList);
        System.out.println("\nThe sorted array of products by demand is: ");
        for (double productDemand : productList) {
            System.out.print(productDemand + " ");
        }
    }
}