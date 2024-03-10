import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
    public String[][] Table;
    public String[][] Board;
    public int RowNum;
    public int ColNum;
    public int BombNum;
    public MineSweeper() {
      boolean Start = true;

        System.out.println("Satır ve Sütun Sayısını Giriniz...");

            while (Start) {
            Scanner input = new Scanner(System.in);
            System.out.print("Satır Sayısı : ");
            int RowNum = input.nextInt();
            System.out.print("Sütun Sayısını : ");
            int ColNum = input.nextInt();

            if (RowNum < 4 || ColNum < 4) {
                System.out.println("Yanlış Veri Girişi, Tekrar Deneyiniz...");
            } else {
                Start = false;
            }


            this.RowNum = RowNum;
            this.ColNum = ColNum;
            this.BombNum = (RowNum * ColNum) / 4;
            this.Table = new String[RowNum][ColNum];
            this.Board = new String[RowNum][ColNum];

            InitBoard();
            BombPlacement();
            BoardBombPlacement();
        }

    }

    public void PrintBoard() {
        for (int i = 0; i < RowNum; i++) {
            for (int j = 0; j < ColNum; j++) {
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void PrintTable() {
        for (int i = 0; i < RowNum; i++) {
            for (int j = 0; j < ColNum; j++) {
                System.out.print(Table[i][j] + " ");
            }
            System.out.println();
        }
    }



    public void InitBoard() {
        for (int i = 0; i < RowNum; i++) {
            for (int j = 0; j < ColNum; j++) {
                Table[i][j] = "-";
                Board[i][j] = "-";
            }
        }
    }

    public void BombPlacement() {
        int count = 0;
        Random rnd = new Random();

        while (count < BombNum) {
            int row = rnd.nextInt(RowNum);
            int col = rnd.nextInt(ColNum);

            if (!Table[row][col].equals("*")) {
                Table[row][col] = "*";
                count++;
            }
        }
    }

    public void BoardBombPlacement() {
        for (int i = 0; i < RowNum; i++) {
            for (int j = 0; j < ColNum; j++) {
                if (!Table[i][j].equals("*")) {
                    Table[i][j] = String.valueOf(BombCount(i, j));
                }
            }
        }
    }

    public int BombCount(int row, int col) {
        int count = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (BorderBounds(row + i, col + j) && Table[row + i][col + j].equals("*")) {
                    count++;
                }
            }
        }

        return count;
    }

    public boolean BorderBounds(int Row, int Col) {
        return Row >= 0 && Row < RowNum && Col >= 0 && Col < ColNum;
    }

    public void RunGame() {
        Scanner input = new Scanner(System.in);
        boolean Game = true;
        int count = 0;

        System.out.println("Önizleme");
        PrintTable();
        while (Game) {

            System.out.println("__________\n__________");
            PrintBoard();
            System.out.println("__________\n__________");


            System.out.print("Satır : ");
            int row = input.nextInt();

            System.out.print("Sütun : ");
            int col = input.nextInt();


            if (!BorderBounds(row, col)) {
                System.out.println("Yanlış yer, tekrar dene.");
                continue;
            }

            if (Board[row][col] != "-") {
                System.out.println("Bunu daha önce seçtin, tekrar dene.");
                continue;
            }

            if (Table[row][col].equals("*")) {
                Game = false;
                System.out.println("Beceriksizliğin sonucu oyununuz bitmiştir.Heheheheheheh!");
            } else {
                Board[row][col] = Table[row][col];
                count++;
            }

            if (count == (RowNum * ColNum - BombNum)) {
                Game = false;
                System.out.println("Bravo Kazandın....");
            }
        }

        System.out.println("__________\n__________");
        PrintTable();


    }
}