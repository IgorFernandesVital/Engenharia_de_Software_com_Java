package etapa_2_variaveis_tipos_primitivos; 

/* Desafio Prático
Crie um novo arquivo chamado DadosColaborador.java. O desafio é declarar as variáveis corretas para as seguintes informações de um funcionário:

- A idade dele.
- O código de identificação da empresa (um número que pode chegar a 1 bilhão).
- O salário (com centavos).
- Se ele possui seguro de vida (sim ou não).
- A inicial do nome dele.

Regra: Tente escolher o tipo que faça mais sentido para o tamanho do dado. Imprima todos esses valores no final usando o System.out.println.
*/

public class DadosColaborador {
    public static void main (String[] args){
        byte idade = 18; // 8bits | -128 à 127
        int idEmpresa = 246468845; // 32bits | inteiros até 2 bilhões
        double salario = 1500.60; // 64bits | Decimal de alta precisão
        boolean seguroVida = true; // 1bit | verdadeiro ou falso
        char inicialNome = 'I'; // 16bit | Um unico character 

        System.out.println("Inicial do nome: " + inicialNome + " Idade: " + idade + " Salário: R$ " + salario + " Seguro de vida: " + seguroVida + " Identificação da empresa: " + idEmpresa);
    }
    
}

