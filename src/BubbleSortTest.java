import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    /*
    Erstellen Sie eine BubbleSortTest-Klasse und schreiben Sie hier zumindest Tests für folgende UseCases:
            ▪ Sortieren von leerem Array
            ▪ Sortieren von Array mit 5 Elementen folgenden Werten (9, 8, 7, 6, 5)
            ▪ Sortieren von Array mit einem Element
            ▪ 3 weitere aus Ihrer Sicht sinnvolle Tests und begründen Sie als Kommentar, warum Sie diese
                geschrieben haben


     */

    @Test
    void emptyArray(){
        int [] empty = {};
        BubbleSort.sort(empty);
        int [] controlEmpty = {};
        Assertions.assertArrayEquals(controlEmpty, empty);
    }

    @Test
    void presetArray(){
        int [] preset = {9, 8, 7, 6, 5 };
        BubbleSort.sort(preset);
        int [] controlPreset = {5, 6, 7, 8, 9};
        Assertions.assertArrayEquals(controlPreset, preset);
    }

    @Test
    void singleArray(){
        int [] single = {42};
        BubbleSort.sort(single);
        int [] controlSingle = {42};
        Assertions.assertArrayEquals(controlSingle, single);
    }


    // Sinnvoll um zu Testen wie sich der BubbleSort verhält, wenn
    // zwei gleiche Nummern im Array sind.

    @Test
    void sameNumber(){
        int [] same = {3,4,2,4,1,5};
        BubbleSort.sort(same);
        int [] controlSame = {1,2,3,4,4,5};
        Assertions.assertArrayEquals(controlSame, same);
    }

    // Sinnvoll um zu Testen wie sich der BubbleSort verhält, wenn
    // nur gleiche Nummern im Array sind.
    @Test
    void    pureNumbers(){
        int [] pure = {2,2,2,2,2,2,2};
        BubbleSort.sort(pure);
        int [] controlPure = {2,2,2,2,2,2,2};
        Assertions.assertArrayEquals(controlPure, pure);
    }

    // Sinnvoll um zu Testen wie sich der BubbleSort verhält, wenn
    // große Nummern im Array sind.
    @Test
    void bigNumbers(){
        int [] big = {123456, 654321, 24680, 987654321};
        BubbleSort.sort(big);
        int [] controlBig = {24680, 123456, 654321, 987654321};
        Assertions.assertArrayEquals(controlBig, big);
    }

    // Sinnvoll um zu Testen wie sich der BubbleSort verhält, wenn
    // negative Nummern im Array sind.

    @Test
    void negativeNumbers(){
        int [] negative = {-2, -5, -6, -1, -9};
        BubbleSort.sort(negative);
        int [] controlNegative = {-9, -6, -5, -2, -1};
        Assertions.assertArrayEquals(controlNegative, negative);
    }


}