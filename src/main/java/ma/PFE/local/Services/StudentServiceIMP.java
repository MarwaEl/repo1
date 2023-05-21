package ma.PFE.local.Services;

import ma.PFE.local.Dtos.StudentDto;
import ma.PFE.local.Mappers.StudentMapper;
import ma.PFE.local.Repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service1")
public class StudentServiceIMP implements StudentService {

    private final static Logger LOGGER= LoggerFactory.getLogger(StudentServiceIMP.class);


    private StudentRepository studentRepository;

    private StudentMapper studentMapper;



    public StudentServiceIMP(@Qualifier("repo1") StudentRepository studentRepository, @Qualifier("mapper1") StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    @Override
    public Long save(StudentDto dto) {
        LOGGER.debug("start method save {} ",dto);
        StudentDto RESP = studentMapper.convertEntityToDto
                (studentRepository.save(studentMapper.convertDtoToEntity(dto)));

        return RESP.getId();
    }

    @Override
    public Long update(StudentDto dto) {
        LOGGER.debug("start method update {} ",dto);
        StudentDto RESP= studentMapper.convertEntityToDto
                (studentRepository.save(studentMapper.convertDtoToEntity(dto)));

        return RESP.getId();
    }

    @Override
    public Boolean delete(Long id) {
        LOGGER.debug("start method delete id {} ",id);
        studentRepository.deleteById(id);
        return true;
    }

    @Override
    public List<StudentDto> selectAll() {
        LOGGER.debug("start method select All");
        return studentMapper.convertEntitiesToDtos(studentRepository.findAll());
    }
}