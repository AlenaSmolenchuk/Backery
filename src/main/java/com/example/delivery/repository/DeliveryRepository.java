package com.example.delivery.repository;

import com.example.delivery.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery,Integer> {
    Delivery findById(int id);
}
