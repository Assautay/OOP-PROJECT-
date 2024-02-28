public class Pizza {
    private PizzaBase pizzaBase;
    private Topping topping;
    private String size;
    private double price;
    private String pizzaName;
    private int pizzaId;

    public Pizza(PizzaBase pizzaBase, Topping topping, String size, double price, String pizzaName, int pizzaId) {
        this.pizzaBase = pizzaBase;
        this.topping = topping;
        this.size = size;
        this.price = price;
        this.pizzaName = pizzaName;
        this.pizzaId = pizzaId;
    }

    /* TODO--------GET-&&-SET----------------*/

    public PizzaBase getPizzaBase() {
        return pizzaBase;
    }

    public Topping getTopping() {
        return topping;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public int getPizzaId() {
        return pizzaId;
    }

    public void setPizzaBase(PizzaBase pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public void setPizzaId(int pizzaId) {
        this.pizzaId = pizzaId;
    }

    @Override
    public String toString() {
        return "Pizza ----> " + "ID = " + getPizzaId() +
                ",PizzaName = " + getPizzaName() +
                ",Price = " + getPrice() +
                ",Size = " + getSize() + "\n"
                + "" + getTopping() + "\n"
                + "" + getPizzaBase() + "\n";

    }
}
