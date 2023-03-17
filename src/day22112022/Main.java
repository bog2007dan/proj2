package day22112022;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalc = new Kalkulator();
        int numb1=Kalkulator.getInt();
        int numb2=Kalkulator.getInt();
       char operation=kalc.getOperation();
       int result=kalc.calk(numb1,numb2,operation);
       System.out.println(result);
    }
}
