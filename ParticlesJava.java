
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
        
    int MAX_PARTICLES=100;
    int HEIGHT=640,posx;
    int WIDTH=480,posy;
    double maxMass=6.0,velx,vely;
    Particle[] theArray;

    Particle[] theArray=new Particle[MAXPARTICLES];
    Particle testPart=new Particle();
    System.out.println("Initialised particle " + testPart.getIndex());
    /* for (int i=0; i<MAXPARTICLES; i++){
        posx=(int) (WIDTH*Math.random());
        posy=(int) (HEIGHT*Math.random());
        theArray[i].setIndex(i);
        theArray[i].setMass((MaxMass*Math.random()));
        theArray[i].sePosition(posx,posy);
         } */


} 
}

