package interfaces;
import java.lang.*;
import java.util.*;
import java.io.*;
import classes.*;

public interface RoomManagement 
{
	
   void renting(int quantity, String Nid) ;
   void leaving(int quantity, String Nid) ;

}