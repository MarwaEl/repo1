package ma.PFE.local.Repositories;

import ma.PFE.local.Dtos.StudentDto;
import ma.PFE.local.Entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("repo1")
public interface StudentRepository
        extends JpaRepository<StudentEntity,Long>{

        }