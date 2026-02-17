package model;

public class BigO {


    //Classe para relembrar Big-O notation -> medir a complexidade de algoritmos de acordo com o espaço e tempo conforme o tamanho da entrada.
    //Analisar o pior caso

    //O(1) -> constante acesso posição índice array
    //O(logn) -> busca binária
    //O(n) -> linear percorre lista
    //O(n log n) -> eficiente mergesort
    //O(n^2) -> quadrática dois loops aninhados
    //O(2^n) -> exponencial problemas recursivos
    //O(n!) -> fatorial força bruta

    //RECONHECER COMPLEXIDADE

    //Sempre buscar diminuir a complexidade dos algoritmos

    private static int n;

    public static void main(String[] args) {
        //1
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        //Loop, em que cada iteração acrescenta na var sum -> constante O(n)
        //Um único loop dependente de n, em que cada iteração executa uma operação constante


        //2
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        //Percorrer loop -> O(1)
        //Se 100 virar n -> não muda a complexidade, pois constantes não crescem com input


        //3
        for (int i = 0; i < n; i++) {
            System.out.println("Oi");
        }
        for (int j = 0; j < n; j++) {
            System.out.println("Tchau");
        }

        //Complexidade final O(n)


        //4
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + j);
            }
        }

        //Loops aninhados é O(n^2)

        //5
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.println(i + j);
            }
        }

        //Loops aninhados é O(n^2), Big-0 não considera frações

        //6
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }//n
        for (int j = 0; j < n * n; j++) {
            System.out.println(j);
        }//O(n^2) -> multiplica
        //Loop O(n^2), fica só com o termo dominante que cresce mais rápido


        //Analisar melhor e pior caso -> melhor é quando o algoritmo funciona simples, pior é quando se estende
        //Para analisar um algoritmo perguntamos: Quantas operações ele faz dependendo da entrada?
        //Big-O representa sempre o pior caso, pois garante o limite máximo de tempo, dá segurança sobre performance

        //BIG-O MEDE CRESCIMENTO
        //MELHOR O(1) que não cresce com n
        //PIOR O(n²), O(2^n), O(n!)

        //Padrão nos loops ->
        /*
        Algoritmo:
        sem loop -> O(1)
        1 LOOP ATÉ N -> O(N)
        Loop até metade de n -> O(n)
        Loop dentro do lop(aninhado) -> O(n^2)
        Loop dobrando * -> O(log n)
        2 loops separados -> O(n)
        Recursão linear O(n)
         */

















    }










}

