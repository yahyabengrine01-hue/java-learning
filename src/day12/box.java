package day12;

public class box {
double width, height , depht ; 

box() //1
{ /*width=0;
height =0;
depht=0;*/
	width= height =depht=0;
}
box(double w, double h , double d) //2
{ width=w;
height=h;
depht=d;
	
}

box (double len )//3
{ width= height =depht=len; 
	}
	
	double volume()
	{return (width*height*depht);  }
	
}
