import java.util.List;
import java.util.Map;

public class SQLInjectionAttack extends Attack {

    private List<String> payloads;
    private String url;

    public SQLInjectionAttack(int id,
                              Target target,
                              Map<String, String> parameters,
                              List<String> payloads,
                              String url) {

        super(id, target, parameters);

        this.payloads = payloads;
        this.url = url;
    }

    @Override
    public void executeAttack() {

        System.out.println("\n[+] SQL INJECTION ATTACK");

        for (String payload : payloads) {
            System.out.println("Payload => " + payload);
        }

        System.out.println(
                generateAlert(
                        "SQL Injection Detected",
                        Severity.CRITICAL
                )
        );
    }
}
