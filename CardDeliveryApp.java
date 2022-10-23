import model.*;
import model.CustomerAddress.AddressType;

public class CardDeliveryApp {
    public static void main(String[] args) throws Exception {
        /*This application is intended to register a customer and the delivery address,
        enabling the delivery of the Card.*/ 

        //This var instance the class CustomerClass. 
        var customer = new CustomerClass();
        
        //This var instance the class CustomerAddress with Constructor Method.
        //Parameters --> @city,@state,@zipCode,@complement,@neighborhood,@addressNumber 
        var address = new CustomerAddress("Canada", 
            "Quebec",
            "07506-710",
            "La Nouvelle-France",
            "In the lower part of town",
            "Lower Town",
            "Nº 65",
            AddressType.RESIDELTIAL 
        );

        //This method try add the Address of Customer in a class Customer
        try {
            customer.addAddress(address);
            System.out.println("Address added successfully!");
        } catch (Exception e) {
            System.err.println("There was an error adding address: " + e.getMessage());
        }
    }
}
