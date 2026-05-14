import java.util.List;
import java.util.Map;

public class BruteForceAttack extends Attack {

    private List<String> usernames;
    private List<String> passwords;
    private int maxAttempts;

    public BruteForceAttack(int id,
                            Target target,
                            Map<String, String> parameters,
                            List<String> usernames,
                            List<String> passwords,
                            int maxAttempts) {

        super(id, target, parameters);

        this.usernames = usernames;
        this.passwords = passwords;
        this.maxAttempts = maxAttempts;
    }

    @Override
    public void executeAttack() {

        System.out.println("\n[+] BRUTE FORCE ATTACK");

        int attempts = 0;

        for (String user : usernames) {
            for (String pass : passwords) {

                attempts++;

                System.out.println(
                        "Trying => " + user + ":" + pass
                );

                if (attempts >= maxAttempts) {
                    System.out.println("Max attempts reached");
                    break;
                }
            }
        }

        System.out.println(
                generateAlert(
                        "Brute Force Detected",
                        Severity.HIGH
                )
        );
    }
}
