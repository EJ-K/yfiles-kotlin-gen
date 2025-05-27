// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.lang.ClassMetadata

/**
 * A void implementation of a label style that does nothing and behaves like an invisible style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidLabelStyle">Online Documentation</a>
 */
external  class VoidLabelStyle 
private constructor () : ILabelStyle {

/**
 * Gets the [VoidLabelStyleRenderer instance][VoidLabelStyleRenderer.INSTANCE].
 * @see [ILabelStyle.renderer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidLabelStyle%23renderer">Online Documentation</a>
 */
final override val renderer: VoidLabelStyleRenderer
/**
 * Returns `this`.
 * @return `this`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidLabelStyle%23VoidLabelStyle-method-clone">Online Documentation</a>
 */
 final override   fun clone():VoidLabelStyle

companion object : ClassMetadata<VoidLabelStyle> {
/**
 * The singleton instance of this style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidLabelStyle%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: VoidLabelStyle
}
}
