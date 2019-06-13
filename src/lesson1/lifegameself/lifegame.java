	package lesson1.lifegameself;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class lifegame extends JFrame
{
	private final Worldmap world;
	
	public lifegame(int rows, int columns)
	{
		world = new Worldmap(rows, columns);
		new Thread(world).start();
		add(world);
	}	
	
    public static void main(String[] args) 
    {
    	lifegame frame = new lifegame(40, 50);
    	
        JMenuBar menu = new JMenuBar();
        frame.setJMenuBar(menu);        
        JMenu options = new JMenu("点击Chose开始游戏");
        menu.add(options);
        
        JMenuItem love = options.add("Love");
        love.addActionListener(frame.new ArrowActionListener());
        
        JMenuItem pentacle = options.add("Penacle");
        pentacle.addActionListener(frame.new SquareActionListener());        
        
        JMenu help = new JMenu("查看游戏规则");        
        help.addActionListener(frame.new HelpActionListener());
        menu.add(help);
        
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1007, 859);
        frame.setTitle("Game of Life");
        frame.setVisible(true);
        frame.setResizable(false);
    }	
    
    class ArrowActionListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e) 
    	{
    		world.setLove();
    	}
    }
    
    class SquareActionListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e) 
    	{
    		world.setPantacle();
    	}
    }    
    class HelpActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			world.setHelp();
		}
    	
    }
}
