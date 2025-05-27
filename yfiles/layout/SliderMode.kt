// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Slider mode specifier which describes continuous label positions directly on the edge path.
 * @see [SliderEdgeLabelLayoutModel]
 * @see [SliderEdgeLabelLayoutModel.mode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderMode">Online Documentation</a>
 */
external sealed class SliderMode: YEnum<SliderMode> {
   companion object: EnumMetadata<SliderMode> {
       /**
 * Slider mode specifier which describes continuous label positions directly on the edge path.
 * 
 * Value - `0`
 * @see [SliderEdgeLabelLayoutModel.mode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderMode%23CENTER">Online Documentation</a>
 */
val CENTER: SliderMode

/**
 * Slider mode specifier which describes continuous label positions along the sides of the edge path.
 * 
 * Value - `1`
 * @see [SliderEdgeLabelLayoutModel.mode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderMode%23SIDE">Online Documentation</a>
 */
val SIDE: SliderMode

/**
 * Slider mode specifier which describes continuous label positions along one side of the edge path.
 * 
 * Value - `2`
 * @see [SliderEdgeLabelLayoutModel.mode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderMode%23SINGLE_SIDE">Online Documentation</a>
 */
val SINGLE_SIDE: SliderMode
   }
}
