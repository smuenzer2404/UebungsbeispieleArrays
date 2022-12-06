public class UmsatzDemo {

    public static void main(String[] args) {
        double [] umsaetze = new double[]{400, 450, 600, 760, 750, 630, 800, 320, 100, 400, 600};

        System.out.println(getUmsatzSteigerungGT10(umsaetze));

        double [][] umsaetzeWochen = {{11,12,13,14,15}, {21,22,23,24,25}, {31,32,33,34,35}, {41,42,43,44,45}};

        double [] umsaetzeProWoche = calculateSumByWeek (umsaetzeWochen);
        for (int i = 0; i < umsaetzeProWoche.length; i++) {
            System.out.println("umsatz in Woche " + (i + 1) + " = " + umsaetzeProWoche[i]);
        }



    }

    public static int getUmsatzSteigerungGT10(double[] umsaetze ) {
        int counter = 0;

        for (int i = 0; i < umsaetze.length - 1; i++) {

            double vormonat = umsaetze[i];
            double monat =  umsaetze[i + 1];

            if (monat > vormonat) {
                if (monat > vormonat * 1.1) {
                    counter++;
                }

            }

        }
        return counter;
    }
    public static double [] calculateSumByWeek (double umsaetzeWoche [][]){
        double [] wochenUmsaetze = new double[umsaetzeWoche.length];

        for (int i = 0; i < umsaetzeWoche.length; i++) {
            double [] umsaetzeProWoche = umsaetzeWoche [i];
            for (int j = 0; j < umsaetzeProWoche.length; j++) {
                double tagesUmsatz = umsaetzeProWoche [j];
                wochenUmsaetze [i] += tagesUmsatz;

            }


        }
        return wochenUmsaetze;

    }

}
