package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.example.model.Student;

@Repository
public class StudentDao {

		public int saveStudent(Student student)
		{
			
			System.out.println("dao:"+student);
			
			final String DB_URL = "jdbc:mysql://localhost/mydb";
			final String USER = "root";
			final String PASS = "tiger";

			final String QUERY = "insert into student values(" + student.getStudentId() + "," + "'" + student.getLastName()
					+ "'" + "," + "'" + student.getFirstName() + "'" + "," + "'" + student.getAddress() + "'" + "," + "'"
					+ student.getCity() + "'" + ")";

			//final String QUERY1 = "SELECT student, LastName, FirstName, Address, City\n" + "FROM demo_db.Persons;\n" + "";

			// Open a connection
			try {
				Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				//int id=
				stmt.executeUpdate(QUERY);
				
			//	if(id==1)
					return student.getStudentId();

			}
			catch (SQLException e) {
				e.printStackTrace();
			}

			return 1;
			
		}
		
		
//		UPDATE mysql.user SET user='myuser',
//				 password=PASSWORD('mypass') WHERE user='root';
//				 FLUSH PRIVILEGES;


}
