// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enum constants that specify the Horizontal overlap criterion for the [ShuffleLayout].
 * @see [ShuffleLayout.horizontalOverlapCriterion]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HorizontalOverlapCriterion">Online Documentation</a>
 */
external sealed class HorizontalOverlapCriterion: YEnum<HorizontalOverlapCriterion> {
   companion object: EnumMetadata<HorizontalOverlapCriterion> {
       /**
 * Horizontal overlap criterion defining an overlap as horizontal if the overlapping area is greater in height than in width.
 * 
 * Value - `0`
 * @see [ShuffleLayout.horizontalOverlapCriterion]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HorizontalOverlapCriterion%23INTERSECTION_BOX">Online Documentation</a>
 */
val INTERSECTION_BOX: HorizontalOverlapCriterion

/**
 * Horizontal overlap criterion categorizing an overlap as horizontal if the center-to-center difference between the overlapping nodes is greater in horizontal direction (x-coordinates) than in vertical direction (y-coordinates).
 * 
 * Value - `1`
 * @see [ShuffleLayout.horizontalOverlapCriterion]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HorizontalOverlapCriterion%23NODE_CENTER">Online Documentation</a>
 */
val NODE_CENTER: HorizontalOverlapCriterion

/**
 * Horizontal overlap criterion categorizing an overlap as horizontal if the required movement for solving the overlap is shorter in horizontal direction than in vertical direction.
 * 
 * Value - `2`
 * @see [ShuffleLayout.horizontalOverlapCriterion]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HorizontalOverlapCriterion%23LESS_MOVEMENT">Online Documentation</a>
 */
val LESS_MOVEMENT: HorizontalOverlapCriterion
   }
}
