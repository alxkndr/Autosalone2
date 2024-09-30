import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String marca = "";
        String modello = "";
        int prezzo = 0;
        Auto a1 = new Auto("Mercedes", "G6", 200000);
        Auto a2 = new Auto("Lamborghini", "Huracan", 400000);
        Auto a3 = new Auto("Ford", "Mustang");
        Auto a4 = new Auto();
        System.out.println(a1.getMarca(prezzo) + " " + a1.getModello(prezzo) + " al costo di: " + a1.getPrezzo(prezzo));
        System.out.println(a2.getMarca(prezzo) + " " + a2.getModello(prezzo) + " al costo di: " + a2.getPrezzo(prezzo));
        System.out.print(a3.getMarca(prezzo) + " " + a3.getModello(prezzo));
        System.out.println(a4.getMarca(prezzo) + " " + a4.getModello(prezzo) + " al costo di : " + a4.getPrezzo(prezzo));

        System.out.println("Inserisci la marca della quarta auto: ");
        marca = in.next();
        a4.setMarca(marca);
        System.out.println("Inserisci il modello della quarta auto: ");
        modello = in.next();
        a4.setModello(modello);
        System.out.println("Inserisci il prezzo della quarta auto: ");
        prezzo = in.nextInt();
        a4.setPrezzo(prezzo);
        if (a4.ifprezzo(prezzo)){
            System.out.println(a4.getMarca(prezzo) + " " + a4.getModello(prezzo) + " al costo di : " + a4.getPrezzo(prezzo));
        } else{
            System.out.println("Non puoi mettere un valore negativo");
        }
    }
}