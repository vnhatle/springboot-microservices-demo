package practice.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import practice.inventoryservice.model.Inventory;
import practice.inventoryservice.repository.InventoryRepository;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
        return args -> {
            Inventory inventory = new Inventory();
            inventory.setSkuCode("iphone_16");
            inventory.setQuantity(0);

            Inventory inventory1 = new Inventory();
            inventory1.setSkuCode("iphone_16_black");
            inventory1.setQuantity(10);

            inventoryRepository.save(inventory);
            inventoryRepository.save(inventory1);
        };
    }

}
