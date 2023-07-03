import java.io.*;
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


        try {
            FileInputStream fis=new FileInputStream("prog.sir");
            ObjectInputStream ois=new ObjectInputStream(fis);
            User users=(User) ois.readObject();
            System.out.println(users);

            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
