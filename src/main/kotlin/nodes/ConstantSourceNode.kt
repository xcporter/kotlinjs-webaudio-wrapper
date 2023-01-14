package nodes

import AudioNode
import AudioParam

external class ConstantSourceNode: AudioScheduledSourceNode {
    var offset: AudioParam
}