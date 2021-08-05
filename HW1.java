import java.util.Scanner;
import java.util.Random;
public class HW1{
    public static void main(String[] args) {
        Random rand = new Random();
        int month = rand.nextInt(12);
        Scanner monthname = new Scanner(System.in);
        Scanner retry = new Scanner(System.in);
        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("해당 월의 영어단어를 입력하시오");
        System.out.println("첫 글자는 대문자 두번째 부터는 소문자로 입력하시오");
        while(true){
            System.out.print((month+1)+"월: ");
            String month1 = monthname.next();
            if(month1.equals(monthName[month])){
                System.out.print("정답입니다. 다시 한번? 1...yes, 0...no: ");
            }else{
                System.out.println("틀렸습니다.");
                break;
            }
            int restart = retry.nextInt();
            if(restart==1){
                continue;
            }else if(restart == 0){
                break;
            }else{
                System.out.println("오류");
                break;
            }
        }
    }
}