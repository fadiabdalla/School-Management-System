package school.student.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import school.student.model.dto.AddStudentDto;
import school.student.model.dto.StudentDto;
import school.student.service.StudentService;

import java.util.List;
@Validated
@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping("/add")
    public StudentDto addStudent(@RequestBody AddStudentDto student){

        StudentDto studentDto = studentService.addStudent(student);

        return studentDto;

    }
    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudent( @PathVariable String id){
        return ResponseEntity.ok(studentService.getStudent(id));

    }
    @PutMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable String id, @RequestBody StudentDto studentDto) {
        StudentDto updatedStudent = studentService.updateStudent(id, studentDto);
        return ResponseEntity.ok(updatedStudent);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/all")
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        List<StudentDto> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }
}