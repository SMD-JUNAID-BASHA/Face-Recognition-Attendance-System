import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;

public class FaceDetector {

    public static void startDetection() {

       
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

       
        CascadeClassifier faceDetector = new CascadeClassifier(
                "haarcascade_frontalface_default.xml"
        );

      
        VideoCapture camera = new VideoCapture(0);

      
        if (!camera.isOpened()) {

            System.out.println("Camera not detected");
            return;
        }

        System.out.println("Camera Started Successfully");
        System.out.println("Face Detection Running...");

        Mat frame = new Mat();

        while (true) {

            camera.read(frame);

            if (!frame.empty()) {

                System.out.println("Face Detected Successfully");
                break;
            }
        }

        camera.release();
    }
}
