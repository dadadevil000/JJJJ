import java.awt.*;

class LayoutEx extends Frame
{
LayoutEx()
{
setSize(400,400);
setVisible(true);
setLocation(500,200);
setTitle("Layout");
BorderLayout b = new BorderLayout(20,20);
Button b1 = new Button("Save");
add(b1,b.NORTH);

Button b2 = new Button("Left");
add(b2,b.WEST);

Button b3 = new Button("Right");
add(b3,b.EAST);

Button b4 = new Button("Down");
add(b4,b.SOUTH);

Label l = new Label("Center",Label.CENTER);
add(l,b.CENTER);
}


public static void main(String[] args)
{
LayoutEx m = new LayoutEx();
}
}