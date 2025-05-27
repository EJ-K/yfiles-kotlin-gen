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
 * A void implementation of a stripe style that does nothing and behaves like an invisible style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidStripeStyle">Online Documentation</a>
 */
external  class VoidStripeStyle 
private constructor () : IStripeStyle {

/**
 * Gets the [VoidStripeStyleRenderer instance][VoidStripeStyleRenderer.INSTANCE].
 * @see [IStripeStyle.renderer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidStripeStyle%23renderer">Online Documentation</a>
 */
final override val renderer: VoidStripeStyleRenderer
/**
 * Returns `this`.
 * @return `this`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidStripeStyle%23VoidStripeStyle-method-clone">Online Documentation</a>
 */
 final override   fun clone():VoidStripeStyle

companion object : ClassMetadata<VoidStripeStyle> {
/**
 * The [VoidStripeStyle] singleton.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidStripeStyle%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: VoidStripeStyle
}
}
