package com.example.SpringApplication.repository;

import com.example.SpringApplication.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository  extends CrudRepository<User,Integer>
{
    @Modifying
    @Query(value = "SELECT userpassword,username from register where username like('p%')",nativeQuery = true)
    List<Object> findUserByNameList();
    // @Query(value = "SELECT username from register",nativeQuery = true)
    // List<String> findUserByNameList();

}
