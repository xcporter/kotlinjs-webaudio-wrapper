package nodes

import AudioNode
import org.w3c.dom.HTMLMediaElement
import org.w3c.dom.mediacapture.MediaStream

external class MediaStreamAudioSourceNode : AudioNode {
    val mesiaStream: MediaStream
}