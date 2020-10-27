package ru.netology.manager;

import ru.netology.domain.AfishaItem;

public class AfishaManager {

    private AfishaItem[] items = new AfishaItem[0];
    private int filmsOfManager;

    public int getFilmsOfManager() {
        return filmsOfManager = 10;
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
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;

    }

    public AfishaItem[] getAmountOfFilms() {
        AfishaItem[] result = new AfishaItem[getFilmsOfManager()];
        AfishaItem[] tmp = getAll();
        if (filmsOfManager < filmsOfManager) {
            this.filmsOfManager = filmsOfManager;
        }

        System.arraycopy(tmp, 0, result, 0, filmsOfManager);

        return result;
    }
}
