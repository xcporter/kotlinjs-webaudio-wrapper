package nodes

import AudioNode
import AudioParam
import org.khronos.webgl.Float32Array

external class BiquadFilterNode: AudioNode {
    val detune: AudioParam
    val frequency: AudioParam
    val gain: AudioParam
    val Q: AudioParam
    var type: String
    fun getFrequencyResponse(frequencyArray: Float32Array, magResponseOutput: Float32Array, phaseResponseOutput: Float32Array)
}