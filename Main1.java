package Lesson12_2;
import java.util.Arrays;
import java.util.List;

public class Main1 {
        public static void main(String[] args) {
            Cat cat = new Cat("Leo", 2);

            Cat live = new Live("Lex", 4);

            List<Cat> discotheque = Arrays.asList(cat, live);
            for (Cat d : discotheque) {
                d.city();
            }

        }

}
