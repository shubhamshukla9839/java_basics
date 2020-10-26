public class generic {


    public static void main(final String[] args) {

        final String[] a1 = { "shu", "bha", "ms" };
        final Integer[] a2 = { 1, 2, 3, 4, 5 };
        final Double[] a3 = { 1.0, 2.5, 3.4, 4.6 };

        print(a1);
        print(a2);
        print(a3);                                         /// -- by using generic we can acecess all te datatype

    }

    static<t> void print(final t[] a1) {

        for (final t p : a1) {

        System.out.println(p);

    }

    }

}
  /*  static void print2(final int[] k2) {

        for (final int q : k2) {

        System.out.println(q);
    }
}
static void print3(final double[] k3) {

    for (final double r : k3) {

    System.out.println(r);
}
}
}*/