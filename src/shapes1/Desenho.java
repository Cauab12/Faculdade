public class Desenho{
    public static void main(String[] args){
        
        Circle sun = new Circle();
        Triangle roof = new Triangle();
        Square home = new Square();
        Square window = new Square();
        Square door = new Square();
        Square door2 = new Square();

        //sol
        sun.makeVisible();
        sun.changeColor("yellow");
        sun.changeSize(55);
        sun.moveRight();

        //casa
        home.makeVisible();
        home.changeColor("blue");
        home.changeSize(100);
        for (int i = 0; i < 8; i++) {
            home.moveDown();
        }
        home.moveRight();
        home.moveRight();

        //teto
        roof.makeVisible();
        roof.changeSize(55,150);
        roof.changeColor("black");
        for (int i = 0; i < 7; i++) {
            roof.moveDown();
        }
        for (int i = 0; i < 5; i++) {
            roof.moveRight();
        }
        
        //janela
        window.makeVisible();
        window.changeColor("white");
        window.changeSize(20);
        for (int i = 0; i < 9; i++) {
            window.moveDown();
        }
        for (int i = 0; i < 3; i++) {
            window.moveRight();
        }
        
        //porta
        door.makeVisible();
        door.changeSize(20);
        door.changeColor("black");
        for (int i = 0; i < 12; i++) {
            door.moveDown();
        }
        for (int i = 0; i < 4; i++) {
            door.moveRight();
        }
        
        //segunda porta
        door2.makeVisible();
        door2.changeSize(20);
        door2.changeColor("black");
        for (int i = 0; i < 12; i++) {
            door2.moveDown();
        }
        for (int i = 0; i < 4; i++) {
            door2.moveRight();
        }
    }
}