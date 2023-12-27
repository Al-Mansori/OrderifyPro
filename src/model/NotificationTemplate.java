package model;
import java.util.List;

// @Entity
class NotificationTemplate {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;// templateId

    private String template;
    // private String templateType;
    // private String templateContent;

    private List<String> placeholders;
    private List<String> availableLanguages;
    private List<String> availableChannels;

    // Constructors, getters, setters, etc.
}