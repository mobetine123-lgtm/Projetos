import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner valorDigitadoPeloUsuario = new Scanner(System.in);

        //definicao de variaveis
        String continuar = "S";
        String nomeDoPrato;
        double precoTotalDaCompra = 0.0;
        int quantidadeDeIngredientesComprados;
        int precoIngredientes;
        int bebida;

        System.out.println("_________________________________________________");
        System.out.print("Digite o nome do prato:");
        nomeDoPrato = valorDigitadoPeloUsuario.nextLine();

        System.out.print("quantos ingredientos foram necessarios para fazer a janta de sexta: ");
        quantidadeDeIngredientesComprados = valorDigitadoPeloUsuario.nextInt();

        System.out.print("Digite os ingredientes que faltam: ");

         for (int contador = 3; contador <= quantidadeDeIngredientesComprados; );
        {
            System.out.println("___________________________________________________");
            System.out.print("digite o valor do ingrediente R$");
            double precoTotalIngredientesComprados = valorDigitadoPeloUsuario.nextDouble();

            precoTotalDaCompra = precoTotalIngredientesComprados;



        }

        valorDigitadoPeloUsuario.close();

    }



}