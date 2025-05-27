// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enumeration of the possible positions of the [ExteriorLabelModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModelPosition">Online Documentation</a>
 */
external sealed class ExteriorLabelModelPosition: YEnum<ExteriorLabelModelPosition> {
   companion object: EnumMetadata<ExteriorLabelModelPosition> {
       /**
 * Encodes a position outside the node at the top.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModelPosition%23NORTH">Online Documentation</a>
 */
val NORTH: ExteriorLabelModelPosition

/**
 * Encodes a position outside the node at the right side.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModelPosition%23EAST">Online Documentation</a>
 */
val EAST: ExteriorLabelModelPosition

/**
 * Encodes a position outside the node at the bottom.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModelPosition%23SOUTH">Online Documentation</a>
 */
val SOUTH: ExteriorLabelModelPosition

/**
 * Encodes a position outside the node at the left side.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModelPosition%23WEST">Online Documentation</a>
 */
val WEST: ExteriorLabelModelPosition

/**
 * Encodes a position outside the node at the upper right corner.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModelPosition%23NORTH_EAST">Online Documentation</a>
 */
val NORTH_EAST: ExteriorLabelModelPosition

/**
 * Encodes a position outside the node at the lower right corner.
 * 
 * Value - `5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModelPosition%23SOUTH_EAST">Online Documentation</a>
 */
val SOUTH_EAST: ExteriorLabelModelPosition

/**
 * Encodes a position outside the node at the upper left corner.
 * 
 * Value - `6`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModelPosition%23NORTH_WEST">Online Documentation</a>
 */
val NORTH_WEST: ExteriorLabelModelPosition

/**
 * Encodes a position outside the node at the lower left corner.
 * 
 * Value - `7`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModelPosition%23SOUTH_WEST">Online Documentation</a>
 */
val SOUTH_WEST: ExteriorLabelModelPosition
   }
}
