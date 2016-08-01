/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CifraCesar;

import java.util.Arrays;


public class Cesar {

    public String cifrar(String frase, int chave) {
        String resultado = "";

        char vetor[] = frase.toCharArray();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (char) (vetor[i] + chave);
            resultado += vetor[i];
        }
        return resultado;
    }

    public String decifrar(String frase, int chave) {
        String resultado = "";
        char vetor[] = frase.toCharArray();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (char) (vetor[i] - chave);
            resultado += vetor[i];
        }
        return resultado;
    }

}
