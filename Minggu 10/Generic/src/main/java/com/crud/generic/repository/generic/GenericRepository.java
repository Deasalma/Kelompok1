package com.crud.generic.repository.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.crud.generic.entity.baseEntity.GenericEntity;

@NoRepositoryBean
public interface GenericRepository <T extends GenericEntity<T>> extends JpaRepository<T, Long> {

}
