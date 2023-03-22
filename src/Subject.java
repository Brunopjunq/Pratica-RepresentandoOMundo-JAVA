import java.util.UUID;

public class Subject {
    private String id;
    private String name;
    private String university;
    
    public String getName() {
        return this.name;
    }

    public Subject(String name, String university) {
        this.name = name;
        this.university = university;
        this.id = UUID.randomUUID().toString();
    }

    public String getUniversity() {
        return this.university;
    }

    public String getId() {
        return this.id;
    }
}
