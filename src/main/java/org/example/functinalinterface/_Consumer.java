package org.example.functinalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        // Normal java function
        Customer maria = new Customer("Maria", "99999999");
        greetCustomer(maria);
        greetCustomerV2(maria, false);


        //  Consumer Functional interface
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumerV2.accept(maria, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello" + customer.customerName +
                    ", thanks for registering phone number " + (showPhoneNumber ? customer.custommerPhoneNumber:"*******"));


    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello" + customer.customerName +
            ", thanks for registering phone number " + customer.custommerPhoneNumber);

    static  void  greetCustomer(Customer customer){
        System.out.println("Hello" + customer.customerName +
                ", thanks for registering phone number " + customer.custommerPhoneNumber);
    }
    static  void  greetCustomerV2(Customer customer, boolean showPoneNumber){
        System.out.println("Hello" + customer.customerName +
                ", thanks for registering phone number " + customer.custommerPhoneNumber);
    }
    static  class  Customer{
        private  final  String customerName;
        private  final  String custommerPhoneNumber;

        public Customer(String customerName, String custommerPhoneNumber) {
            this.customerName = customerName;
            this.custommerPhoneNumber = custommerPhoneNumber;
        }
    }
}
