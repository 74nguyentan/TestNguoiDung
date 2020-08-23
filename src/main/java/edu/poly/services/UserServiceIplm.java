package edu.poly.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.poly.model.UserModel;
import edu.poly.repository.UserRepository;

@Service
public class UserServiceIplm implements UserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserModel save(UserModel entity) {
		return userRepository.save(entity);
	}

	@Override
	public List<UserModel> saveAll(List<UserModel> entities) {
		return (List<UserModel>) userRepository.saveAll(entities);
	}

	@Override
	public Optional<UserModel> findById(Integer id) {
		return userRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return userRepository.existsById(id);
	}

	@Override
	public Iterable<UserModel> findAll() {
		return userRepository.findAll();
	}

	@Override
	public List<UserModel> findAllById(Iterable<Integer> ids) {
		return (List<UserModel>) userRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return userRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		userRepository.deleteById(id);
	}

	@Override
	public void delete(UserModel entity) {
		userRepository.delete(entity);
	}

	@Override
	public void deleteAll(List<UserModel> entities) {
		userRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		userRepository.deleteAll();
	}

	@Override
	public List<UserModel> findByNameLikeOrderByName(String name) {
		return userRepository.findByNameLikeOrderByName(name);
	}
	
	
}
