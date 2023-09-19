public class innarclass {
    public static void main(String[] args) {
        reema r = new reema();
        reema.patel n = r.new patel();
        reema.patel p = r.new patel();
        n.name();
        s.surname();

    }
}

class reema {
    String na = "ami ";
    String su = "jogani";

    class patel {
        void name() {
            System.out.print(na);
        }
    }

    class Sur {
        void surname() {
            System.out.println(su);
        }
    }
}