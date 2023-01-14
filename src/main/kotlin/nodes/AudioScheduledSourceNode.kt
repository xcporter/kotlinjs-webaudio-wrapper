package nodes

import AudioNode

open external class AudioScheduledSourceNode: AudioNode {
    fun start(offset: Long = definedExternally)
    fun stop(offset: Long = definedExternally)
}