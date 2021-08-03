package interfaces;
import java.lang.*;
import java.util.*;
import java.io.*;
import classes.*;

public interface RoomOperation
{
	
void insertRoom(Room r) ;
void removeRoom(Room r) ;
Room getRoom(int RoomNumber) ;
void showAllRoom( ) ;

}