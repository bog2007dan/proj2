package day12112022;

public class Journal implements Printable {
   String name;
public Journal(String name){
    this.name=name;
}
    @Override
    public void print() {
        System.out.print(name);
    }
}
