public class ExceptionEx1 {

    public static void main(String args[]) {
        int[] nums = {3, 2, 6, 1};
        calculateSum(nums);
    }

    public static void calculateSum(int[] vals) {
        int total = 0;

        for (int i = 0; i < vals.length; i++) {
            total += vals[i]; // Adiciona o valor do elemento atual ao total
        }

        System.out.println("Soma dos elementos do array: " + total);
    }
}
