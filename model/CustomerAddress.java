package model;

public class CustomerAddress {
    
    //Enum Address Type
    public enum AddressType {
        RESIDELTIAL,
        DELIVERY,
        WORK
    }
    
    private String city;
    private String state;
    private String zipCode;
    private String address;
    private String complement;
    private String neighborhood;
    private String addressNumber;
    private AddressType type;

    //This method constructor.
    public CustomerAddress(String city, String state, String zipCode, String address, String complement, String neighborhood,
            String addressNumber, AddressType type) {
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.address = address;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.addressNumber = addressNumber;
        this.type = type;
    }

    
    //Getters And Setters.
    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}

    public String getState() {return state;}
    public void setState(String state) {this.state = state;}

    public String getZipCode() {return zipCode;}
    public void setZipCode(String zipCode) {this.zipCode = zipCode;}

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public String getComplement() {return complement;}
    public void setComplement(String complement) {this.complement = complement;}

    public String getNeighborhood() {return neighborhood;}
    public void setNeighborhood(String neighborhood) {this.neighborhood = neighborhood;}

    public String getAddressNumber() {return addressNumber;}
    public void setAddressNumber(String addressNumber) {this.addressNumber = addressNumber;}

    public AddressType getType() {return type;}
    public void setType(AddressType type) {this.type = type;} 
}
