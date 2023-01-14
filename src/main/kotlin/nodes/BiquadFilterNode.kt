package nodes

import AudioNode
import AudioParam

external class BiquadFilterNode: AudioNode {
    val detune: AudioParam
    val frequency: AudioParam
    val gain: AudioParam
    val Q: AudioParam
    var type: String
    fun getFrequencyResponse(frequencyArray: FloatArray, magResponseOutput: FloatArray, phaseResponseOutput: FloatArray)
}