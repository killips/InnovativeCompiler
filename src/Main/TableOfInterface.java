/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author Пользователь
 */
public class TableOfInterface {
    ArrayList<Table> t = new ArrayList();
    
    public void AddNewElement(int digit,String name){
        t.add(new Table(digit,name));
    }
    public void GetElement(int index){
        t.get(index);
    }
    public Table searchElementForName(String name){
        Table a = null;
        for(int i=0;i<t.size();i++){
            if(name==t.get(i).name){
                a=t.get(i);
                break;
            }
        }
        return a;
    }
}
