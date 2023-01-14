package nodes

import AudioNode
import org.khronos.webgl.Float32Array

external class WaveShaperNode : AudioNode {
    var curve: Float32Array
}