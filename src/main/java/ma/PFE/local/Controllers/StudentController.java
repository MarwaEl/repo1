package ma.PFE.local.Controllers;

import ma.PFE.local.Dtos.StudentDto;
import ma.PFE.local.Services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final static Logger LOGGER= LoggerFactory.getLogger(StudentController.class);

    private StudentService studentService;


    public StudentController(@Qualifier("service1") StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Long save(@RequestBody StudentDto dto) {
        LOGGER.debug("start method save {} ",dto);
        return studentService.save(dto);
    }

    @PutMapping
    public Long update(@RequestBody StudentDto dto) {
        LOGGER.debug("start method update {} ",dto);
        return studentService.update(dto);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable("id") Long id) {
        LOGGER.debug("start method delete id {} ",id);
        return studentService.delete(id);
    }

    @GetMapping
    public List<StudentDto> selectAll() {
        LOGGER.debug("start method select All");
        return studentService.selectAll();
    }
}