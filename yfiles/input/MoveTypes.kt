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
 * Describes the type of movement of a point during an edit in the context of [GraphSnapContext].
 * @see [GraphSnapContext]
 * @see [MovementInfo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveTypes">Online Documentation</a>
 */

external class MoveTypes private constructor(): YFlags<MoveTypes> {
  companion object {
    /**
     * The element does not move at all during the edit.
     * 
     * Value - `0`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveTypes%23FIXED">Online Documentation</a>
     */
    val FIXED: MoveTypes
    
    /**
     * The element moves linearly with the mouse in horizontal direction.
     * 
     * Value - `1`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveTypes%23LINEAR_MOVE_X">Online Documentation</a>
     */
    val LINEAR_MOVE_X: MoveTypes
    
    /**
     * The element moves linearly with the mouse in vertical direction.
     * 
     * Value - `2`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveTypes%23LINEAR_MOVE_Y">Online Documentation</a>
     */
    val LINEAR_MOVE_Y: MoveTypes
    
    /**
     * The element moves linearly with the mouse in both directions.
     * 
     * Value - `3`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveTypes%23LINEAR_MOVE">Online Documentation</a>
     */
    val LINEAR_MOVE: MoveTypes
    
    /**
     * The element moves in horizontal direction but not linearly/predictably with the mouse.
     * 
     * Value - `4`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveTypes%23ARBITRARY_MOVE_X">Online Documentation</a>
     */
    val ARBITRARY_MOVE_X: MoveTypes
    
    /**
     * The bitwise combination of [LINEAR_MOVE_X][MoveTypes] and [ARBITRARY_MOVE_X][MoveTypes]
     * 
     * Value - `5`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveTypes%23MOVEMENT_X">Online Documentation</a>
     */
    val MOVEMENT_X: MoveTypes
    
    /**
     * The element moves in vertical direction but not linearly/predictably with the mouse.
     * 
     * Value - `8`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveTypes%23ARBITRARY_MOVE_Y">Online Documentation</a>
     */
    val ARBITRARY_MOVE_Y: MoveTypes
    
    /**
     * The bitwise combination of [LINEAR_MOVE_Y][MoveTypes] and [ARBITRARY_MOVE_Y][MoveTypes]
     * 
     * Value - `10`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveTypes%23MOVEMENT_Y">Online Documentation</a>
     */
    val MOVEMENT_Y: MoveTypes
    
    /**
     * The element moves in both directions but not linearly/predictably with the mouse.
     * 
     * Value - `12`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveTypes%23ARBITRARY_MOVE">Online Documentation</a>
     */
    val ARBITRARY_MOVE: MoveTypes
  }
}
