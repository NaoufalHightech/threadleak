package ben.com.threadleak.utils;

public class LargeObject {
    private String[] largeArray;

    public LargeObject() {
        // Simuler un grand objet
        largeArray = new String[1000000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = "Données volumineuses " + i;
        }
    }
}
