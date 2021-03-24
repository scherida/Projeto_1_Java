package br.com.loja.service.program;

import br.com.loja.service.Database.ProductDatabase;
import br.com.loja.service.entities.Product;

import java.util.*;

public class Program {

    public static void programApplication() {

        try {
            int opcao;
                Product product = new Product();
                Scanner sc = new Scanner(System.in);
                Locale.setDefault(Locale.US);

                System.out.println("------------- Bem vindo à loja de produtos -------------");
                System.out.println();
                System.out.println("Escolha uma opção: ");
                System.out.println("1 - mostrar lista de produtos");
                System.out.println("2 - Procurar produtos por nome");
                System.out.println("3 - desejo adicionar produtos");
                System.out.println("4 - desejo sair da loja");
                opcao = sc.nextInt();

                switch(opcao){
                    case 1:
                        ProductDatabase.ReturnListProcucts();
                        Program.programApplication();
                        break;

                    case 2:
                        System.out.println("Digite o name:");
                        String nome = sc.next();
                        ProductDatabase.SearchProcucts(nome);
                        Program.programApplication();
                        break;

                    case 3:
                        System.out.println("Digite o Id:");
                        try{
                            product.setId(sc.nextInt());
                        }catch (InputMismatchException | NumberFormatException e){
                            System.out.println("Digite apenas números. Tente novamente!");
                            Program.programApplication();
                        }

                        System.out.println("Digite o name:");
                        product.setName(sc.next());
                        System.out.println("Digite a quantidade:");
                        try{
                            product.setQuantity(sc.nextInt());
                        }catch (InputMismatchException | NumberFormatException e){
                            System.out.println("Digite apenas números. Tente novamente!");
                            Program.programApplication();
                        }

                        System.out.println("Digite o preço:");
                        try{
                            product.setPrice(sc.nextDouble());
                        }catch (InputMismatchException ex){
                            System.out.println("Preço inválido!");
                            Program.programApplication();
                        }catch (NumberFormatException exc){
                            System.out.println("Preço inválido!");
                            Program.programApplication();
                        }

                        System.out.println("Digite a descrição:");
                        product.setDescription(sc.next());
                        System.out.println("Digite a categoria: ");
                        product.setCategory(sc.next());

                        ProductDatabase.AddProcucts(product.getId(), product);
                        Program.programApplication();
                        break;

                    case 4:
                        System.out.println("Volte sempre!");
                        break;

                    default:
                        System.out.println ("Você escolheu uma opção que não existe!");
                        Program.programApplication();
                        break;
                }

                sc.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

}
