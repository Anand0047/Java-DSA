public class DonutTerminal {
    public static void main(String[] args) throws InterruptedException {
        double A = 0, B = 0;
        while (true) {
            char[] b = new char[1760];
            double[] z = new double[1760];
            for (int k = 0; k < 1760; k++) {
                b[k] = ' ';
                z[k] = 0;
            }

            for (double j = 0; j < 6.28; j += 0.07) {
                for (double i = 0; i < 6.28; i += 0.02) {
                    double c = Math.sin(i),
                            d = Math.cos(j),
                            e = Math.sin(A),
                            f = Math.sin(j),
                            g = Math.cos(A),
                            h = d + 2,
                            D = 1 / (c * h * e + f * g + 5),
                            l = Math.cos(i),
                            m = Math.cos(B),
                            n = Math.sin(B),
                            t = c * h * g - f * e;
                    int x = (int)(40 + 30 * D * (l * h * m - t * n));
                    int y = (int)(12 + 15 * D * (l * h * n + t * m));
                    int o = x + 80 * y;
                    int N = (int)(8 * ((f * e - c * d * g) * m - c * d * e - f * g - l * d * n));
                    if (1760 > o && o > 0 && D > z[o]) {
                        z[o] = D;
                        b[o] = ".,-~:;=!*#$@".charAt(Math.max(0, N));
                    }
                }
            }

            // ANSI code to move cursor to top left
            System.out.print("\u001b[H");

            for (int k = 0; k < 1760; k++) {
                System.out.print(k % 80 != 0 ? b[k] : "\n");
            }

            A += 0.04;
            B += 0.08;
            Thread.sleep(50); // delay to control frame rate
        }
    }
}
