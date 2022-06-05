package ru.netology.domain;

public class Manager {
    int countFilms = 10;

    private Films[] film = new Films[0];


    public void add(Films movie) {
        int length = film.length + 1;
        Films[] tmp = new Films[length];
        System.arraycopy(film, 0, tmp, 0, film.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        film = tmp;
    }

    public Films[] findAll() {
        return film;
    }

    public Manager() {
    }

    public Manager(int countFilms) {
        this.countFilms=countFilms;
    }

    public Films[] findLast() {
        int resultLength;
        if (countFilms > 10) {
            resultLength = 10;
        } else {
            resultLength = countFilms;
        }

        Films[] result = new Films[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = film.length - i - 1;
            result[i] = film[index];
        }
        return result;
    }


}
