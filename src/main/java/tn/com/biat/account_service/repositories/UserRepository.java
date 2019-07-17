package tn.com.biat.account_service.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.com.biat.account_service.models.User;

public interface  UserRepository extends MongoRepository <User, String>{


}
