import com.talanlabs.avatargenerator.Avatar;
import com.talanlabs.avatargenerator.TriangleAvatar;

import java.awt.image.BufferedImage;

public class Triangle1Main {

	public static void main(String[] args) throws Exception {
		BufferedImage image = AvatarShowing.showAvatar(TriangleAvatar.newAvatarBuilder().build(), 10);
		AvatarShowing.showImage(image);
	}
}
