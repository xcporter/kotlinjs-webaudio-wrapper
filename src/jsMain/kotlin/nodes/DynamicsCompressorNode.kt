package nodes

import AudioNode
import AudioParam

external class DynamicsCompressorNode: AudioNode {
    val attack: AudioParam
    val knee: AudioParam
    val ratio: AudioParam
    val reduction: AudioParam
    val release: AudioParam
    val threshold: AudioParam
}