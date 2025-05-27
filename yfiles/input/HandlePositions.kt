// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.YFlags

/**
 * The possible positions of a rectangle [IHandle]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions">Online Documentation</a>
 */
external class HandlePositions 
    private constructor(): YFlags<HandlePositions> {
    companion object {
    /**
 * Indicates no position at all.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23NONE">Online Documentation</a>
 */
val NONE: HandlePositions
/**
 * Indicates the position at north west.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23NORTH_WEST">Online Documentation</a>
 */
val NORTH_WEST: HandlePositions
/**
 * Indicates the position at north.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23NORTH">Online Documentation</a>
 */
val NORTH: HandlePositions
/**
 * Indicates the position at north east.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23NORTH_EAST">Online Documentation</a>
 */
val NORTH_EAST: HandlePositions
/**
 * Indicates the position at west.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23WEST">Online Documentation</a>
 */
val WEST: HandlePositions
/**
 * Indicates the position at the center.
 * 
 * Value - `16`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23CENTER">Online Documentation</a>
 */
val CENTER: HandlePositions
/**
 * Indicates the position at east.
 * 
 * Value - `32`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23EAST">Online Documentation</a>
 */
val EAST: HandlePositions
/**
 * A combination of the two horizontal handles of a rectangle.
 * 
 * Value - `40`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23HORIZONTAL">Online Documentation</a>
 */
val HORIZONTAL: HandlePositions
/**
 * Indicates the position at south west.
 * 
 * Value - `64`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23SOUTH_WEST">Online Documentation</a>
 */
val SOUTH_WEST: HandlePositions
/**
 * Indicates the position at south.
 * 
 * Value - `128`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23SOUTH">Online Documentation</a>
 */
val SOUTH: HandlePositions
/**
 * A combination of the two vertical handles of a rectangle.
 * 
 * Value - `130`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23VERTICAL">Online Documentation</a>
 */
val VERTICAL: HandlePositions
/**
 * Indicates the position at south east.
 * 
 * Value - `256`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23SOUTH_EAST">Online Documentation</a>
 */
val SOUTH_EAST: HandlePositions
/**
 * A combination of all possible handle positions at the four corners of a rectangle.
 * 
 * Value - `325`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23CORNERS">Online Documentation</a>
 */
val CORNERS: HandlePositions
/**
 * A combination of all possible handle positions at the border of a rectangle.
 * 
 * Value - `495`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23BORDER">Online Documentation</a>
 */
val BORDER: HandlePositions
/**
 * A combination of all possible handle positions.
 * 
 * Value - `511`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23ALL">Online Documentation</a>
 */
val ALL: HandlePositions

    }
}
