class TriangleExercise {
    public void singleAsterisk() {
        System.out.print("*");
    }

    public void horizontalAsterisk(int n) {
        for (int x = 0; x < n; x++) {
            System.out.print("*");
        }
    }

    public void rightTriangleAsterisk(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.println("*");
                } else {
                    System.out.print("*");
                }
            }
        }
    }
}

public class TriangleExerciseTest{
    public static void main(String[] args){
        TriangleExercise triangleExercise = new TriangleExercise();
        triangleExercise.singleAsterisk();
        System.out.println("-------------");
        triangleExercise.horizontalAsterisk(3);
        System.out.println("-------------");
        triangleExercise.rightTriangleAsterisk(3);
    }
}
