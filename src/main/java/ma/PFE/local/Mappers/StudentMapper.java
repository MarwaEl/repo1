package ma.PFE.local.Mappers;

import ma.PFE.local.Dtos.StudentDto;
import ma.PFE.local.Entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component(value = "mapper1")
public class StudentMapper {

    public StudentEntity convertDtoToEntity(StudentDto dto){

        StudentEntity STentity = new StudentEntity();
        STentity.setId(dto.getId());
        STentity.setName(dto.getName());
        return STentity;
    }
    public StudentDto convertEntityToDto(StudentEntity entity){

        StudentDto dto = new StudentDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;

    }
    public List<StudentDto> convertEntitiesToDtos (List<StudentEntity> entities){

        if(entities!=null && !entities.isEmpty())
        {

            return entities.stream().map(studentEntity -> convertEntityToDto(studentEntity))
                    .collect(Collectors.toList());
        }
        else
        {
            return new ArrayList<>();
        }
    }
    public List<StudentEntity> convertDtosToEntities (List<StudentDto> dtos){

        return dtos
                .stream()
                .map(dto -> convertDtoToEntity(dto))
                .collect(Collectors.toList());
    }
}