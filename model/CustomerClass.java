package model;

import java.util.*;

public class CustomerClass extends Person{
    private List<CustomerAddress> Addresses;

    //This method Add address. Also validates the data entered.
    public void addAddress(CustomerAddress Address){
        
        //Validates if Address is Null.
        if (Address == null) {
            throw new NullPointerException("Address can't be Null");
        }        

        //Validates if Zip Code is Null.
        if (Address.getZipCode() == null) {
            throw new NullPointerException("Zip Code can't be Null");
        }

        //This method add The Customer Address in a List.
        getCustomerAddresses().add(Address);
    }

    //This method return The Address List. 
    private List<CustomerAddress> getCustomerAddresses() {
        if (Addresses == null){
            Addresses = new ArrayList<CustomerAddress>();
        }
        return Addresses;
    }
}
