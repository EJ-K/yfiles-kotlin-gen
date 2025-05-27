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
 * Enumeration of the possible positions of the [StretchStripeLabelModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModelPosition">Online Documentation</a>
 */
external sealed class StretchStripeLabelModelPosition: YEnum<StretchStripeLabelModelPosition> {
   companion object: EnumMetadata<StretchStripeLabelModelPosition> {
       /**
 * Encodes a position at the top header of a table column.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModelPosition%23NORTH">Online Documentation</a>
 */
val NORTH: StretchStripeLabelModelPosition

/**
 * Encodes a position at the right header of a table row.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModelPosition%23EAST">Online Documentation</a>
 */
val EAST: StretchStripeLabelModelPosition

/**
 * Encodes a position at the bottom header of a table column.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModelPosition%23SOUTH">Online Documentation</a>
 */
val SOUTH: StretchStripeLabelModelPosition

/**
 * Encodes a position at the left header of a table row.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModelPosition%23WEST">Online Documentation</a>
 */
val WEST: StretchStripeLabelModelPosition
   }
}
