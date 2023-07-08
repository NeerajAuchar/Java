import java.awt.*;
public  class prac3{
   prac3(){
       Frame f = new Frame("Menu and Menu items");
       MenuBar mb = new MenuBar();
       Menu menu = new Menu();
       Menu submenu = new Menu();
       MenuItem i1 = new MenuItem("Item 1");
       MenuItem i2 = new MenuItem("Item 2");
       MenuItem i3 = new MenuItem("Item 3");
       MenuItem i4 = new MenuItem("Item 4");
       menu.add(i1);
       menu.add(i2);
       menu.add(i3);
       menu.add(i4);
       menu.add(submenu);
       mb.add(menu);
       f.setMenuBar(mb);

    }

    public static void main(String[] args) {
       new prac3();
    }
}