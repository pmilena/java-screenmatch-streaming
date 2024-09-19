package br.com.screenmatch.calculos;

import br.com.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public int inclui(Titulo t){
        return tempoTotal += t.getDuracaoEmMinutos();
    }
}
