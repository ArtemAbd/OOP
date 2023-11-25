import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Fruits apple = new Apple(2);
        Fruits mandarin = new Mandarin(4);
        Fruits pineapple = new Pineapple(6);
        Fruits banana = new Banana(9);

// добавление мандарина в корзину
        List<Fruits> fruits1 = new ArrayList<>();
        fruits1.add(mandarin);
        fruits1.add(apple);
        fruits1.add(pineapple);
        System.out.println("Задача 1.");
        System.out.println("Сейчас в корзине лежат: " + fruits1);
        fruits1.add(mandarin);
        System.out.println("Сейчас в корзине лежат: " + fruits1);
        System.out.println();

// Добавление мандарина на позицию 1
        List<Fruits> fruits2 = new ArrayList<>();
        fruits2.add(mandarin);
        fruits2.add(apple);
        fruits2.add(pineapple);
        System.out.println("Задача 2.");
        System.out.println("Сейчас в корзине лежат: " + fruits2);
        fruits2.add(1, mandarin);
        System.out.println("Сейчас в корзине лежат: " + fruits2);
        System.out.println();

// Удаление элемента с индексом 1 из корзины
        List<Fruits> fruits3 = new ArrayList<>();
        fruits3.add(mandarin);
        fruits3.add(apple);
        fruits3.add(pineapple);
        System.out.println("Задача 3.");
        System.out.println("Сейчас в корзине лежат: " + fruits3);
        fruits3.remove(1);
        System.out.println("Сейчас в корзине лежат: " + fruits3);
        System.out.println();

// получение наименования фрукта по индексу
        List<Fruits> fruits4 = new ArrayList<>();
        fruits4.add(mandarin);
        fruits4.add(banana);
        System.out.println("Задача 4.");
        System.out.println("Сейчас в корзине лежат: " + fruits4);
        System.out.println("Фрукт с индекcом 1 это  - " + fruits4.get(1));
        System.out.println();

// замена фрукта с индексом 1
        List<Fruits> fruits5 = new ArrayList<>();
        fruits5.add(mandarin);
        fruits5.add(banana);
        fruits5.add(pineapple);
        System.out.println("Задача 5.");
        System.out.println("Сейчас в корзине лежат: " + fruits5);
        fruits5.set(1, apple);
        System.out.println("Сейчас в корзине лежат: " + fruits5);
        System.out.println();

// получение количества наименований фруктов в корзине
        List<Fruits> fruits6 = new ArrayList<>();
        fruits6.add(mandarin);
        fruits6.add(banana);
        fruits6.add(pineapple);
        System.out.println("Задача 6.");
        System.out.println("Сейчас в корзине лежат: " + fruits6);
        System.out.println("Количество наименований фруктов в корзине: " + fruits6.size());
        System.out.println();

// Проверка наличия пустых мест в корзине
        List<Fruits> fruits7 = new ArrayList<>();
        fruits7.add(mandarin);
        fruits7.add(banana);
        fruits7.add(pineapple);
        System.out.println("Задача 7.");
        System.out.println("Сейчас в корзине лежат: " + fruits7);
        String answer = "В корзине %s";
        if (fruits7.isEmpty()) {
            System.out.println(String.format(answer, "есть пустые места"));

        } else {
            System.out.println(String.format(answer, "нет пустых мест"));
        }
        System.out.println();

// Проверка наличия ананаса в корзине
        List<Fruits> fruits8 = new ArrayList<>();
        fruits8.add(mandarin);
        fruits8.add(banana);
        fruits8.add(pineapple);
        System.out.println("Задача 8.");
        System.out.println("Сейчас в корзине лежат: " + fruits8);
        String answer1 = "В корзине %s";
        if (fruits8.contains(pineapple)) {
            System.out.println(String.format(answer1, "есть ананас"));
        } else {
            System.out.println(String.format(answer1, "нет ананаса"));
        }
        System.out.println();

// Получение индекса определенного фрукта
        List<Fruits> fruits9 = new ArrayList<>();
        fruits9.add(mandarin);
        fruits9.add(banana);
        fruits9.add(apple);
        System.out.println("Задача 9.");
        System.out.println("Сейчас в корзине лежат: " + fruits9);
        System.out.println("Индекс яблока = " + fruits9.indexOf(apple));
    }
}