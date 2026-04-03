package etapa_2_variaveis_tipos_primitivos;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/* Desafio criado por IA
Você vai criar um sistema para uma loja de peças de computador. Declare as variáveis usando o tipo mais econômico e correto possível.

Requisitos:
- Estado da Peça: Apenas uma letra para a categoria ('P' para Processador, 'V' para Vídeo).
- Quantidade no Estoque: Um número que nunca passará de 30.000.
- Preço Unitário: Um valor com centavos.
- ID da Peça: Um número de identificação grande (ex: 8.000.000.000).
- Disponibilidade: Um valor que diz se a peça está à venda ou não.

Regra Extra: No final, faça uma operação matemática simples: multiplique a quantidade pelo preço e guarde em uma variável chamada valorTotalEstoque. Imprima tudo de forma organizada.
*/
public class SimuladorEstoque {
    public static void main (String [] args){
        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(Locale.of("pt","br"));
        char categoria = 'P';
        short estoque = 500;
        BigDecimal preco = new BigDecimal("799.99");
        long id = 3528057209L;
        boolean disponivel = true;
        BigDecimal valorTotalEstoque = preco.multiply(BigDecimal.valueOf(estoque));

        System.out.print("id: " + id +
        " | Categoria: " + categoria + 
        " | Estoque: " + estoque + 
        " | Preço: " + formatadorMoeda.format(preco) + 
        " | Valor total de estoque: " + formatadorMoeda.format(valorTotalEstoque) + 
        " | Disponibilidade: " + disponivel );
    
    }
}