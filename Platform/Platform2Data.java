import java.util.ArrayList;
import java.util.List;

import org.apache.mahout.math.DenseVector;
import org.jfree.ui.RefineryUtilities;


public class Platform2Data{

	public Platform2Data() {
		// TODO Auto-generated constructor stub
	}
	
	public static void getData() throws Exception {
		//Se genera la muestra
	
		Platform2 platform2 = new Platform2();
		ArrayList<Platform2Type> dataplatform2 = new ArrayList<Platform2Type>();
		dataplatform2 = platform2.listadejugadas();

		List< DenseVector> jugadas1 = new ArrayList< DenseVector>();
		DenseVector jugada1;
		//Se normalizan los parámetros y se verifica que no se salgan del rango especificado
		for(int i=0; i<dataplatform2.size(); i++){
			
			if ( dataplatform2.get(i).getPuntos() > dataplatform2.get(i).MAX_PUNTOS){
				dataplatform2.get(i).setPuntos(dataplatform2.get(i).MAX_PUNTOS);
			}
			if ( dataplatform2.get(i).getNumeroObjetos() > dataplatform2.get(i).MAX_OBJETOS){
				dataplatform2.get(i).setNumeroObjetos(dataplatform2.get(i).MAX_OBJETOS);
			} 			
			if ( dataplatform2.get(i).getChoqueVaca() > dataplatform2.get(i).MAX_CHOQUE_VACA){
				dataplatform2.get(i).setChoqueVaca(dataplatform2.get(i).MAX_CHOQUE_VACA);
			}

			if ( dataplatform2.get(i).getChoqueSerpiente() > dataplatform2.get(i).MAX_CHOQUE_SERPIENTE){
				dataplatform2.get(i).setChoqueSerpiente(dataplatform2.get(i).MAX_CHOQUE_SERPIENTE);
			}

			if ( dataplatform2.get(i).getSaltos() > dataplatform2.get(i).MAX_SALTOS){
				dataplatform2.get(i).setSaltos(dataplatform2.get(i).MAX_SALTOS);
			} 

			if ( dataplatform2.get(i).getChoquePared() > dataplatform2.get(i).MAX_CHOQUE_PARED){
				dataplatform2.get(i).setChoquePared(dataplatform2.get(i).MAX_CHOQUE_PARED);
			} 
			
			if ( dataplatform2.get(i).getTiempoJuego() > dataplatform2.get(i).MAX_TIEMPO_JUEGO){
				dataplatform2.get(i).setTiempoJuego(dataplatform2.get(i).MAX_TIEMPO_JUEGO);
			} 
		}

		
		

		for(int i=0; i<dataplatform2.size(); i++){
			double aux_puntos=dataplatform2.get(i).getPuntos();
			double aux_objetos=dataplatform2.get(i).getNumeroObjetos();
			double aux_vacas=dataplatform2.get(i).getChoqueVaca();
			double aux_serpientes=dataplatform2.get(i).getChoqueSerpiente();
			double aux_pared=dataplatform2.get(i).getChoquePared();
			double aux_tiempo=dataplatform2.get(i).getTiempoJuego();
			double aux_saltos=dataplatform2.get(i).getSaltos();
		 jugada1 = new DenseVector(new double[] {aux_puntos / dataplatform2.get(i).MAX_PUNTOS ,
						 					     aux_vacas / dataplatform2.get(i).MAX_CHOQUE_VACA,
						 					     aux_serpientes / dataplatform2.get(i).MAX_CHOQUE_SERPIENTE,
						 					     aux_pared / dataplatform2.get(i).MAX_CHOQUE_PARED});	
		 jugadas1.add(jugada1);
		 
		}
		DataAnalisis.runAnalisis(jugadas1);	
	
	  // se grafican  los clústeres obtenidos 
	  // cluster 0	
		
	  List<String> aux = dataplatform2.get(0).getFeatures();
	  List<String>  aux2 =dataplatform2.get(0).getClusters();
	  
		
    RadarChart demo = new RadarChart("Jugador: 0",aux,jugadas1.get(0),aux2.get(0),0);
    demo.pack();
    RefineryUtilities.centerFrameOnScreen(demo);
    demo.setVisible(true);
    
    RadarChart demo1 = new RadarChart("Jugador: 5",aux,jugadas1.get(5),aux2.get(0),0);
    demo1.pack();
    RefineryUtilities.centerFrameOnScreen(demo1);
    demo1.setVisible(true);
	
    
    // cluster 1	
    RadarChart demo2 = new RadarChart("Jugador: 1",aux,jugadas1.get(1),aux2.get(1),1);
    demo2.pack();
    RefineryUtilities.centerFrameOnScreen(demo2);
    demo2.setVisible(true);

    RadarChart demo3 = new RadarChart("Jugador: 4",aux,jugadas1.get(4),aux2.get(1),1);
    demo3.pack();
    RefineryUtilities.centerFrameOnScreen(demo3);
    demo3.setVisible(true);

    RadarChart demo4 = new RadarChart("Jugador: 3 ",aux,jugadas1.get(3),aux2.get(1),1);
    demo4.pack();
    RefineryUtilities.centerFrameOnScreen(demo4);
    demo4.setVisible(true);
    
    RadarChart demo5 = new RadarChart("Jugador: 6",aux,jugadas1.get(6),aux2.get(1),1);
    demo5.pack();
    RefineryUtilities.centerFrameOnScreen(demo5);
    demo5.setVisible(true);
    
    
    RadarChart demo6 = new RadarChart("Jugador:8 ",aux,jugadas1.get(8),aux2.get(1),1);
    demo6.pack();
    RefineryUtilities.centerFrameOnScreen(demo6);
    demo6.setVisible(true);

    //cluster 2

    RadarChart demo7 = new RadarChart("Jugador:2 ",aux,jugadas1.get(2),aux2.get(2),2);
    demo7.pack();
    RefineryUtilities.centerFrameOnScreen(demo7);
    demo7.setVisible(true);
    
    RadarChart demo8 = new RadarChart("Jugador:10 ",aux,jugadas1.get(10),aux2.get(2),2);
    demo8.pack();
    RefineryUtilities.centerFrameOnScreen(demo8);
    demo8.setVisible(true);
    
    //cluster 2
    RadarChart demo9 = new RadarChart("Jugador:7 ",aux,jugadas1.get(7),aux2.get(3),3);
    demo9.pack();
    RefineryUtilities.centerFrameOnScreen(demo9);
    demo9.setVisible(true);
    
    RadarChart demo10 = new RadarChart("Jugador:9 ",aux,jugadas1.get(9),aux2.get(3),3);
    demo10.pack();
    RefineryUtilities.centerFrameOnScreen(demo10);
    demo10.setVisible(true);
	}
}
