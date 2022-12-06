package ie.atu.testingproj.repo;

import ie.atu.testingproj.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User,Integer> {
}
