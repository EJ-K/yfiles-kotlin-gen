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
 * Specifies constants that define the effect of turning the mouse wheel in a [CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseWheelBehaviors">Online Documentation</a>
 */

external class MouseWheelBehaviors private constructor(): YFlags<MouseWheelBehaviors> {
  companion object {
    /**
     * The mouse wheel has no effect.
     * 
     * Value - `0`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseWheelBehaviors%23NONE">Online Documentation</a>
     */
    val NONE: MouseWheelBehaviors
    
    /**
     * Turning the mouse wheel or pinching on a touchpad changes the zoom factor.
     * 
     * Value - `1`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseWheelBehaviors%23ZOOM">Online Documentation</a>
     */
    val ZOOM: MouseWheelBehaviors
    
    /**
     * The mouse wheel scrolls the view.
     * 
     * Value - `2`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseWheelBehaviors%23SCROLL">Online Documentation</a>
     */
    val SCROLL: MouseWheelBehaviors
    
    /**
     * Can be combined with [ZOOM][MouseWheelBehaviors] or [SCROLL][MouseWheelBehaviors] to perform the action only when the control has focus.
     * 
     * Value - `4`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseWheelBehaviors%23ONLY_WHEN_FOCUSED">Online Documentation</a>
     */
    val ONLY_WHEN_FOCUSED: MouseWheelBehaviors
  }
}
