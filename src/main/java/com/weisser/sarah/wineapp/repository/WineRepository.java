package com.weisser.sarah.wineapp.repository;

import com.weisser.sarah.wineapp.model.wine.Wine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WineRepository extends JpaRepository<Wine, Long> {
}
