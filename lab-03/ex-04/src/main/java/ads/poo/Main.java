package ads.poo;

public class Main {
    public static void main(String[] args) {
        Data a = new Data();
        Data b = new Data(31);
        Data c = new Data(28 ,2);
        Data d = new Data(21, 3, 2020);
        Data e = new Data(21,3,2024);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println(d.diferencaEntreDatas(e));


    }
}