package nodes

import AudioNode
import org.khronos.webgl.Uint8Array

external class AnalyserNode: AudioNode {
    val frequencyBinCount: Long
    var fftSize: Long
    var maxDecibels: Double
    var minDecibels: Double
    var smoothingTimeConstant: Double

    fun getByteFrequencyData(array: Uint8Array)
    fun getByteTimeDomainData(array: Uint8Array)
    fun getFloatFrequencyData(array: Uint8Array)
    fun getFloatTimeDomainData(array: Uint8Array)
}