package nodes

import AudioNode
import AudioParam

external class PannerNode : AudioNode {
    var coneInnerAngle: Double
    var coneOuterAngle: Double
    var coneOuterGain: Double
    var distanceModel: String
    var maxDistance: Double
    val orientationX: AudioParam
    val orientationY: AudioParam
    val orientationZ: AudioParam
    val positionX: AudioParam
    val positionY: AudioParam
    val positionZ: AudioParam
    var refDistance: Double
    var rolloffFactor: Double
    fun setPosition()
    fun setOrientation()
    fun setVelocity()
}