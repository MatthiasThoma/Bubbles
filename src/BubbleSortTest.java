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

    /*
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void sort() {
    }

     */
}