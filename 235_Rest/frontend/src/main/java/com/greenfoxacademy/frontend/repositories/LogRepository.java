package com.greenfoxacademy.frontend.repositories;

import com.greenfoxacademy.frontend.models.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<Log, Long> {
}
