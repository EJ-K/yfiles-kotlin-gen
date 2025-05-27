// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.Edge
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.Graph
import yfiles.algorithms.ILabelLayoutDpKey
import yfiles.algorithms.NodeDpKey
import yfiles.collections.IComparer
import yfiles.collections.IList
import yfiles.lang.ClassMetadata
import yfiles.layout.GroupingSupport
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * This edge routing algorithm applies polyline routes to the edges of the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter">Online Documentation</a>
 * 
 * @constructor Creates a new [EdgeRouter] instance with an optional [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-constructor-EdgeRouter">Online Documentation</a>
 */
external open class EdgeRouter  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets the [IDataProvider][yfiles.algorithms.IDataProvider] key to look up the selection state of the edges.
 * 
 * Default value - [LayoutKeys.AFFECTED_EDGES_DP_KEY][yfiles.layout.LayoutKeys.AFFECTED_EDGES_DP_KEY]
 * @see [scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23affectedEdgesDpKey">Online Documentation</a>
 */
open var affectedEdgesDpKey: EdgeDpKey<Boolean>
/**
 * Gets or sets the [IDataProvider][yfiles.algorithms.IDataProvider] key to look up the selection state of the nodes.
 * 
 * Default value - [LayoutKeys.AFFECTED_NODES_DP_KEY][yfiles.layout.LayoutKeys.AFFECTED_NODES_DP_KEY]
 * @see [scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23affectedNodesDpKey">Online Documentation</a>
 */
open var affectedNodesDpKey: NodeDpKey<Boolean>
/**
 * Gets or sets whether or not the routing algorithm considers as obstacles the edge labels that do not belong to the (sub-)set of edges to be routed when calculating the edge routes.
 * 
 * Default value - `false`. Edge labels of fixed edges are not considered.
 * @see [scope]
 * @see [affectedEdgesDpKey]
 * @see [PenaltySettings.edgeLabelCrossingPenalty]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23considerEdgeLabels">Online Documentation</a>
 */
open var considerEdgeLabels: Boolean
/**
 * Gets or sets whether or not the routing algorithm considers the labels of the nodes as obstacles when calculating the edge routes to avoid overlaps.
 * 
 * Default value - `false`. Node labels are not considered.
 * @see [PenaltySettings.nodeLabelCrossingPenalty]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23considerNodeLabels">Online Documentation</a>
 */
open var considerNodeLabels: Boolean
/**
 * Gets the [EdgeLayoutDescriptor] instance used for all those edges that do not have a specific edge layout descriptor assigned.
 * @see [EDGE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23defaultEdgeLayoutDescriptor">Online Documentation</a>
 */
open val defaultEdgeLayoutDescriptor: EdgeLayoutDescriptor
/**
 * Gets or sets a custom [IComparer] to define the processing order of the edges.
 * 
 * Default value - `null`. There is no custom instance set and the default implementation will be applied.
 * @see [createDefaultEdgeOrderComparer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23edgeComparer">Online Documentation</a>
 */
open var edgeComparer: IComparer<in Edge>?
/**
 * Gets or sets the [Grid] instance on which the routing algorithm places the orthogonal segments.
 * 
 * Default value - `null`. No grid is specified.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23grid">Online Documentation</a>
 */
open var grid: Grid?
/**
 * Gets or sets whether or not this routing algorithm ignores node labels that are inside the bounds of their owner as obstacles for edge routes.
 * 
 * Default value - `true`. Node labels that are inside the bounds of their owner are ignored.
 * @see [considerNodeLabels]
 * @see [PenaltySettings.nodeLabelCrossingPenalty]
 * @see [LABEL_CROSSING_PENALTY_FACTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23ignoreInnerNodeLabels">Online Documentation</a>
 */
open var ignoreInnerNodeLabels: Boolean
/**
 * Gets or sets whether or not the layout algorithm will place edge labels.
 * 
 * Default value - `false`. Integrated edge labeling is disabled.
 * @see [considerEdgeLabels]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23integratedEdgeLabeling">Online Documentation</a>
 */
open var integratedEdgeLabeling: Boolean
/**
 * Gets or sets the time limit (in milliseconds) set for the edge routing algorithm.
 * 
 * Default value - `<code>0x7FFFFFFF</code>`. The edge routing algorithm runs unrestricted.
 * @throws ArgumentError if the maximum duration is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * Gets or sets the maximum ratio between the horizontal/vertical part of a segment and the (non-orthogonal) octilinear part.
 * 
 * This property is deprecated and replaced by [EdgeLayoutDescriptor.maximumOctilinearSegmentRatio]. As the property is on the descriptor, it additionally allows to define the maximum segment ratio each edge individually.
 * This property only affects edges using the [default layout descriptor][defaultEdgeLayoutDescriptor] and using routing style [EdgeRoutingStyle.OCTILINEAR]. Changing the value of this property changes property [EdgeLayoutDescriptor.maximumOctilinearSegmentRatio] of the default edge layout descriptor instance.
 * 
 * Default value - `0.3`
 * @throws ArgumentError if the maximum segment length is negative or greater than `0.5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23maximumPolylineSegmentRatio">Online Documentation</a>
 */
@Deprecated("Read documentation for more information")
open var maximumPolylineSegmentRatio: Double
/**
 * Gets or sets the minimum distance between edges and node bounds.
 * 
 * Default value - `10`
 * @throws ArgumentError if the minimum node-to-edge distance is negative
 * @see [PenaltySettings.minimumNodeToEdgeDistancePenalty]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23minimumNodeToEdgeDistance">Online Documentation</a>
 */
open var minimumNodeToEdgeDistance: Double
/**
 * Gets the [GraphPartition] instance used during the routing process.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23partition">Online Documentation</a>
 */
open val partition: GraphPartition?
/**
 * Gets or sets whether or not the routing algorithm will route the edges with non-orthogonal, octilinear segments.
 * 
 * This property is deprecated! It is replaced by property [EdgeLayoutDescriptor.routingStyle] on the edge layout descriptor. Use the routing styles [EdgeRoutingStyle.ORTHOGONAL] and [EdgeRoutingStyle.OCTILINEAR] to switch between octilinear and orthogonal routing. With the descriptor, the style can be specified for each edge individually, if desired.
 * This property only affects edges using the [default layout descriptor][defaultEdgeLayoutDescriptor]. Changing this property value changes property [EdgeLayoutDescriptor.routingStyle] of the default edge layout descriptor instance.
 * 
 * Default value - `false`. The octilinear edge routing is disabled and edges are routed orthogonal.
 * @see [preferredPolylineSegmentLength]
 * @see [maximumPolylineSegmentRatio]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23polylineRouting">Online Documentation</a>
 */
@Deprecated("Read documentation for more information")
open var polylineRouting: Boolean
/**
 * Gets or sets the preferred length of (non-orthogonal) octilinear segments.
 * 
 * This property is deprecated and replaced by [EdgeLayoutDescriptor.preferredOctilinearSegmentLength]. As the property is on the descriptor, it additionally allows to define the preferred length for each edge individually.
 * This property only affects edges using the [default layout descriptor][defaultEdgeLayoutDescriptor] and using routing style [EdgeRoutingStyle.OCTILINEAR]. Changing the value of this property changes property [EdgeLayoutDescriptor.preferredOctilinearSegmentLength] of the default edge layout descriptor instance.
 * 
 * Default value - `30`
 * @throws ArgumentError if the preferred octilinear segment length is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23preferredPolylineSegmentLength">Online Documentation</a>
 */
@Deprecated("Read documentation for more information")
open var preferredPolylineSegmentLength: Double
/**
 * Gets a list of all registered [IGraphPartitionExtension]s.
 * @see [createGraphPartition]
 * @see [configureGraphPartition]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23registeredPartitionExtensions">Online Documentation</a>
 */
open val registeredPartitionExtensions: IList<out IGraphPartitionExtension>
/**
 * Gets a list of all registered [PathSearchExtension]s.
 * @see [createPathSearch]
 * @see [configurePathSearch]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23registeredPathSearchExtensions">Online Documentation</a>
 */
open val registeredPathSearchExtensions: IList<out PathSearchExtension>
/**
 * Gets or sets whether or not the routing algorithm uses an additional step to reroute the edges that are considered to have the worst paths.
 * 
 * Default value - `false`. The rerouting step will not be performed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23rerouting">Online Documentation</a>
 */
open var rerouting: Boolean
/**
 * Gets or sets a (sub-)set of edges that shall be routed.
 * 
 * Default value - [Scope.ROUTE_ALL_EDGES]
 * @throws ArgumentError if the given scope is unknown
 * @see [affectedEdgesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23scope">Online Documentation</a>
 */
open var scope: Scope
/**
 * Performs the routing of the edges of the input graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Checks the sizes of the nodes to be non-zero.
 * @param [g] The graph to check.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-method-checkNodeSize">Online Documentation</a>
 */
 open protected   fun checkNodeSize( g: LayoutGraph )
/**
 * Removes all registered [IGraphPartitionExtension]s from a given [GraphPartition] instance.
 * @param [partition] the given [GraphPartition] instance
 * @see [configureGraphPartition]
 * @see [registeredPartitionExtensions]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-method-cleanUpGraphPartition">Online Documentation</a>
 */
 open protected   fun cleanUpGraphPartition( partition: GraphPartition )
/**
 * Adds all registered [IGraphPartitionExtension]s instances to a given [GraphPartition] instance.
 * @param [partition] the given [GraphPartition] instance
 * @see [registeredPartitionExtensions]
 * @see [cleanUpGraphPartition]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-method-configureGraphPartition">Online Documentation</a>
 */
 open protected   fun configureGraphPartition( partition: GraphPartition )
/**
 * Adds all registered [PathSearchExtension]s to a given [PathSearch] instance.
 * @param [pathSearch] a [PathSearch] instance
 * @see [createPathSearch]
 * @see [registeredPathSearchExtensions]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-method-configurePathSearch">Online Documentation</a>
 */
 open protected   fun configurePathSearch( pathSearch: PathSearch )
/**
 * Creates a [PathSearchConfiguration] that is used during the path searching process.
 * @param [graph] the input graph
 * @param [grouping] the grouping structure of the graph
 * @return a [PathSearchConfiguration] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-method-createConfiguration">Online Documentation</a>
 */
 open protected   fun createConfiguration( graph: LayoutGraph ,
 grouping: GroupingSupport ):PathSearchConfiguration
/**
 * Creates a default [IComparer] instance to determine the order of the edges according to which they will be routed.
 * @param [graph] the input graph
 * @param [configuration] the given configuration for the path searching process
 * @return a [IComparer] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-method-createDefaultEdgeOrderComparer">Online Documentation</a>
 */
 open protected   fun createDefaultEdgeOrderComparer( graph: LayoutGraph ,
 configuration: PathSearchConfiguration ):IComparer<Edge>
/**
 * Creates a [GraphPartition] instance that divides the area of the graph into several rectangles.
 * @param [decomposition] the current [IObstaclePartition]
 * @return a [GraphPartition] instance
 * @see [configureGraphPartition]
 * @see [registeredPartitionExtensions]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-method-createGraphPartition">Online Documentation</a>
 */
 open protected   fun createGraphPartition( decomposition: IObstaclePartition ):GraphPartition
/**
 * Creates a [DynamicObstacleDecomposition] that is used by the [GraphPartition] to divide the graph area in rectangles.
 * @return a [DynamicObstacleDecomposition] instance
 * @see [createGraphPartition]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-method-createObstacleDecomposition">Online Documentation</a>
 */
 open protected   fun createObstacleDecomposition():DynamicObstacleDecomposition
/**
 * Creates a [ChannelBasedPathRouting] instance that routes the edges using pre-calculated [Path] objects.
 * @return a [ChannelBasedPathRouting] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-method-createPathRouting">Online Documentation</a>
 */
 open protected   fun createPathRouting():ChannelBasedPathRouting
/**
 * Creates a [PathSearch] instance that finds the paths of the edges through the [GraphPartition].
 * @return a [PathSearch] instance
 * @see [configurePathSearch]
 * @see [registeredPathSearchExtensions]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-method-createPathSearch">Online Documentation</a>
 */
 open protected   fun createPathSearch():PathSearch
/**
 * Creates a [PathSearchContext] that provides context information for the path searching algorithm.
 * @param [pathSearch] a given [PathSearch] instance
 * @param [configuration] a given configuration for the path searching process
 * @return a [PathSearchContext] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-method-createPathSearchContext">Online Documentation</a>
 */
 open protected   fun createPathSearchContext( pathSearch: PathSearch ,
 configuration: PathSearchConfiguration ):PathSearchContext
/**
 * Returns the [EdgeLayoutDescriptor] instance for a given edge that is provided by a [IDataProvider][yfiles.algorithms.IDataProvider] which is registered with the graph with key [EDGE_LAYOUT_DESCRIPTOR_DP_KEY].
 * @param [edge] the given edge
 * @return the current [EdgeLayoutDescriptor] instance for a given edge
 * @see [defaultEdgeLayoutDescriptor]
 * @see [EDGE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-method-getEdgeLayoutDescriptor">Online Documentation</a>
 */
 open protected   fun getEdgeLayoutDescriptor( edge: Edge ):EdgeLayoutDescriptor
/**
 * Returns whether or not a given edge is selected.
 * @param [edge] the given edge
 * @param [graph] the input graph
 * @return `true` if the given edge is selected, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-method-isAffected">Online Documentation</a>
 */
 open protected   fun isAffected( edge: Edge ,
 graph: Graph ):Boolean

companion object : ClassMetadata<EdgeRouter> {
/**
 * A data provider key for specifying a bus descriptor for each edge.
 * @see [EdgeRouterBusDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23BUS_DESCRIPTOR_DP_KEY">Online Documentation</a>
 */
 val BUS_DESCRIPTOR_DP_KEY: EdgeDpKey<EdgeRouterBusDescriptor>
/**
 * A data provider key for specifying individual edge layout information.
 * @see [defaultEdgeLayoutDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EDGE_LAYOUT_DESCRIPTOR_DP_KEY">Online Documentation</a>
 */
 val EDGE_LAYOUT_DESCRIPTOR_DP_KEY: EdgeDpKey<EdgeLayoutDescriptor>
/**
 * A data provider key for weighting the costs for crossing each label individually.
 * @see [defaultEdgeLayoutDescriptor]
 * @see [EdgeLayoutDescriptor.penaltySettings]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23LABEL_CROSSING_PENALTY_FACTOR_DP_KEY">Online Documentation</a>
 */
 val LABEL_CROSSING_PENALTY_FACTOR_DP_KEY: ILabelLayoutDpKey<Double>
}
}

inline fun EdgeRouter(
    block: EdgeRouter.() -> Unit
): EdgeRouter {
    return EdgeRouter()
        .apply(block)
}
