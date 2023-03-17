/*
1. Cоздать фабрику по производству пиццы. Фабрика должна уметь готовить следующие виды пиццы:
    Гавайи, Моцарелла,Салями.
   2. Каждый вид пиццы должен уметь: подготавливаться (накладывать ингридиенты напр.), печься и упаковываться.
         В каждом случае должно быть понятно о какой пицце речь.
   3. В классе Main не должен создаваться новый обьект пиццы, а из него должен поступать "заказ"  на изготовление
      требуемого вида пиццы (обьекта) в класс PizzaFactory, который и должен выбрать нужную пиццу для изготовления

      Пример: заказана пицца Hawaii.
      На выходе:
      Preparing pizza with ananas and cheese
      Baking Pizza Hawaii
      Packing pizza Hawaii*/


public abstract class Pizza {

     private String type;

     public Pizza( String type ){
         this.type = type;
     }

     public void orderPizza(){
         prepare();
         bake();
         pack();
     }


     protected abstract void prepare();

     private void bake(){
         System.out.println("Baking "+type);
     }

     private void pack(){
         System.out.println("Packing "+type);
     }

}
