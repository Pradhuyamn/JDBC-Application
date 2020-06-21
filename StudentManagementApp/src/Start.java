import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args)throws IOException {
		
    System.out.println("Welcome to Student Management Application");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    while( true ) {
    	System.out.println("PRESS 1 to ADD Student");
    	System.out.println("PRESS 2 to DELETE Student");
    	System.out.println("PRESS 3 to DISPLAY Student");
    	System.out.println("PRESS 4 to EXIT Application");
    	int c = Integer.parseInt(br.readLine());
    	if( c == 1 )
    	{
    		
    		System.out.println("Enter User Name : ");
    		String name = br.readLine();
    		
    		System.out.println("Enter User Phone : ");
    		String phone = br.readLine();
    		
    		System.out.println("Enter User City : ");
    		String city = br.readLine();
    		
    		//Create Student Object to Store student
    		Student st = new Student(name,phone,city);
    		boolean ans = StudentDao.insertStudenttoDB(st);
    		if(ans)
    		{
    			System.out.println("Successful Submission");
    		}else
    		{
    			System.out.println("Something went wrong");
    		}
    		System.out.println(st);
    		
    	}else if( c == 2 )
    	{
    		System.out.println("Enter StudentId to Delete");
    		int userId = Integer.parseInt(br.readLine());
    		boolean f = StudentDao.deleteStudent(userId);
    		if(f) 
    		{
    			System.out.println("Successful Deletion");
    		}else {
    			System.out.println("Something went wrong");
    		}
    		
    	}else if( c == 3 )
    	{
    		StudentDao.showAllStudent();
    		
    	}else if( c == 4 )
    	{
    		break;
    	}else 
    	{
    		
    	}
    	System.out.println("Thankyou for using This Application");
    }
	}

}
