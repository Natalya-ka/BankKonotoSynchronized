public class KontoVerw {
    public static void main(String[] s){
        Konto konto=new Konto();
        Einzahler e=new Einzahler(konto);//платильщик
        Abholer a=new Abholer(konto);//снять со счета
        e.start();
        a.start();
    }
}
