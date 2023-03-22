public class App {
    public static void main(String[] args) {
        User user = new User("Bruno", 28,"bruno@driven.com", "UFRJ");

        Subject sub1 = new Subject("Cáluclo 1", "UFRJ");
        Subject sub2 = new Subject("Física 2", "PUC");
        Subject sub3 = new Subject("Prog 1", "UFRJ");

        user.addSubject(sub1.getName());
        user.addSubject(sub3.getName());


        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getEmail());
        System.out.println(user.getUniversity());
        System.out.println(user.getSubjects());

        System.out.println(sub2.getName());

    }
}
