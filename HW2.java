import java.util.Scanner;
import java.util.Random;
public class HW2 {
    public static void main(String[] args) {
        String[] dayK = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
        String[] dayE = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Random rand = new Random();
        int num = rand.nextInt(7);
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        while(true){
            System.out.print(dayK[num]+": ");
            String date = sc.next();
            if(date.equals(dayE[num])){
                System.out.print("정답입니다. 계속하시겠습니까? 1... yes, 0...no: ");
                
            }
            else{
                System.out.println("오답입니다.");
                break;
            }
            int restart = sc1.nextInt();
            if(restart == 0){
                break;
            }else if(restart == 1){
                continue;
            }else{
                System.out.println("오류");
                break;
            }
        }

    }
}
