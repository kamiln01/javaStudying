public class Tabs {
    public static void main(String[] args) {

        int[] OneThreeFive = new int[] {1, 3, 5, 7, 9};

        for (int i = 0; i < OneThreeFive.length; i++) {
            System.out.println("OneThreeFive[" + i + "] = " + OneThreeFive[i]);
        }

        for (int i = 0; i < (OneThreeFive.length/2); i++) {
            int temp = OneThreeFive[i];     //  = 1; = 3; = 5;
            OneThreeFive[i] = OneThreeFive[OneThreeFive.length-1-i];    //  = 5; = 3; = 1;
            OneThreeFive[OneThreeFive.length-1-i] = temp;
        }
        System.out.println("REVERSE");
        for (int i = 0; i < OneThreeFive.length; i++) {
            System.out.println("OneThreeFive[" + i + "] = " + OneThreeFive[i]);
        }
    }
}
