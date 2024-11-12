/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author kenk7
 */
public class Animal 
{
    private String pelo;
    private String boca;
    private String cola;
    private String ojo;
    private Integer patas;

    public Animal(String pelo, String boca, String cola, String ojo, Integer patas)
    {
        this.pelo = pelo;
        this.boca = boca;
        this.cola = cola;
        this.ojo = ojo;
        this.patas = patas;
    }
    public String getpelo()
    {
        return pelo;
    }
    public void setpelo(String pelo)
    {
        this.pelo = pelo;
    }
    
    public String getboca()
    {
        return boca;
    }
    public void setboca(String boca)
    {
        this.boca = boca;
    }
    
    public String getcola()
    {
        return cola;
    }
    public void setcola(String cola)
    {
        this.cola = cola;
    }
    
    public String getojo()
    {
        return ojo;
    }
    public void setojo(String ojo)
    {
        this.ojo = ojo;
    }
    
    public Integer getpatas()
    {
        return patas;
    }
    public void setpatas(Integer patas)
    {
        this.patas = patas;
    }

    public void Sonido(){}
}