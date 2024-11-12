package POO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kenk7
 */
public class perro extends Animal
{
   public perro(String pelo, String boca, String cola, String ojo, Integer patas)
   {
       super(pelo, boca, cola, ojo, patas);
   }
    
   @Override
   public void Sonido()
    {
        System.out.println("El perro ladra");
    }
}
