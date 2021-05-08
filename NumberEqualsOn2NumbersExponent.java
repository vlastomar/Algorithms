public class NumberEqualsOn2NumbersExponent {
    public static void main(String[] args) {
        int l = 25;
        int r = 30;

        int count = r - l + 1;
        int counter = 0;
        for (int i = 0; i < count; i++) {
            double temp = Math.sqrt(l);
            int fff = (int) temp;
            double res = temp - fff;
            if (res == 0.0) {
                counter++;
            } else {
                for (int j = 0; j < l/2; j++) {
                    int a = l - j;
                    int b = l - a;
                    double aSqr = Math.sqrt(a);
                    int aTemp = (int) aSqr;
                    double aRes = aTemp - aSqr;
                    double bSqr = Math.sqrt(b);
                    int bTemp = (int) bSqr;
                    double bRes = bTemp - bSqr;
                    if (aRes == 0 && bRes == 0) {
                        counter++;
                        break;
                    } else {
                        aSqr = Math.cbrt(a);
                        aTemp = (int) aSqr;
                        aRes = aTemp - aSqr;
                        bSqr = Math.sqrt(b);
                        bTemp = (int) bSqr;
                        bRes = bTemp - bSqr;
                        if (aRes == 0 && bRes == 0) {
                            counter++;
                            break;
                        }
                    }
                }

            }
            l++;

        }
        System.out.println(counter);

    }
}
