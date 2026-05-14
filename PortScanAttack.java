import java.util.List;
import java.util.Map;

public class PortScanAttack extends Attack {

    private List<Integer> ports;
    private int timeout;

    public PortScanAttack(int id, Target target,
                          Map<String, String> parameters,
                          List<Integer> ports,
                          int timeout) {

        super(id, target, parameters);
        this.ports = ports;
        this.timeout = timeout;
    }

    @Override
    public void executeAttack() {

        System.out.println("\n[+] PORT SCAN STARTED");

        for (Integer port : ports) {
            System.out.println("Scanning Port: " + port);
        }

        System.out.println(
                generateAlert(
                        "Port Scan Detected",
                        Severity.MEDIUM
                )
        );
    }
}
