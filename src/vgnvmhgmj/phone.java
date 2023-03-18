package vgnvmhgmj;

public class phone {
    int weight;
    int number;
    String model;
    String call;
    public static void main(String[] args) {
phone phone = new phone();
        phone.weight= 2;
        phone.number= +298786570;
        phone.model="Samsung Galaxy S5";
        phone.call="Мама";
        phone phone1 = new phone();
        phone1.weight= 12;
        phone1.number= +89943085;
        phone1.model="Iphone 13 PRO MAX";
        phone.call="Вася однокласник";
        phone phone2 = new phone();
        phone2.weight= 1;
        phone2.number= +477185110;
        phone2.model="Nokia 3310";
        phone.call="Баба Таня";
        System.out.println("Вам дзвонить " + phone.number + " Модель телефону " + phone.model + " Його вага " + phone.weight + " Вам дзвонить " + phone.call);
        System.out.println("Вам дзвонить " + phone1.number + " Модель телефону " + phone1.model + " Його вага " + phone1.weight + " Вам дзвонить " + phone1.call);
        System.out.println("Вам дзвонить " + phone2.number + " Модель телефону " + phone2.model + " Його вага " + phone2.weight + " Вам дзвонить " + phone2.call);
    }
}
