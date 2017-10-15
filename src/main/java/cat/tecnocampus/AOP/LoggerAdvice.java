package cat.tecnocampus.AOP;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAdvice {

    private static final Logger logger = LoggerFactory.getLogger(LoggerAdvice.class);


    @Pointcut("execution(* *..*(cat.tecnocampus.domain.Classroom))")
    public void classroomAttribute() {}

    @Pointcut("execution(* cat.tecnocampus.application.Controller.find*(..))")
    public void findNotes() {}


    @Before("classroomAttribute()")
    public void beforeClassroomAttribute() {
        logger.info("Working with a classroom");
    }

    @After("findNotes()")
    public void afterFindingClassrooms() {
        logger.info("Finding Classrooms...");
    }


    /*
    @Pointcut("execution(* cat.tecnocampus.persintence.ClassroomDAO.insertBatch(..))")
    public void insertBatchNote() {}

    @Around("insertBatchNote()")
    public void aroundInsertBatch(){
        logger.info("LAST");
    }
*/

}
