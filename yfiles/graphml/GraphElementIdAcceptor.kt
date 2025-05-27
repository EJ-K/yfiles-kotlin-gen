// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.collections.IMap
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.lang.ClassMetadata

/**
 * An[IGraphElementIdAcceptor] and [IGraphElementIdProvider] implementation that stores all IDs in [IMapper] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphElementIdAcceptor">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphElementIdAcceptor%23GraphElementIdAcceptor-constructor-GraphElementIdAcceptor">Online Documentation</a>
 */
external open class GraphElementIdAcceptor  () : IGraphElementIdAcceptor, IGraphElementResolver {

/**
 * Gets a mapping between all GraphML ids for `<edge>` elements and the corresponding [IEdge] instances
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphElementIdAcceptor%23edgeIds">Online Documentation</a>
 */
final val edgeIds: IMap<IEdge, String>
/**
 * Gets a mapping between all GraphML ids for `<graph>` elements and the corresponding [IGraph] instances
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphElementIdAcceptor%23graphIds">Online Documentation</a>
 */
final val graphIds: IMap<IGraph, String>
/**
 * Gets a mapping between all GraphML ids for `<node>` elements and the corresponding [INode] instances
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphElementIdAcceptor%23nodeIds">Online Documentation</a>
 */
final val nodeIds: IMap<INode, String>
/**
 * Gets a mapping between all GraphML ids for `<port>` elements and the corresponding [IPort] instances
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphElementIdAcceptor%23portIds">Online Documentation</a>
 */
final val portIds: IMap<IPort, String>
/**
 * Factory method to create a default implementation of [IGraphElementIdProvider] that delegates to `fallback` and uses the values stored by this [GraphElementIdAcceptor] instance, if possible.
 * @param [fallback] The fallback.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphElementIdAcceptor%23GraphElementIdAcceptor-method-createIdProvider">Online Documentation</a>
 */
 final   fun createIdProvider( fallback: IGraphElementIdProvider ):IGraphElementIdProvider
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphElementIdAcceptor%23GraphElementIdAcceptor-method-resolveEdge">Online Documentation</a>
 */
 final override   fun resolveEdge( context: IParseContext ,
 id: ElementId ):IEdge?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphElementIdAcceptor%23GraphElementIdAcceptor-method-resolveGraph">Online Documentation</a>
 */
 final override   fun resolveGraph( context: IParseContext ,
 id: ElementId ):IGraph?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphElementIdAcceptor%23GraphElementIdAcceptor-method-resolveNode">Online Documentation</a>
 */
 final override   fun resolveNode( context: IParseContext ,
 id: ElementId ):INode?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphElementIdAcceptor%23GraphElementIdAcceptor-method-resolvePort">Online Documentation</a>
 */
 final override   fun resolvePort( context: IParseContext ,
 ownerId: ElementId ,
 id: ElementId ):IPort?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphElementIdAcceptor%23GraphElementIdAcceptor-method-storeEdgeId">Online Documentation</a>
 */
 final override   fun storeEdgeId( context: IParseContext ,
 edge: IEdge ,
 id: ElementId )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphElementIdAcceptor%23GraphElementIdAcceptor-method-storeGraphId">Online Documentation</a>
 */
 final override   fun storeGraphId( context: IParseContext ,
 graph: IGraph ,
 id: ElementId )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphElementIdAcceptor%23GraphElementIdAcceptor-method-storeNodeId">Online Documentation</a>
 */
 final override   fun storeNodeId( context: IParseContext ,
 node: INode ,
 id: ElementId )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphElementIdAcceptor%23GraphElementIdAcceptor-method-storePortId">Online Documentation</a>
 */
 final override   fun storePortId( context: IParseContext ,
 port: IPort ,
 id: ElementId )

companion object : ClassMetadata<GraphElementIdAcceptor> {
}
}
