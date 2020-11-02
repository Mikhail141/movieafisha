package ru.netology.manager;

import ru.netology.domain.AfishaItem;





public class AfishaManager {

    private AfishaItem[] items = new AfishaItem[0];

    private int custom ;


    public AfishaManager() {
    }

    public AfishaManager(int custom) {
        this.custom = custom;
    }


    public void add(AfishaItem item) {
        int length = items.length + 1;
        AfishaItem[] tmp = new AfishaItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public AfishaItem[] getAll() {


        int length = custom;
        if (length > items.length) {
            length = items.length;
        }
        if (custom <= 0) {
            length = items.length;
        }
        AfishaItem[] result = new AfishaItem[length];
        for (int i = 0; i < length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;

    }
}









