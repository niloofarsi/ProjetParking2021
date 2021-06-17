package fr.miage.projet.parking2021.dao;

import fr.miage.projet.parking2021.metier.*;
import java.util.List;

public interface CommuneDAO {
	Commune findByName(String nom);
	void saveOrUpdate(Commune commune);
	Commune get(int id);
	List<Commune> findAll();

}
