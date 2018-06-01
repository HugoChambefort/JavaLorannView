import java.awt.image.BufferedImage;
import java.io.IOException; 
import javax.imageio.ImageIO;

public class HorizontalWall {

	    private BufferedImage sprite;
		public HorizontalWall(int x, int y){
	        super();
	        try {
	            this.sprite = ImageIO.read(this.getClass().getResourceAsStream("Image/horizontal_wall.png"));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    public String get_type(){
	        return "H";
	    }
	   
	}

