package ru.netology.repository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.AfishaItem;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AfishaRepositoryTest {
    private AfishaRepository repository = new AfishaRepository();
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
    public void setUp() {
        repository.save(f);
        repository.save(s);
        repository.save(th);
        repository.save(fo);
        repository.save(fi);
        repository.save(si);
        repository.save(se);
        repository.save(et);
        repository.save(n);
        repository.save(t);

    }

    @Test
    void shouldFindAll() {
        repository.findAll();
        AfishaItem []actual = repository.findAll();
        AfishaItem[] expected = new AfishaItem[]{f,s,th,fo,fi,si,se,et,n,t};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldSave() {
        AfishaItem[] actual = repository.findAll();
        AfishaItem[] expected = new  AfishaItem[]{f,s,th,fo,fi,si,se,et,n,t};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveById() {
        AfishaRepository repository = new AfishaRepository();
        int idToRemove = 2;
        repository.save(f);
        repository.save(s);
        repository.save(th);
        repository.save(fo);

        repository.removeById(idToRemove);
        AfishaItem[]actual = repository.findAll();
        AfishaItem[] expected = new AfishaItem[]{f,th,fo};
        assertArrayEquals(expected, actual);


}
    @Test
    void shouldFindById() {
        AfishaRepository repository = new AfishaRepository();
        int idToFind = 3;
        repository.save(f);
        repository.save(s);
        repository.save(th);

        repository.findById(idToFind);
        AfishaItem actual = repository.findById(idToFind);
        AfishaItem expected = th;
        assertEquals(actual, expected);


}
    @Test
    void shouldFindByIdIfIdDoesNotExist() {
        AfishaRepository repository = new AfishaRepository();
        int idToFind = 4;
        repository.save(f);
        repository.save(s);
        repository.save(th);
        repository.findById(idToFind);
        AfishaItem actual = repository.findById(idToFind);
        AfishaItem expected = null;
        assertEquals(expected, actual);

    }

    @Test
    void shouldRemoveAll() {
        AfishaRepository repository = new AfishaRepository();
        repository.save(f);
        repository.save(s);
        repository.save(th);
        repository.save(fo);
        repository.save(fi);
        repository.save(si);
        repository.save(se);
        repository.save(et);
        repository.save(n);
        repository.save(t);

        repository.removeAll();
        AfishaItem[] actual = repository.findAll();
        AfishaItem[] expected = {};
        assertArrayEquals(actual, expected);
    }
}
