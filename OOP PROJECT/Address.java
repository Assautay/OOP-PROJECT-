public class Address {
    private String state;
    private String district;
    private String city;
    private String street;
    private int doorNumber;

    public Address(String state, String district, String city, String street, int doorNumber) {
        this.state = state;
        this.district = district;
        this.city = city;
        this.street = street;
        this.doorNumber = doorNumber;
    }


    /* TODO--------GET-&&-SET-------------*/
    public String getState() {
        return state;
    }
    public String getDistrict() {
        return district;
    }
    public String getCity() {
        return city;
    }
    public String getStreet() {
        return street;
    }
    public int getDoorNumber() {
        return doorNumber;
    }

    public void setState(String state) {
        this.state = state;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    @Override
    public String toString() {
        return "Address ----> " +
                "Door Number = " + doorNumber +
                ", Street = '" + street + '\'' +
                ", City = '" + city + '\'' +
                ", District = '" + district + '\'' +
                ", State = '" + state + '\'';
    }
}
