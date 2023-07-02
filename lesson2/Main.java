public class Main {
    public static void main(String[] args) {
        Player bot = new Player();
        Player alex = new Player("Alex",Player.VARIANTS.SCISSORS );

        System.out.println(Player.whoWins(bot, alex));
    }
}
