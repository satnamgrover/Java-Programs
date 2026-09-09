public class reversearray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int l = a.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            temp = a[i];
            a[i] = a[l - i - 1];
            a[l - i - 1] = temp;
        }
        for (int i=0; i<l; i++)
        {
            System.out.print(a[i] + " ");

        }
    }
}
