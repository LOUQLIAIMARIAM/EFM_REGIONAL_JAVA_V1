package EFM_REGIONAL_JAVA_V1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Mgasin {
    private List<Article> articles;

    public Mgasin() {
        articles = new ArrayList<>();
    }

    public int indiceDe(int code) {
        for (int i = 0; i < articles.size(); i++) {
            if (articles.get(i).getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public void ajouter(Article a) {
        if (articles.contains(a)) {
            throw new IllegalArgumentException("L'article existe déjà dans le magasin.");
        }
        articles.add(a);
    }

    public boolean supprimer(int code) {
        int index = indiceDe(code);
        if (index != -1) {
            articles.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public boolean supprimer(Article a) {
        return articles.remove(a);
    }

    public int nombreArticlesEnSolde() {
        int count = 0;
        for (Article a : articles) {
            if (a instanceof ArticleEnSolde) {
                count++;
            }
        }
        return count;
    }

    public void enregistrer(String chemin) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(chemin));
        for (Article a : articles) {
            writer.write(a.toString());
        }
    } }