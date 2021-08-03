package interfaces;
import java.lang.*;
import java.util.*;
import java.io.*;
import classes.*;

public interface EmployeeOperation
{
	

public Employee getEmployee(String NId) ;
void insertEmployee(Employee e) ;
void removeEmployee(Employee e) ;
void showAllEmployee() ;

}