package edu.poly.services;

import java.util.List;
import java.util.Optional;

import edu.poly.model.UserModel;

public interface UserService {

	void deleteAll();

	void deleteAll(List<UserModel> entities);

	void delete(UserModel entity);

	void deleteById(Integer id);

	long count();

	List<UserModel> findAllById(Iterable<Integer> ids);

	Iterable<UserModel> findAll();

	boolean existsById(Integer id);

	Optional<UserModel> findById(Integer id);

	List<UserModel> saveAll(List<UserModel> entities);

	UserModel save(UserModel entity);

	List<UserModel> findByNameLikeOrderByName(String name);


}
