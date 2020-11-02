package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
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
    AfishaItem x = new AfishaItem(11, 11, "x", 1, 1);
    AfishaItem tw = new AfishaItem(12, 12, "tw", 1, 1);





    @Test
    void addFilm() {
        manager.add(f);
        AfishaItem[] actual = manager.getAll();
        AfishaItem[] expected = new AfishaItem[]{f};
        assertArrayEquals(expected, actual);
    }


    @Test
    void getAll() {
        manager = new AfishaManager(12);
        manager.add(f);
        manager.add(s);
        manager.add(th);
        manager.add(fo);
        manager.add(fi);
        manager.add(si);
        manager.add(se);
        manager.add(et);
        manager.add(n);
        manager.add(t);
        AfishaItem[] actual = manager.getAll();
        AfishaItem[] expected = new AfishaItem[]{t,n,et,se,si,fi,fo,th,s,f};
        assertArrayEquals(expected, actual);
}









