package com.educandoweb.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.couse.entities.OrderItem;
import com.educandoweb.couse.entities.pk.OrdemItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrdemItemPK> {

}
