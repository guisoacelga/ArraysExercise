import java.util.Arrays;

public class OrderArrayAscending {
    public static void main(String[] args) {
        int[] arr = {9,1,4,5,7,3,0,9,2,6,2};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(orderArrayAscending(arr)));
        System.out.println(Arrays.toString(orderArrayDescending(arr)));
    }
    public static int[] orderArrayAscending(int[] arrToOrder){
        int temp=0;

        for (int i = 0; i < arrToOrder.length; i++) {
            for (int j = i+1; j < arrToOrder.length; j++) {
                if (arrToOrder[i]>arrToOrder[j]){
                    temp = arrToOrder[i];
                    arrToOrder[i] = arrToOrder[j];
                    arrToOrder[j] = temp;
                }
            }

        }
        return arrToOrder;
    }

    public static int[] orderArrayDescending(int[] arrToOrder){
        int temp=0;

        for (int i = 0; i < arrToOrder.length; i++) {
            for (int j = i+1; j < arrToOrder.length; j++) {
                if (arrToOrder[i]<arrToOrder[j]){
                    temp = arrToOrder[i];
                    arrToOrder[i] = arrToOrder[j];
                    arrToOrder[j] = temp;
                }
            }

        }
        return arrToOrder;
    }
}
