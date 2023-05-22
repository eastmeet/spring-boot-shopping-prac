package com.prac.springbootshoppingprac.repository;

import com.prac.springbootshoppingprac.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
