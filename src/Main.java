public class Main {
    public static void main(String[] args) {
        int arr[] = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) + i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}


