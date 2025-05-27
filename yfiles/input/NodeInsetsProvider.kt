// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Insets
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * An [INodeInsetsProvider] that returns the same insets for each node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeInsetsProvider">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided insets.
 * @param [insets] The [insets].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeInsetsProvider%23NodeInsetsProvider-constructor-NodeInsetsProvider">Online Documentation</a>
 * 
 * @property insets
 * Gets or sets the insets returned by [getInsets].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeInsetsProvider%23insets">Online Documentation</a>
 */
external open class NodeInsetsProvider  (
final var insets: Insets) : INodeInsetsProvider {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeInsetsProvider%23NodeInsetsProvider-method-getInsets">Online Documentation</a>
 */
 final override   fun getInsets( node: INode ):Insets

companion object : ClassMetadata<NodeInsetsProvider> {
}
}
