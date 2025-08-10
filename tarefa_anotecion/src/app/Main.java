// Endereço onde esse arquivo está guardado.
package com.kaliton.tarefaanotacao.app;

// Aqui importamos a anotação Tabela para poder verificar ela.
import com.kaliton.tarefaanotacao.annotations.Tabela;
// Aqui importamos a classe Cliente para testar a anotação.
import com.kaliton.tarefaanotacao.model.Cliente;

public class Main {
    public static void main(String[] args) {

        // Aqui pegamos o "desenho" da classe Cliente para o Java (Class object).
        Class<Cliente> clazz = Cliente.class;

        // Perguntamos: "Essa classe tem a anotação @Tabela?"
        if (clazz.isAnnotationPresent(Tabela.class)) {

            // Se tem, pegamos a anotação.
            Tabela tabela = clazz.getAnnotation(Tabela.class);

            // Aqui mostramos o valor da anotação no console.
            System.out.println("Nome da tabela: " + tabela.value());

        } else {
            // Se não tiver a anotação, mostramos outra mensagem.
            System.out.println("A classe não tem a anotação @Tabela.");
        }
    }
}
