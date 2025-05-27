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
 * An enumeration containing values for different mouse wheel scroll behavior.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseWheelDeltaMode">Online Documentation</a>
 */
external sealed class MouseWheelDeltaMode: YEnum<MouseWheelDeltaMode> {
   companion object: EnumMetadata<MouseWheelDeltaMode> {
       /**
 * Scrolling should scroll a set number of lines per mouse wheel notch.
 * 
 * Value - `0`
 * @see [MouseEventArgs.scrollAmount]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseWheelDeltaMode%23LINES">Online Documentation</a>
 */
val LINES: MouseWheelDeltaMode

/**
 * Scrolling should scroll a single "page" per mouse wheel notch.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseWheelDeltaMode%23PAGE">Online Documentation</a>
 */
val PAGE: MouseWheelDeltaMode
   }
}
