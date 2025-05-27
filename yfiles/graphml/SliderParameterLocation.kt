// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.YFlags

/**
 * Flaggable enumeration that is used by [SmartEdgeLabelModel][yfiles.graph.SmartEdgeLabelModel] to indicate the position.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderParameterLocation">Online Documentation</a>
 */
external class SliderParameterLocation 
    private constructor(): YFlags<SliderParameterLocation> {
    companion object {
    /**
 * Left of the edge.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderParameterLocation%23LEFT">Online Documentation</a>
 */
val LEFT: SliderParameterLocation
/**
 * Right of the edge.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderParameterLocation%23RIGHT">Online Documentation</a>
 */
val RIGHT: SliderParameterLocation
/**
 * Measured from the source end.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderParameterLocation%23FROM_SOURCE">Online Documentation</a>
 */
val FROM_SOURCE: SliderParameterLocation
/**
 * Measured from the target end.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderParameterLocation%23FROM_TARGET">Online Documentation</a>
 */
val FROM_TARGET: SliderParameterLocation
/**
 * "Center" segment.
 * 
 * Value - `16`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderParameterLocation%23CENTER">Online Documentation</a>
 */
val CENTER: SliderParameterLocation

    }
}
