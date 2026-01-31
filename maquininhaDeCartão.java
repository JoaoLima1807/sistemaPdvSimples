package Exercicios;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class maquininhaDeCartão {


    void main() {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "963258";

        while (true) {
            IO.println("\n--- SISTEMA DE PAGAMENTO ---");
            IO.print("Digite o valor da compra: R$  ");
            double valor = sc.nextDouble();

            IO.println("Escolha o modo de pagamento: ");
            IO.println("1 - Crédito");
            IO.println("2 - Débito");
            int opcao = sc.nextInt();

            String modo = "";
            int parcelas = 1;

            // Lógica de parcelamento e modo
            if (opcao == 1) {
                modo = "Crédito";
                IO.println("Deseja parcelar? (1x, 2x ou 3x): ");
                parcelas = sc.nextInt();
                if (parcelas < 1 || parcelas > 3) parcelas = 1;
            } else if (opcao == 2) {
                modo = "Débito";
            } else {
                IO.println("Opção inválida!");
                continue;
            }

            // Validação de senha
            System.out.print("Digite a senha: ");
            String senhaDigitada = sc.next();

            if (senhaDigitada.equals(senhaCorreta)) {
                imprimirVia(valor, modo, parcelas);
                break; // Finaliza o programa após o sucesso
            } else {
                IO.println("Pagamento não aprovado! Senha incorreta.");
                // O loop volta para a estaca inicial automaticamente
            }
        }
    }

    void imprimirVia(double valor, String modo, int parcelas) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = dtf.format(LocalDateTime.now());

        IO.println("\n========= VIA DO CLIENTE =========");
        IO.println("Data: " + dataFormatada);
        System.out.printf("Valor Total: R$ %.2f%n", valor);
        IO.println("Modo: " + modo);
        if (modo.equals("Crédito")) {
            System.out.printf("Parcelamento: %dx de R$ %.2f%n", parcelas, (valor / parcelas));
        }
        IO.println("Status: APROVADO");
        IO.println("==================================");

    }

}

