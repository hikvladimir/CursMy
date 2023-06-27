public class Animal {
    public static int animalCount=0;
    private String type;
    String name;

    int MaxRun;
    int MaxSwim;

    public Animal(String type, String name, int maxRun, int maxSwim) {
        animalCount++;
        this.type = type;
        this.name = name;
        MaxRun = maxRun;
        MaxSwim = maxSwim;
    }

    public void run(int distance) {
        if (distance<=MaxRun){
            System.out.println(type+" "+name+" успешно справился с кросом");
        } else {
            System.out.println(type+" "+name+" не справился с кросом");
        }
    }

    public void swim(int distance) {
        if (distance==1){
            System.out.println(type+" "+name+" Плавать не умеет");
            return;
        }
        if (distance<=MaxSwim) {
            System.out.println(type+" "+name+" успешно справился с заплывом");
        } else {
            System.out.println(type+" "+name+" не справился с заплывом");
        }
    }
}
