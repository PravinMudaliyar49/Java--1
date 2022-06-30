public class coverup {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;
        int n3 = 4;
        int n4 = 2;

        // String loopCondition = "Loop ko chalne do";
        boolean breakTheLoop = false;

        for (int i = 1; i <= n1; i++) {
            System.out.print(i + " ==> ");

            for (int j = 1; j <= n2; j++) {
                System.out.print(j + " ");

                if (j == n4 && i == n3) {
                    // loopCondition = "Loop ko thod do";
                    breakTheLoop = true;
                    break;
                }
            }

            // if(i == n3) {
            // break;
            // }

            // if(loopCondition.equals("Loop ko thod do")){
            // break;
            // }

            if (breakTheLoop == true) {
                break;
            }

            System.out.println();
        }

    }
}