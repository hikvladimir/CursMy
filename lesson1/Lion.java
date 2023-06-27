public class Lion extends Animal{
    public static int lionCount=0;
    public Lion( String name) {

        super("Lion", name, 500, 50);
        lionCount++;
    }
}
