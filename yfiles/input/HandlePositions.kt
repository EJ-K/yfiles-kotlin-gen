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

external class HandlePositions private constructor(): YFlags<HandlePositions> {
  companion object {
    /**
     * Indicates no position at all.
     * 
     * Value - `0`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23NONE">Online Documentation</a>
     */
    val NONE: HandlePositions
    
    /**
     * Indicates the top-left position.
     * 
     * Value - `1`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23TOP_LEFT">Online Documentation</a>
     */
    val TOP_LEFT: HandlePositions
    
    /**
     * Indicates the top position.
     * 
     * Value - `2`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23TOP">Online Documentation</a>
     */
    val TOP: HandlePositions
    
    /**
     * Indicates the top-right position.
     * 
     * Value - `4`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23TOP_RIGHT">Online Documentation</a>
     */
    val TOP_RIGHT: HandlePositions
    
    /**
     * Indicates the left position.
     * 
     * Value - `8`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23LEFT">Online Documentation</a>
     */
    val LEFT: HandlePositions
    
    /**
     * Indicates the center position.
     * 
     * Value - `16`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23CENTER">Online Documentation</a>
     */
    val CENTER: HandlePositions
    
    /**
     * Indicates the right position.
     * 
     * Value - `32`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23RIGHT">Online Documentation</a>
     */
    val RIGHT: HandlePositions
    
    /**
     * A combination of the two horizontal handles of a rectangle.
     * 
     * Value - `40`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23HORIZONTAL">Online Documentation</a>
     */
    val HORIZONTAL: HandlePositions
    
    /**
     * Indicates the bottom-left position.
     * 
     * Value - `64`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23BOTTOM_LEFT">Online Documentation</a>
     */
    val BOTTOM_LEFT: HandlePositions
    
    /**
     * Indicates the bottom position.
     * 
     * Value - `128`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23BOTTOM">Online Documentation</a>
     */
    val BOTTOM: HandlePositions
    
    /**
     * A combination of the two vertical handles of a rectangle.
     * 
     * Value - `130`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23VERTICAL">Online Documentation</a>
     */
    val VERTICAL: HandlePositions
    
    /**
     * Indicates the bottom-right position.
     * 
     * Value - `256`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandlePositions%23BOTTOM_RIGHT">Online Documentation</a>
     */
    val BOTTOM_RIGHT: HandlePositions
    
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
