import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Person> pArray = new ArrayList<>();
        pArray.add(new Person("Andrzej", "Nowak", 30));
        pArray.add(new Person("Bartek", "Kołakowski", 30));
        pArray.add(new Person("Cezary", "Konazowski", 36));
        pArray.add(new Person("Cezary", "Abazowski", 34));
        pArray.add(new Person("Cezary", "Derezowski", 32));

        PersonComparator pComparator = new PersonComparator();
        pArray.sort(pComparator.reversed());
        for (Person person : pArray)
        {
            System.out.println(person);
        }
    }
}