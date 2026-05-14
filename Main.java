import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            Target target = new Target(
                    1,
                    "192.168.1.10",
                    "srv-linux",
                    "Linux",
                    "Production Server"
            );

            Map<String, String> params =
                    new HashMap<>();

            params.put("threads", "10");

            System.out.println(
                    "===== CYBER SECURITY PLATFORM ====="
            );

            System.out.println("1 - Port Scan");
            System.out.println("2 - Brute Force");
            System.out.println("3 - SQL Injection");
            System.out.println("4 - XSS Attack");
            System.out.println("5 - Malware Attack");

            System.out.print("Choose attack: ");

            int choice = scanner.nextInt();

            Attack attack;

            switch (choice) {

                case 1:

                    attack = new PortScanAttack(
                            1,
                            target,
                            params,
                            Arrays.asList(22, 80, 443, 3306),
                            1000
                    );

                    break;

                case 2:

                    attack = new BruteForceAttack(
                            2,
                            target,
                            params,
                            Arrays.asList("admin", "root"),
                            Arrays.asList("123456", "password"),
                            5
                    );

                    break;

                case 3:

                    attack = new SQLInjectionAttack(
                            3,
                            target,
                            params,
                            Arrays.asList("' OR 1=1 --"),
                            "http://testphp.vuln"
                    );

                    break;

                case 4:

                    attack = new XSSAttack(
                            4,
                            target,
                            params,
                            Arrays.asList("<script>alert(1)</script>"),
                            "http://site.test"
                    );

                    break;

                case 5:

                    attack = new MalwareAttack(
                            5,
                            target,
                            params,
                            "C:/malware.exe",
                            "USB Infection"
                    );

                    break;

                default:
                    throw new AttackException("Invalid Choice");
            }

            attack.executeAttack();

        } catch (AttackException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }
}
