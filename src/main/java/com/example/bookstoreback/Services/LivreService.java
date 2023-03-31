package com.example.bookstoreback.Services;

import com.example.bookstoreback.Entity.Livre;
import com.example.bookstoreback.Exception.NullLivreException;

import java.util.List;

public interface LivreService {
    public Livre createLivre(Livre livre);
    public Livre getLivreById(int id) throws NullLivreException;
    public Livre updateLivre(Livre livre);
    public void deleteLivreById(int id);
    public List<Livre> getAllLivres();
    Livre getLivreByName(String name) throws NullLivreException;
    Livre getLivreByCategory(String category) throws NullLivreException;
}
