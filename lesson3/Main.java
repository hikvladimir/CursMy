import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name= in.nextLine();
        System.out.print("Введите логин: ");
        String login= in.nextLine();

        System.out.print("Введите хобби через запятую: ");
        String hobbes= in.nextLine();
        System.out.print("Введите возраст: ");
        int age= in.nextInt();


        User user=new User(name, login, age, hobbes.split(",") );

        try {
            FileOutputStream fos=new FileOutputStream("prog.sir");
            ObjectOutputStream oos=new ObjectOutputStream(fos);

            oos.writeObject(user);
            oos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
