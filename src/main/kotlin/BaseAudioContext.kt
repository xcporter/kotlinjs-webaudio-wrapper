import nodes.*
import org.khronos.webgl.ArrayBuffer
import org.w3c.dom.events.EventTarget
import kotlin.js.Promise

enum class BaseAudioContextState {
   SUSPENDED,RUNNING,CLOSED
}

open external class BaseAudioContext : EventTarget {
    val audioWorklet: AudioWorklet
    val currentTime: Double
    val destination: AudioNode
    val listener: AudioListener
    val sampleRate: Float

    fun createAnalyser(): AnalyserNode
    fun createBiquadFilter(): BiquadFilterNode
    fun createBuffer(numOfChannels: Int, length: Float, sampleRate: Float): AudioBuffer
    fun createBufferSource(): AudioBufferSourceNode
    fun createChannelMerger(numberOfInputs: Int): ChannelMergerNode
    fun createChannelSplitter(numberOfOutputs: Int): ChannelSplitterNode
    fun createConstantSource(): ConstantSourceNode
    fun createConvolver(): ConvolverNode
    fun createDelay(maxDelayTime: Float): DelayNode
    fun createDynamicsCompressor(): DynamicsCompressorNode
    fun createGain(): GainNode
    fun createIIRFilter(feedforward: Float, feedback: Float): IIRFilterNode
    fun createOscillator(): OscillatorNode
    fun createPanner(): PannerNode
    fun createPeriodicWave(real: FloatArray, imag: FloatArray): PeriodicWave
    fun createStereoPanner(): StereoPannerNode
    fun createWaveShaper(): WaveShaperNode
    fun decodeAudioData(buffer: ArrayBuffer): Promise<AudioBuffer>
}