public class Klient {
        public static void main(String[] args) {
        int[][] a = { {1, 2}, {3, 4} };
        int[][] b = { {5, 6}, {7, 8} };

        Matrise A = new Matrise(a);
        Matrise B = new Matrise(b);

        System.out.println("A:\n" + A);
        System.out.println("B:\n" + B);

        System.out.println("A + B:\n" + A.add(B));
        System.out.println("A * B:\n" + A.mult(B));
        System.out.println("A^T:\n" + A.transpose());
    }
}
