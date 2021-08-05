import java.util.Scanner;
class min {
    static int min(int a, int b, int c){
        int min = a;
        if(min > b){
            min = b;
        }
        if(min > c){
            min = c;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("3개의 정수 입력: ");
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(min(num, num1, num2));
    }
}
