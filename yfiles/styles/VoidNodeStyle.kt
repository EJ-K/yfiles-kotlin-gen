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
 * A void implementation of a node style that does nothing and behaves like an invisible style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidNodeStyle">Online Documentation</a>
 */
external  class VoidNodeStyle 
private constructor () : INodeStyle {

/**
 * Gets the [VoidNodeStyleRenderer instance][VoidNodeStyleRenderer.INSTANCE].
 * @see [INodeStyle.renderer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidNodeStyle%23renderer">Online Documentation</a>
 */
final override val renderer: VoidNodeStyleRenderer
/**
 * Returns `this`.
 * @return `this`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidNodeStyle%23VoidNodeStyle-method-clone">Online Documentation</a>
 */
 final override   fun clone():VoidNodeStyle

companion object : ClassMetadata<VoidNodeStyle> {
/**
 * The [VoidNodeStyle] singleton.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidNodeStyle%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: VoidNodeStyle
}
}
