// Esta linha diz em qual "endereço" (pacote) o arquivo mora.
// Assim o Java sabe organizar o código.
package com.kaliton.tarefaanotacao.annotations;

// Aqui importamos a anotação @Documented, que serve para aparecer no Javadoc.
import java.lang.annotation.Documented;
// Aqui importamos o ElementType, que serve para dizer onde a anotação pode ser usada.
import java.lang.annotation.ElementType;
// Aqui importamos Retention, que define quanto tempo a anotação fica disponível.
import java.lang.annotation.Retention;
// Aqui importamos RetentionPolicy, que serve para dizer se fica no código em tempo de execução.
import java.lang.annotation.RetentionPolicy;
// Aqui importamos Target, que serve para indicar onde podemos colocar a anotação.
import java.lang.annotation.Target;

// Diz que essa anotação vai aparecer na documentação gerada do Java.
@Documented
// Diz que essa anotação pode ser usada em CLASSES ou INTERFACES (tipo Cliente).
@Target(ElementType.TYPE)
// Diz que a anotação vai estar disponível em tempo de execução (podemos ler ela no programa).
@Retention(RetentionPolicy.RUNTIME)
public @interface Tabela {
    // Aqui criamos o "valor" que a anotação vai guardar.
    // Quem usar a anotação vai escrever: @Tabela("nome_da_tabela")
    String value();
}
