import java.util.List;

public class PizzaService implements PizzaInterface{
    private String pizzaNotFoundMessage;
    private PizzaStore pizzaStore;

    public PizzaService(String pizzaNotFoundMessage, PizzaStore pizzaStore) {
        this.pizzaNotFoundMessage = pizzaNotFoundMessage;
        this.pizzaStore = pizzaStore;
    }

    public Pizza addNewPizza(Pizza pizza){

        pizzaStore.addPizza(pizza);
        return pizza;
    }
    public void deletePizza(Pizza pizza){
        pizzaStore.deletePizza(pizza);
    }
    public Pizza updatePrice(Pizza pizza, double newPrice){
        List<Pizza> pizzaList = pizzaStore.getPizzas();
        for (Pizza p : pizzaList) {
            if(p == pizza){
                p.setPrice(newPrice);
                return p;
            }
        }
        return null;
    }
    public List<Pizza> getAllPizzas(){
        return pizzaStore.getPizzas();
    }


    public Pizza orderNewPizza(Pizza pizza, Customer customer){
        Order neworder = new Order("no",pizza.getPrice(),"01-03-2024",1);
        neworder.addPizza(pizza);
        customer.addOrder(neworder);
        pizzaStore.addCustomer(customer);

        return null;
    }


    public Pizza getPizzaByName(String pizzaName)throws PizzaNotFoundException{
        List<Pizza> pizzaList = pizzaStore.getPizzas();
        for (Pizza p : pizzaList) {
            if(p.getPizzaName().equals(pizzaName)){
                return p;
            }
        }
        throw new PizzaNotFoundException("pizza not found");
    }
    public Pizza getPizzaById(int pizzaId)throws PizzaNotFoundException{
        List<Pizza> pizzaList = pizzaStore.getPizzas();
        for (Pizza p : pizzaList) {
            if(p.getPizzaId() == pizzaId){
                return p;
            }
        }
        throw new PizzaNotFoundException("pizza not found");
    }

    public Pizza getPizzaBySize(String pizzaSize)throws PizzaNotFoundException{
        List<Pizza> pizzaList = pizzaStore.getPizzas();
        for (Pizza p : pizzaList) {
            if(p.getSize().equals(pizzaSize)){
                return p;
            }
        }
        throw new PizzaNotFoundException("pizza not found");
    }

    @Override
    public String toString() {
        return "PizzaService{" +
                "pizzaNotFoundMessage='" + pizzaNotFoundMessage + '\'' +
                ", pizzaStore=" + pizzaStore +
                '}';
    }
}


