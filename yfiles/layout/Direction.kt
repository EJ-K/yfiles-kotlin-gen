// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * [Direction] provides four main directions and some methods to work with them.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Direction">Online Documentation</a>
 */
external sealed class Direction  : YObject {

/**
 * Gets whether or not this direction is horizontal ([RIGHT] or [LEFT]).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Direction%23horizontal">Online Documentation</a>
 */
final val horizontal: Boolean
/**
 * Gets the mirror direction.
 * @throws ArgumentError if the current direction value is invalid
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Direction%23mirror">Online Documentation</a>
 */
final val mirror: Direction
/**
 * Gets the direction that follows this direction in counterclockwise order.
 * @throws ArgumentError if the current direction value is invalid
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Direction%23turnCCW">Online Documentation</a>
 */
final val turnCCW: Direction
/**
 * Gets the direction that follows this direction in clockwise order.
 * @throws ArgumentError if the current direction value is invalid
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Direction%23turnCW">Online Documentation</a>
 */
final val turnCW: Direction
/**
 * Gets whether or not this direction is vertical ([UP] or [DOWN]).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Direction%23vertical">Online Documentation</a>
 */
final val vertical: Boolean
/**
 * Returns the direction encoded as an integer value.
 * @return `0` for direction [UP], `1` for [RIGHT], `2` for [DOWN], and `3` for [LEFT]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Direction%23Direction-method-getDirection">Online Documentation</a>
 */
 final   fun getDirection():Int

companion object : ClassMetadata<Direction> {

/**
 * Decodes the down direction.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Direction%23DOWN">Online Documentation</a>
 */
 val DOWN: Direction

/**
 * Decodes the left direction.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Direction%23LEFT">Online Documentation</a>
 */
 val LEFT: Direction

/**
 * Decodes the right direction.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Direction%23RIGHT">Online Documentation</a>
 */
 val RIGHT: Direction

/**
 * Decodes the up direction.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Direction%23UP">Online Documentation</a>
 */
 val UP: Direction
}
}
