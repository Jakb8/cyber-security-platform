public class Target {

    private int id;
    private String ipAddress;
    private String hostname;
    private String os;
    private String description;

    public Target(int id, String ipAddress, String hostname,
                  String os, String description) {

        this.id = id;
        this.ipAddress = ipAddress;
        this.hostname = hostname;
        this.os = os;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getHostname() {
        return hostname;
    }

    public String getOs() {
        return os;
    }

    public String getDescription() {
        return description;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
}
