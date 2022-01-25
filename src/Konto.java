class Konto {
    private int einz, ausz,stand;
    //ausz выплата,einz начисление
    //счет
    //доступ
    public  int auszahlung(){
        ausz=einz;
       stand-=ausz;
       return ausz;
    }
    public void einzahlung(int wert) {
        einz = wert;
        stand += wert;
    }
    public int stand(){
        return stand;
    }
}
