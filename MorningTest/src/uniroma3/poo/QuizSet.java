package uniroma3.poo;

import java.util.*;

class Libro1 implements Comparable<Libro1> {
    private String titolo;
    
    public Libro1(String titolo){
        this.titolo    = titolo;
    } 
    
    public String getTitolo() {
        return this.titolo;
    }

    public int compareTo(Libro1 libro){
        return this.titolo.compareTo(libro.getTitolo());
    }
    
    public boolean equals(Object o){
        return this.titolo.equals(((Libro1)o).getTitolo());
    }
}

public class QuizSet {
    
    public static void main(String[] args) {
        Set<Libro1> libri = new HashSet<Libro1>();
        Libro1 l = new Libro1("Karenina");
        libri.add(l);
        l = new Libro1("Zorro");
        libri.add(l);
        l = new Libro1("Karenina");
        libri.add(l);
        l = new Libro1("Bovary");
        libri.add(l);
        libri.add(l);
        
        List<Libro1> listaLibri = new ArrayList<Libro1>(libri);
        Collections.sort(listaLibri);
        for(Libro1 libro : listaLibri) {
            System.out.println(libro.getTitolo());
        }
    }
}