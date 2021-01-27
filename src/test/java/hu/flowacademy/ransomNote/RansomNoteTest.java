package hu.flowacademy.ransomNote;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RansomNoteTest {
    private final RansomNote ransomNote = new RansomNote();

    @Test
    public void testCase_1() {
        List<String> magazine = List.of("ebben", "a", "magazinban", "nincs", "túl", "sok", "szó");
        List<String> note = List.of("nincs", "túl", "sok");

        assertTrue(ransomNote.checkMagazine(magazine, note));
    }

    @Test
    public void testCase_2() {
        List<String> magazine = List.of("ebben", "a", "magazinban", "nincs", "túl", "sok", "szó");
        List<String> note = List.of("nincs", "túl", "sok", "időtök");

        assertFalse(ransomNote.checkMagazine(magazine, note));
    }

    @Test
    public void testCase_3() {
        List<String> magazine = List.of("ebben", "a", "magazinban", "Nincs", "túl", "sok", "szó");
        List<String> note = List.of("nincs", "túl", "sok");

        assertFalse(ransomNote.checkMagazine(magazine, note));
    }

    @Test
    public void testCase_4() {
        List<String> magazine = List.of("egy");
        List<String> note = List.of("ezt", "hogy", "rakjam", "ki", "egy", "szóból");

        assertFalse(ransomNote.checkMagazine(magazine, note));
    }
}
