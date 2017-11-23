package com.zzy.dao;

import com.zzy.model.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/11/23.
 */
@Repository
public interface UserRepository extends JpaRepository<UserDTO,Long> {
}
