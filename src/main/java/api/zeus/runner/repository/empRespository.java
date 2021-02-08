package api.zeus.runner.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import api.zeus.runner.model.Employee;

@Repository
public interface empRespository extends MongoRepository<Employee,String> {

}
