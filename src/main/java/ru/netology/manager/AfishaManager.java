package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.AfishaItem;

@Data
@AllArgsConstructor


public class AfishaManager {

    private AfishaItem[] items = new AfishaItem[0];

    private int custom = 10;


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
        int length = items.length;
        if (custom <= 0) {
            if (custom < length) {
                length = custom;
            }
        }
        AfishaItem[] result = new AfishaItem[length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    }









