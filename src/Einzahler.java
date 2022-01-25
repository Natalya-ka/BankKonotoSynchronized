import java.lang.Thread;
public class Einzahler extends Thread{

    private  Konto konto;

    public Einzahler(Konto konto){
        this.konto=konto;
    }

    public void run() {
        int betrag;
        for(int i=0; i<10;i++){
        betrag = (int) (Math.random()  * 1000);
        konto.einzahlung(betrag);
        System.out.println("Einzahler:" +betrag + "/Stand:" + konto.stand());

        try {
            sleep((int) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}}
