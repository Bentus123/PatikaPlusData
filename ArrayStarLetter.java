//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArrayStarLetter {
    public static void main(String[] args) {
        String[][] zort = new String[7][4];

        for (int i = 0; i < zort.length; i++) {
            for (int j = 0; j < zort[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    zort[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    zort[i][j] = " * ";
                } else {
                    zort[i][j] = "   ";
                }

            }
        }

        for (String[] sira : zort) {
            for (String sutun : sira) {
                System.out.print(sutun);
            }
            System.out.println();
        }
    }

}