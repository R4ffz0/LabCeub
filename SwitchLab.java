
    
    import java.util.Scanner;

public class SwitchLab {
    public static void main(String[] args) {

        int opcao;

        Scanner leitorOpcao = new Scanner(System.in);

        System.out.println("1 - Pastel de carne");
        System.out.println("2 - Coxinha de frango");
        System.out.println("3 - Kibe com queijo");

        System.out.print("Escolha uma opção: ");
        opcao = leitorOpcao.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu o Pastel de carne.");
                break;
            case 2:
                System.out.println("Você escolheu a Coxinha de frango.");
                break;
            case 3:
                System.out.println("Você escolheu o Kibe com queijo.");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                break;
        }

        
        leitorOpcao.close();
    }
}