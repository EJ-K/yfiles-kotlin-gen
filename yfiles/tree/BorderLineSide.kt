// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Side constant that defines the index of the eastern border line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLineSide">Online Documentation</a>
 */
external sealed class BorderLineSide: YEnum<BorderLineSide> {
   companion object: EnumMetadata<BorderLineSide> {
       /**
 * Side constant that defines the index of the northern border line.
 * 
 * Value - `0`
 * @see [SubtreeShape.getBorderLine]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLineSide%23NORTH">Online Documentation</a>
 */
val NORTH: BorderLineSide

/**
 * Side constant that defines the index of the eastern border line.
 * 
 * Value - `1`
 * @see [SubtreeShape.getBorderLine]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLineSide%23EAST">Online Documentation</a>
 */
val EAST: BorderLineSide

/**
 * Side constant that defines the index of the southern border line.
 * 
 * Value - `2`
 * @see [SubtreeShape.getBorderLine]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLineSide%23SOUTH">Online Documentation</a>
 */
val SOUTH: BorderLineSide

/**
 * Side constant that defines the index of the western border line.
 * 
 * Value - `3`
 * @see [SubtreeShape.getBorderLine]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLineSide%23WEST">Online Documentation</a>
 */
val WEST: BorderLineSide
   }
}
