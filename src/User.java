import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String name;
    private int age;
	private String email;
    private String university;
    private List<String> subjects = new ArrayList<>();

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }

    public String getUniversity() {
        return this.university;
    }

    public String getId() {
        return this.id;
    }

    public List<String> getSubjects() {
        return this.subjects;
    }

    public User(String name, int age, String email, String university) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.university = university;
        this.id = UUID.randomUUID().toString();
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }
}
