package ma.PFE.local.Services;
import ma.PFE.local.Dtos.StudentDto;

import java.util.List;

public interface StudentService {

    Long save(StudentDto ST);

    Long update(StudentDto ST);

    Boolean delete(Long id);

    List<StudentDto> selectAll();
}