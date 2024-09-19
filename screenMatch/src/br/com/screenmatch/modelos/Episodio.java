package br.com.screenmatch.modelos;

import br.com.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {

    private Serie serie;
    private int numero;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    @Override
    public int getClassificacao() {
        if(totalVisualizacoes >= 100){
         return 4;
        } else {
          return 2;
        }
    }
}
