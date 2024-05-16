package isp.lab4.exercise1;

/**
 * @author Radu Miron
 */
public enum ProductCategory {

    ELECTRONICS("Electronics & Gadgets"),
    FASHION("Fashion"),
    Home_and_garden("Home and garden"),
    Beauty("Beauty"),
    Toys("Toys");

    private String displayName;

    ProductCategory(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }

}
