package model;
import java.util.List;

// @Entity
class Customer {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // private List<Order> ordersPlaced;
    private String email;
    private String password;
    private double accountBalance;

    // Constructors, getters, setters, etc.
}   