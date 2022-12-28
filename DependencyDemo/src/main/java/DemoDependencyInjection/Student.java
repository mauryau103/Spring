package DemoDependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Student {
	private Course course;

	public Course getCourse() {
		return course;
	}
    @Autowired
	public void setCourse(Course course) {
    	System.out.println("in setter");
		this.course = course;
	}
	@Autowired
	public Student(Course course) {
		super();
		System.out.println("in constructor");
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}
	
	

}
