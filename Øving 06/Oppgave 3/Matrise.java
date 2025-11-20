public class Matrise {
    private int[][] data;

    public Matrise(int[][] d) {
        // bare kopierer ikke dypt, men nok til å teste
        data = new int[d.length][d[0].length];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[0].length; j++) {
                data[i][j] = d[i][j];
            }
        }
    }

    public int rader() {
        return data.length;
    }

    public int kolonner() {
        return data[0].length;
    }

    public Matrise add(Matrise m) {
        if (this.rader() != m.rader() || this.kolonner() != m.kolonner()) {
            return null;
        }
        int[][] res = new int[rader()][kolonner()];
        for (int i = 0; i < rader(); i++) {
            for (int j = 0; j < kolonner(); j++) {
                res[i][j] = this.data[i][j] + m.data[i][j];
            }
        }
        return new Matrise(res);
    }

    public Matrise mult(Matrise m) {
        if (this.kolonner() != m.rader()) {
            return null;
        }
        int[][] res = new int[this.rader()][m.kolonner()];
        for (int i = 0; i < this.rader(); i++) {
            for (int j = 0; j < m.kolonner(); j++) {
                int sum = 0;
                for (int k = 0; k < this.kolonner(); k++) {
                    sum += this.data[i][k] * m.data[k][j];
                }
                res[i][j] = sum;
            }
        }
        return new Matrise(res);
    }

    public Matrise transpose() {
        int[][] res = new int[kolonner()][rader()];
        for (int i = 0; i < rader(); i++) {
            for (int j = 0; j < kolonner(); j++) {
                res[j][i] = data[i][j];
            }
        }
        return new Matrise(res);
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < rader(); i++) {
            for (int j = 0; j < kolonner(); j++) {
                s += data[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }
}
