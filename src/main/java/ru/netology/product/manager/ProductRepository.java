package ru.netology.product.manager;

public class ProductRepository {

    private Product[] products = new Product[0];

    //вывод всех объектов
    public Product[] findAll() {
        return products;
    }

    //сохранить/добавить объект
    public void save(Product newProduct) {
        int length = products.length + 1;
        Product[] tmp = new Product[length];

        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = newProduct;

        products = tmp;
    }

    //удалить объект по id
    public void removeById(int removeId) {
        if (products.length != 0) {
            Product[] tmp = new Product[products.length - 1];
            int copyToIndex = 0;

            for (int i = 0; i < products.length; i++) {
                if (products[i].getId() != removeId) {
                    if (copyToIndex + 1 == products.length) { //если id товара не найден, выходим из метода
                        return;
                    }
                    tmp[copyToIndex] = products[i];
                    copyToIndex++;
                }
            }

            products = tmp;
        }
    }
}