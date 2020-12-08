public class EuclidAlg {
    public static void main(String[] args) {
        int x = 1989, y = 867;
        int i = 0;

        //by diving, no zero given assumed
        if(x != y) {
            do {
                if (x > y) {
                    x = x - y;
                } else y = y - x;
                i++;
            } while (x != y);
        }
        System.out.println(x + " : " + i);
//by modulo
//       oblicz c jako resztę z dzielenia a przez b
// zastąp a liczbą b, następnie b liczbą c
// jeżeli wartość b wynosi 0, to a jest szukaną wartością NWD, w przeciwnym wypadku przejdź do kroku 1
        x = 1989;
        y = 867;
        i = 0;
        if(x != y) {
            while (y != 0) {
                int c = x % y;
                x = y;
                y = c;
                i++;
            } ;
        }
        System.out.println(x + " : " + i);
    }
}