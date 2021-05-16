import java.util.Scanner;

/* 
* Ao executar o método main, no console será solicitado o valor de investimento.
* O separador de casa decimal deve ser a vírgula.
*
* O resultado será apresentado a partir de 'Projeção máxima de compartilhamento'
* e impresso no console
*/
public class Calculadora {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        final int baseVisualizacaoPorRealInvestido = 30;
        final double percentualDeVisualizacao = 0.12;
        final int pessoasQueClicamNoAnuncio = 20;
        final int pessoasQueClicamECompartilhamOAnuncio = 3;
        final int cadaCompartilhamentoGeraVisualizacoes = 40;
        final int compartilhamentoMaximoMesmoAnuncio = 4;

        System.out.println("Investimento: ");
        double valorInvestido = sc.nextDouble();
        
        double visualizacaoOriginal = baseVisualizacaoPorRealInvestido * valorInvestido;
        
        double cliquesNoAnuncio = visualizacaoOriginal * percentualDeVisualizacao;
        
        double compartilhamentoRedeSocial = 
        	(cliquesNoAnuncio / pessoasQueClicamNoAnuncio) * pessoasQueClicamECompartilhamOAnuncio;
        
        double visualizacoesGeradas = 
        	compartilhamentoRedeSocial * cadaCompartilhamentoGeraVisualizacoes;
        
        double projecaoNaximaDeCompartilhamento = visualizacoesGeradas * compartilhamentoMaximoMesmoAnuncio;

        System.out.printf("Projeção máxima de compartilhamento %.0f%n", projecaoNaximaDeCompartilhamento);

        sc.close();
    }
}
