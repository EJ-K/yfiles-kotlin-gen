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
 * A void implementation of a port style that does nothing and behaves like an invisible style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidPortStyle">Online Documentation</a>
 */
external  class VoidPortStyle 
private constructor () : IPortStyle {

/**
 * Gets the [VoidPortStyleRenderer instance][VoidPortStyleRenderer.INSTANCE].
 * @see [IPortStyle.renderer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidPortStyle%23renderer">Online Documentation</a>
 */
final override val renderer: VoidPortStyleRenderer
/**
 * Returns `this`.
 * @return `this`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidPortStyle%23VoidPortStyle-method-clone">Online Documentation</a>
 */
 final override   fun clone():VoidPortStyle

companion object : ClassMetadata<VoidPortStyle> {
/**
 * The [VoidPortStyle] singleton.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidPortStyle%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: VoidPortStyle
}
}
