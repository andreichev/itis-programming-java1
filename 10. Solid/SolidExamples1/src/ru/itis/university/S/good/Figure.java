package ru.itis.university.S.good;

import ru.itis.university.common.Vector2;

public interface Figure {
    boolean isPointInside(Vector2 point);
    char getSym();
}
