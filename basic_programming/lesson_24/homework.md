
Есть лист стрингов, в котором длины всех элементов различны и он не пустой.   
Написать метод, возврашающий элемент(строку), который встречается раньше в
листе: самый короткий или самый длинный.  

Пример: ["aa" "bbb" "cccc" "d" ] ->ответ  cccc так как сссс самое длинное слово и встречается раньше самого
короткого слова d  
["aa" "d" "bbb" "cccc" ] ->ответ  d,  так как здесь d самое короткое слово и оно встречается раньше самого длинного

public static String findShortestOrLongest(List<String>list)