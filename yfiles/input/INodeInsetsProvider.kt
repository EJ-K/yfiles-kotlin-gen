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
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface for implementations that yield insets for a given [INode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeInsetsProvider">Online Documentation</a>
 */
external interface INodeInsetsProvider : YObject {
/**
 * Returns the insets for the given `node`.
 * @param [node] The node to yield insets for.
 * @return The insets for the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeInsetsProvider%23INodeInsetsProvider-method-getInsets">Online Documentation</a>
 */
   fun getInsets( node: INode ):Insets

companion object : InterfaceMetadata<INodeInsetsProvider> {

/**
 * Creates an implementation of the interface [INodeInsetsProvider] by using the given function as implementation for its [getInsets] method.
 * @param [getInsets] A function for [INodeInsetsProvider]'s single abstract method [getInsets].
 * @return An instance of the [INodeInsetsProvider] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeInsetsProvider%23INodeInsetsProvider-method-create">Online Documentation</a>
 */
@JsName("create")
operator fun  invoke(
    getInsets: (
node: INode
) -> Insets 
):INodeInsetsProvider
}
}
