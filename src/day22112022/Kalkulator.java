package day22112022;

import java.util.Scanner;

public class Kalkulator {
    static Scanner scanner = new Scanner(System.in);
    public static int getInt() {
        System.out.println("Введіть число");
        int numb = 0;
        if (scanner.hasNextInt()) {
            numb = scanner.nextInt();
        } else {
            System.out.println("Невірний символ, повторіть знову");
            scanner.next();
            numb = getInt();
       }
        return numb;
        }
        public static char getOperation(){
        System.out.println("Виберіть операцію");
     char operation;
        if(scanner.hasNext()){
            operation=scanner.next().charAt(0);

        }
        else{
            System.out.println("Ви припустили помилку при операції");
            scanner.next();
            operation=getOperation();
        }
        return operation;
        }
        public static int calk(int numb1, int numb2, char operation){
        int result;
        switch (operation){
            case '+':
                result=numb1+numb2;
                break;
            case '-':
                result=numb1-numb2;
                break;
            case '*':
                result=numb1*numb2;
                break;
            case '/':
                result=numb1/numb2;
                break;
            default:
                System.out.println("Операція не розпізнана, повторіть спробу");
                result=calk(numb1,numb2,operation);
        }
        return result;
        }
    }
