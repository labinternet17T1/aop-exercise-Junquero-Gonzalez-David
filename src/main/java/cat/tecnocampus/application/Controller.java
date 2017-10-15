package cat.tecnocampus.application;

import cat.tecnocampus.domain.Classroom;
import cat.tecnocampus.persintence.ClassroomDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class Controller {

    @Autowired
    ClassroomDAO classroomDAO;

    public List<Classroom> findAll() {
       return this.classroomDAO.findAll();
    }

    public List<Classroom> findCapacityLargerThan(int capacity) {
        return this.classroomDAO.findCapacityLargerThan(capacity);
    }

    public List<Classroom> findCapacityLowerThan(int capacity) {
        return this.classroomDAO.findCapacityLowerThan(capacity);
    }

    public List<Classroom> findWithPlugs() {
        return this.classroomDAO.findWithPlugs();
    }

    public List<Classroom> findWithNoPlugs() {
        return this.classroomDAO.findWithNoPlugs();
    }

    public int insert(Classroom classroom) {
        return this.classroomDAO.insert(classroom);
    }

    public int[] insertBatch(List<Classroom> classrooms) {
        return this.classroomDAO.insertBatch(classrooms);
    }

}
