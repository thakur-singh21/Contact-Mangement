package com.raj.cm.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raj.cm.pojo.login;
@Repository
public interface LoginRepo extends JpaRepository<login, Integer>{

	List<login> findByUsername(String userNmae);
}
