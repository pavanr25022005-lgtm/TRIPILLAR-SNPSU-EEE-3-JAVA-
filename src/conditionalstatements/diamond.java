package conditionalstatements;

import java.util.Scanner;

public class diamond {
    static void main() {
        //upper part
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();


                int height = 7;   // number of rows
                int width = 7;    // number of columns

                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        // Left column, diagonal, right column
                        if (j == 0 || j == width - 1 || i == j) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
            }
        }


