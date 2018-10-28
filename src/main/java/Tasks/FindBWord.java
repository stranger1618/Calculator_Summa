package Tasks;

import java.util.BitSet;

/**
 * Класс Слова
 * Хранит массив слов и осуществляет в нем поиск слова максимальной длины

 */


public class FindBWord {
    public String[] myWord;


    /**
     * Метод поиска в массиве слова максимальной длины
     *
     * @return Слово максимальной длины
     */
    public String findLongest() {
        //Получение массива слов, хранящегося в текущем объекте


        String[] words = myWord;


        //Задание начальных значений максимальной длины слова и слова этой длины
        int maxLength = myWord[0].length();
        String longestWord = words[0];


        //Поиск слова максимальной длины
        for (String word : words) {
            if (word.length() > maxLength) {
                //Если длина просматриваемого слова больше установленной, задать новые значения переменным
                maxLength = word.length();
                longestWord = word;
            }
        }


        //Возвращение слова максимальной длины
        return longestWord;
    }
}
