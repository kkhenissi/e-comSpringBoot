package com.kkhenissi.ecomSpringBoot.dao;

import com.kkhenissi.ecomSpringBoot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
