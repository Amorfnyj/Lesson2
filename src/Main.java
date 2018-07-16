import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//       Furniture sofa = new Furniture( 100.5, "black", 50);
//       System.out.println("Sofa: " + sofa.toString());
//
//       Furniture table = new Furniture (20.87, "beige", 40);
//        System.out.println("Table: " + table.toString());
//
//        System.out.println("The sum of two heights is " + ClassWithStaticMethod.heightSum(sofa, table));

        Doggy bobik = new Doggy(20.5, "Bobik", true);
        Doggy tuzik = new Doggy(7.1, "Tuzik", false);

        System.out.println(bobik.toString());
        System.out.println(tuzik.toString());

        ArrayList<Doggy> doggiesList;
        doggiesList = new ArrayList<>();

        doggiesList.add(bobik);
        doggiesList.add(tuzik);
        doggiesList.add(new Doggy(20.5, "Bobik", true));
        doggiesList.add(new Doggy(20.5, "Galia", false));
        doggiesList.add(new Doggy(20.5, "Galia", true));
        doggiesList.add(new Doggy(20.5, "Anjelika", true));
        doggiesList.add(new Doggy(20.5, "Anjelika", false));
        doggiesList.add(new Doggy(20.5, "Bobik", true));
        doggiesList.add(new Doggy(20.5, "Bobik", true));
        doggiesList.add(new Doggy(20.5, "Bobik", true));
        doggiesList.add(new Doggy(20.5, "Bobik", true));
        doggiesList.add(new Doggy(20.5, "Bobik", true));
        doggiesList.add(new Doggy(20.5, "Bobik", true));
        doggiesList.add(new Doggy(20.5, "Pisiun", false));
        doggiesList.add(new Doggy(20.5, "Bobik", true));
        doggiesList.add(new Doggy(20.5, "Bobik", true));

        double tailLenghtSum = 0;

        for (int i = 0; i < doggiesList.size() ; i++) {
            Doggy currentDoggy = doggiesList.get(i);
            tailLenghtSum += currentDoggy.getTailLength();
        }

        System.out.println("The length of Bobik and Tuzik's tails is "+ tailLenghtSum);

        DoggyClassWithStaticMethod.printAllFemaleDoggyNames(doggiesList);
    }
}
