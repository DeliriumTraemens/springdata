package org.nick.springdata.repository;

import org.nick.springdata.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport, Integer> {
}
