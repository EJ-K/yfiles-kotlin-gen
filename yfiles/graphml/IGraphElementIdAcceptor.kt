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
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface for classes that can store the GraphML id attribute of GraphML core elements
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementIdAcceptor">Online Documentation</a>
 */
external interface IGraphElementIdAcceptor : YObject {
/**
 * Store the value of the id attribute for the given edge.
 * @param [context] The current parse context.
 * @param [edge] The current edge element
 * @param [id] The id of the edge's XML representation
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementIdAcceptor%23IGraphElementIdAcceptor-method-storeEdgeId">Online Documentation</a>
 */
   fun storeEdgeId( context: IParseContext ,
 edge: IEdge ,
 id: ElementId )
/**
 * Store the value of the id attribute for the given graph.
 * @param [context] The current parse context.
 * @param [graph] The current graph element
 * @param [id] The id of the graph's XML representation
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementIdAcceptor%23IGraphElementIdAcceptor-method-storeGraphId">Online Documentation</a>
 */
   fun storeGraphId( context: IParseContext ,
 graph: IGraph ,
 id: ElementId )
/**
 * Store the value of the id attribute for the given node.
 * @param [context] The current parse context.
 * @param [node] The current node element
 * @param [id] The id of the node's XML representation
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementIdAcceptor%23IGraphElementIdAcceptor-method-storeNodeId">Online Documentation</a>
 */
   fun storeNodeId( context: IParseContext ,
 node: INode ,
 id: ElementId )
/**
 * Store the value of the id attribute for the given port.
 * @param [context] The current parse context.
 * @param [port] The current port element
 * @param [id] The id of the port's XML representation
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementIdAcceptor%23IGraphElementIdAcceptor-method-storePortId">Online Documentation</a>
 */
   fun storePortId( context: IParseContext ,
 port: IPort ,
 id: ElementId )

companion object : InterfaceMetadata<IGraphElementIdAcceptor> {
}
}
