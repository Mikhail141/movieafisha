package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.AfishaItem;
import ru.netology.repository.AfishaRepository;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)


public class AfishaManagerTest {
    @Mock
    private AfishaRepository repository;
    @InjectMocks
    private AfishaManager manager;
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
        manager.add(f);
        manager.add(s);
        manager.add(th);

    }

    @Test
    public void shouldRemoveIfExists() {
        int idToRemove = 1;
        AfishaItem[] returned = new AfishaItem[]{s, th};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).removeById(idToRemove);

        manager.removeById(idToRemove);
        AfishaItem[] expected = new AfishaItem[]{th, s};
        AfishaItem[] actual = manager.getAll();
        assertArrayEquals(expected, actual);


        verify(repository).removeById(idToRemove);
    }

    @Test
    public void shouldNotRemoveIfNotExists() {
        int idToRemove = 4;
        AfishaItem[] returned = new AfishaItem[]{f, s, th};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).removeById(idToRemove);

        manager.removeById(idToRemove);
        AfishaItem[] expected = new AfishaItem[]{th, s, f};
        AfishaItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);

        verify(repository).removeById(idToRemove);
    }
}








