import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PizzaDashboard {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PizzaStore pizzaStore = new PizzaStore("Abylaikhan", "SduPizza", 1);
        PizzaInterface pizzaService = new PizzaService("Pizza not found", pizzaStore);



        while (true) {
            System.out.println("Enter your choice :");
            System.out.println("1) For ADMIN ");
            System.out.println("2) For CUSTOMER ");
            System.out.print("Enter: ");
            int n = 0;
            try {
                n = in.nextInt();

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter only 1 or 2.");
                in.nextLine();
            }

            if (n == 1) {
                openAdminRole(in, pizzaService);
            } else if (n == 2) {
                openCustomerRole(in, pizzaService);
            } else {
                System.out.println("Please enter only 1 or 2.");
            }
        }
    }

    static int pizzaId = 1;

    public static void openAdminRole(Scanner in, PizzaInterface pizzaService) {
        while (true) {
            in.nextLine();
            System.out.println("\nAll options!!!\n\n" +
                    "1) Add New Pizza\n" +
                    "2) Update Price\n" +
                    "3) Delete Pizza\n" +
                    "4) View All Pizza\n" +
                    "5) Search Pizza\n" +
                    "6) Exit\n");
            System.out.print("Enter your choice:");
            int n = 0;
            try {
                n = in.nextInt();
            } catch (Exception e) {

                System.out.println("Invalid input! Please enter correct option.");
                System.out.print("Press Enter:");
                in.nextLine();
            }
            in.nextLine();
            if (n == 1) {
                try {
                    System.out.println("Write information as: [Topping,spiceLevel,Description for topping]");
                    String informationtopping = in.nextLine();
                    String[] info = informationtopping.split(",");
                    System.out.println(info[0] + " " + info[1] + " " + info[2]);
                    Topping topping = new Topping(info[0], info[1], info[2]);

                    System.out.println("Write information as: [BaseName,type(thin/thick),Description for PizzaBase]");
                    String informationbase = in.nextLine();
                    info = informationbase.split(",");
                    System.out.println(info[0] + " " + info[1] + " " + info[2]);
                    PizzaBase pizzaBase = new PizzaBase(info[0], info[1], info[2]);

                    System.out.println("Write information as: [Pizza,Price,Size (small/meduim/large)]");
                    String informationPizza = in.nextLine();
                    info = informationPizza.split(",");
                    System.out.println(info[0] + " " + info[1] + " " + info[2]);
                    Pizza newpizza = new Pizza(pizzaBase, topping, info[2], Double.parseDouble(info[1]), info[0], pizzaId);

                    pizzaService.addNewPizza(newpizza);
                    System.out.println("Pizza added successful!!!\n");

                    System.out.println(newpizza);
                    in.nextLine();
                } catch (InputMismatchException m) {
                    System.out.println("Invalid input! Please enter an integer  next time.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter an correct price  next time.");

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid input! Please enter full information  next time.");

                }

            } else if (n == 2) {
                System.out.print("Enter PizzaName:");
                String pizzaname = in.nextLine();
                System.out.println();

                try {
                    Pizza pizza = pizzaService.getPizzaByName(pizzaname);
                    System.out.print("Enter your new Price: ");
                    double price = in.nextInt();
                    pizzaService.updatePrice(pizza, price);
                    System.out.println("Price of " + pizzaname + " changed to " + price + "  successful");
                } catch (PizzaNotFoundException e) {
                    System.out.println(e.getMessage());
                }

            } else if (n == 3) {
                System.out.print("Enter PizzaName:");
                String pizzaname = in.nextLine();
                System.out.println();
                try {
                    pizzaService.deletePizza(pizzaService.getPizzaByName(pizzaname));
                    System.out.println("Pizza " + pizzaname + " deleted successful");

                } catch (PizzaNotFoundException e) {
                    System.out.println(e.getMessage());
                }

            } else if (n == 4) {
                allPizzas(pizzaService);

            } else if (n == 5) {
                searchPizza(in, pizzaService);
                in.nextLine();
            } else if (n == 6) {
                System.out.println("\n");
                break;
            } else {
                System.out.println("Invalid input! Please enter between 1 and 6");
                System.out.print("Press Enter:");
            }


        }
    }

    static int customer_id = 0;

    public static void openCustomerRole(Scanner in, PizzaInterface pizzaService) {
        Customer customer;
        try {
            in.nextLine();
            System.out.println("\nEnter your [doorNumber, street, city, district, state]");
            String info = in.nextLine();
            String[] addressinfo = info.split(",");
            Address address = new Address(addressinfo[1], addressinfo[2],
                    addressinfo[3], addressinfo[4], Integer.parseInt(addressinfo[0]));

            System.out.println("Enter your Details as [name, email, mobile]");
            info = in.nextLine();
            String[] customerinfo = info.split(",");
            customer = new Customer(customer_id++, customerinfo[0], customerinfo[1], Long.parseLong(customerinfo[2]),
                    address);
            System.out.println("We added you as our New customer...\n" + customer);
        } catch (InputMismatchException m) {
            System.out.println("Invalid input! Please enter an integer next time.\n");
//        openCustomerRole(in,pizzaService);
            return;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter an correct information  next time.\n");
//          openCustomerRole(in,pizzaService);
            return;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input! Please enter full information  next time.\n");
//          openCustomerRole(in,pizzaService);
            return;

        }

        while (true) {
            in.nextLine();
            System.out.println("\nAll options!!!\n\n" +
                    "1) Place Order\n" +
                    "2) Pay Bill\n" +
                    "3) View All Pizza\n" +
                    "4) View Order History\n" +
                    "5) Search Pizza\n" +
                    "6) Exit\n");
            System.out.print("Enter your choice:");
            int n = 0;
            try {
                n = in.nextInt();
            } catch (Exception e) {

                System.out.println("Invalid input! Please enter correct option.");

            }

            if (n == 1) {
                System.out.println("Available pizzas!!!\n");
                allPizzas(pizzaService);
                in.nextLine();
                System.out.print("Enter your choice [Pizza Name]: ");
                String pizzaname = in.nextLine();
                try {
                    Pizza orderpizza = pizzaService.getPizzaByName(pizzaname);
                    System.out.println(orderpizza + "\n");
                    System.out.println("Your pizza placed successfully");
                    pizzaService.orderNewPizza(orderpizza, customer);
                } catch (PizzaNotFoundException e) {
                    System.out.println(e.getMessage());
                }

            } else if (n == 2) {
                System.out.println("\nCheck your order's Bill Amount\n");
                System.out.println("Your Payable Bill Amount for all your orders is : "
                        + customer.getPayableAmount() + " USD\n");
                in.nextLine();
            } else if (n == 3) {
                allPizzas(pizzaService);
            } else if (n == 4) {
                System.out.println("\nView your all orders\n");
                System.out.println("Your Orders : \n" + customer.getOrders() + "\n");

            } else if (n == 5) {
                searchPizza(in, pizzaService);
                in.nextLine();
            } else if (n == 6) {
                System.out.println("\n");
                break;
            } else {
                System.out.println("Invalid input! Please enter between 1 and 6");
                System.out.print("Press Enter:");
                in.nextLine();
            }


        }


    }

    public static void allPizzas(PizzaInterface pizzaservice) {
        List<Pizza> allPizzas = pizzaservice.getAllPizzas();
        for (int i = 1; i <= allPizzas.size(); i++) {
            System.out.println(i + ") " + allPizzas.get(i - 1));
        }
        if (allPizzas.isEmpty()) System.out.println("Pizzas doesn't exist!!!");

    }

    public static void searchPizza(Scanner in, PizzaInterface pizzaService) {
        System.out.println("All options\n");

        System.out.println("1) Search by name");
        System.out.println("2) Search by ID");
        System.out.println("3) Search by Size");
        System.out.print("Enter your option:");
        int index = 0;
        try {
            index = in.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter correct option.");
            in.nextLine();
        }
        try {
            if (index == 1) {
                System.out.print("Enter pizza name:");
                String pizzaname = in.nextLine();
                try {
                    Pizza pizza = pizzaService.getPizzaByName(pizzaname);
                    System.out.println(pizza);
                } catch (PizzaNotFoundException e) {
                    System.out.println(e.getMessage());
                }
//
            } else if (index == 2) {
                System.out.print("Enter pizza ID:");
                int pizzaID = in.nextInt();
                try {
                    Pizza pizza = pizzaService.getPizzaById(pizzaID);
                    System.out.println(pizza);
                } catch (PizzaNotFoundException e) {
                    System.out.println(e.getMessage());
                }
            } else if (index == 3) {
                in.nextLine();
                System.out.print("Enter pizza Size:");
                String size = in.nextLine();
                try {
                    Pizza pizza = pizzaService.getPizzaBySize(size);
                    System.out.println(pizza);
                } catch (PizzaNotFoundException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("\nEnter numbers between[1-3]");
            }


        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an correct information");
            System.out.println("Press enter:");
            in.nextLine();
        }


    }


}

