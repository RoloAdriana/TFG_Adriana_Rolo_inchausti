import java.awt.*;

import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.chart.labels.*;
import org.jfree.chart.title.*;
import org.jfree.data.category.*;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.util.*;


  public class RadarChartPlatform extends ApplicationFrame {
	  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DefaultCategoryDataset dataset;
    public SpiderWebPlot plot;

    public RadarChartPlatform(String title, String[] features) {
        super(title);
        String series1 = "First";
        String series2 = "Second";
        String series3 = "Third";

        String category1 = "puntos";
        String category2 = "ObjetosCogidos";
        String category3 = "tiempoJuego";
        String category4 = "EnemigosAcabados";
        String category5 = "flechaDerecha";
        String category6 = "flechaIzqda";
        String category7 = "saltos";
        String category8 = "vidasPerdidasCaidas";
        String category9 = "vidasPerdidasEnemigos";

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, series1, category1);
        dataset.addValue(5.0, series1, category2);
        dataset.addValue(5.0, series1, category3);
        dataset.addValue(5.0, series1, category4);
        dataset.addValue(5.0, series1, category5);
        dataset.addValue(5.0, series1, category6);
        dataset.addValue(5.0, series1, category7);
        dataset.addValue(5.0, series1, category8);
        dataset.addValue(5.0, series1, category9);
        
        dataset.addValue(2.0, series2, category1);
        dataset.addValue(4.0, series2, category2);
        dataset.addValue(5.0, series2, category3);
        dataset.addValue(3.0, series2, category4);
        dataset.addValue(3.9, series2, category5);
        dataset.addValue(4.3, series2, category6);
        dataset.addValue(5.0, series2, category7);
        dataset.addValue(3.5, series2, category8);
        dataset.addValue(4.0, series2, category9);

        SpiderWebPlot plot = new SpiderWebPlot(dataset);

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
                RadarChartPlatform demo = new RadarChartPlatform("Chart");
                demo.pack();
                RefineryUtilities.centerFrameOnScreen(demo);
                demo.setVisible(true);
        }
}