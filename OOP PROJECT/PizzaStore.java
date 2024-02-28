import java.util.ArrayList;
import java.util.List;

public class PizzaStore {
    private List<Customer> customers;
    private List<Pizza> pizzas;
    private String storeLocation;
    private String storeName;
    private int storeId;

    public PizzaStore( String storeLocation, String storeName, int storeId) {
        customers = new ArrayList<>();
        pizzas = new ArrayList<>();
        this.storeLocation = storeLocation;
        this.storeName = storeName;
        this.storeId = storeId;
    }


    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void deletePizza(Pizza pizza) {
        pizzas.remove(pizza);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    /* TODO--------GET-&&-SET-------------*/

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public String getStoreName() {
        return storeName;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }


    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }


    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }


    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }


    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }


    @Override
    public String toString() {
        return "PizzaStore{" +
                "customers=" + customers +
                ", pizzas=" + pizzas +
                ", storeLocation='" + storeLocation + '\'' +
                ", storeName='" + storeName + '\'' +
                ", storeId=" + storeId +
                '}';
    }
}
