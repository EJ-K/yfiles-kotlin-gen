// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.partial

import js.array.ReadonlyArray
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.EdgeList
import yfiles.algorithms.NodeDpKey
import yfiles.algorithms.NodeList
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * This class represents a partial layout algorithm which changes the coordinates for a given set of graph elements (called partial elements) only.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [PartialLayout] which uses the specified [ILayoutAlgorithm] instance as the core layout algorithm.
 * @param [coreLayout] the layout algorithm that is applied to the subgraph components
 * @see [componentAssignmentStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23PartialLayout-constructor-PartialLayout">Online Documentation</a>
 * 
 * @property coreLayout
 * Gets or sets the [ILayoutAlgorithm] instance that is applied to each subgraph component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23coreLayout">Online Documentation</a>
 */
external open class PartialLayout  (
override var coreLayout: ILayoutAlgorithm? = definedExternally) : LayoutStageBase {

/**
 * Gets or sets whether or not subgraph components are mirrored to improve the layout quality.
 * 
 * Default value - `false`. Mirroring is disabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23allowMirroring">Online Documentation</a>
 */
open var allowMirroring: Boolean
/**
 * Gets or sets whether or not the algorithm may move fixed elements.
 * 
 * Default value - `false`. The algorithm doesn't move fixed elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23allowMovingFixedElements">Online Documentation</a>
 */
open var allowMovingFixedElements: Boolean
/**
 * Gets or sets the strategy that assigns partial nodes to subgraph components.
 * 
 * Default value - [ComponentAssignmentStrategy.SINGLE]. Each partial node is assigned to a separate subgraph component.
 * @throws ArgumentError if the specified strategy does not match one of the predefined strategies
 * @see [COMPONENT_ID_DP_KEY]
 * @see [coreLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23componentAssignmentStrategy">Online Documentation</a>
 */
open var componentAssignmentStrategy: ComponentAssignmentStrategy
/**
 * Gets or sets whether or not a subgraph component may be placed within another subgraph component.
 * 
 * Default value - `true`. Subgraph component may be placed within another subgraph component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23componentCompaction">Online Documentation</a>
 */
open var componentCompaction: Boolean
/**
 * Gets or sets whether or not partial nodes should be aligned.
 * 
 * Default value - `false`. Nodes are not aligned.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23considerNodeAlignment">Online Documentation</a>
 */
open var considerNodeAlignment: Boolean
/**
 * Gets or sets the custom edge router instance that is used for partial edges and edges between different subgraph components (so-called inter-edges).
 * 
 * Default value - [StraightLineEdgeRouter][yfiles.router.StraightLineEdgeRouter]
 * @see [ROUTE_EDGE_DP_KEY]
 * @see [edgeRoutingStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23edgeRouter">Online Documentation</a>
 */
open var edgeRouter: ILayoutAlgorithm?
/**
 * Gets or sets the routing strategy that is used for partial edges and inter-edges.
 * 
 * Default value - [EdgeRoutingStrategy.STRAIGHTLINE]
 * @throws ArgumentError if the specified strategy does not match one of the predefined routing strategies
 * @see [edgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23edgeRoutingStrategy">Online Documentation</a>
 */
open var edgeRoutingStrategy: EdgeRoutingStrategy
/**
 * Gets or sets the layout orientation that is considered during the placement of partial elements.
 * 
 * Default value - [LayoutOrientation.NONE]. The layout orientation is completely ignored.
 * @throws ArgumentError if the specified orientation does not match one of the predefined orientations
 * @see [DIRECTED_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23layoutOrientation">Online Documentation</a>
 */
open var layoutOrientation: LayoutOrientation
/**
 * Gets or sets the preferred time limit (in milliseconds) for the layout algorithm.
 * 
 * Default value - `<code>0x7FFFFFFF</code>`. The time is not limited.
 * @throws ArgumentError if the maximum duration is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * Gets or sets the minimum distance between two adjacent nodes.
 * 
 * Default value - `10`
 * @throws ArgumentError if the distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23minimumNodeDistance">Online Documentation</a>
 */
open var minimumNodeDistance: Double
/**
 * Gets or sets whether or not a postprocessing step should be applied to reduce the number of directed edges that do not comply with the specified layout orientation.
 * 
 * Default value - `true`. This postprocessing step is enabled.
 * @see [layoutOrientation]
 * @see [DIRECTED_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23optimizeOrientation">Online Documentation</a>
 */
open var optimizeOrientation: Boolean
/**
 * Gets or sets whether or not fixed (non-partial) group nodes may be resized.
 * 
 * Default value - `false`. Fixed group nodes may not be resized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23resizeFixedGroups">Online Documentation</a>
 */
open var resizeFixedGroups: Boolean
/**
 * Gets or sets whether or not edges between different subgraph components should be routed immediately.
 * 
 * Default value - `false`. Edges are not routed immediately.
 * @see [routeInterEdges]
 * @see [placeSubgraphs]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23routeInterEdgesImmediately">Online Documentation</a>
 */
open var routeInterEdgesImmediately: Boolean
/**
 * Gets or sets the objective used for finding 'good' positions for subgraph components.
 * 
 * Default value - [SubgraphPlacement.BARYCENTER]. Each subgraph component is placed close to the barycenter of its graph neighbors.
 * @throws ArgumentError if the specified strategy does not match one of the predefined positioning strategies
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23subgraphPlacement">Online Documentation</a>
 */
open var subgraphPlacement: SubgraphPlacement
/**
 * This method calculates the partial layout.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23PartialLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * This method is called each time when edges are routed with an edge router.
 * @param [edgeRouter] the instance used for routing the edges
 * @see [edgeRouter]
 * @see [edgeRoutingStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23PartialLayout-method-configureEdgeRouter">Online Documentation</a>
 */
 open protected   fun configureEdgeRouter( edgeRouter: ILayoutAlgorithm )
/**
 * This method is called during the [layout process][applyLayout] and calculates the layout for the given subgraph component using the specified [core layout algorithm][coreLayout].
 * @param [subGraph] the subgraph component
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23PartialLayout-method-layoutSubgraph">Online Documentation</a>
 */
 open protected   fun layoutSubgraph( subGraph: LayoutGraph )
/**
 * This method is called during the [layout process][applyLayout] and places the subgraph components one-by-one onto the drawing area.
 * @param [graph] the input graph
 * @param [subgraphComponents] each entry contains a [NodeList] that induces a subgraph component
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23PartialLayout-method-placeSubgraphs">Online Documentation</a>
 */
 open protected   fun placeSubgraphs( graph: LayoutGraph ,
 subgraphComponents: ReadonlyArray<NodeList> )
/**
 * This method is called during the [layout process][applyLayout] and routes all partial edges that connect two fixed elements.
 * @param [graph] the subgraph of the input graph induced by the fixed nodes
 * @param [partialEdges] the [list of partial edges][EdgeList] to be routed
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23PartialLayout-method-routeEdgesBetweenFixedElements">Online Documentation</a>
 */
 open protected   fun routeEdgesBetweenFixedElements( graph: LayoutGraph ,
 partialEdges: EdgeList )
/**
 * This method is called during the [layout process][applyLayout] and routes all inter-edges.
 * @param [graph] the relevant subgraph
 * @param [interEdges] the [list of inter-edges][EdgeList] to be routed
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23PartialLayout-method-routeInterEdges">Online Documentation</a>
 */
 open protected   fun routeInterEdges( graph: LayoutGraph ,
 interEdges: EdgeList )

companion object : ClassMetadata<PartialLayout> {
/**
 * A data provider key for marking partial edges.
 * @see [AFFECTED_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23AFFECTED_EDGES_DP_KEY">Online Documentation</a>
 */
 val AFFECTED_EDGES_DP_KEY: EdgeDpKey<Boolean>
/**
 * A data provider key for marking partial nodes.
 * @see [AFFECTED_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23AFFECTED_NODES_DP_KEY">Online Documentation</a>
 */
 val AFFECTED_NODES_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for defining custom subgraph components.
 * @see [ComponentAssignmentStrategy.CUSTOMIZED]
 * @see [componentAssignmentStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23COMPONENT_ID_DP_KEY">Online Documentation</a>
 */
 val COMPONENT_ID_DP_KEY: NodeDpKey<Id>
/**
 * A data provider key for specifying the edges that should be considered to be directed.
 * @see [layoutOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23DIRECTED_EDGES_DP_KEY">Online Documentation</a>
 */
 val DIRECTED_EDGES_DP_KEY: EdgeDpKey<Boolean>
/**
 * A data provider key for obtaining the edges that should be routed by the edge router.
 * @see [edgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23ROUTE_EDGE_DP_KEY">Online Documentation</a>
 */
 val ROUTE_EDGE_DP_KEY: EdgeDpKey<Boolean>
}
}

inline fun PartialLayout(
    block: PartialLayout.() -> Unit
): PartialLayout {
    return PartialLayout()
        .apply(block)
}
