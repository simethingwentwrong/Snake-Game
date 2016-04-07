
/**
 * Clase SnakeGame
 * 
 * @author Miguel Bayon
 * @version 1.0
 */
public class SnakeGame
{
    private Canvas lienzo;
    private Snake serpientesEnElAvion;
    private static final int ANCHOLIENZO = 500;
    private static final int ALTOLIENZO = 500;
    /*
     * Constructor de la clase Snake
     */
    public SnakeGame()
    {
     lienzo = new Canvas("Serpientes en el avion", ANCHOLIENZO, ALTOLIENZO );
    }
    
    
    
    /*
     * Dibuja una serpiente en la pantalla
     */
    public void drawSnake()
    {
      serpientesEnElAvion = new Snake(ANCHOLIENZO, ALTOLIENZO);
      lienzo.erase();
      serpientesEnElAvion.dibujar(lienzo);
    }
    
    public void animateSnake(){
        boolean moverse = true;
        while(moverse)
        {
            lienzo.wait(200);
            serpientesEnElAvion.borrar(lienzo);
            moverse = serpientesEnElAvion.mover();
            serpientesEnElAvion.dibujar(lienzo);
        }
        lienzo.drawString("GAME OVER", (ANCHOLIENZO/2) - 50, ALTOLIENZO/2);
    }
}

