import models.CardType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//TODO : Reading data from yml config file
//TODO : Add API to list type of credit cards
//TODO : Add API to apply for credit card
//TODO : Add API to make purchase
//TODO : Add API to return current amount due
//TODO : Add API to deposit due amount
//TODO : Add API to get total due amount and date
//TODO : Add API to get all transactions
//TODO : Send purchase API data to a kafka broker

@SpringBootApplication
@ComponentScan(basePackages = "java")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
