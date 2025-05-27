// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.graph.IBend
import yfiles.graph.IEdge
import yfiles.graph.ILabel
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.lang.InterfaceMetadata

/**
 * Manages the selection state of items in an [IGraph][yfiles.graph.IGraph] instance.
 * @see [ISelectionModel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphSelection">Online Documentation</a>
 */
external interface IGraphSelection : ISelectionModel<IModelItem> {
/**
 * Gets an [ISelectionModel] of the selected bends.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphSelection%23selectedBends">Online Documentation</a>
 */
val selectedBends: ISelectionModel<IBend>
/**
 * Gets an [ISelectionModel] of the selected edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphSelection%23selectedEdges">Online Documentation</a>
 */
val selectedEdges: ISelectionModel<IEdge>
/**
 * Gets an [ISelectionModel] of the selected labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphSelection%23selectedLabels">Online Documentation</a>
 */
val selectedLabels: ISelectionModel<ILabel>
/**
 * Gets an [ISelectionModel] of the selected nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphSelection%23selectedNodes">Online Documentation</a>
 */
val selectedNodes: ISelectionModel<INode>
/**
 * Gets an [ISelectionModel] of the selected ports.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphSelection%23selectedPorts">Online Documentation</a>
 */
val selectedPorts: ISelectionModel<IPort>

companion object : InterfaceMetadata<IGraphSelection> {
}
}
