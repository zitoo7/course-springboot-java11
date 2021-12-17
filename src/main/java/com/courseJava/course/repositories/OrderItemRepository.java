package com.courseJava.course.repositories;

import com.courseJava.course.entities.OrderItem;
import com.courseJava.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
