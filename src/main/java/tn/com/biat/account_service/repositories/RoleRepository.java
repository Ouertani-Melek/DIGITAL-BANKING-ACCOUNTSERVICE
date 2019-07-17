package tn.com.biat.account_service.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.com.biat.account_service.models.Role;

public interface RoleRepository extends MongoRepository<Role,String> {
}
