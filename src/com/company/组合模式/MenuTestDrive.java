package com.company.组合模式;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("a", "a");
        MenuComponent allMenus = new Menu("all", "all");
        allMenus.add(pancakeHouseMenu);

        pancakeHouseMenu.add(new MenuItem(
                "a",
                "a",
                true,
                3
        ));
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
