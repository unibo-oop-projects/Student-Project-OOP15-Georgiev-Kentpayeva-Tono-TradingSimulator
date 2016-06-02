package viewPlatform;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.data.general.AbstractSeriesDataset;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.ohlc.OHLCSeries;
import org.jfree.data.time.ohlc.OHLCSeriesCollection;

public interface ViewPlatform {
	
	
	public void setValueGraph(TimeSeriesCollection dataset);
	
	
	
	public void setCandleStick(boolean isCandleGraph);
	public boolean getCandleStick();
	
	public void disabilitaBottone();
	public void abilitaBottone();
	
	void setDataSet(OHLCSeries dataset);
		
	
}
