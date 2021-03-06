package br.com.loja.service.database;


import br.com.loja.service.entities.Product;
import br.com.loja.service.program.Program;

import java.util.HashMap;

public class ProductDatabase {

    public static HashMap<Integer, Product> totalproducts = new HashMap<>();

    public static void returnListProducts(){
        if(totalproducts.size()>0){
            for (Integer key : totalproducts.keySet()) {
                Product product = totalproducts.get(key);
                System.out.println(product);
                limpaTela();
            }
        }else{
            System.out.println("Lista vazia!");
            Program.programApplication();
        }

    }

    public static void addProducts(Integer id, Product product){
        if(id != 0 || product != null){
            totalproducts.put(id, product);
            System.out.println(product);
            System.out.println("Produto adicionado!");
        }else{
            System.out.println("Tente novamente!");
            Program.programApplication();
        }
    }

    public static void searchProducts(String nome){
        for (Integer key : totalproducts.keySet()) {
            Product products = totalproducts.get(key);
            limpaTela();
            if(products.getName().equalsIgnoreCase(nome)){
                System.out.println("Nome: " + products.getName() +
                                   ", Preço: " + products.getPrice() +
                                   ", Descrição: " + products.getDescription());
            }else{
                System.out.println("O produto não foi encontrado!");
            }
        }
    }

    public static void limpaTela() {
        System.out.println();
    }
}
