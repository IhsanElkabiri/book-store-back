package com.example.bookstoreback.Repository;

import com.example.bookstoreback.Entity.Livre;
import com.example.bookstoreback.Exception.NullLivreException;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRepository extends JpaRepository<Livre,Integer> {
    public Livre getLivreByName(String name) throws NullLivreException;
    public Livre getLivreByCategory(String category) throws NullLivreException;

}
