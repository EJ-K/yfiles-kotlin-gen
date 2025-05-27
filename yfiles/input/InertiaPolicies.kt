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
 * Flaggable enumeration used by [inertia][MoveViewportInputMode] to determine when to use inertia moving.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InertiaPolicies">Online Documentation</a>
 */

external class InertiaPolicies private constructor(): YFlags<InertiaPolicies> {
  companion object {
    /**
     * Never move the viewport using inertia.
     * 
     * Value - `0`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InertiaPolicies%23NEVER">Online Documentation</a>
     */
    val NEVER: InertiaPolicies
    
    /**
     * Move the viewport using inertia when the mouse has been used to drag the viewport.
     * 
     * Value - `1`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InertiaPolicies%23MOUSE">Online Documentation</a>
     */
    val MOUSE: InertiaPolicies
    
    /**
     * Move the viewport using inertia when touch has been used to drag the viewport.
     * 
     * Value - `2`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InertiaPolicies%23TOUCH">Online Documentation</a>
     */
    val TOUCH: InertiaPolicies
    
    /**
     * Always move the viewport using inertia no matter what input gesture has been used.
     * 
     * Value - `3`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InertiaPolicies%23ALWAYS">Online Documentation</a>
     */
    val ALWAYS: InertiaPolicies
  }
}
