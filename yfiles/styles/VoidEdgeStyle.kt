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
 * A void implementation of an edge style that does nothing and behaves like an invisible style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidEdgeStyle">Online Documentation</a>
 */
external  class VoidEdgeStyle 
private constructor () : IEdgeStyle {

/**
 * Gets the [VoidEdgeStyleRenderer instance][VoidEdgeStyleRenderer.INSTANCE].
 * @see [IEdgeStyle.renderer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidEdgeStyle%23renderer">Online Documentation</a>
 */
final override val renderer: VoidEdgeStyleRenderer
/**
 * Returns `this`.
 * @return `this`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidEdgeStyle%23VoidEdgeStyle-method-clone">Online Documentation</a>
 */
 final override   fun clone():VoidEdgeStyle

companion object : ClassMetadata<VoidEdgeStyle> {
/**
 * The [VoidEdgeStyle] singleton.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidEdgeStyle%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: VoidEdgeStyle
}
}
