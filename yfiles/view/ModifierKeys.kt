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
 * Indicates which modifier keys were pressed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModifierKeys">Online Documentation</a>
 */

external class ModifierKeys private constructor(): YFlags<ModifierKeys> {
  companion object {
    /**
     * Indicates that no modifier key was pressed.
     * 
     * Value - `0`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModifierKeys%23NONE">Online Documentation</a>
     */
    val NONE: ModifierKeys
    
    /**
     * Indicates that the control key was pressed.
     * 
     * Value - `1`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModifierKeys%23CONTROL">Online Documentation</a>
     */
    val CONTROL: ModifierKeys
    
    /**
     * Indicates that the shift key was pressed.
     * 
     * Value - `2`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModifierKeys%23SHIFT">Online Documentation</a>
     */
    val SHIFT: ModifierKeys
    
    /**
     * Indicates that the alt key was pressed.
     * 
     * Value - `4`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModifierKeys%23ALT">Online Documentation</a>
     */
    val ALT: ModifierKeys
    
    /**
     * Indicates that the meta (e.g., windows or command) key was pressed.
     * 
     * Value - `8`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModifierKeys%23META">Online Documentation</a>
     */
    val META: ModifierKeys
  }
}
