package org.example.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.example.entities.Compte;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte,Long>
{
}