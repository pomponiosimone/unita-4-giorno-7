package EsercizioDue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EsercizioDue {


    public static List<Integer> generaNumeriCasuali(int n) {
        Random random = new Random();
        List<Integer> numeriCasuali = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numeriCasuali.add(random.nextInt(101));
        }

        Collections.sort(numeriCasuali);
        return numeriCasuali;
    }

    
    public static List<Integer> creaListaSpecchiata(List<Integer> lista) {
        List<Integer> listaSpecchiata = new ArrayList<>(lista);
        List<Integer> listaInvertita = new ArrayList<>(lista);
        Collections.reverse(listaInvertita);
        listaSpecchiata.addAll(listaInvertita);
        return listaSpecchiata;
    }

    public static void stampaValori(List<Integer> lista, boolean pari) {
        for (int i = (pari ? 0 : 1); i < lista.size(); i += 2) {
            System.out.println(lista.get(i));
        }
    }

    public static void main(String[] args) {

        List<Integer> numeriCasuali = generaNumeriCasuali(10);
        System.out.println("Lista ordinata di numeri casuali:");
        System.out.println(numeriCasuali);


        List<Integer> listaSpecchiata = creaListaSpecchiata(numeriCasuali);
        System.out.println("Lista specchiata:");
        System.out.println(listaSpecchiata);


        System.out.println("Valori in posizioni pari:");
        stampaValori(listaSpecchiata, true);


        System.out.println("Valori in posizioni dispari:");
        stampaValori(listaSpecchiata, false);
    }
}