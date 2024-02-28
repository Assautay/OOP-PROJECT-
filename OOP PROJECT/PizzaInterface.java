import java.util.List;

public interface PizzaInterface {
    Pizza addNewPizza(Pizza pizza);
    void deletePizza(Pizza pizza);
    Pizza updatePrice(Pizza pizza, double newPrice);
    List<Pizza> getAllPizzas();
    Pizza orderNewPizza(Pizza pizza, Customer customer);
    Pizza getPizzaByName(String pizzaName)throws PizzaNotFoundException;
    Pizza getPizzaById(int pizzaId) throws PizzaNotFoundException;
    Pizza getPizzaBySize(String pizzaSize)throws PizzaNotFoundException;
}
