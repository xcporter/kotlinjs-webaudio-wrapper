import org.khronos.webgl.Float32Array

open external class AudioParam {
    val defaultValue: dynamic
    val maxValue: dynamic
    val minValue: dynamic
    var value: dynamic
    fun cancelAndHoldAtTime(cancelTime: Double): AudioParam
    fun cancelScheduledValues(startTime: Double): AudioParam
    fun exponentialRampToValueAtTime(value: Float, endTime: Double): AudioParam
    fun linearRampToValueAtTime(value: Float, endTime: Double): AudioParam
    fun setTargetAtTime(value: Float, startTime: Double, timeConstant: Double): AudioParam
    fun setValueAtTime(value: Float, startTime: Double): AudioParam
    fun setValueCurveAtTime(values: Float32Array, startTime: Double, duration: Double): AudioParam
}