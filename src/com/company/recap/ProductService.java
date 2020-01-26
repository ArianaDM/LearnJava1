package com.company.recap;

public class ProductService {
    public static void main( String[] args ) {
        Product product = new Product();
        Product product1 = new Product();
        Product product2 = new Product();
        product.setName("Tablet");
        product1.setName("Laptop");
        product2.setName("Phone");
        System.out.println("It's a " + product.getName());
        System.out.println("It's a " + product1.getName());
        System.out.println("It's a " + product2.getName());
    }

    private void processProduct(Product product) {

    }

    protected Product createProduct (int id, String name) {
        return createProduct(1, "Laptop");
    }
}
