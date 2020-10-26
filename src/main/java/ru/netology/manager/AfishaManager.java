package ru.netology.manager;

import ru.netology.domain.AfishaItem;

public class AfishaManager {
    private int film1 ;
    private int film2 ;
    private int film3 ;
    private int film4 ;
    private int film5 ;
    private int film6 ;
    private int film7 ;
    private int film8 ;
    private int film9 ;
    private int film10 ;
    private AfishaItem[] items = new AfishaItem[0];
    
    public void add(AfishaItem item) {
        AfishaItem[] tmp = new AfishaItem[items.length + 1];
        if (tmp.length >= 0) System.arraycopy(items, 0, tmp, 0, tmp.length);
        {

            int lastIndex = tmp.length - 1;
            tmp[lastIndex] = item;
            items = tmp;
            
        }
    }
    public AfishaItem[]getAll() {
        AfishaItem[] result = new AfishaItem[items.length];
        for (int i = 0; i < result.length; i++) {
           int index = items.length - i -1;
           result[i] = items[index];

        }
        return result;
    }
    
}
