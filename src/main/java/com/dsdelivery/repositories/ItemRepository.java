package com.dsdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsdelivery.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
