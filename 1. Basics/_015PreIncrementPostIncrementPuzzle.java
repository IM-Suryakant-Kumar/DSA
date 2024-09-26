public class _015PreIncrementPostIncrementPuzzle {
    public static void main(String[] args) {
        postIncrement();
        preIncrement();
    }

    public static void postIncrement() {
        int i = 10;
        if (i++ == i) {
            System.out.println(i + " is good");
        } else {
            System.out.println(i + " is bad");
        }
    }

    public static void preIncrement() {
        int i = 20;
        if (++i == i) {
            System.out.println(i + " is good");
        } else {
            System.out.println(i + " is bad");
        }
    }
}
