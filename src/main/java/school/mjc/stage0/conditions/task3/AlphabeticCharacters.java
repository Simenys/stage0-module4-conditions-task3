package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println("Vowel");
        } else if (character >= 'a' && character <= 'z') {
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}

// Vowels are: a, e, i, o, u .
// "Vowel" or consonant if it's "Consonant". And If it is not from eng alphabet than print "wrong alphabet!"