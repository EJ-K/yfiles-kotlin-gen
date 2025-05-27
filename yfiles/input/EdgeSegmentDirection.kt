// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Defines the direction of an edge segment
 * @see [CreateEdgeInputMode.getFirstSegmentDirection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentDirection">Online Documentation</a>
 */
external sealed class EdgeSegmentDirection: YEnum<EdgeSegmentDirection> {
   companion object: EnumMetadata<EdgeSegmentDirection> {
       /**
 * The edge segment is going into north direction
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentDirection%23NORTH">Online Documentation</a>
 */
val NORTH: EdgeSegmentDirection

/**
 * The edge segment is going into east direction
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentDirection%23EAST">Online Documentation</a>
 */
val EAST: EdgeSegmentDirection

/**
 * The edge segment is going into south direction
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentDirection%23SOUTH">Online Documentation</a>
 */
val SOUTH: EdgeSegmentDirection

/**
 * The edge segment is going into west direction
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentDirection%23WEST">Online Documentation</a>
 */
val WEST: EdgeSegmentDirection
   }
}
