import java.util.*;

// @Entity
class Order {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // orderId

    // @ManyToOne
    private Customer customer;

    // @OneToMany
    private List<Product> products;

    // private String status;
    // private String shippingAddress;
    // private boolean isShipped;
    // private double shippingFees;

    // Other order details, shipping info

    // Constructors, getters, setters, etc.
}