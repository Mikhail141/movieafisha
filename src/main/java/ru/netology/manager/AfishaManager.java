package ru.netology.manager;

import ru.netology.domain.AfishaItem;

public class AfishaManager {

    private AfishaItem[] items = new AfishaItem[0];
    private int filmsOfManager = 10;
    private int custom;


    public int getFilmsOfManager() {
        return filmsOfManager;
    }

    public void setFilmsOfManager(int filmsOfManager) {
        this.filmsOfManager = filmsOfManager;
    }

    public void add(AfishaItem item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        AfishaItem[] tmp = new AfishaItem[length];
        // itar + tab
        // копируем поэлементно
        // for (int i = 0; i < items.length; i++) {
        //   tmp[i] = items[i];
        // }
        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public AfishaItem[] getAll() {
        AfishaItem[] result = new AfishaItem[items.length];
        int temp = items.length;
        if (custom <= 0) {
            if (filmsOfManager < items.length) {
                temp = filmsOfManager;

            }
        } else {
            if (custom < items.length) {
                temp = custom;

            }
        }

        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}

