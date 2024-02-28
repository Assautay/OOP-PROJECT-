import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Pizza> pizzas;
    private String orderDescription;
    private double payableBillAmount;
    private String orderDate;
    private int orderId;

    public Order( String orderDescription, double payableBillAmount, String orderDate, int orderId) {
        this.orderDescription = orderDescription;
        this.payableBillAmount = payableBillAmount;
        this.orderDate = orderDate;
        this.orderId = orderId;
        pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    /* TODO--------GET-&&-SET-------------*/
    public List<Pizza> getPizzas() {
        return pizzas;
    }public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public String getOrderDescription() {
        return orderDescription;
    }public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public double getPayableBillAmount() {
        return payableBillAmount;
    }public void setPayableBillAmount(double payableBillAmount) {
        this.payableBillAmount = payableBillAmount;
    }

    public String getOrderDate() {
        return orderDate;
    }public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    @Override
    public String toString() {
        return "Order ----> [" +
                "ID = " + orderId +
                ", Date = " + orderDate +
                ", Description = '" + orderDescription + '\'' +
                ", Payable Bill Amount = " + payableBillAmount + "\n" +
                "Pizzas = " + pizzas+"]\n";
    }
}
