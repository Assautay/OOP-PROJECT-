public class Topping {
    private String description;
    private String spiceLevel;
    private String toppingName;

    public Topping(String description, String spiceLevel, String toppingName) {
        this.description = description;
        this.spiceLevel = spiceLevel;
        this.toppingName = toppingName;
    }

    /* TODO--------GET-&&-SET-------------*/

    public String getDescription() {
        return description;
    }
    public String getToppingName() {
        return toppingName;
    }
    public String getSpiceLevel() {
        return spiceLevel;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void setSpiceLevel(String spiceLevel) {
        this.spiceLevel = spiceLevel;
    }



    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    @Override
    public String toString() {
        return "Topping ----> " +
                "Name = " + toppingName +
                ", SpiceLevel = " + spiceLevel +
                ", Description = " + description;
    }
}

