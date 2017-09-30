package com.company.迭代器;

import java.util.Iterator;

public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("c","c",true,33);
        addItem("d","d",false,33);
        addItem("c","c",true,33);
        addItem("c","c",true,33);
        addItem("c","c",true,33);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry!");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }

//    public Iterator createIterator() {
//        return new DinerMenuIterator(menuItems);
//    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    //这里还有菜单的其他方法
}
