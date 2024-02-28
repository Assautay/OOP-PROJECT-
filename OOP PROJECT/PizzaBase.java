public class PizzaBase {
    private String description;
    private String baseType;
    private String baseName;

    public PizzaBase(String description, String baseType, String baseName) {
        this.description = description;
        this.baseType = baseType;
        this.baseName = baseName;
    }

    /* TODO--------GET-&&-SET-------------*/

    public String getDescription() {
        return description;
    }
    public String getBaseType() {
        return baseType;
    }
    public String getBaseName() {
        return baseName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }
    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    @Override
    public String toString() {
        return "PizzaBase ----> " +
                "Name = " + getBaseName() +
                ", Type = " + getBaseType() +
                ", Description = " + getDescription();

    }
}
