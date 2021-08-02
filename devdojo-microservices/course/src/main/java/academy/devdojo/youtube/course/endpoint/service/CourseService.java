package academy.devdojo.youtube.course.endpoint.service;

import academy.devdojo.youtube.course.model.Course;
import academy.devdojo.youtube.course.repository.CourseRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Iterable<Course> list(Pageable pageable){
        return courseRepository.findAll(pageable);
    }
}
