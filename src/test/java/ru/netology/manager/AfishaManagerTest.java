package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.AfishaItem;
import static org.junit.jupiter.api.Assertions.*;

public class AfishaManagerTest {
    AfishaManager manager = new AfishaManager();
    AfishaItem f = new AfishaItem(1, 1, "f", 1, 1);
    AfishaItem s = new AfishaItem(2, 2, "s", 1, 1);
    AfishaItem th = new AfishaItem(3, 3, "th", 1, 1);
    AfishaItem fo = new AfishaItem(4, 4, "fo", 1, 1);
    AfishaItem fi = new AfishaItem(5, 5, "fi", 1, 1);
    AfishaItem si = new AfishaItem(6, 6, "si", 1, 1);
    AfishaItem se = new AfishaItem(7, 7, "se", 1, 1);
    AfishaItem et = new AfishaItem(8, 8, "et", 1, 1);
    AfishaItem n = new AfishaItem(9, 9, "n", 1, 1);
    AfishaItem t = new AfishaItem(10, 10, "t", 1, 1);

    @Test
    public void add(AfishaItem item) {
        manager.add(f);
        AfishaItem[] expected = new AfishaItem[]{f};
        AfishaItem[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }
}
