// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.graph.IPortOwner
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * This is the interface for a factory that is used for creating the constituents of an [IGraph][yfiles.graph.IGraph] that are encountered during the parsing of [GraphML][GraphMLParser]
 * @see [GraphMLIOHandler.createGraphElementFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementFactory">Online Documentation</a>
 */
external interface IGraphElementFactory : YObject {
/**
 * Adds a new port to the given [IPortOwner].
 * @param [context] The context from which the graph, the [CreationProperties], and the [IParseContext.objectStack] can be queried.
 * @param [owner] The owner of the port.
 * @return A newly created port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementFactory%23IGraphElementFactory-method-addPort">Online Documentation</a>
 */
   fun addPort( context: IParseContext ,
 owner: IPortOwner ):IPort
/**
 * Creates an edge for the given context and the provided source and target nodes or ports.
 * @param [context] The context from which the graph, the [CreationProperties], and the [IParseContext.objectStack] can be queried.
 * @param [sourceNode] The source node for the edge.
 * @param [sourcePort] The source port for the edge, if specified, otherwise `null`.
 * @param [targetNode] The target node for the edge.
 * @param [targetPort] The target port for the edge, if specified, otherwise `null`.
 * @return A newly created edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementFactory%23IGraphElementFactory-method-createEdge">Online Documentation</a>
 */
   fun createEdge( context: IParseContext ,
 sourceNode: INode ,
 sourcePort: IPort? ,
 targetNode: INode ,
 targetPort: IPort? ):IEdge
/**
 * Creates a node for the given context.
 * @param [context] The context from which the graph, the [CreationProperties], and the [IParseContext.objectStack] can be queried.
 * @return A newly created node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementFactory%23IGraphElementFactory-method-createNode">Online Documentation</a>
 */
   fun createNode( context: IParseContext ):INode

companion object : InterfaceMetadata<IGraphElementFactory> {
}
}
