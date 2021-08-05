import java.util.Scanner;
public class HW3 {
    public static void main(String[] args) {
        Scanner a1 = new Scanner(System.in);
        int [][] a = new int[4][3];
        int [][] b = new int[3][4];
        int [][] c = new int[4][4];
    
        System.out.println("행렬 a의 요소");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("a[%d][%d] = ",i,j);
                a[i][j] = a1.nextInt();
            }
        }

        System.out.println("행렬 b의 요소");
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 4; y++){
                System.out.printf("b[%d][%d] = ",x,y);
                b[x][y] = a1.nextInt();
            }
        }     
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 3; k++){
                    c[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }

        for(int x = 0; x < 4; x++){
            for(int y = 0; y < 4; y++){
                System.out.println(c[x][y]);
            }
        }
        

    }


}
