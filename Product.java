package OOP;

import java.util.ArrayList;
import java.util.List;

class Product {

        private String name; // свойство для хранения имени продукта

        // Конструктор класса Product
        public Product(String name) {
            this.name = name;
        }

        // Геттер для получения имени продукта
        public String getName() {
            return name;
        }
    }
    // Создаем класс с новым продуктом, расширяющий класс Product
class NewProduct extends Product {
    private int property; // новое свойство продукта

    // Конструктор класса NewProduct
    public NewProduct(String name, int property) {
        super(name);
        this.property = property;
    }

    // Геттер для получения нового свойства продукта
    public int getProperty() {
        return property;
    }
}
class VendingMachine {
    private List<Product> products; // список доступных продуктов

    // Конструктор класса VendingMachine
    public VendingMachine() {
        products = new ArrayList<Product>();
    }

    // Метод для добавления продукта в список продуктов вендинг машины
    public void addProduct(Product product) {
        products.add(product);
    }

    // Метод для продажи продукта по его индексу в списке
    public void sellProduct(int index) {
        if (index >= 0 && index < products.size()) {
            Product soldProduct = products.remove(index);
            System.out.println("Продан продукт: " + soldProduct.getName());
        } else {
            System.out.println("Продукта с таким индексом нет");
        }
    }
}
