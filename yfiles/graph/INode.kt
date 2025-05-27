// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.IRectangle
import yfiles.lang.InterfaceMetadata
import yfiles.styles.INodeStyle

/**
 * The interface for node entities in an [IGraph].
 * @see [IGraph]
 * @see [IEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INode">Online Documentation</a>
 */
external interface INode : IPortOwner, ILabelOwner {
/**
 * Gets a rectangle describing the position and size of the node.
 * @see [IGraph.setNodeLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INode%23layout">Online Documentation</a>
 */
val layout: IRectangle
/**
 * Gets the style that is responsible for the visual representation of this node in a [CanvasComponent][yfiles.view.CanvasComponent].
 * @see [IGraph.setStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INode%23style">Online Documentation</a>
 */
val style: INodeStyle

companion object : InterfaceMetadata<INode> {
}
}
