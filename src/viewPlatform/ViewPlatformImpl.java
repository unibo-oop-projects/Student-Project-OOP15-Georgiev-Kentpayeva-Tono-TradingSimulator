package viewPlatform;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import org.jfree.chart.ChartMouseEvent;

import modelPlatform.ModelPlatform;
import modelPlatform.ModelPlatformImpl;
import modelPlatform.ValuesAsset;
import modelPlatform.ValuesAssetImpl;

public class ViewPlatformImpl extends JFrame implements ViewPlatform{

	ValuesAsset asset=null;
			
	public ViewPlatformImpl(ValuesAsset asset){/*ValuesAsset asset*/
		
		super("Trading Platoform");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.asset=asset;
        //System.out.println("ok--> "+asset.toString());
		JPanel canvas =new JPanel();
		
		JFrame graph=this.drawGraph();
		JFrame ui=this.uI();
		JPanel buy=this.buy();
		
		//graph.pack();
		ui.setSize(400,1400);
		
		//assegno l'asset all'ui per prendere il punto di puntata nel grafico
		((viewPlatform.uI) ui).setAssetValues(asset);
		//______________________________________________________________________
		
		
		ui.pack();
		//ui.setVisible(true);
		buy.setVisible(true);
		
		//buy.setSize(1000,1000);
		//buy.pack()
		//this.setSize(1800, 1800);
		
		
		
		
		canvas.add(buy,BorderLayout.WEST);
		canvas.add(graph.getContentPane(),BorderLayout.CENTER);
		canvas.add(ui.getContentPane(),BorderLayout.EAST);
		
		
		//this.pack();
		this.add(canvas);
		//this.setContentPane(canvas);
		this.setVisible(true);
		this.pack();
	}
	
	
		
			@Override
			public JFrame drawGraph() {
				// TODO Auto-generated method stub
				//asset=new ModelPlatformImpl().dataFeed();
				
				
				
				return new CandleStick("MSFT",asset);
			    
				
			}
			
			
			@Override
			public JFrame uI() {
				// TODO Auto-generated method stub
				return new uI();
				
				
			}

			
			@Override
			public JPanel buy() {
				// TODO Auto-generated method stub
				return new buy();
			}
			

			
			//_______________________________metodi per il controller____________________________________
			@Override
			public void setValueGraph(ValuesAsset asset ) {
				// TODO Auto-generated method stub
				this.asset=asset;
				
			}

			@Override
			public void close() {
				// TODO Auto-generated method stub
				this.setVisible(false);
			}



			@Override
			public void refreshGraph(ValuesAssetImpl ass) {
				// TODO Auto-generated method stub
				 this.close();
				 new ViewPlatformImpl(ass);
				 
			}
			
			
			
			
		}
		
		
		

