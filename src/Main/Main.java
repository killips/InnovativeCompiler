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
public class Main {
    public static void main(String [] arg){
        //Первый пример работы с классами как со структурами, используя так же стандартные java структуры данных
        ArrayList<TableIndificatorov> l = new ArrayList();
        l.add(new TableIndificatorov(1,"Lol1",'g'));
        l.add(new TableIndificatorov(2,"lol2",'c'));
        l.add(new TableIndificatorov(3,"Lol3",'b'));
        System.out.println(l.get(1).lol+" "+l.get(1).name+" "+l.get(1).token);
        //-------------------------------------------------------------------------
        //Второй пример, более удобный и универсальные
        TableOfRegisters TOR = new TableOfRegisters(16);
        /*Создаем класс со структурой, прописываем все данные внутри и при создании передаём(или не передаем) туда определяющую переменную, которая задаёт основы 
        *для работы со структурой...
        *При этом способе внутри класса со структурой можно реализовать методы проверки или поска, или вывода значений и многое другое.
        */
        System.out.println(TOR.getRegType("AL"));
        //------------------------------------------------------------------------------------------------------
        /*Третий пример, создаём как и впервом случае струтуру через класс, а выше этого класса ещё один класс-интерфейс(управляющий класс),
        *в котором будет хранится структура данных с нашей структурой и в которой будут реализованы методы поиска, добавление, удаления, сортировки и т.д. по усматрению
        *
        */
        TableOfInterface TI = new TableOfInterface();
        TI.AddNewElement(14, "singl");
        TI.AddNewElement(7984, "lol");
        TI.AddNewElement(1561, "ku ku");
        System.out.println(TI.searchElementForName("singl").digit);
        //---------------------------------------------------------------------
        //P.S. Что вы будуте использовать не имеет знчение, хотя 3 способо более универсальный, особенно если поработать с ирахией и модификаторами доступа.
    }
}
