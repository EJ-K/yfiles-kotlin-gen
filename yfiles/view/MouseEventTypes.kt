// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enumeration of the possible [MouseEventArgs] types.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventTypes">Online Documentation</a>
 */
external sealed class MouseEventTypes: YEnum<MouseEventTypes> {
   companion object: EnumMetadata<MouseEventTypes> {
       /**
 * Not a mouse event.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventTypes%23NONE">Online Documentation</a>
 */
val NONE: MouseEventTypes

/**
 * The mouse has been moved.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventTypes%23MOVE">Online Documentation</a>
 */
val MOVE: MouseEventTypes

/**
 * The mouse has been dragged, which means it has been moved while at least one button has been pressed.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventTypes%23DRAG">Online Documentation</a>
 */
val DRAG: MouseEventTypes

/**
 * A button has been pressed.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventTypes%23DOWN">Online Documentation</a>
 */
val DOWN: MouseEventTypes

/**
 * A button has been released.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventTypes%23UP">Online Documentation</a>
 */
val UP: MouseEventTypes

/**
 * The mouse has entered the control's bounds.
 * 
 * Value - `5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventTypes%23ENTER">Online Documentation</a>
 */
val ENTER: MouseEventTypes

/**
 * The mouse has exited the control's bounds.
 * 
 * Value - `6`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventTypes%23LEAVE">Online Documentation</a>
 */
val LEAVE: MouseEventTypes

/**
 * The mouse wheel has been turned.
 * 
 * Value - `7`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventTypes%23WHEEL">Online Documentation</a>
 */
val WHEEL: MouseEventTypes

/**
 * A mouse click has been recognized.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventTypes%23CLICK">Online Documentation</a>
 */
val CLICK: MouseEventTypes

/**
 * Mouse input capture has been lost.
 * 
 * Value - `9`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventTypes%23LOST_CAPTURE">Online Documentation</a>
 */
val LOST_CAPTURE: MouseEventTypes
   }
}
