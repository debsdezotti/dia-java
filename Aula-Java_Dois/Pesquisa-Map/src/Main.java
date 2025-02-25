import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, -10, 5, 4, 3);
        
        // Desafio 1 - Mostre a lista na ordem numérica
        System.out.println();
        System.out.println("Desafio 1 - Mostre a lista na ordem numérica");
        List<Integer> numerosOrdenados = numeros.stream()
                .sorted() // Método que ordena em ordem natural
                .collect(Collectors.toList());

        // Exibindo a lista ordenada
        System.out.println("Numeros ordenados: "+ numerosOrdenados);



        // Desafio 2 - Imprima a soma dos números pares da lista
        System.out.println();
        System.out.println("Desafio 2 - Imprima a soma dos números pares da lista");
         /**
         * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
         * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
         */

        int somarNumeros = numeros.stream().reduce(0, Integer::sum);
        // Exibindo a somar de numeros
        System.out.println("A soma dos números é: " + somarNumeros);



        // Desafio 3 - Verifique se todos os números da lista são positivos:
        System.out.println();
        System.out.println("Desafio 3 - Verifique se todos os números da lista são positivos");
        /**
         * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
         * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
         */ 
        // Predicate<Integer> numerosPositivos = n -> n>= 0;

        numeros.stream()
            .filter(n -> n>= 0)
            .forEach(System.out::print);  



        // Desafio 4 - Remova todos os valores ímpares:
        System.out.println();
        System.out.println();
        System.out.println("Desafio 4 - Remova todos os valores ímpares");
        numeros.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::print);



        // Desafio 5 - Calcule a média dos números maiores que 5:
        System.out.println();
        System.out.println();
        System.out.println("Desafio 5 - Calcule a média dos números maiores que 5:");
        
        int somaMaioresQueCinco = numeros.stream()
            .filter(n -> n> 5)
            .reduce(0, Integer::sum);
        System.out.println("A soma dos números maiores que 5 é de: " + somaMaioresQueCinco);



        // Desafio 7 - Encontrar o segundo número maior da lista:
        System.out.println();
        System.out.println();
        System.out.println("Desafio 7 - Encontrar o segundo número maior da lista:");

        Optional<Integer> segundoMaior = numeros.stream()
            .distinct()                   // Remove duplicatas
            .sorted((a, b) -> b - a)      // Ordena em ordem decrescente
            .skip(1)                      // Pula o maior número
            .findFirst();                  // Obtém o segundo maior número

        segundoMaior.ifPresent(valor -> System.out.println("O segundo maior número é: " + valor));
        
        
        

        // Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        System.out.println();
        System.out.println();
        System.out.println("Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem)");

        boolean todosDistintos = numeros.stream()
            .distinct()
            .count() == numeros.size();

        System.out.println("Todos os números são distintos? " + todosDistintos);

        List<Integer> repetidos = numeros.stream()
            .filter(n -> Collections.frequency(numeros, n) > 1) // Pega os números que aparecem mais de uma vez
            .distinct() // Remove duplicatas da saída final
            .collect(Collectors.toList());

        System.out.println("Números que se repetem: " + repetidos);




        // Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
        System.out.println();
        System.out.println();
        System.out.println("Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:");

        List<Integer> numerosMultiplosDe3e5 = numeros.stream()
            .filter(n -> (n % 3 == 0 || n % 5 == 0))
            .distinct()
            .collect(Collectors.toList());

        System.out.println("Os numeros multiplos de 3 e 5 são: " + numerosMultiplosDe3e5);




        // Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
        System.out.println();
        System.out.println();
        System.out.println("Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:");

        int somaDosQuadrados = numeros.stream()
            .map(n -> (int) Math.pow(n, 2)) // ou n * n
            .reduce(0, Integer::sum);
            
        // Exibindo a somar de numeros
        System.out.println("A soma dos quadrados dos números é: " + somaDosQuadrados);




        // Desafio 12 - Encontre o produto de todos os números da lista:
        System.out.println();
        System.out.println();
        System.out.println("Desafio 12 - Encontre o produto de todos os números da lista: ");


        int produtoDosNumeros = numeros.stream()
            .reduce(1, (a, b) -> a * b);

        System.out.println("O produto de todos os números da lista é: " + produtoDosNumeros);




        
        // Desafio 13 - Filtrar os números que estão dentro de um intervalo:
        System.out.println();
        System.out.println();
        System.out.println("Desafio 13 - Filtrar os números que estão dentro de um intervalo: ");

        List<Integer> entre5e10 = numeros.stream()
        .filter(n -> (n > 5 && n < 10))
        .distinct()
        .collect(Collectors.toList());

        System.out.println("Os numeros multiplos de 3 e 5 são: " + entre5e10);




        // Desafio 14 - Encontre o maior número primo da lista:
        System.out.println();
        System.out.println();
        System.out.println("Desafio 14 - Encontre o maior número primo da lista: ");

        Optional<Integer> maiorPrimo = numeros.stream()
            .filter(Main::ehPrimo) // Filtra apenas os números primos
            .max(Integer::compareTo); // Encontra o maior número primo

        System.out.println("O maior número primo da lista é: " + maiorPrimo.orElse(-1));


    }

        // Método para verificar se um número é primo
        public static boolean ehPrimo(int num) {
            if (num < 2) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;}



}




