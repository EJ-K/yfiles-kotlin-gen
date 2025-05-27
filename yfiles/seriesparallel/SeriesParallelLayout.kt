// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.seriesparallel

import yfiles.algorithms.Edge
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.Graph
import yfiles.algorithms.IEdgeLabelLayoutDpKey
import yfiles.algorithms.NodeDpKey
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutGraph
import yfiles.layout.MultiStageLayout

/**
 * This layout algorithm arranges series-parallel graphs.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [SeriesParallelLayout] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23SeriesParallelLayout-constructor-SeriesParallelLayout">Online Documentation</a>
 */
external open class SeriesParallelLayout  () : MultiStageLayout {

/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for arranging the components of the graph is activated.
 * 
 * Default value - `true`. The stage that arranges connected graph components is activated.
 * @see [MultiStageLayout.componentLayoutEnabled]
 * @see [MultiStageLayout.componentLayout]
 * @see [ComponentLayout][yfiles.layout.ComponentLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23componentLayoutEnabled">Online Documentation</a>
 */
override var componentLayoutEnabled: Boolean
/**
 * Gets or sets whether or not the layout algorithm reserves space for node labels to avoid overlaps.
 * 
 * Default value - `false`. Node labels are not considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23considerNodeLabels">Online Documentation</a>
 */
open var considerNodeLabels: Boolean
/**
 * Gets or sets the [EdgeLayoutDescriptor] instance used for all those edges that do not have a specific layout descriptor assigned.
 * 
 * Default value - [EdgeLayoutDescriptor]
 * @see [EDGE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23defaultEdgeLayoutDescriptor">Online Documentation</a>
 */
open var defaultEdgeLayoutDescriptor: EdgeLayoutDescriptor
/**
 * Gets or sets the default [IComparer] used for sorting the outgoing edges incident to nodes that do not have a specific [IComparer].
 * 
 * Default value - [DefaultOutEdgeComparer]. The order of the edges is used along with a special [PortConstraint][yfiles.layout.PortConstraint] and edge group handling.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23defaultOutEdgeComparer">Online Documentation</a>
 */
open var defaultOutEdgeComparer: IComparer<in Edge>?
/**
 * Gets or sets the default [IPortAssignment] used for those nodes that do not have their own specific instance.
 * 
 * Default value - [DefaultPortAssignment]. All ports are [distributed][PortAssignmentMode.DISTRIBUTED] on the borders of the nodes.
 * @throws ArgumentError if `null` is specified
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23defaultPortAssignment">Online Documentation</a>
 */
open var defaultPortAssignment: IPortAssignment
/**
 * Gets or sets whether or not to take the coordinates of the input diagram into account when arranging the nodes.
 * 
 * Default value - `false`. The initial coordinates of the nodes are not considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23fromSketchMode">Online Documentation</a>
 */
open var fromSketchMode: Boolean
/**
 * Gets or sets whether or not the layout algorithm can handle general graphs.
 * 
 * Default value - `false`. Only series-parallel graphs are handled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23generalGraphHandling">Online Documentation</a>
 */
open var generalGraphHandling: Boolean
/**
 * Gets or sets whether or not the layout algorithm will place edge labels and reserve space for them.
 * 
 * Default value - `false`. Integrated edge labeling is disabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23integratedEdgeLabeling">Online Documentation</a>
 */
open var integratedEdgeLabeling: Boolean
/**
 * Gets or sets the minimum distance between edges.
 * 
 * Default value - `5`
 * @throws ArgumentError if the specified distance is smaller than `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23minimumEdgeToEdgeDistance">Online Documentation</a>
 */
open var minimumEdgeToEdgeDistance: Double
/**
 * Gets or sets the minimum distance between nodes and edges.
 * 
 * Default value - `10`
 * @throws ArgumentError if the specified distance is smaller than `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23minimumNodeToEdgeDistance">Online Documentation</a>
 */
open var minimumNodeToEdgeDistance: Double
/**
 * Gets or sets the minimum distance between nodes.
 * 
 * Default value - `10`
 * @throws ArgumentError if the specified distance is smaller than `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23minimumNodeToNodeDistance">Online Documentation</a>
 */
open var minimumNodeToNodeDistance: Double
/**
 * Gets or sets the minimum vertical distance of the edge segments that are not orthogonal.
 * 
 * Default value - `30`
 * @throws ArgumentError if the specified length is smaller than `0`
 * @see [minimumSlope]
 * @see [routingStyle]
 * @see [RoutingStyle.POLYLINE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23minimumPolylineSegmentLength">Online Documentation</a>
 */
open var minimumPolylineSegmentLength: Double
/**
 * Gets or sets the minimum slope which a non-orthogonal edge segment should have.
 * 
 * Default value - `0.25`
 * @throws ArgumentError if the specified slope is smaller than `0`
 * @see [minimumPolylineSegmentLength]
 * @see [routingStyle]
 * @see [RoutingStyle.POLYLINE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23minimumSlope">Online Documentation</a>
 */
open var minimumSlope: Double
/**
 * Gets or sets the key to register a [IDataProvider][yfiles.algorithms.IDataProvider] that is used by the [non-series-parallel edge labeling algorithm][nonSeriesParallelEdgeLabelingAlgorithm] to determine which edge labels it should place.
 * 
 * Default value - [NON_SERIES_PARALLEL_EDGE_LABELS_DP_KEY]
 * @see [nonSeriesParallelEdgeLabelingAlgorithm]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23nonSeriesParallelEdgeLabelSelectionKey">Online Documentation</a>
 */
open var nonSeriesParallelEdgeLabelSelectionKey: EdgeDpKey<Boolean>?
/**
 * Gets or sets the labeling algorithm that is applied to all edge labels that belong to non-series-parallel edges.
 * 
 * Default value - [GenericLabeling][yfiles.labeling.GenericLabeling]
 * @see [generalGraphHandling]
 * @see [nonSeriesParallelEdgeLabelSelectionKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23nonSeriesParallelEdgeLabelingAlgorithm">Online Documentation</a>
 */
open var nonSeriesParallelEdgeLabelingAlgorithm: ILayoutAlgorithm?
/**
 * Gets or sets the edge routing algorithm used for the edges of a general graph that are not part of the series-parallel subgraph whose layout is calculated.
 * 
 * Default value - [EdgeRouter][yfiles.router.EdgeRouter]
 * @throws ArgumentError if `null` is specified
 * @see [generalGraphHandling]
 * @see [nonSeriesParallelEdgesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23nonSeriesParallelEdgeRouter">Online Documentation</a>
 */
open var nonSeriesParallelEdgeRouter: ILayoutAlgorithm
/**
 * Gets or sets the key to register a [IDataProvider][yfiles.algorithms.IDataProvider] that is used for marking non-series-parallel edges.
 * 
 * Default value - [LayoutKeys.AFFECTED_EDGES_DP_KEY][yfiles.layout.LayoutKeys.AFFECTED_EDGES_DP_KEY]
 * @throws ArgumentError if the given key is set to `null`
 * @see [generalGraphHandling]
 * @see [nonSeriesParallelEdgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23nonSeriesParallelEdgesDpKey">Online Documentation</a>
 */
open var nonSeriesParallelEdgesDpKey: EdgeDpKey<Boolean>
/**
 * Gets or sets the preferred length for non-orthogonal segments in octilinear edge routes.
 * 
 * Default value - `10`
 * @throws ArgumentError if the specified length is smaller than `0`
 * @see [routingStyle]
 * @see [RoutingStyle.OCTILINEAR]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23preferredOctilinearSegmentLength">Online Documentation</a>
 */
open var preferredOctilinearSegmentLength: Double
/**
 * Gets or sets the currently used routing style for edges.
 * 
 * Default value - [RoutingStyle.ORTHOGONAL]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23routingStyle">Online Documentation</a>
 */
open var routingStyle: RoutingStyle
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for routing self-loops is activated.
 * 
 * Default value - `true`. The stage that routes self-loops is activated.
 * @see [MultiStageLayout.selfLoopRouterEnabled]
 * @see [MultiStageLayout.selfLoopRouter]
 * @see [SelfLoopRouter][yfiles.layout.SelfLoopRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23selfLoopRouterEnabled">Online Documentation</a>
 */
override var selfLoopRouterEnabled: Boolean
/**
 * Gets or sets the vertical alignment of parallel subgraphs.
 * 
 * Default value - `0.5`. Subgraphs are center aligned.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23verticalAlignment">Online Documentation</a>
 */
open var verticalAlignment: Double
/**
 * Calculates a series-parallel layout for the given graph.
 * @param [graph] the input graph
 * @throws InvalidGraphStructureError if the graph is not series-parallel
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23SeriesParallelLayout-method-applyLayoutCore">Online Documentation</a>
 */
 override   fun applyLayoutCore( graph: LayoutGraph )

companion object : ClassMetadata<SeriesParallelLayout> {
/**
 * A data provider key for storing individual settings for edges.
 * @see [defaultEdgeLayoutDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23EDGE_LAYOUT_DESCRIPTOR_DP_KEY">Online Documentation</a>
 */
 val EDGE_LAYOUT_DESCRIPTOR_DP_KEY: EdgeDpKey<EdgeLayoutDescriptor>
/**
 * A data provider key for marking edge labels of non-series-parallel edges.
 * @see [nonSeriesParallelEdgeLabelSelectionKey]
 * @see [nonSeriesParallelEdgeLabelingAlgorithm]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23NON_SERIES_PARALLEL_EDGE_LABELS_DP_KEY">Online Documentation</a>
 */
 val NON_SERIES_PARALLEL_EDGE_LABELS_DP_KEY: IEdgeLabelLayoutDpKey<Boolean>
/**
 * A data provider key for assigning different orderings for outgoing edges of the nodes.
 * @see [defaultOutEdgeComparer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23OUT_EDGE_COMPARER_DP_KEY">Online Documentation</a>
 */
 val OUT_EDGE_COMPARER_DP_KEY: NodeDpKey<IComparer<in Edge>>
/**
 * A data provider key for providing an individual port distribution at nodes.
 * @see [defaultPortAssignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23PORT_ASSIGNMENT_DP_KEY">Online Documentation</a>
 */
 val PORT_ASSIGNMENT_DP_KEY: NodeDpKey<IPortAssignment>
/**
 * Determines whether or not the given graph has a series-parallel structure.
 * @receiver the input graph
 * @return `true` if the given graph is series-parallel, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23SeriesParallelLayout-method-isSeriesParallelGraph">Online Documentation</a>
 */
 final   fun Graph.isSeriesParallelGraph():Boolean
}
}

inline fun SeriesParallelLayout(
    block: SeriesParallelLayout.() -> Unit
): SeriesParallelLayout {
    return SeriesParallelLayout()
        .apply(block)
}
