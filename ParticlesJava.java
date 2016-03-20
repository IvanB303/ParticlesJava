
import java.lang.*
import java.io.*
import java.util.*



public class Particle{


    private int index;
    private int x;
    private int y;
    private double mass;
    private double vx;
    private double vy;


Particle(){
this.setIndex(0);
this.setPosition(0,0);
this.setMass(0.0);
this.setVelocity(0.0,0.0);
}



public void setIndex(int newIndex){
    this.index=newIndex;
}
public void setPosition(int newX, int newY){
    this.x=newX;
    this.y=newY;
}
public void setMass(double newMass){
    this.mass=newMass;
}
public void setVelocity(double newVX, double newVY){
    this.vx=newVX;
    this.vy=newVY;
}

public int getIndex(){
    return index;
}
public int getPosition(int flag){
    if(flag==1){
    return x;}
    else { 
    return y;}
}
public double getMass(double newMass){
    return mass;
}
public double getVelocity(int flag){
    if(flag==1){
    return vx;}
    else { 
    return vy;}
}

}




class ParticleProg{


public static void main (String args[]){
        
    int MAX_PARTICLES=0;
    int HEIGHT=640,posx;
    int WIDTH=480,posy;
    double maxMass=6.0,velx,vely;
    Particle[] theArray;
     
     System.out.println("Enter the maximum number of particles");
     Scanner input=new Scanner(System.in);
     MAX_PARTICLES=input.nextInt();
    
    Particle[] theArray=new Particle[MAX_PARTICLES];

    System.out.println("Initialised particle " + testPart.getIndex());
    for (int j=0; j<MAX_PARTICLES; j++){
        theArray[j]=new Particle();
    }
    for (int i=0; i<MAX_PARTICLES; i++){
        posx=(int) (WIDTH*Math.random());
        posy=(int) (HEIGHT*Math.random());
        theArray[i].setIndex(i);
        theArray[i].setMass((maxMass*Math.random()));
        theArray[i].setPosition(posx,posy);
         }
         
    for (int i=0; i<MAX_PARTICLES; i++){
         System.out.println("Index is " + theArray[i].getIndex());
         System.out.println("PosX is " + theArray[i].getPosition(1));
         System.out.println("PosY is " + theArray[i].getPosition(0));
         }


} 
}

