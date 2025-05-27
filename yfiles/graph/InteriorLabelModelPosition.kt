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
 * Enumeration of the possible positions of the [InteriorLabelModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModelPosition">Online Documentation</a>
 */
external sealed class InteriorLabelModelPosition: YEnum<InteriorLabelModelPosition> {
   companion object: EnumMetadata<InteriorLabelModelPosition> {
       /**
 * Encodes a position at the top side of the node interior.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModelPosition%23NORTH">Online Documentation</a>
 */
val NORTH: InteriorLabelModelPosition

/**
 * Encodes a position at the right side of the node interior.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModelPosition%23EAST">Online Documentation</a>
 */
val EAST: InteriorLabelModelPosition

/**
 * Encodes a position at the bottom side of the node interior.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModelPosition%23SOUTH">Online Documentation</a>
 */
val SOUTH: InteriorLabelModelPosition

/**
 * Encodes a position at the left side of the node interior.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModelPosition%23WEST">Online Documentation</a>
 */
val WEST: InteriorLabelModelPosition

/**
 * Encodes a position at the upper right corner of the node interior.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModelPosition%23NORTH_EAST">Online Documentation</a>
 */
val NORTH_EAST: InteriorLabelModelPosition

/**
 * Encodes a position at the lower right corner of the node interior.
 * 
 * Value - `5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModelPosition%23SOUTH_EAST">Online Documentation</a>
 */
val SOUTH_EAST: InteriorLabelModelPosition

/**
 * Encodes a position at the upper left corner of the node interior.
 * 
 * Value - `6`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModelPosition%23NORTH_WEST">Online Documentation</a>
 */
val NORTH_WEST: InteriorLabelModelPosition

/**
 * Encodes a position at the lower left corner of the node interior.
 * 
 * Value - `7`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModelPosition%23SOUTH_WEST">Online Documentation</a>
 */
val SOUTH_WEST: InteriorLabelModelPosition

/**
 * Encodes a position at the center of the node interior.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModelPosition%23CENTER">Online Documentation</a>
 */
val CENTER: InteriorLabelModelPosition
   }
}
