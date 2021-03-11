public class FlatArray {
    public static void main(String[] args) {
        System.out.println("Hello! I am going to turn a 2d array into a 1d array!!*****");

        int [] [] numbers = {{0,1,9}, {6,3,2}};
        for (int i = 0; i < getFlatArray(numbers).length ; i++) {
            if (i==getFlatArray(numbers).length-1){
                System.out.print(getFlatArray(numbers)[i] + ".");
            } else {
                System.out.print(getFlatArray(numbers)[i] + ", ");
            }
        }
    }

    public static int[] getFlatArray(int[][] numbers) {
        int i=0;
        int uniLength = (numbers.length * numbers[0].length);
        int[] uni = new int[uniLength];

        for (int y = 0; y < numbers.length; y++) {

            //numbers.length me da el LARGO (filas)
            //numbers[0].length me da el ancho (columnas)

            for (int x = 0; x < numbers[0].length; x++) {
                uni[i] = numbers[y] [x];
                i++;
            }
        }
        return uni;
    }
}
