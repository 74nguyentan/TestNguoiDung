package edu.poly.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.poly.model.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Integer> {
	List<UserModel> findByNameLikeOrderByName(String name);
}
