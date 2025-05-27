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
 * Interface for classes that provide custom id's for core GraphML elements
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementIdProvider">Online Documentation</a>
 */
external interface IGraphElementIdProvider : YObject {
/**
 * Get an ID for the specified `edge` object
 * @param [context] The current write context, for further information to the provider
 * @param [edge] The current graph object
 * @return an ID for the specified edge object
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementIdProvider%23IGraphElementIdProvider-method-getEdgeId">Online Documentation</a>
 */
   fun getEdgeId( context: IWriteContext ,
 edge: IEdge ):ElementId
/**
 * Get an ID for the specified `graph` object
 * @param [context] The current write context, for further information to the provider
 * @param [graph] The current graph object
 * @return an ID for the specified graph object
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementIdProvider%23IGraphElementIdProvider-method-getGraphId">Online Documentation</a>
 */
   fun getGraphId( context: IWriteContext ,
 graph: IGraph ):ElementId
/**
 * Get an ID for the specified `node` object
 * @param [context] The current write context, for further information to the provider
 * @param [node] The current graph object
 * @return an ID for the specified graph object
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementIdProvider%23IGraphElementIdProvider-method-getNodeId">Online Documentation</a>
 */
   fun getNodeId( context: IWriteContext ,
 node: INode ):ElementId
/**
 * Get an ID for the specified `port` object
 * @param [context] The current write context, for further information to the provider
 * @param [port] The current port object
 * @return an ID for the specified port object
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementIdProvider%23IGraphElementIdProvider-method-getPortId">Online Documentation</a>
 */
   fun getPortId( context: IWriteContext ,
 port: IPort ):ElementId

companion object : InterfaceMetadata<IGraphElementIdProvider> {
}
}
