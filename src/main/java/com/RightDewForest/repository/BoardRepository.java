package com.RightDewForest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RightDewForest.Community.*;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);

}
