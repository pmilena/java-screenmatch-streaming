package br.com.screenmatch;

import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.calculos.FiltroRecomendacao;
import br.com.screenmatch.modelos.Episodio;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;


 public class Principal {
        public static void main(String[] args) {

            Filme avengers = new Filme();
            avengers.setNome("Avengers");
            avengers.setAnoDeLancamento(2012);
            avengers.setIncluidoNoPlano(true);
            avengers.setDuracaoEmMinutos(180);

            avengers.avalia(8);
            avengers.avalia(7);

            avengers.exibeFichaTecnica();
            System.out.println("Total de Avaliações: " + avengers.exibeTotalAvaliacoes());
            System.out.println("Nota: " + avengers.exibeMedia());

            Serie theOffice = new Serie();
            theOffice.setNome("The Office");
            theOffice.setAnoDeLancamento(2015);
            theOffice.setMinutosPorEpisodio(30);
            theOffice.setIncluidoNoPlano(true);
            theOffice.setEpisodiosPorTemporada(10);
            theOffice.setTemporadas(10);

            /*System.out.println(theOffice.getDuracaoEmMinutos());*/

            CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
            calculadoraDeTempo.inclui(theOffice);
            calculadoraDeTempo.inclui(avengers);

            System.out.println(calculadoraDeTempo.getTempoTotal());

            FiltroRecomendacao filtro = new FiltroRecomendacao();
            Episodio episodio = new Episodio();
            episodio.setTotalVisualizacoes(120);
            filtro.filtrar(episodio);
        }
    }

