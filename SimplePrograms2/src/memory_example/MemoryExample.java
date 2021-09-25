package memory_example;

// Модель памяти (стек, куча):
// &x - адрес X

//  STACK PART OF MEMORY:
//  x         &y        &z       ?          ?          ?         ?
// |00000101 |00010100 |00000000 |110101010 |101010100 |00111010 |1110...
// 5         6         7         8          9          10        11


//  HEAP PART OF MEMORY:
//  y        ?         ?          ?         ?          ?         ?
// |00000101 |11100101 |11010101 |110101010 |101010100 |00111010 |1110...
// 20        21        22        23         24         25        26

// Ремарка:
// 1) Адреса обычно занимают 4 байта, а не 1 (зависит от системы)
// 2) Обычно адреса представляются в 16-й системе, а тут в десятичной
// 3) Адресов много и номер ячейки будет номного больше, чем 5 или 20

public class MemoryExample {
    public static void main(String[] args) {
        {
            {
                // примитивный тип
                byte x = 5;
                // ссылочный тип (простой)
                Byte y = 5;
                Byte z = null;
            }
            // на этой строке из стека выгрузились x, ссылка на heap y и z.
            // А память, на которую ссылаются y и z освободит из heap сборщик мусора в JVM.
            byte w = 5;
        }
    }
}

// При вызове функции:
// Если в качестве параметра передается примитивный
// или ПРОСТОЙ ссылочный тип, происходит копирование.
// То есть, такой метод ничего не меняет:
// void setXTo50(int x) { x = 50; }
// Такой тоже ничего не меняет:
// void setXTo50(Integer x) { x = 50; }
// т. к. в методе создается новое значение, туда копируется значение x.
// Затем созданное в методе значение меняется и выгружается из памяти.
// Вне метода x меняться не будет:
// int x = 5;
// setXTo50(x);
// System.out.println(x); - Выведется 5
//
// Для продвинутых на семестр вперед:
// В случае если тип СЛОЖНЫЙ (класс), происходит передача ссылки
// class A { int x; }
// Такой метод меняет x:
// void setXTo50(A a) { a.x = 50; }
// т. к. в метод копируется ссылка и по этой ссылке меняется значение.
// Вне метода это будет заметно:
// A a = new A();
// a.x = 5;
// setXTo50(a);
// System.out.println(a.x); - Выведется 50
//

