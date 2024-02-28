import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<Order> orders;
    private Address address;
    private long mobile;
    private String email;
    private String customerName;
    private int customerId;

    public Customer(int customerId, String customerName, String email, long mobile, Address address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        orders = new ArrayList<>();
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    /* TODO--------GET-&&-SET----------------*/
    public List<Order> getOrders() {
        return orders;
    }
    public Address getAddress() {
        return address;
    }
    public long getMobile() {
        return mobile;
    }
    public String getEmail() {
        return email;
    }
    public String getCustomerName() {
        return customerName;
    }
    public int getCustomerId() {
        return customerId;
    }
    public double getPayableAmount() {
        double payableAmount = 0;
        for(Order orderObj : orders) {
            payableAmount += orderObj.getPayableBillAmount();
        }

        return payableAmount;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }





    @Override
    public String toString() {
        return "Customer ----> " +
                "Name = " + customerName +
                ", ID = " + customerId +
                ", Email = " + email +
                ", Mobile = " + mobile + "\n" +
                "Address = " + address;
    }
}
