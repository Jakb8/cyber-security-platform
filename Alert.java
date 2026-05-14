import java.time.LocalDateTime;

public class Alert {

    private int id;
    private String attackType;
    private Severity severity;
    private String description;
    private LocalDateTime timestamp;

    public Alert(int id, String attackType,
                 Severity severity, String description) {

        this.id = id;
        this.attackType = attackType;
        this.severity = severity;
        this.description = description;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {

        return "\n===== ALERT =====" +
                "\nType: " + attackType +
                "\nSeverity: " + severity +
                "\nDescription: " + description +
                "\nDate: " + timestamp;
    }
}
