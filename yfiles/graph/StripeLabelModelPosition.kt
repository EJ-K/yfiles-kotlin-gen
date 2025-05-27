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
 * Enumeration of the possible positions of the [StripeLabelModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModelPosition">Online Documentation</a>
 */
external sealed class StripeLabelModelPosition: YEnum<StripeLabelModelPosition> {
   companion object: EnumMetadata<StripeLabelModelPosition> {
       /**
 * Encodes a position at the top header of a table column.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModelPosition%23NORTH">Online Documentation</a>
 */
val NORTH: StripeLabelModelPosition

/**
 * Encodes a position at the right header of a table row.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModelPosition%23EAST">Online Documentation</a>
 */
val EAST: StripeLabelModelPosition

/**
 * Encodes a position at the bottom header of a table column.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModelPosition%23SOUTH">Online Documentation</a>
 */
val SOUTH: StripeLabelModelPosition

/**
 * Encodes a position at the left header of a table row.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModelPosition%23WEST">Online Documentation</a>
 */
val WEST: StripeLabelModelPosition
   }
}
