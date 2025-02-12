package student.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import student.registration.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
