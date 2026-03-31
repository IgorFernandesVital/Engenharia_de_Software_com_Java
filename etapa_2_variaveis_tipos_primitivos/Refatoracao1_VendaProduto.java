package etapa_2_variaveis_tipos_primitivos;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/* Código "sujo" gerado por IA
public class teste {
public static void main(String[] args) {
double d = 1000.50; 
double d2 = 10;
double r = d * d2;
System.out.println(r);
}
}
*/

public class Refatoracao1_VendaProduto {
    public static void main(String[] args){
    BigDecimal precoProduto = new BigDecimal(1000.50);
    int quantidadeProduto = 10;
    BigDecimal totalVenda = precoProduto.multiply(new BigDecimal(quantidadeProduto));
    NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(Locale.of("pt","BR"));
   
    System.out.println("Valor total da venda: " + formatadorMoeda.format(totalVenda));
    }
}