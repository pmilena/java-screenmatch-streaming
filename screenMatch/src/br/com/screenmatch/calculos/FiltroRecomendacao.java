package br.com.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtrar(Classificavel classificado){
        if (classificado.getClassificacao()>=4){
            System.out.println("Assista com certeza!");
        } else {
            System.out.println("Deixe para depois...");
        }
    }

}
