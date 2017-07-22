class DiamondExercise {
    public void isoscelesTriangle(int n) {
        for (int y = 1; y <= n; y++) {
            int x = n - y;
            System.out.println(printAsterisk(x, 2 * y - 1));
        }
    }

    public String printAsterisk(int x, int y) {
        String blankSpace = "";
        String asterisk = "";
        for (int i = 1; i <= x; i++) {
            blankSpace += " ";
        }
        for (int j = 1; j <= y; j++) {
            asterisk += "*";
        }
        return blankSpace + asterisk;
    }

    public void diamond(int n) {
        for (int y = 1; y <= n; y++) {
            int x = n - y;
            System.out.println(printAsterisk(x, 2 * y - 1));
        }
        for (int y = n - 1; y > 0; y--) {
            int x = n - y;
            System.out.println(printAsterisk(x, 2 * y - 1));
        }
    }

    public void diamondWithName(int n) {
        for (int y = 1; y <= n - 1; y++) {
            int x = n - y;
            System.out.println(printAsterisk(x, 2 * y - 1));
        }
        System.out.println("Bill");
        for (int y = n - 1; y > 0; y--) {
            int x = n - y;
            System.out.println(printAsterisk(x, 2 * y - 1));
        }
    }
}

public class DiamondExerciseTest {
    public static void main(String[] args) {
        DiamondExercise diamondExercise = new DiamondExercise();
        diamondExercise.isoscelesTriangle(3);
        diamondExercise.diamond(3);
        diamondExercise.diamondWithName(3);
    }
}
