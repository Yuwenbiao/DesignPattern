package com.company.迭代器;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("a", "a", true, 2.99);
        addItem("b", "b", false, 2.99);
        addItem("a", "a", true, 2.99);
        addItem("a", "a", true, 2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

//    public ArrayList getMenuItems() {
//        return menuItems;
//    }

    @Override
    public Iterator createIterator() {
//        return new PancakeHouseMenuIterator(menuItems);
        return menuItems.iterator();
    }
    //这里还有菜单的其他方法
}
