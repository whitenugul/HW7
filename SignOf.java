import java.util.Scanner;
class SignOf {
    static int signOf(int n){
        int sign = 0;
        if (n > 0){
            sign = 1;
        }else if(n < 0){
            sign = -1;
        }
        return sign;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자입력: ");
        int num = sc.nextInt();
        System.out.println(signOf(num));
    }
}
