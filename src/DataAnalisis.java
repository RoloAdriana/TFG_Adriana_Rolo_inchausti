/**
 * 
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import org.apache.mahout.utils.clustering.*;
import org.apache.mahout.clustering.display.*;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.SequenceFile;
import org.apache.hadoop.io.Text;
import org.apache.mahout.clustering.kmeans.KMeansDriver;
import org.apache.mahout.clustering.kmeans.RandomSeedGenerator;
import org.apache.mahout.common.HadoopUtil;
import org.apache.mahout.common.RandomUtils;
import org.apache.mahout.common.distance.DistanceMeasure;
import org.apache.mahout.common.distance.ManhattanDistanceMeasure;
import org.apache.mahout.math.DenseVector;
import org.apache.mahout.math.VectorWritable;




import com.google.common.collect.Lists;


/**
 * @author Adriana Rolo Inchausti
 *
 */
public class DataAnalisis extends DisplayClustering  {

	private static final long serialVersionUID = 1L;
	protected static final List<VectorWritable> SAMPLE_DATA = Lists.newArrayList();
	
	public DataAnalisis()  throws Exception {
		// TODO Auto-generated constructor stub
		initialize();
	}
	
	public static void runAnalisis(List<DenseVector> jugadas) throws Exception {
		  
	    DistanceMeasure measure = new ManhattanDistanceMeasure();
		Path samples = new Path("juegodata/jugadas");
	    Path output = new Path("output");
		Configuration conf = new Configuration();
	    HadoopUtil.delete(conf, samples);
	    HadoopUtil.delete(conf, output);
		FileSystem fs = FileSystem.get(conf);

		@SuppressWarnings("deprecation")
		SequenceFile.Writer writer = new SequenceFile.Writer(fs, conf, samples, Text.class, VectorWritable.class);
		VectorWritable vec = new VectorWritable();
	    int i=0;
		vec = new VectorWritable();
		for (DenseVector vector : jugadas) {
		  vec.set(vector);
		  writer.append(new Text("sample "+ i), vec);
		  i++;
		}
		SAMPLE_DATA.add(vec);
		writer.close();
		  
	    double convergenceDelta = 0.001;
	    int numClusters = 4;
	    int maxIterations = 40;
	    RandomUtils.useTestSeed(); 
	    Path clustersIn = new Path(output, "random-seeds");
	    RandomSeedGenerator.buildRandom(conf, samples, clustersIn, numClusters, measure);
	    
	    KMeansDriver.run(samples,clustersIn,output, convergenceDelta, maxIterations, true, 0.0, true);
	    loadClustersWritable(output);
	    //new DataAnalisis();

		@SuppressWarnings("deprecation")
		SequenceFile.Reader reader = new SequenceFile.Reader(fs,new Path("juegodata/jugadas"), conf);
		Text key = new Text();
		VectorWritable value = new VectorWritable();
		while (reader.next(key, value)) {
		  System.out.println(key.toString() + " belongs to "+ value.get().asFormatString());
		}
		reader.close();
		
	    // run ClusterDumper
	    ClusterDumper clusterDumper = new ClusterDumper(new Path(output, "clusters-0"), new Path(output, "clusteredPoints"));
	    //String[] termDictionary = null;
		clusterDumper.printClusters(null);
		

	}
	  // Override the paint() method
	  @Override
	  public void paint(Graphics g) {
		    Graphics2D g2 = (Graphics2D) g;
		    plotSampleData(g2);
		    plotClusters(g2);
	  }


}






