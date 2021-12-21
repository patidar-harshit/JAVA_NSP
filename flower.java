import java.awt.*;
import java.awt.event.*;
import java.applet.*;



public class flower extends Applet implements ActionListener
{
    Button bttn1 = new Button ("Enlarge");
    Button bttn2 = new Button ("Small");
 

 
    String input;

    int choice =0;
    int ch=0;
    int cho=0,chi=0;

    public void init ()
    {
        this.setSize (902, 560);

        setBackground (Color.lightGray);


        bttn1.addActionListener (this); // Enlarge button
        bttn2.addActionListener (this); // small button
       
        add (bttn1);
        add (bttn2);
       

    }
    public void paint (Graphics g)
    {
       
       
//scenery
    g.setColor (Color.cyan);
    g.fillRect (0,0,900,500);

    //sun
    g.setColor (Color.orange);
    g.fillArc (100,20,80,80,0,360);
    g.drawLine (95,55,75,55);
    g.drawLine (140,105,140,125);
    g.drawLine (140,15,140,0);
    g.drawLine (185,60,205,60);
    g.drawLine (105,35,85,25);
    g.drawLine (120,20,105,5);
    g.drawLine (100,80,80,90);
    g.drawLine (115,100,100,120);
    g.drawLine (175,5,160,20);
    g.drawLine (205,25,175,35);
    g.drawLine (205,90,175,80);
    g.drawLine (175,120,160,100);

    //cloud
    g.setColor (Color.white);
  

    g.fillArc (210,50,80,50,0,360);
    g.fillArc (240,30,70,50,0,360);
    g.fillArc (260,40,80,50,0,360);

     g.fillArc (310,50,80,50,0,360);
    g.fillArc (340,30,70,50,0,360);
    g.fillArc (360,40,80,50,0,360);
  
     g.fillArc (510,70,80,50,0,360);
    g.fillArc (540,50,70,50,0,360);
    g.fillArc (560,60,80,50,0,360);
  

    g.fillArc (700,50,80,50,0,360);
    g.fillArc (720,40,70,50,0,360);
    g.fillArc (760,50,80,50,0,360);
    

    //page
    g.setColor (Color.green);
    g.fillRect (0,450,900,100);

    
    
     if( choice>=0 || ch>=0 )
                 {
                
                //First Flower
                g.setColor(Color.YELLOW);
                g.fillOval (-10, 200, 100+choice-ch, 100+choice-ch);
                g.fillOval (-10, 100,  100+choice-ch, 100+choice-ch);
                g.fillOval (100, 100,  100+choice-ch, 100+choice-ch); 
                g.fillOval (100, 200,  100+choice-ch, 100+choice-ch);
                
                g.setColor(Color.PINK);
                g.fillOval (20, 135, 50+choice-ch, 50+choice-ch);
                g.fillOval (20, 220,  50+choice-ch, 50+choice-ch);
                g.fillOval (110, 215,  50+choice-ch, 50+choice-ch); 
                g.fillOval (110, 135,  50+choice-ch, 50+choice-ch);
                 
                g.setColor(Color.red);
                g.fillOval (45, 150,  100+choice-ch, 100+choice-ch);

                //tree
    g.setColor (Color.red);
    int a [] = {85+choice-ch,90+choice-ch,95+choice-ch,100+choice-ch};
    int b [] = {450,150,150,450};
    g.fillPolygon (a, b, 4);
    g.setColor (Color.green);
    g.fillOval (38+choice-ch, 380, 50, 50);
    g.fillOval (97+choice-ch, 350, 50, 50);


                //Second Flower
                g.setColor(Color.YELLOW);
                g.fillOval (500, 300, 100+choice-ch, 100+choice-ch);
                g.fillOval (500, 200,  100+choice-ch, 100+choice-ch);
                g.fillOval (600, 200,  100+choice-ch, 100+choice-ch); 
                g.fillOval (600, 300,  100+choice-ch, 100+choice-ch);
                
                g.setColor(Color.PINK);
                g.fillOval (540, 240, 50+choice-ch, 50+choice-ch);
                g.fillOval (540, 315,  50+choice-ch, 50+choice-ch);
                g.fillOval (610, 315,  50+choice-ch, 50+choice-ch); 
                g.fillOval (610, 240,  50+choice-ch, 50+choice-ch);
                 
                g.setColor(Color.red);
                g.fillOval (560, 265,  80+choice-ch, 80+choice-ch);
                

                g.setColor (Color.red);
                int c [] = {595+choice-ch,597+choice-ch,599+choice-ch,601+choice-ch};
                int d [] = {450,300,300,450};
                g.fillPolygon (c, d, 4);
                g.setColor (Color.green);
                g.fillOval (568+choice-ch, 400, 30, 30);
                g.fillOval (601+choice-ch, 410, 30, 30);

                 
                g.setColor (Color.green);
                g.fillArc (105,425,140,60,0,180);
                g.fillArc (135,400,80,60,0,180);
                
 
                g.setColor (Color.green);
                g.fillArc (135,425,290,60,0,210);
                g.fillArc (175,400,110,60,0,210);

                g.setColor (Color.green);
                g.fillArc (700,425,140,60,0,180);
                g.fillArc (735,400,80,60,0,180);

 }

    
               
          
        showStatus ("Please seclect an option.");
    }
    public void actionPerformed (ActionEvent evt)
    {
        if (evt.getSource () == bttn1)
{
            choice=choice+1;
            cho++;
}
        else if (evt.getSource () == bttn2)
{
            ch=ch+1;
            chi++;
}
        repaint ();
    }

}


/*

<applet code ="flower.class" width=700 height=500>

</applet>

*/