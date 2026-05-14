import java.util.List;
import java.util.Map;

public class XSSAttack extends Attack {

    private List<String> payloads;
    private String url;

    public XSSAttack(int id,
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

        System.out.println("\n[+] XSS ATTACK");

        for (String payload : payloads) {
            System.out.println("Injecting => " + payload);
        }

        System.out.println(
                generateAlert(
                        "XSS Attack Detected",
                        Severity.HIGH
                )
        );
    }
}
