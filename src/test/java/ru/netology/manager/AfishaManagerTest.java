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

    @BeforeEach
    public void setUp(){
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
    }


    @Test
    public void shouldAddFilm() {
        AfishaManager manager = new AfishaManager();
        manager.add(f);
        AfishaItem[] expected = new AfishaItem[]{f};
        AfishaItem[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void getAlls() {
        AfishaItem[] actual = manager.getAll();
        AfishaItem[] expected = new AfishaItem[]{t, n, et, se, si, fi, fo, th, s, f};
        assertArrayEquals(expected, actual);
    }


    @Test
    void getFilmsOfManager() {
        manager.setFilmsOfManager(10);
        assertEquals(10,manager.getFilmsOfManager());
    }


    @Test
    void testGetAmountOfFilms() {
        AfishaManager manager = new AfishaManager();
        AfishaItem x = new AfishaItem(11, 11, "x", 1, 1);
        manager.add(se);
        manager.add(et);
        manager.add(n);
        manager.add(t);
        manager.add(x);
        AfishaItem[] actual = manager.getAll();
        AfishaItem[] expected = new AfishaItem[]{ x, t, n, et, se};
        assertArrayEquals(expected, actual);

    }

    @Test
    void testGetAmountOfFilm() {
        AfishaItem x = new AfishaItem(11, 11, "x", 1, 1);
        manager.add(x);
        AfishaItem[] actual = manager.getAmountOfFilms();
        AfishaItem[] expected = new AfishaItem[]{ x, t, n, et, se, si, fi, fo, th, s};
        assertArrayEquals(expected, actual);

    }

    @Test
    void getAmountOfFilms() {
        AfishaManager manager = new AfishaManager();
        AfishaItem x = new AfishaItem(11, 11, "x", 1, 1);
        AfishaItem el = new AfishaItem(12, 12, "x", 1, 1);
        AfishaItem tw = new AfishaItem(13, 13, "x", 1, 1);
        AfishaItem thr = new AfishaItem(14, 14, "x", 1, 1);
        AfishaItem forth = new AfishaItem(15, 15, "x", 1, 1);

        int filmsOfManager =10;
        manager.add(x);
        manager.add(el);
        manager.add(tw);
        manager.add(thr);
        manager.add(forth);
        AfishaItem[] actual = manager.getFilmsOfManager(filmsOfManager);
        AfishaItem[] expected = new AfishaItem[]{forth, thr,tw,el,x};
        assertArrayEquals(expected, actual);



    }
}

