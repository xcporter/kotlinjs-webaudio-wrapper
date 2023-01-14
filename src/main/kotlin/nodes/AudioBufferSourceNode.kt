package nodes

import AudioBuffer
import AudioParam

external class AudioBufferSourceNode: AudioScheduledSourceNode {
    val loopEnd: Float
    val loopStart: Float
    var buffer: AudioBuffer
    var detune: AudioParam
    var loop: Boolean
    var playbackRate: AudioParam
}