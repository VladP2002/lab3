import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setProductsMadeInFirstYear(100);
        product1.setProductsSoldInFirstYear(70);
        product1.setProductsMadeInSecondYear(90);
        product1.setProductsSoldInSecondYear(90);

        Product product2 = new Product();
        product2.setProductsMadeInFirstYear(150);
        product2.setProductsSoldInFirstYear(150);
        product2.setProductsMadeInSecondYear(190);
        product2.setProductsSoldInSecondYear(190);

        Product product3 = new Product();
        product3.setProductsMadeInFirstYear(230);
        product3.setProductsSoldInFirstYear(80);
        product3.setProductsMadeInSecondYear(80);
        product3.setProductsSoldInSecondYear(10);

        double[] productList = {product1.calculateDemand(), product2.calculateDemand(), product3.calculateDemand()};
        Arrays.sort(productList);
        System.out.println("\n(AUFGABE 1):The sorted array of products by demand is: ");
        for (double productDemand : productList) {
            System.out.print(productDemand + " ");
        }

        System.out.println("\n(AUFGABE 2) Printing the category of products by demand: \n");
        System.out.println(product1.compareDemand());
        System.out.println(product2.compareDemand());
        System.out.println(product3.compareDemand());


        System.out.println("\n(AUFGABE 3) Printing the optimal number of products for the next year: \n");
        System.out.println(product1.optimalProduction());
        System.out.println(product2.optimalProduction());
        System.out.println(product3.optimalProduction());
    }
}