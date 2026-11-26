package za.co.keepsakemoments.keepsake_backend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import za.co.keepsakemoments.keepsake_backend.model.Product;

public class ProductTest {
    @Test
    void shouldCreateProductWithCorrectDetails() {
        //follow the Arrange,Act,Assert rule

        //Arrange: Create a product
        Product product = new Product(
                "Luxury Birthday Box",
                "A personalised birthday gift box",
                650
        );

        //Act and Assert: Check the produt details
        assertEquals("Luxury Birthday Box", product.getName());
        assertEquals("A personalised birthday gift box", product.getDescription());
        assertEquals(650.0, product.getPrice());
    }

    @Test
    void shouldRejectProductWithZeroPrice() {
        //Arrange

        //Act and Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Product("Graduation Box", "Celebrate achievements with a memorable keepsake.", 0);
        });
    }

    @Test
    void shouldUpdateProductPrice() {
        //Arrange
        Product product = new Product(
                "Luxury Gift Box",
                "A personalised birthday gift box",
                650
        );

        //Act (Change the price first)
        product.setPrice(850);

        //Assert
        assertEquals(850.0,product.getPrice());
    }

    @Test
    void shouldRejectInvalidPriceUpdate() {
        //Arrange
        Product product = new Product(
                "Luxury Gift Box",
                "A personalised birthday gift box",
                650
        );

        //Act and Assert
        assertThrows(IllegalArgumentException.class, () -> {
        product.setPrice(0);
        });
    }

    @Test
    void shouldRejectEmptyDescription() {
        //Arrange
        Product product = new Product(
                "Luxury Gift Box",
                "A personalised birthday gift box",
                650
        );

        //Act and Assert
        assertThrows(IllegalArgumentException.class, () -> {
           product.setDescription("");
        });
    }

    @Test
    void shouldRejectNullDescription() {
        //Arrange
        Product product = new Product(
                "Luxury Gift Box",
                "A personalised birthday gift box",
                650
        );

        assertThrows(IllegalArgumentException.class, () -> {
            product.setDescription(null);
        });
    }

    @Test
    void shouldRejectProductWithNullName() {
        //Arrange (no need to create a new product because we are testing the object creation itself)

        //Act and Assert
        assertThrows(IllegalArgumentException.class, () -> {
           new Product(null,"A personalised birthday gift box",650.0);
        });
    }

    @Test
    void shouldRejectProductWithBlankName() {
        //Arrange

        //Act and Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Product("","A personalised birthday gift box",650.0);
        });
    }

    @Test
    void shouldRejectProductWithNegativePrice() {
        //Arrange

        //Act and Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Product("Luxury Gift Box","A personalised birthday gift box",-100.0);
        });
    }

}