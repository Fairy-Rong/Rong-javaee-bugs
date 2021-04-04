import com.talanlabs.avatargenerator.Avatar;
import com.talanlabs.avatargenerator.utils.AvatarUtils;

import javax.imageio.ImageIO;
import java.awt.Desktop;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class AvatarShowing {

	private AvatarShowing() {
		super();
	}

	public static BufferedImage showAvatar(Avatar avatar, int randSeed){
		return showAvatar(avatar, 4, 1, randSeed);
	}

	public static void showAvatar(Avatar avatar) {
		showAvatar(avatar, 4, 1, 10);
	}

	public static BufferedImage showAvatar(Avatar avatar, int w, int h, int randSeed) {
		int size = avatar.getWidth();
		BufferedImage dest = new BufferedImage(size * w, size * h, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = dest.createGraphics();
		AvatarUtils.activeAntialiasing(g2);
		Random random = new Random(randSeed);
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				long code = Math.abs(random.nextLong());
				g2.drawImage(avatar.create(code), x * size, y * size, size, size, null);
				//System.out.print(code + ", ");
				//g2.setColor(Color.RED);
				//g2.drawRect(x * 128, y * 128, 128, 128);
			}
			//System.out.println("");
		}

		g2.dispose();

		//------original code
		//showImage(dest);
		return dest;

	}

	public static void showImage(BufferedImage bi) {
		try {
			Path file = Files.createTempFile("img", ".png");
			ImageIO.write(bi, "png", file.toFile());

			Desktop.getDesktop().open(file.toFile());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
