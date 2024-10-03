package Tutorial;

public class SandWich {
    private String mainIngredient;
    private String breadType;
    private Double cost;

    public String getMainIngredient() {
        return mainIngredient;
    }
    public String getBreadType() {
        return breadType;
    }
    public double getCost() {
        return cost;
    }
    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }
    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }

}
