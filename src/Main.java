public class Main {
    public static void main(String[] args) {
        /*
        Stwórz tablicę kilku imion.
        W pętli połącz wszystkie imiona za pomocą StringBuffer,
        Zaprezentuj wynikowy łańcuch znaków w konsoli.
         */

        String [] names = {"Wiktor", "Ania", "Igor"};
        StringBuffer s = new StringBuffer();
       /*
        for (int i = 0; i < names.length; i++)
        {
           s.append(names[i]);
           s.append(" ");
        }

        System.out.println(s.toString());
*/
        for (String t:names
             ) {
            s.append(t);
            s.append(" ");

        }
        System.out.println(s.toString());
    }
}
