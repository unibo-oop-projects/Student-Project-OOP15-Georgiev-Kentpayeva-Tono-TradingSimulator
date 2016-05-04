package viewPlatform;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.data.general.AbstractSeriesDataset;
import org.jfree.data.time.ohlc.OHLCSeriesCollection;

public interface ViewPlatform {
	
	public JFrame drawGraph(boolean isCandleStick);
	public JPanel uI();//user Interface
	public JPanel buy();//zona per puntare
	
	
	public void setValueGraph(AbstractSeriesDataset asset);
	
	public void refreshGraph(AbstractSeriesDataset ass);
	public void close();
	
}
