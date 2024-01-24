
import java.util.Scanner;

public class Menu extends Agenda{
    public void opcoes(){
        Scanner escolha = new Scanner(System.in);
        while (true){
            System.out.println("\nVer Lista:1\nAdicionar novo contato:2\nApagar contato:3\nSair:4\n");
            int escolhas = escolha.nextInt();
            if  (escolhas == 1){
                listaDeContados();
            } else if (escolhas == 2){
                adicionarContato();
            } else if (escolhas == 3) {
                removerContato();
            } else if (escolhas == 4){
                System.out.println("Saido");
                break;
            }
            else {
                System.out.println("Digite uma opção valida");
            }
        }
    }
}
