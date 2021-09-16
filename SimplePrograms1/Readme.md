# ДЗ (дедлайн 23.09)

### 1.
Вводится последовательность целых чисел, ввод завершается `0`.

Вывести:
 - `YES`, если среди чисел есть 5, иначе вывести `NO`
 ```
4 10 5 3
YES
```

```
4 10 7 3
NO
```

### 2.
Вводится последовательность целых чисел, ввод завершается `0`.

Вывести: 
- сумму чисел
 ```
4 10 5 3
22
```

```
4 10 7 3
24
```

### 3.
Вводится последовательность целых чисел, ввод завершается `0`.

Вывести:
- символ `<`, если последовательность возрастает, 
- символ `>` - если убывает,
- символ `=` - если все элементы равны (включая случай, когда в последовательности меньше двух элементов),
- символ `!` - если последовательность не возрастает и не убывает (т.е. немонотонная). 

Сравнения нестрогие.

```
1 2 3 -1
<
```

```
3 2 1 -1
>
```

```
1 1 2 -1
<
```

```
2 2 1 -1
>
```

```
1 2 1 -1
!
```

```
1 1 1 -1
=
```

```
1 1 2 2 3 3 -1
<
```

```
1 1 2 2 1 1 -1
!
```

```
1 -1
=
```

```
-1
=
```