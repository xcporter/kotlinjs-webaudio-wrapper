package nodes

import AudioBuffer
import AudioNode

external class ConvolverNode: AudioNode {
    var buffer: AudioBuffer
    var normalize:  Boolean
}