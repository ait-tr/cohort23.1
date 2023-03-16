***Класс Object и его методы***      
Хотя мы можем создать обычный класс, который не является наследником, но фактически все классы наследуются от класса Object. Все остальные классы, даже те, которые мы добавляем в свой проект, являются неявно производными от класса Object. Поэтому все типы и классы могут реализовать те методы, которые определены в классе Object. Рассмотрим эти методы.
  
**toString**  
Метод toString служит для получения представления данного объекта в виде строки. При попытке вывести строковое представления какого-нибудь объекта, как правило, будет выводиться полное имя класса.

**Метод hashCode**  
Метод hashCode позволяет задать некоторое числовое значение, которое будет соответствовать данному объекту или его хэш-код. По данному числу, например, можно сравнивать объекты.  

**Метод equals**  
Метод equals сравнивает два объекта на равенство. Он принимает в качестве параметра объект любого типа, который мы затем приводим к текущему, если они являются объектами одного класса.
