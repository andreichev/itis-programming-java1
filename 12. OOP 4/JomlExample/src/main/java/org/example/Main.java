package org.example;

import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class Main {
    public static void main(String[] args) {
        Matrix4f matrix1 = new Matrix4f();
        matrix1.translate(1.f, 4.f, 1.f);

        System.out.println(matrix1);

        Vector4f vector = new Vector4f(5.f, 5.f, 5.f, 1.f);
        vector = vector.mul(matrix1);

        System.out.println(vector);
    }
}