package br.com.loja.service;

import br.com.loja.service.database.ProductDatabase;
import br.com.loja.service.entities.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.stereotype.Service;

@Service
@RunWith(MockitoJUnitRunner.class)
public class ProductTest {

    Product product = new Product();

    @Test
    public void deveriaAdicionarProdutosDeTeste() {
        product.setId(2);
        product.setName("shampoo");
        product.setPrice(75);
        product.setCategory("Cosméstico");
        product.setDescription("Shampoo anti-queda");
        product.setQuantity(45);
        System.out.println();
        ProductDatabase.addProducts(1, product);
    }

    @Test
    public void deveriaEncontrarProdutosdeTeste() {
        System.out.println("============== Encontrar lista: ==============");
        deveriaAdicionarProdutosDeTeste();
        ProductDatabase.searchProducts("shampoo");
        System.out.println("====================================");
    }

    @Test
    public void deveriaRetornarListaDeTeste() {
        System.out.println("============== Retornar lista: ==============");
        ProductDatabase.returnListProducts();
    }
}
