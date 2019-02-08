package com.hokenso.vuespringapps.repository;


import com.hokenso.vuespringapps.domain.Challenges;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ChallengesRepository extends CrudRepository<Challenges, Long> {

    List<Challenges> findByTitle(@Param("title") String title);

    List<Challenges> findByLevel(@Param("level") String level);

}
