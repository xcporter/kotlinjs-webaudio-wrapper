package nodes

import AudioNode
import org.w3c.dom.mediacapture.MediaStream

external class MediaStreamAudioDestinationNode : AudioNode {
    val stream: MediaStream
}