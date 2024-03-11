
public class Inky {
    
    public Inky (String pinky){
        System.out. println(pinky);
    }
    
    
    public Inky(String pinky, String blinky,String rinky){
        
        System.out. println(blinky + "" + pinky);
        System.out. println(pinky + "" +rinky ); 
        System.out. println(blinky + "" + pinky+ ""+ rinky); 
    }
    
    
    public static void main(String[] args) {
	String pinky="Donky";       // 01.  local accessing
        Inky ponky = new Inky(pinky);
        
        String blinky= "pinky";     // 02.  local accessing
        String rinky= "monky";      // 03.  local accessing
        
        
      Inky ponky2 = new Inky(pinky,blinky,rinky);
      
	       
        
}
  
}
    
