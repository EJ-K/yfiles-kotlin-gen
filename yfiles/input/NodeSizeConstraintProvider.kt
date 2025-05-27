// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.IRectangle
import yfiles.geometry.ISize
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * An implementation of [INodeSizeConstraintProvider] which provides constant sizes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSizeConstraintProvider">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided size instances as the initial values.
 * @param [minimumSize] The [minimumSize].
 * @param [maximumSize] The [maximumSize].
 * @param [minimumEnclosedArea] The [minimumEnclosedArea].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSizeConstraintProvider%23NodeSizeConstraintProvider-constructor-NodeSizeConstraintProvider">Online Documentation</a>
 */
external open class NodeSizeConstraintProvider  ( minimumSize: ISize ,
 maximumSize: ISize ,
 minimumEnclosedArea: IRectangle?  = definedExternally) : INodeSizeConstraintProvider {

/**
 * Gets or sets the instance to return by [getMaximumSize].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSizeConstraintProvider%23maximumSize">Online Documentation</a>
 */
final var maximumSize: ISize
/**
 * Gets or sets the instance to return by [getMinimumEnclosedArea].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSizeConstraintProvider%23minimumEnclosedArea">Online Documentation</a>
 */
final var minimumEnclosedArea: IRectangle
/**
 * Gets or sets the instance to return by [getMinimumSize].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSizeConstraintProvider%23minimumSize">Online Documentation</a>
 */
final var minimumSize: ISize
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSizeConstraintProvider%23NodeSizeConstraintProvider-method-getMaximumSize">Online Documentation</a>
 */
 override   fun getMaximumSize( node: INode ):Size
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSizeConstraintProvider%23NodeSizeConstraintProvider-method-getMinimumEnclosedArea">Online Documentation</a>
 */
 override   fun getMinimumEnclosedArea( node: INode ):Rect
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSizeConstraintProvider%23NodeSizeConstraintProvider-method-getMinimumSize">Online Documentation</a>
 */
 override   fun getMinimumSize( node: INode ):Size

companion object : ClassMetadata<NodeSizeConstraintProvider> {
}
}
