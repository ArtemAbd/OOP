import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fruits apple = new Apple();
        Fruits mandarin = new Mandarin();
        Fruits pineapple = new Pineapple();
        Fruits banana = new Banana();
        System.out.println();

// добавление мандарина в корзину
        List<Fruits> fruits1 = new ArrayList<>();
        fruits1.add(mandarin);
        fruits1.add(apple);
        fruits1.add(pineapple);
        fruits1.add(mandarin);
        System.out.println("Задача 1. Сейчас в корзине лежат: " + fruits1);
        System.out.println();

// Добавление мандарина на позицию 1
        List<Fruits> fruits2 = new ArrayList<>();
        fruits2.add(mandarin);
        fruits2.add(apple);
        fruits2.add(pineapple);
        fruits2.add(1, mandarin);
        System.out.println("Задача 2. Сейчас в корзине лежат: " + fruits2);
        System.out.println();

// Удаление элемента с индексом 1 из корзины
        List<Fruits> fruits3 = new ArrayList<>();
        fruits3.add(mandarin);
        fruits3.add(apple);
        fruits3.add(pineapple);
        fruits3.remove(1);
        System.out.println("Задача 3. Сейчас в корзине лежат: " + fruits3);
        System.out.println();

// получение наименования фрукта по индексу
        List<Fruits> fruits4 = new ArrayList<>();
        fruits4.add(mandarin);
        fruits4.add(banana);
        System.out.println("Задача 4. Фрукт с индеком 1 это  - " + fruits4.get(1));
        System.out.println();

// замена фрукта с индексом 1
        List<Fruits> fruits5 = new ArrayList<>();
        fruits5.add(mandarin);
        fruits5.add(banana);
        fruits5.add(pineapple);
        fruits5.set(1, apple);
        System.out.println("Задача 5. Сейчас в корзине лежат: " + fruits5);
        System.out.println();

// получение количества наименований фруктов в корзине
        List<Fruits> fruits6 = new ArrayList<>();
        fruits6.add(mandarin);
        fruits6.add(banana);
        fruits6.add(pineapple);
        System.out.println("Задача 6. Количество наименований фруктов в корзине: " + fruits6.size());
        System.out.println();

// Проверка наличия пустых мест в корзине
        List<Fruits> fruits7 = new ArrayList<>();
        fruits7.add(mandarin);
        fruits7.add(banana);
        fruits7.add(pineapple);
        boolean empty = true;
        if (empty = fruits7.isEmpty()) System.out.println("Задача 7. В корзине есть пустые места");
        else System.out.println("Задача 7. В корзине нет пустых мест");
        System.out.println();

// Проверка наличия ананаса в корзине
        List<Fruits> fruits8 = new ArrayList<>();
        fruits8.add(mandarin);
        fruits8.add(banana);
        fruits8.add(pineapple);
        boolean isExist = true;
        if (isExist = fruits8.contains(pineapple))
            System.out.println("Задача 8. В корзине есть ананас");
        else System.out.println("Задача 8. В корзине нет ананаса");
        System.out.println();

// Получение индекса определенного фрукта
        List<Fruits> fruits9 = new ArrayList<>();
        fruits9.add(mandarin);
        fruits9.add(banana);
        fruits9.add(apple);
        System.out.println("Задача 9. Индекс яблока = " + fruits9.indexOf(apple));
    }
}