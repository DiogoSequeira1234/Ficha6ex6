package org.example;

public class Main {
    public double calcularMediaDigitos(int numero) {
        int soma = 0;
        int quantidade = 0;
        int num = Math.abs(numero);  // Para lidar com números negativos

        if (num == 0) {
            return 0;  // Se o número for 0, retorna 0 para evitar divisão por 0
        }

        // Enquanto houver dígitos no número
        while (num > 0) {
            int digito = num % 10;  // Pega o último dígito
            soma += digito;          // Soma o dígito à soma total
            quantidade++;            // Incrementa a quantidade de dígitos
            num /= 10;               // Remove o último dígito
        }

        // Retorna a média dos dígitos
        return (double) soma / quantidade;
    }
}