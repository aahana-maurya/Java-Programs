import java.util.Scanner;

public class ConditionQuiz{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int button;
        button = scanner.nextInt();

        if(button == 1){
            System.out.print("Hello");
        }
        else if(button == 2){
            System.out.print("Namaste");
        }
        else if(button == 3){
            System.out.print("Bonjour");
        }
        else{
            System.out.print("Invaild");
        }


    }
}