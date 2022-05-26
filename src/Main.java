import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    //1.определяем final-переменные
    private static final String SOURCE_TEXT =
            "нарум	бунгар даран темур дягва тим тим тату бубере ау	ауа	сау	уй со йо нар куле валь";

    public static void main(String args[]) {
//2. Применяем чистую функцию: она детерминирована и  не обладает побочными эффектами:
        List<String> orderedWords = orderingTheWordsOfTheText(SOURCE_TEXT);

        System.out.println("Исходный текст аборигенов:" + SOURCE_TEXT);
        System.out.println("Упорядоченные слова для словаря:" + orderedWords);
    }

    //3. Применение монады:  Stream API для реализации монад.
    //4. Применение функции высших порядков (принимаем в качестве аргументов другие функции
    // и в качестве результата также возвращаем функцию
    public static List<String> orderingTheWordsOfTheText(String SOURCE_TEXT) {

        return Arrays.asList(SOURCE_TEXT.split("\\s+")).stream()
                .sorted()
                .collect(Collectors.toList());
    }
}