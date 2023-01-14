import org.khronos.webgl.Float32Array

open external class AudioBuffer {
    val duration: Double
    val length: Int
    val numberOfChannels: Int
    val sampleRate: Float

    fun copyFromChannel(destination: Float32Array, channelNumber: Int, offset: Long = definedExternally)
    fun copyToChannel(source: Float32Array, channelNumber: Int, offset: Long = definedExternally)
    fun getChannelData(channel: Int): Float32Array
}