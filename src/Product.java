import java.util.*;

// @Entity
class Product {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serialNumber;
    private String name;
    private String vendor;
    private String category;
    private double price;
    private int count;

    // Constructors, getters, setters.
}