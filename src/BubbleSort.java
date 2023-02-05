/*

    Name: Matthias Thoma
    Email: matthias.thoma@edu.campus02.at
    Matrikel-Number: 1133266

 */



public class BubbleSort {


    public static void sort(int[] array) {
        int temp;
        int n = array.length;

        for (int i = 0; i < n - 1; i++ ) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        /*
        TODO: Sortieren Sie den Inhalt eines Arrays mittels BubbleSort
        Idee Matthias: Rekursiv Vorschlag:
            - Iterieren Sie mit einer Schleife über den gesamten Array
            - Innerhalb der Schleife implementieren Sie eine weitere, innere Schleife
                - Vergleichen Sie jeweils das aktuelle Element mit dem nächsten Element
                - Wenn diese größer ist, dann tauschen Sie diese aus

        https://de.wikipedia.org/wiki/Bubblesort#Algorithmus
         */





    }

}
