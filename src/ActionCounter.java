import java.util.*;
/*
делал согласно примера:
    - передаваемое время в метод getAction(305) тоже считает это время обращения включительно,
    а время 305 - 300 = 5 уже включено не будет.
    - сделанно безобразно, его можно отредактировать, но идея понятна "Бинарный поиск" c некоторыми особенностями
    под задачу;
 */

public class ActionCounter {
    private static List<Integer> timestampList = new ArrayList<>();

    public ActionCounter() {
    }

    public void call(int timestamp) {
        timestampList.add(timestamp);
    }

    public int getActions(int timestamp) {
        if (timestampList.get(timestampList.size() - 1) < 300)
            return timestampList.size();
        int startIndex = binarySearchIndex(timestamp - 300);
        int endIndex = binarySearchIndex(timestamp);
        return endIndex - startIndex;
    }


    public int binarySearchIndex(double valueToFind) {

        int index = 0;
        int startIndex = 0;
        int endIndex = timestampList.size() - 1;


        if (valueToFind <= 0)
            return -1;

        while (startIndex <= endIndex) {

            int mid = startIndex + (endIndex - startIndex) / 2;

            if (timestampList.get(mid) < valueToFind) {
                if (timestampList.get(startIndex) == timestampList.get(endIndex) || endIndex - startIndex == 1) {
                    index = timestampList.get(startIndex) <= valueToFind ? startIndex : startIndex + 1;
                    break;
                }
                startIndex = mid + 1;

            } else if (timestampList.get(mid) > valueToFind) {
                if (timestampList.get(startIndex) == timestampList.get(endIndex) || endIndex - startIndex == 1) {
                    index = timestampList.get(startIndex) == valueToFind ? startIndex : startIndex - 1;
                    break;
                }
                endIndex = mid - 1;

            } else if (timestampList.get(mid) == valueToFind) {
                index = binarySearchIndex(valueToFind + 0.5); // здесь используется промежуточное значение (0.5) для поиска индекса последнего предшествующего значения;
                break;
            }
        }
        return index;
    }
}
