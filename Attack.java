import java.time.LocalDateTime;
import java.util.Map;

public abstract class Attack implements AttackTool {

    protected int id;
    protected Target target;
    protected LocalDateTime timestamp;
    protected Map<String, String> parameters;

    public Attack(int id, Target target,
                  Map<String, String> parameters) {

        this.id = id;
        this.target = target;
        this.parameters = parameters;
        this.timestamp = LocalDateTime.now();
    }

    public Alert generateAlert(String description,
                               Severity severity) {

        return new Alert(
                id,
                this.getClass().getSimpleName(),
                severity,
                description
        );
    }

    public abstract void executeAttack();
}
