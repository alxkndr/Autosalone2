public class Auto {
    //Attributi
    private String Marca;
    private String Modello;
    private int Prezzo;
    //Costruttore con parametri
    public Auto(String marca, String modello, int prezzo){
        Marca = marca;
        Modello = modello;
        Prezzo = prezzo;
    }
    //Costruttore con parametro a valore standard
    public Auto(String marca, String modello){
        Marca = marca;
        Modello = modello;
        Prezzo = 0;
    }
    //Costruttore senza parametri
    public Auto(){
        Marca = "";
        Modello = "";
        Prezzo = 0;
    }
    //Metodi get
    public String  getMarca(int prezzo){
        ifprezzo(prezzo);
        return Marca;
    }
    public String getModello(int prezzo){
        ifprezzo(prezzo);
        return Modello;
    }
    public int getPrezzo(int prezzo){
        ifprezzo(prezzo);
        return Prezzo;
    }
    //Metodi set
    public void setMarca(String marca){
        Marca = marca;
    }
    public void setModello(String modello){
        Modello = modello;
    }
    public void setPrezzo(int prezzo){
        Prezzo = prezzo;
        ifprezzo(prezzo);
    }
    public int ifprezzo(int prezzo){
        if(prezzo<0){
            return -1;
        }
        return 0;
    }
}
