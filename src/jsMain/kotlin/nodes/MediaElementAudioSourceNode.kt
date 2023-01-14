package nodes

import AudioNode
import org.w3c.dom.HTMLMediaElement

external class MediaElementAudioSourceNode : AudioNode {
    val mediaElement: HTMLMediaElement
}