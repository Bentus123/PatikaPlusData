
public class Transpoz {
    public static void main(String[] args) {
        int[][] Matrix = {{40, 70, 70}, {80, 90, 350}, {401, 589, 554}};
        int YeniSatir = Matrix.length;
        int YeniSutun = Matrix[0].length;
        int[][] Transpoz = new int[YeniSutun][YeniSatir];

        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                Transpoz[j][i] = Matrix[i][j];
            }
        }
        for (int[] Sutun : Matrix) {
            for (int Satir : Sutun) {
                System.out.print(Satir + " ");
            }
            System.out.println();
        }
        System.out.println("===================================================");

        for (int[] Sutun : Transpoz) {
            for (int Satir : Sutun) {
                System.out.print(Satir + " ");
            }
            System.out.println();
        }
    }

}