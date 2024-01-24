import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    List<Contato> contatos = new ArrayList<>();

    public void listaDeContados(){
        System.out.println("Lista de Contatos:");
       for (Contato contato : contatos){
           System.out.println("\nNome: " + contato.getNome() + "\nNumero: " + contato.getNumero() + "\nemail: " + contato.getEmail());
       }
    }
    public void adicionarContato(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adicionar Contato:\nNome: ");
        String nome = scanner.nextLine();

        System.out.println("Número de Telefone: ");
        String numero = scanner.nextLine();

        System.out.println("email: ");
        String email = scanner.nextLine();


        Contato novoContato = new Contato(nome,numero,email);
        contatos.add(novoContato);
    }

    public void removerContato(){
        Scanner apagar = new Scanner(System.in);
        if (contatos == null){
            System.out.println('Não tem contatos por enquanto');
        }

        System.out.println("Qual contato deseja remover ?");
         String nomeRemover = apagar.nextLine();
        Contato contatoRemover = null;
         for (Contato contato : contatos){
             if (contato.getNome().equals(nomeRemover)){
                 contatoRemover = contato;
             } else {
                 System.out.println("Tente novamente");
             }
         }

    }
    public void validacao(){

    }

    //fazer um para validação de numero ai dps da validação ai pode add
    //mensagem se não passar na validação
    // mensagem de confirmação para remoção do contato

}
