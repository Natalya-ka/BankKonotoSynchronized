public class Abholer extends Thread{
    private  Konto konto;
    public Abholer(Konto konto){
        this.konto=konto;
    }

    public void run(){
        int wert=0;
        for(int i=0; i<10; i++) {
            wert = konto.auszahlung();
            System.out.println("Abholer:" + wert + "/Stand:" + konto.stand());

            try {
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }}}