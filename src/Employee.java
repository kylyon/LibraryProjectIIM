import java.util.UUID;

public class Employee {
    private final UUID id;
    private String lastname;
    private String name;

    public Employee() {
    }

    public Employee(UUID id, String lastname, String name) {
        this.id = id;
        this.lastname = lastname;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
