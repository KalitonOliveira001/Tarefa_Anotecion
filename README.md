
 Tarefa: Anotação @Tabela

 Objetivo
Criar uma anotação Java chamada `@Tabela` que recebe um valor (o nome da tabela) e usá-la em uma classe de exemplo.  
O programa vai ler essa anotação em tempo de execução e imprimir o valor no console.

 Código comentado
Todos os arquivos (`Tabela.java`, `Cliente.java`, `Main.java`) estão comentados linha a linha** para facilitar o entendimento.

Como rodar

1. Abrir no IntelliJ IDEA
   - Vá em `File → Open` e selecione a pasta do projeto.

2. Compilar e executar 
    Abra o arquivo `Main.java`.  
    Clique no botão Run ▶ na parte de cima.

 Resultado esperado
Quando o programa rodar, no console vai aparecer:

Nome da tabela: clientes

Copiar código

Isso significa que:
 A classe `Cliente` tem a anotação `@Tabela("clientes")`
 O `Main.java` conseguiu ler essa anotação e mostrar o valor.

 Explicação rápida
`@interface` → cria uma anotação em Java.  
`@Target(ElementType.TYPE)`** → a anotação pode ser usada em classes e interfaces.  
`@Retention(RetentionPolicy.RUNTIME)`** → a anotação pode ser lida enquanto o programa roda.  
`String value()`** → define um campo chamado `value` que vai guardar o nome da tabela.

 Autor: Káliton Oliveira  
Data:10/08/2025
