import static java.lang.Math.abs;
import static java.lang.Math.floor;

public class Product {
    private int productsMadeInFirstYear;

    private int productsSoldInFirstYear;

    private int productsMadeInSecondYear;

    private int productsSoldInSecondYear;


    public int getProductsMadeInFirstYear() {
        return productsMadeInFirstYear;
    }

    public void setProductsMadeInFirstYear(int productsMadeInFirstYear) {
        this.productsMadeInFirstYear = productsMadeInFirstYear;
    }

    public int getProductsSoldInFirstYear() {
        return productsSoldInFirstYear;
    }

    public void setProductsSoldInFirstYear(int productsSoldInFirstYear) {
        productsSoldInFirstYear = productsSoldInFirstYear;
    }

    public int getProductsMadeInSecondYear() {
        return productsMadeInSecondYear;
    }

    public void setProductsMadeInSecondYear(int productsMadeInSecondYear) {
        this.productsMadeInSecondYear = productsMadeInSecondYear;
    }

    public int getProductsSoldInSecondYear() {
        return productsSoldInSecondYear;
    }

    public void setProductsSoldInSecondYear(int productsSoldInSecondYear) {
        this.productsSoldInSecondYear = productsSoldInSecondYear;
    }

    /**
     * \calculates the demand in the 1st year
     * converting the int values in double
     *
     * @return the demand in the 1st year
     */
    public double demandInFirstYear() {
        double firstYearMade = this.productsMadeInFirstYear;
        double firstYearSold = this.productsSoldInFirstYear;
        return firstYearSold / firstYearMade;
    }

    /**
     * \calculates the demand in the 2nd year
     * converting the int values in double
     *
     * @return the demand in the 2nd year
     */
    public double demandInSecondYear() {
        //calculates the demand in the 2nd year
        //converting the int values in double
        double secondYearMade = this.productsMadeInSecondYear;
        double secondYearSold = this.productsSoldInSecondYear;
        return secondYearSold / secondYearMade;
    }

    /**
     * calculates the demand
     */
    public double calculateDemand() {
        return this.demandInSecondYear() - this.demandInFirstYear();
    }

    /**
     * compares the demands from both years
     *
     * @return a, if the demand is increasing
     * b, if the demand is stagnating
     * c, if the demand is decreasing
     */
    public char compareDemand() {
        double comparison = this.calculateDemand();
        if (comparison < 0) {
            return 'a';
        } else if (0.00 == comparison || comparison < 0.10) {
            return 'b';
        } else {
            return 'c';
        }
    }

    /**
     * calculates the optimal number of products to be made in the next year based on demand grow
     * uses the method compareDemand() to decide which formula should be used
     */
    public int optimalProduction() {
        int nextYearProducts = 0;
        if (this.compareDemand() == 'a') {
            nextYearProducts = (int) (floor(this.productsSoldInSecondYear * 1.50) + 1);
        } else if (this.compareDemand() == 'b') {
            nextYearProducts = (int) (floor(this.productsSoldInSecondYear * 1.10) + 1);
        } else {
            nextYearProducts = (int) (floor(this.productsSoldInSecondYear * 0.9) + 1);
        }
        return nextYearProducts;
    }
}
