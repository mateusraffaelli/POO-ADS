package ads.poo;

public class Main {
    static void main() {
        Horario a = new Horario();
        Horario b = new Horario(10);
        Horario c = new Horario(2,48);
        Horario d = new Horario(23,59,59);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
