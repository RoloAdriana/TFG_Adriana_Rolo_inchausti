import java.awt.*;
import java.util.List;

import org.apache.mahout.math.DenseVector;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.chart.labels.*;
import org.jfree.chart.title.*;
import org.jfree.data.category.*;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.util.*;


  public class RadarChart extends ApplicationFrame {
	  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DefaultCategoryDataset dataset;
    public SpiderWebPlot plot;

    public RadarChart(String title, List<String> features, DenseVector datos, String clusterName, int numCluster) {
        super(title);
        String series1 = "First";


        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // se asignan las categorias que tiene el clúster
        for (int i= 0; i < features.size(); i++){
        dataset.addValue(1, series1, features.get(i));
        }

	        for (int i= 0; i < features.size(); i++){
		        dataset.addValue(datos.get(i), clusterName, features.get(i));
	        }

        
        SpiderWebPlot plot = new SpiderWebPlot(dataset);
        
        switch (numCluster){
        case 0: 
            plot.setSeriesPaint(1, Color.MAGENTA);
        break;
        
        case 1:
            plot.setSeriesPaint(1, Color.BLUE);
        break;
        
        case 2:
            plot.setSeriesPaint(1, Color.RED);
        break;
        
        case 3:
            plot.setSeriesPaint(1, Color.YELLOW);
        break;
        
        }

        plot.setStartAngle(90);
        plot.setInteriorGap(0.20);

        plot.setToolTipGenerator(new StandardCategoryToolTipGenerator());

        JFreeChart chart = new JFreeChart("", TextTitle.DEFAULT_FONT, plot, false);

        ChartUtilities.applyCurrentTheme(chart);

        ChartPanel chartPanel = new ChartPanel(chart);
        this.plot = (SpiderWebPlot) chartPanel.getChart().getPlot();
        this.dataset = (DefaultCategoryDataset) plot.getDataset();
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);
        }


        public static void main(String[] args) {
//                RadarChart demo = new RadarChart("Chart", null, null);
//                demo.pack();
//                RefineryUtilities.centerFrameOnScreen(demo);
//                demo.setVisible(true);
        }
}