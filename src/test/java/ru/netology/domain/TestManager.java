package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestManager {

    Films first = new Films(1, "Red", "Action");
    Films second = new Films(2, "Blue", "Comedy");
    Films third = new Films(3, "Green", "Horror");
    Films fourth = new Films(4, "Deep", "Comedy");
    Films fifth = new Films(5, "Dark", "Horror");
    Films sixth = new Films(6, "Fantasy", "Action");
    Films seventh = new Films(7, "Van", "Action");
    Films eighth = new Films(8, "Billy", "Comedy");
    Films ninth = new Films(9, "300", "Horror");
    Films tenth = new Films(10, "Bucks", "Comedy");
    Films eleventh = new Films(11, "Metal", "Action");
    Films twelfth = new Films(12, "Celebrate", "Comedy");
    Films thirteenth = new Films(13, "Some", "Horror");

    @Test
    public void addFilmsAll() {

        Manager manager = new Manager();
        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.findAll();

        Films[] actual = manager.findAll();
        Films[] expected = {first, second, third};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void LastFilmsBeforeLimit() {

        Manager manager = new Manager(2);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        manager.findLast();

        Films[] actual = manager.findLast();
        Films[] expected = {fifth, fourth};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void LastFilmsUpperLimit() {

        Manager manager = new Manager(11);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);
        manager.add(thirteenth);

        manager.findLast();

        Films[] actual = manager.findLast();
        Films[] expected = {thirteenth, twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void LastFilmsLimit() {

        Manager manager = new Manager(13);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);
        manager.add(thirteenth);

        manager.findLast();

        Films[] actual = manager.findLast();
        Films[] expected = {thirteenth, twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void LastFilmsDefaultLimit() {

        Manager manager = new Manager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);
        manager.add(thirteenth);

        manager.findLast();

        Films[] actual = manager.findLast();
        Films[] expected = {thirteenth, twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth};

        Assertions.assertArrayEquals(expected, actual);

    }
}
