/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2;

import java.util.ArrayList;

/**
 *
 * @author esmil
 */
public class Liste {
    
    private ArrayList<Object> m_List =new ArrayList<>();
    private int m_position  ;
    
    
    //constructeur 
   /*  public void Liste ()
    {
    m_List = new ArrayList<>();
     m_position =-1;
    }*/
    
    //methode
    public void Premier()
    {
        if(m_List.isEmpty()==false)
        //we put the position in the first place of the array so 0
         m_position =0;
    }
    
     public void Dernier()
    {
        //we put the position in the last place of the array so the size of the array -1 bc the array start at 0 not 1
      
         m_position = m_List.size()-1;
        
          
    }
     
     public Object Suivant()
     {
         Object obj = null ; // we need to return an null object if theyr is an error so we can change it after if its not null
         m_position++;
        if ( m_List.isEmpty() || m_position ==m_List.size()-1  )//if its empty or at the last position there's an error 
        {
             System.out.println("You can't go to the next position because it's empty or we are at the end of the array");
        }else
        {
            obj=m_List.get(m_position);
        }
        
        return obj;
       
     }
     
      public Object Supprimer()
     {
         Object obj = null ; // we need to return an null object if theyr is an error so we can change it after if its not null
        if ( m_List.isEmpty() )
        {
             System.out.println("You can't suppress it because it's empty");
        }else
        {
            obj=m_List.remove(m_position); // we remove the object at the position we are and we keep it to send it back 
        }
        
        return obj;
     }
    public void Ajouter(Object obj)
    {//we adding an object in the array at the position we are
     
        m_List.add(m_position+1,obj);
    
    }
    
    void afficher ()
    {
    System.out.print(m_List);
    System.out.println();
        
    }
}
