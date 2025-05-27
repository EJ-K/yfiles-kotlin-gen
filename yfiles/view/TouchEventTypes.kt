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
 * Enumeration of the possible [TouchEventArgs] types.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventTypes">Online Documentation</a>
 */
external sealed class TouchEventTypes: YEnum<TouchEventTypes> {
   companion object: EnumMetadata<TouchEventTypes> {
       /**
 * Not a touch event.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventTypes%23NONE">Online Documentation</a>
 */
val NONE: TouchEventTypes

/**
 * A pointer has been moved.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventTypes%23MOVE">Online Documentation</a>
 */
val MOVE: TouchEventTypes

/**
 * A touch device went down.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventTypes%23DOWN">Online Documentation</a>
 */
val DOWN: TouchEventTypes

/**
 * A touch device went up.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventTypes%23UP">Online Documentation</a>
 */
val UP: TouchEventTypes

/**
 * A touch device has entered the control's bounds.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventTypes%23ENTER">Online Documentation</a>
 */
val ENTER: TouchEventTypes

/**
 * A touch device has exited the control's bounds.
 * 
 * Value - `5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventTypes%23LEAVE">Online Documentation</a>
 */
val LEAVE: TouchEventTypes

/**
 * A touch tap has been recognized.
 * 
 * Value - `6`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventTypes%23TAP">Online Documentation</a>
 */
val TAP: TouchEventTypes

/**
 * A long press has been recognized.
 * 
 * Value - `7`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventTypes%23LONG_PRESS">Online Documentation</a>
 */
val LONG_PRESS: TouchEventTypes

/**
 * Touch capture has been lost while the device was down.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventTypes%23LOST_CAPTURE">Online Documentation</a>
 */
val LOST_CAPTURE: TouchEventTypes
   }
}
