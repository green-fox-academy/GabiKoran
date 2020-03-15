package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.entities.Rate;
import com.greenfoxacademy.reddit.models.entities.RateId;
import org.springframework.data.repository.CrudRepository;

public interface RateRepository extends CrudRepository<Rate, RateId> {
}
