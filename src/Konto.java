class Konto {
    private int einz, ausz,stand;
    //ausz выплата,einz начисление
    //счет
    //доступ
    private boolean zugriff=false;

    public synchronized int auszahlung(){
        while (!zugriff){
            try{
                wait();
            }catch (InterruptedException e){ }
        }
        ausz=einz;
        stand-=ausz;
        zugriff=false;
        notifyAll();
        return ausz;
    }
    public synchronized void einzahlung(int wert) {
        while (zugriff) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        einz = wert;
        stand += wert;
        zugriff = true;
        notifyAll();
    }
    public int stand(){
        return stand;
    }
}
