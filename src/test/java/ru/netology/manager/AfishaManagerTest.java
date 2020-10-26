package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.AfishaItem;

public class AfishaManagerTest {
    @Test
    public void shouldAddFilm(){
        AfishaManager manager = new AfishaManager();
        int idToAdd = 1;
        AfishaItem first = new AfishaItem(1,1,"first",1,1);
        manager.add(first);

        AfishaItem[] actual = manager.getAll();
        AfishaItem[] expected = new AfishaItem[] {first};


    }
}
