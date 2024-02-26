package practice;

public class Coder {

    public void setMaxCoders(int n) {
        int maxCoders = (n * n / 2) + 1;
        System.out.println(maxCoders);
        int i = 0;
        while (i < n) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("C");

                } else {
                    System.out.print(".");
                }

            }
            System.out.println();

            i++;
        }
    }
}
