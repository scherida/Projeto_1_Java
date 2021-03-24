package br.com.loja.service.Database;


import br.com.loja.service.entities.Product;
import br.com.loja.service.program.Program;

import java.util.HashMap;

public class ProductDatabase {

    public static HashMap<Integer, Product> totalproducts = new HashMap<Integer, Product>();

    public static void ReturnListProcucts(){
        if(totalproducts.size()>0){
            System.out.println("----------- Lista dos produtos: -----------");
            for (Integer key : totalproducts.keySet()) {
                Product product = totalproducts.get(key);
                System.out.println(product);
                System.out.println();
            }
        }else{
            System.out.println("Lista vazia!");
            Program.programApplication();
        }

    }

    public static void AddProcucts(Integer id, Product product){
        totalproducts.put(id, product);
    }

    public static void SearchProcucts(String nome){
        System.out.println("----------- Produtos relacionados à sua pesquisa: -----------");
        if ( totalproducts.containsKey( nome ) ) {
            System.out.println("Valor da Chave "+nome+
                    " = "+totalproducts.get(nome));
        }else{
            System.err.println("Chave não existe");
        }

    }
}
