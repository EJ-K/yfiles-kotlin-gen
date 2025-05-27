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
 * Enumeration of the possible positions of the [InteriorStretchLabelModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModelPosition">Online Documentation</a>
 */
external sealed class InteriorStretchLabelModelPosition: YEnum<InteriorStretchLabelModelPosition> {
   companion object: EnumMetadata<InteriorStretchLabelModelPosition> {
       /**
 * Encodes a position at the top side of the node interior.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModelPosition%23NORTH">Online Documentation</a>
 */
val NORTH: InteriorStretchLabelModelPosition

/**
 * Encodes a position at the right side of the node interior.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModelPosition%23EAST">Online Documentation</a>
 */
val EAST: InteriorStretchLabelModelPosition

/**
 * Encodes a position at the bottom side of the node interior.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModelPosition%23SOUTH">Online Documentation</a>
 */
val SOUTH: InteriorStretchLabelModelPosition

/**
 * Encodes a position at the left side of the node interior.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModelPosition%23WEST">Online Documentation</a>
 */
val WEST: InteriorStretchLabelModelPosition

/**
 * Encodes a position at the center of the node interior.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModelPosition%23CENTER">Online Documentation</a>
 */
val CENTER: InteriorStretchLabelModelPosition

/**
 * Encodes a position at the vertical center with the preferred height of the label and the width of the node.
 * 
 * Value - `5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModelPosition%23CENTER_HORIZONTAL">Online Documentation</a>
 */
val CENTER_HORIZONTAL: InteriorStretchLabelModelPosition

/**
 * Encodes a position at the horizontal center with the preferred width of the label and the height of the node.
 * 
 * Value - `6`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModelPosition%23CENTER_VERTICAL">Online Documentation</a>
 */
val CENTER_VERTICAL: InteriorStretchLabelModelPosition
   }
}
