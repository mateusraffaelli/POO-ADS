package ads.poo;

public class Main {
    static void main() {
        Retangulo a = new Retangulo();
        System.out.println(a);
        Retangulo b = new Retangulo(5,6,"ASCII");
        System.out.println(b);
        Retangulo c = new Retangulo(5,6,"UTF8");
        System.out.println(c);
    }
}
