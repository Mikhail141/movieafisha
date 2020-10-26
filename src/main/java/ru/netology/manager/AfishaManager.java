package ru.netology.manager;

import ru.netology.domain.AfishaItem;

public class AfishaManager {
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
