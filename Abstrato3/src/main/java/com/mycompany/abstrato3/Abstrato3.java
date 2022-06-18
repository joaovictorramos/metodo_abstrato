package com.mycompany.abstrato3;

import java.util.ArrayList;

public class Abstrato3 {

    public static void main(String[] args) {
        Coordenador c1 = new Coordenador("Fuschilo","fuschilo1@gmail.com", "Cefet/Rj", "Rua do Sonic", "Pesquisador");
        
        ArrayList<Teses> teses = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<RevistasConf> revistas = new ArrayList<>();
        
        Teses t1 = new Teses("Eficiência da luz solar", 2001, "Carlos e Jordan", "Biologia", "Fotossíntese", "D.Sc", "UFF");
        Teses t2 = new Teses("Clima Ensolarado", 2010, "Patrícia", "Biologia", "Fotossíntese", "M.Sc", "UFRJ");
        Livro l1 = new Livro("Buraco Negro", 1988, "Karl e Felipe", "Física", "Relatividade", "scipione", "Estados Unidos");
        RevistasConf r1 = new RevistasConf("Clorofila", 1999, "Linna", "Biologia", "Fotossíntese", "photosynthesis and its importance", 2, 1);
        
        teses.add(t1);
        teses.add(t2);
        livros.add(l1);
        revistas.add(r1);
        
        Pesquisa p1 = new Pesquisa("Fotossíntese", "Entendendo sua importância", "15/06/2021", "15/06/2022", "Efetiva", "Biologia", c1, teses, livros, revistas);
        
        p1.bibliografias();
    }
}
