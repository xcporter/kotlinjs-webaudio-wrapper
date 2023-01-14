
open external class AudioBuffer {
    val duration: Double
    val length: Int
    val numberOfChannels: Int
    val sampleRate: Float

    fun copyFromChannel(destination: FloatArray, channelNumber: Int, offset: Long = definedExternally)
    fun copyToChannel(source: FloatArray, channelNumber: Int, offset: Long = definedExternally)
    fun getChannelData(channel: Int): FloatArray
}