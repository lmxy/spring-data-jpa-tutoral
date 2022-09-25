package com.yoilife.springdatajpatutoral.repository;

import com.yoilife.springdatajpatutoral.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
