public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Írj egy függvényt ami összepárosít egy fiút egy lánnyal, és visszaadja egy új listában.
        // Ha valakinek nincs párja, akkor is szerepeljen a listában.
        // Várt eredmény: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }
}
