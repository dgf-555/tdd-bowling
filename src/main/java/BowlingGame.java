import java.util.Scanner;

public class BowlingGame {
    public static void main(String[] args) {
//nihao
        Scanner scan = new Scanner(System.in);

        String  str = scan.nextLine().toString();
        String arr[] = str.split(",");
        int score[] = new int[arr.length];
        for(int i = 0;i<score.length;i++){
            score[i] = Integer.parseInt(arr[i]);
        }
        int result = calculate(score);
        System.out.println(result);
    }
    public static int calculate(int[] a){
        int result1=0;
        int index=0;
        for(int i=0;i<a.length;i++){
            if(index<10){
                if(a[i]==10){
                    result1+=10+a[i+1]+a[i+2];
                    index++;
                }
                else if(a[i]+a[i+1]==10){
                    result1+=10+a[i+1];
                    i++;
                    index++;
                }
                else {
                    result1+=a[i]+a[i+1];
                    i++;
                    index++;
                }
            }
            else break;
        }
        return result1;
    }
}
