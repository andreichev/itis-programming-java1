package ru.itis.simpleprograms.oop;

public class TrianglesChecker {
    static float getTotalPerimeter(IsoscelesTriangle[] triangles) {
        float result = 0;
        for(int i = 0; i < triangles.length; i++) {
            result += triangles[i].perimeter();
        }
        return result;
    }

    static boolean hasEquals(IsoscelesTriangle[] triangles) {
        for(int i = 0; i < triangles.length; i++) {
            for(int j = i; j < triangles.length; j++) {
                if(triangles[i].equals(triangles[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
