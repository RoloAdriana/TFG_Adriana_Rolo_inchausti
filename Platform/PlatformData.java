import java.util.ArrayList;
import java.util.List;

import org.apache.mahout.math.DenseVector;
import org.jfree.ui.RefineryUtilities;


public class PlatformData{

	public PlatformData() {
		// TODO Auto-generated constructor stub
	}
	
	public static void getData() throws Exception {
		//Se genera la muestra
		Platform platform = new Platform();
		ArrayList<PlatformType> dataPlatform = new ArrayList<PlatformType>();
		dataPlatform = platform.listadejugadas();
		
		//Se normalizan los parámetros y se verifica que no se salgan del rango especificado
		for(int i=0; i<dataPlatform.size(); i++){
			
			if ( dataPlatform.get(i).getPuntos() > dataPlatform.get(i).MAX_PUNTOS){
				dataPlatform.get(i).setPuntos(dataPlatform.get(i).MAX_PUNTOS);
			}
			
			if ( dataPlatform.get(i).getNumSaltos() > dataPlatform.get(i).MAX_NUM_SALTOS){
				dataPlatform.get(i).setNumSaltos(dataPlatform.get(i).MAX_NUM_SALTOS);
			}

			if ( dataPlatform.get(i).getNumFlechaDerecha() > dataPlatform.get(i).MAX_NUM_FLECHA_DERECHA){
				dataPlatform.get(i).setNumFlechaDerecha(dataPlatform.get(i).MAX_NUM_FLECHA_DERECHA);
			}

			if ( dataPlatform.get(i).getNumFlechaIzqda() > dataPlatform.get(i).MAX_NUM_FLECHA_IZQDA){
				dataPlatform.get(i).setNumFlechaIzqda(dataPlatform.get(i).MAX_NUM_FLECHA_IZQDA);
			} 

			if ( dataPlatform.get(i).getNumObjetos() > dataPlatform.get(i).MAX_NUM_OBJETOS){
				dataPlatform.get(i).setNumObjetos(dataPlatform.get(i).MAX_NUM_OBJETOS);
			} 

			if ( dataPlatform.get(i).getEnemigosAcabados() > dataPlatform.get(i).MAX_ENEMIGOSACABADOS){
				dataPlatform.get(i).setEnemigosAcabados(dataPlatform.get(i).MAX_ENEMIGOSACABADOS);
			} 
			
			if ( dataPlatform.get(i).getVidasPerdidasCaidas() > dataPlatform.get(i).MAX_VIDAS_PERDIDAS_CAIDAS){
				dataPlatform.get(i).setVidasPerdidasCaidas(dataPlatform.get(i).MAX_VIDAS_PERDIDAS_CAIDAS);
			} 

			if ( dataPlatform.get(i).getVidasPerdidasEnemigos() > dataPlatform.get(i).MAX_VIDAS_PERDIDAS_ENEMIGOS){
				dataPlatform.get(i).setVidasPerdidasEnemigos(dataPlatform.get(i).MAX_VIDAS_PERDIDAS_ENEMIGOS);
			} 
				
			if ( dataPlatform.get(i).getTiempo() > dataPlatform.get(i).MAX_TIEMPO){
				dataPlatform.get(i).setTiempo(dataPlatform.get(i).MAX_TIEMPO);
			} 

			 
		}

		List< DenseVector> jugadas1 = new ArrayList< DenseVector>();
		DenseVector jugada1;
			 
			
		for(int i=0; i<dataPlatform.size(); i++){
			
			double aux_puntos=dataPlatform.get(i).getPuntos();
			double aux_saltos=dataPlatform.get(i).getNumSaltos();
			double aux_derecha=dataPlatform.get(i).getNumFlechaDerecha();
			double aux_izqda=dataPlatform.get(i).getNumFlechaIzqda() ;
			double aux_objetos=dataPlatform.get(i).getNumObjetos();
			double aux_enemigos=dataPlatform.get(i).getEnemigosAcabados(); 
			double aux_caidas=dataPlatform.get(i).getVidasPerdidasCaidas();
			double aux_vidasEnemigos=dataPlatform.get(i).getVidasPerdidasEnemigos() ;
			double aux_tiempo=dataPlatform.get(i).getTiempo();

			//Se llena el vector con las veriables que serán usadas para la ejecución de k-means 
			// se quitan aquellas que han sido desechadas por las matrices de correlación
		 jugada1 = new DenseVector(new double[]{(aux_puntos/ dataPlatform.get(i).MAX_PUNTOS),
				 								(aux_saltos / dataPlatform.get(i).MAX_NUM_SALTOS),
				 								(aux_derecha/ dataPlatform.get(i).MAX_NUM_FLECHA_DERECHA),
				 								(aux_izqda/ dataPlatform.get(i).MAX_NUM_FLECHA_IZQDA),
				 								(aux_caidas / dataPlatform.get(i).MAX_VIDAS_PERDIDAS_CAIDAS),
				 								(aux_tiempo / dataPlatform.get(i).MAX_TIEMPO)});
		 jugadas1.add(jugada1);
		 
		}
		DataAnalisis.runAnalisis(jugadas1);

	  // se grafican  los clústeres obtenidos 
	  // cluster 0	
		
	  List<String> aux = dataPlatform.get(0).getFeatures();
	  List<String>  aux2 =dataPlatform.get(0).getClusters();
		
      RadarChart demo = new RadarChart("Jugador: 0",aux,jugadas1.get(0),aux2.get(0),0);
      demo.pack();
      RefineryUtilities.centerFrameOnScreen(demo);
      demo.setVisible(true);
      
      RadarChart demo1 = new RadarChart("Jugador: 4",aux,jugadas1.get(4),aux2.get(0),0);
      demo1.pack();
      RefineryUtilities.centerFrameOnScreen(demo1);
      demo1.setVisible(true);
      
      RadarChart demo2 = new RadarChart("Jugador: 6",aux,jugadas1.get(6),aux2.get(0),0);
      demo2.pack();
      RefineryUtilities.centerFrameOnScreen(demo2);
      demo2.setVisible(true);
      
      RadarChart demo3 = new RadarChart("Jugador: 9",aux,jugadas1.get(9),aux2.get(1),1);
      demo3.pack();
      RefineryUtilities.centerFrameOnScreen(demo3);
      demo3.setVisible(true);

	  // cluster 1			
      RadarChart demo4 = new RadarChart("Jugador: 5 ",aux,jugadas1.get(5),aux2.get(1),1);
      demo4.pack();
      RefineryUtilities.centerFrameOnScreen(demo4);
      demo4.setVisible(true);
      
      RadarChart demo5 = new RadarChart("Jugador: 8",aux,jugadas1.get(8),aux2.get(1),1);
      demo5.pack();
      RefineryUtilities.centerFrameOnScreen(demo5);
      demo5.setVisible(true);
      
      //cluster 2
      
      RadarChart demo6 = new RadarChart("Jugador:2 ",aux,jugadas1.get(2),aux2.get(2),2);
      demo6.pack();
      RefineryUtilities.centerFrameOnScreen(demo6);
      demo6.setVisible(true);
      
      RadarChart demo7 = new RadarChart("Jugador:10 ",aux,jugadas1.get(10),aux2.get(2),2);
      demo7.pack();
      RefineryUtilities.centerFrameOnScreen(demo7);
      demo7.setVisible(true);

      
      //cluster 2
      
      RadarChart demo8 = new RadarChart("Jugador:1 ",aux,jugadas1.get(1),aux2.get(3),3);
      demo8.pack();
      RefineryUtilities.centerFrameOnScreen(demo8);
      demo8.setVisible(true);
      
      RadarChart demo9 = new RadarChart("Jugador:3 ",aux,jugadas1.get(3),aux2.get(3),3);
      demo9.pack();
      RefineryUtilities.centerFrameOnScreen(demo9);
      demo9.setVisible(true);
      
      RadarChart demo10 = new RadarChart("Jugador:7 ",aux,jugadas1.get(7),aux2.get(3),3);
      demo10.pack();
      RefineryUtilities.centerFrameOnScreen(demo10);
      demo10.setVisible(true);
      
	}
}
