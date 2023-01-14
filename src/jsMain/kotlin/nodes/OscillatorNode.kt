package nodes

import AudioParam
import PeriodicWave

external class OscillatorNode : AudioScheduledSourceNode {
    val frequency: AudioParam
    val detune: AudioParam
    var type: String
    fun setPeriodicWave(wave: PeriodicWave)
}
