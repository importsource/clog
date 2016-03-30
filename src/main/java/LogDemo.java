import com.importsource.log.LogManager;
import com.importsource.log.Logger;

public class LogDemo {

	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(LogDemo.class);
		logger.i("sdfsdf");
		logger.e("sdfsdf");
		logger.w("sdfsdf");
	}

}
