// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.orthogonal

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [OrthogonalLayout.cycleStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleLayoutStyle">Online Documentation</a>
 */
external sealed class CycleLayoutStyle: YEnum<CycleLayoutStyle> {
   companion object: EnumMetadata<CycleLayoutStyle> {
       /**
 * A cycle layout style that defines that cycles should not be handled specifically.
 * 
 * Value - `0`
 * @see [OrthogonalLayout.cycleStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleLayoutStyle%23NONE">Online Documentation</a>
 */
val NONE: CycleLayoutStyle

/**
 * A cycle layout style that defines that cycle structures are arranged in a circular fashion such that nodes form the corners of the circular layout.
 * 
 * Value - `1`
 * @see [OrthogonalLayout.cycleStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleLayoutStyle%23CIRCULAR_WITH_NODES_AT_CORNERS">Online Documentation</a>
 */
val CIRCULAR_WITH_NODES_AT_CORNERS: CycleLayoutStyle

/**
 * A cycle layout style that defines that cycle structures are arranged in a circular fashion such that bends of cycle edges form the corners of the circular layout.
 * 
 * Value - `2`
 * @see [OrthogonalLayout.cycleStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleLayoutStyle%23CIRCULAR_WITH_BENDS_AT_CORNERS">Online Documentation</a>
 */
val CIRCULAR_WITH_BENDS_AT_CORNERS: CycleLayoutStyle
   }
}
