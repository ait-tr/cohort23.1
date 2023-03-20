public class Garden {
    /*
    Садовод-любитель. Выращиваем растения в течение нескольких лет и смотрим что будет.
    Задача:
    Выращиваем деревья и цветы. Каждый из этих двух видов имеет следующие характеристики:
    displayName, height, age.  Каждый из них вырастает за сезон на разную высоту, одинаковую
    для всех деревьев и всех цветов.
    Каждый сезон состоит из четырех времен года, в которые цветы и деревья  ведут себя не
    всегда одинаково.
    Для цветов:
    -сезон начинается весной и весной цветы растут
    -зимой цветы не растут
    -летом они не растут а цветут
    -осенью их срезают
    Для деревьев:
    -сезон начинается весной и весной они растут
    -зимой деревья не растут
    -летом растут
    -осенью не растут

    В классе Garden создать метод growPlants,  в  котором подробно отражен процесс роста
    двух растений в течение нескольких лет (т.е. что происходит с ними зимой,летом , весной и
    размер их в каждый сезон м какого они размера и возраста в конце.
     */
    public static void main(String[] args) {
        Plant tree = new Tree("Pine tree",100,1);
        Plant flower = new Flower("Tulip",0,1);

        Plant[] plants = {tree,flower};
        int yearsToGrow = 2;

        growPlants(plants,yearsToGrow);
    }

    public static void growPlants( Plant[] plants, int numberOfYears){

        System.out.println("Growing plants for "+numberOfYears+" years");
        for (int i = 0; i<numberOfYears; i++) {
            for (Plant plant : plants) {
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();
            }
        }
        for (Plant plant:plants){
            System.out.println("      "+plant.getDisplayName()+" has height: "+plant.getHeight()+
                                " and is "+plant.getAge() + " years old");
        }



    }
}
