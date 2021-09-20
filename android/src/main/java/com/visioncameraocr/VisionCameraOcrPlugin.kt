import androidx.camera.core.ImageProxy
import com.mrousavy.camera.frameprocessor.FrameProcessorPlugin

class VisionCameraOcrPlugin: FrameProcessorPlugin("scanOCR") {

  override fun callback(image: ImageProxy, params: Array<Any>): Any? {
    // code goes here
    return null
  }
}
