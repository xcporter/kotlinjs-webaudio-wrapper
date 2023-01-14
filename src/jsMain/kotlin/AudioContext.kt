import nodes.MediaElementAudioSourceNode
import nodes.MediaStreamAudioDestinationNode
import nodes.MediaStreamAudioSourceNode
import nodes.MediaStreamTrackAudioSourceNode
import org.w3c.dom.HTMLMediaElement
import org.w3c.dom.mediacapture.MediaStream
import org.w3c.dom.mediacapture.MediaStreamTrack
import kotlin.js.Promise

open external class AudioContext: BaseAudioContext {
    val baseLatency: Long
    val outputLatency: Long
    fun close()
    fun createMediaElementSource(element: HTMLMediaElement): MediaElementAudioSourceNode
    fun createMediaStreamDestination(): MediaStreamAudioDestinationNode
    fun createMediaStreamSource(source: MediaStream): MediaStreamAudioSourceNode
    fun createMediaStreamTrackSource(source: MediaStreamTrack): MediaStreamTrackAudioSourceNode
    fun getOutputTimestamp(): AudioTimestamp
    fun resume(): Promise<Unit>
    fun suspend(): Promise<Unit>
}
