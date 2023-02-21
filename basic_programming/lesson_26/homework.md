Есть не пустой массив строк. Написать метод, возвращающий мапу Map<String, Boolean> где каждая строка  
является ключом, а значением является  true  если строка в массиве встречается больше одного раза
и false если только один раз.  
Map<String,Boolean> mapStringBoolean( String[] strings)  

    Примеры:  
    [a,b,a,c,b] -> {a:true, b: true, c: false}  
     [a,b,c,] -> {a:false, b: false, c: false}  
     [c,c,c,] -> {c: true}  
     
