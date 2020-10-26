package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.AfishaItem;
import static org.junit.jupiter.api.Assertions.*;

public class AfishaManagerTest {
    private AfishaItem[]films = new AfishaItem[0];
    @Test
    public void shouldAddFilm(){
        AfishaManager manager = new AfishaManager();



        AfishaItem f = new AfishaItem(1,1,"f",1,1);

        manager.add(f);



        AfishaItem[] expected = new AfishaItem[] {f};
        AfishaItem[] actual = manager.getAll();
        assertArrayEquals(expected,actual);


    }
}
