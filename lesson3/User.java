import java.io.Serializable;

public class User implements Serializable {
    public String name;
    public String login;
    public int age;

    public String[] hobbes;

    public User(String name, String login, int age, String[] hobbes) {
        this.name = name;
        this.login = login;
        this.age = age;
        this.hobbes = hobbes;
    }
}
