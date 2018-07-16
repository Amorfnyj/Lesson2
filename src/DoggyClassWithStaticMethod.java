import java.util.ArrayList;

public class DoggyClassWithStaticMethod {

    /**
     * 1. создать переменную
     * 2. цикл
     * 3. проверить isMale
     * 4. если isMale, то опустить
     * 5. если isMale = false, добавить в переменную
     * 6. вывести результат
     * @param doggiesList
     */
   public static void printAllFemaleDoggyNames( ArrayList<Doggy> doggiesList) {

       String petNamesResult = "The names of female doggos are: ";

       for (int i = 0; i < doggiesList.size(); i++) {
           Doggy currentDoggy = doggiesList.get(i);
           if ( !currentDoggy.isMale()) {
               petNamesResult = petNamesResult + currentDoggy.getPetName() + " ";
           }
       }

       System.out.println(petNamesResult);
   }

}