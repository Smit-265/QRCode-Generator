import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeGen {

	public static void main(String[] args) throws Exception
	{
		
		ByteArrayOutputStream out = QRCode.from("C://Users/admin/Desktop/File.txt").withSize(250, 250).to(ImageType.PNG).stream();
		File f = new File("C://Users/admin/Desktop/Anyname.png");
		FileOutputStream fos = new FileOutputStream(f);
		fos.write(out.toByteArray());
		fos.close();
	}
}
