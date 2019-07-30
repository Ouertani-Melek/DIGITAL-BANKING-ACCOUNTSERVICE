package tn.com.biat.account_service.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.com.biat.account_service.models.Compte;

import java.util.List;

public interface CompteRepository extends MongoRepository<Compte, String> {
    List<Compte> findByEmail(String email);
}