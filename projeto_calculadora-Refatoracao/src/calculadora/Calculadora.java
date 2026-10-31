/**
 * <p><strong>Projeto Calculadora</strong></p>
 *
 * <p>Esta classe fornece operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão, além de um método principal que seleciona a operação
 * desejada com base em um operador informado pelo usuário.</p>
 * <p>Este projeto é utilizado para demonstrar:</p>
 * <ul>
 *   <li>Técnicas de revisão estática (caixa branca)</li>
 *   <li>Técnicas de revisão (caixa branca)</li>
 *   <li>Aplicação de refatoração em código Java</li>
 *   <li>Documentação com Javadoc</li>
 * </ul>
 * 
 *
 * @author Vitoria C. Cesar
 * @version 1.0
 */

package calculadora;


public class Calculadora {

    /**
     * <p>Este atributo armazena o resultado da operação matemática realizada.</p>
     * <p>O valor inicial é 0 e é retornado ao final de cada operação.</p>
     */

    public int r = 0;

    /**
     * <p>Este método realiza operações matemáticas básicas (soma, subtração,
     * multiplicação e divisão) com base em dois números inteiros e um operador
     * fornecido pelo usuário.</p>
     * 
     * @param a O primeiro número inteiro.
     * @param b O segundo número inteiro.
     * @param op O operador que define a operação a ser realizada. Pode ser "+",
     *           "-", "*", ou "/".
     * @return O resultado da operação matemática como um inteiro.
     */

    public int calc(int a, int b, String op) {
    
        //Calculadora
        if (op.equals("+")) {
            r = a + b;
        } else if (op.equals("-")) {
            r = a - b;
        } else if (op.equals("*")) {
            r = a * b;
        } else if (op.equals("/")) {
            if (b != 0) {
                r = a / b;
            } else {
                System.out.println("Erro: divisao por zero, operação irregular");
                r = 0;
            }
        } else {
            System.out.println("Operacao invalida");
            r = 0;
        }

        System.out.println("Resultado = " + r);
        return r;
    }

}
