import org.w3c.dom.MessagePort

external interface Worklet
external interface WorkletGlobalScope
interface AudioWorklet: Worklet

open external class AudioWorkletGlobalScope: WorkletGlobalScope {
    val currentFrame: Int
    val currentTime: Double
    val sampleRate: Float
    fun registerProcessor(name: String, processorCtor: AudioWorkletProcessor)
}

open external class AudioWorkletNode: AudioNode

open external class AudioWorkletProcessor {
    val port: MessagePort
    fun process()
}