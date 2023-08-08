import java.awt.*;


class Gridex extends Frame
{
Gridex()
{
setSize(400,400);
setVisible(true);
setLocation(500,200);
setTitle("GridLayout");
GridLayout g1 = new GridLayout(3,2);

Label l = new Label("Name");
add(l);
TextField t = new TextField();
add(t);
Label l1 = new Label("password");
add(l1);
TextField t1 = new TextField();
add(t1);
t1.setEchoChar('#');
Button b = new Button("Login");
add(b);
setLayout(g1);
}
public static void main(String[] args)
{
Gridex q = new Gridex();
}
}