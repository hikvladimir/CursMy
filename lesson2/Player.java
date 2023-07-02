import java.util.Random;

public class Player {
    public enum VARIANTS{
        ROCK,
        PAPER,
        SCISSORS
    }
    private String name;
    private VARIANTS variant;

    public Player() {
        VARIANTS[] vari=VARIANTS.values();
        int i=new Random().nextInt(3);
        variant=vari[i];
        name="bot";
    }

    public Player(String name, VARIANTS variant) {
        this.name = name;
        this.variant = variant;
    }
    public static String whoWins(Player playr, Player playr2){
        System.out.println("Игрок "+playr.variant);
        System.out.println("Выбор bot "+playr2.variant);
        if(playr.variant==playr2.variant){
             return "Нечья";
        }else if ((playr.variant==VARIANTS.SCISSORS && playr2.variant==VARIANTS.ROCK) ||
                (playr.variant==VARIANTS.PAPER && playr2.variant==VARIANTS.SCISSORS) ||
                (playr.variant==VARIANTS.ROCK && playr2.variant==VARIANTS.PAPER)){
            return "Выйграл bot";
        }
        return "Пользователь выйграл";

    }

}
