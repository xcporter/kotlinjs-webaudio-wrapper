import org.w3c.dom.events.EventTarget

open external class AudioNode: EventTarget {
    val context: BaseAudioContext
    val numberOfInputs: Int
    val numberOfOutputs: Int

    var channelCount: dynamic
    var channelCountMode: dynamic
    var channelInterpretation: dynamic

    fun connect(node: AudioNode, output: Int = definedExternally, input: Int = definedExternally): AudioNode
    fun disconnect(node: AudioNode, output: Int = definedExternally, input: Int = definedExternally): AudioNode
}