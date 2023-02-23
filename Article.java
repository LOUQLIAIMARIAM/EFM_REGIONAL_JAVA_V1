package EFM_REGIONAL_JAVA_V1;

public class Article {
    private int code;
    private double prixOrigine;

    public Article(int code, double prixOrigine) {
        this.code = code;
        this.prixOrigine = prixOrigine;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrixOrigine() {
        return prixOrigine;
    }

    public void setPrixOrigine(double prixOrigine) {
        this.prixOrigine = prixOrigine;
    }

    public double prixArticle() {
        return prixOrigine;
    }

    @Override
    public String toString() {
        return code + ";" + prixOrigine;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Article other = (Article) obj;
        if (this.code != other.code) {
            return false;
        }
        return true;
    }
}
