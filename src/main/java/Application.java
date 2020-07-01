import models.CreditCard;
import models.Customer;

public class Application {
    //TODO : Add API to apply for credit card
    //TODO : Add API to make purchase
    //TODO : Add API to return current amount due
    //TODO : Add API to deposit due amount
    //TODO : Add API to get total due amount and date
    //TODO : Add API to get all transactions
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setAge(24);
        customer.setName("Vishal Sharma");
        customer.setEmail("vishal.sharma@email.com");
        customer.setPhone("9876543210");
        customer.setUserId(customer.createUserId());

        CreditCard creditCard = new CreditCard();
        creditCard.setCardOwner(customer);
        creditCard.getCardMonthlyLimit();
    }
}
