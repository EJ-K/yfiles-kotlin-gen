// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.YFlags

/**
 * The enumeration of the various keys that are relevant to drag and drop operations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropKeyStates">Online Documentation</a>
 */
external class DragDropKeyStates 
    private constructor(): YFlags<DragDropKeyStates> {
    companion object {
    /**
 * No button and no key is pressed.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropKeyStates%23NONE">Online Documentation</a>
 */
val NONE: DragDropKeyStates
/**
 * The left mouse button is down or a touch gesture is in progress.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropKeyStates%23POINTER_DOWN">Online Documentation</a>
 */
val POINTER_DOWN: DragDropKeyStates
/**
 * The shift key is down.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropKeyStates%23SHIFT_KEY">Online Documentation</a>
 */
val SHIFT_KEY: DragDropKeyStates
/**
 * The control key is down.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropKeyStates%23CONTROL_KEY">Online Documentation</a>
 */
val CONTROL_KEY: DragDropKeyStates
/**
 * The alt key is down.
 * 
 * Value - `32`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropKeyStates%23ALT_KEY">Online Documentation</a>
 */
val ALT_KEY: DragDropKeyStates

    }
}
