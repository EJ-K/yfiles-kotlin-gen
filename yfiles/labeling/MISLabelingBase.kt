// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.labeling

import yfiles.algorithms.Edge
import yfiles.algorithms.Graph
import yfiles.algorithms.INodeMap
import yfiles.algorithms.LineSegment
import yfiles.algorithms.Node
import yfiles.algorithms.YRectangle
import yfiles.collections.IMap
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.LabelCandidate
import yfiles.layout.LayoutGraph

/**
 * A base class for generic labeling algorithms which solve the labeling problem by reducing it to the maximum independent set (MIS) problem.
 * @see [GenericLabeling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase">Online Documentation</a>
 * 
 * @constructor Creates a new [MISLabelingBase] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23MISLabelingBase-constructor-MISLabelingBase">Online Documentation</a>
 */
external abstract class MISLabelingBase  () : LabelingBase {

/**
 * The mapping from the [LabelCandidate]s to the corresponding nodes in the [conflictGraph].
 * @see [conflictGraph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23boxesToNodes">Online Documentation</a>
 */
protected final var boxesToNodes: IMap<LabelCandidate, Node>
/**
 * The conflict graph modeling [LabelCandidate]s as nodes and edges between them as conflicts, i.e., overlaps among candidates.
 * @see [createEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23conflictGraph">Online Documentation</a>
 */
protected final var conflictGraph: Graph
/**
 * Gets or sets the ratio between the internal profit (ip) and the profit computed using the specified [profit model][LabelingBase.profitModel] (sp).
 * 
 * Default value - `0.1`. The profit determined by the optimization strategy is more important than the currently specified profit model.
 * @throws ArgumentError if the given ratio is negative or larger than `1`
 * @see [LabelingBase.profitModel]
 * @see [optimizationStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23customProfitModelRatio">Online Documentation</a>
 */
open var customProfitModelRatio: Double
/**
 * The input graph that will be labeled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23graph">Online Documentation</a>
 */
protected final var graph: LayoutGraph
/**
 * The mapping from each node in the [conflictGraph] to the corresponding [LabelCandidate] instance.
 * @see [conflictGraph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23nodesToBoxes">Online Documentation</a>
 */
protected final var nodesToBoxes: INodeMap<LabelCandidate>
/**
 * The mapping from nodes in the [conflictGraph] to a corresponding integer value (ID).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23nodesToID">Online Documentation</a>
 */
protected final var nodesToID: INodeMap<Id>
/**
 * Gets or sets the optimization strategy which defines the importance of criteria when optimizing labeling results.
 * 
 * Default value - [OptimizationStrategy.BALANCED]
 * @throws ArgumentError if the given strategy is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23optimizationStrategy">Online Documentation</a>
 */
open var optimizationStrategy: OptimizationStrategy
/**
 * Gets or sets whether or not the number of ambiguous label placements is reduced by applying an additional optimization step.
 * 
 * Default value - `false`. Ambiguous label placements might be selected.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23reduceAmbiguity">Online Documentation</a>
 */
open var reduceAmbiguity: Boolean
/**
 * Gets or sets whether or not [label candidates][LabelCandidate] that overlap with edges are removed.
 * 
 * Default value - `false`. Candidates overlapping with edges are allowed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23removeEdgeOverlaps">Online Documentation</a>
 */
override var removeEdgeOverlaps: Boolean
/**
 * Gets or sets whether or not [label candidates][LabelCandidate] that overlap with nodes are removed.
 * 
 * Default value - `false`. Candidates overlapping with nodes are allowed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23removeNodeOverlaps">Online Documentation</a>
 */
override var removeNodeOverlaps: Boolean
/**
 * Returns a [INodeMap] which assigns a profit value to each node in the [conflict graph][conflictGraph].
 * @return a mapping from nodes (i.e. label candidates) to their profit value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23MISLabelingBase-method-assignProfit">Online Documentation</a>
 */
 open protected   fun assignProfit():INodeMap<Double>
/**
 * Creates the edges in the conflict graph, i.e., one edge between two nodes if the corresponding [LabelCandidate]s intersect.
 * @see [conflictGraph]
 * @see [nodesToBoxes]
 * @see [boxesToNodes]
 * @see [nodesToID]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23MISLabelingBase-method-createEdges">Online Documentation</a>
 */
 open protected   fun createEdges()
/**
 * Indicates that an overlap between a [LabelCandidate] and an [Edge] of the input graph has been found.
 * @param [labelCandidate] the [LabelCandidate] overlapping with the given [Edge]
 * @param [edge] the [Edge] overlapping with the given [LabelCandidate]
 * @param [eSegment] the [LineSegment] of the given edge overlapping with the given candidate
 * @see [conflictGraph]
 * @see [createEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23MISLabelingBase-method-foundEdgeOverlap">Online Documentation</a>
 */
 open protected   fun foundEdgeOverlap( labelCandidate: LabelCandidate ,
 edge: Edge ,
 eSegment: LineSegment )
/**
 * Indicates that an overlap between a [LabelCandidate] and a [NodeHalo][yfiles.layout.NodeHalo] of the input graph has been found.
 * @param [labelCandidate] the [LabelCandidate] overlapping with a node halo
 * @param [node] the [Node] whose [NodeHalo][yfiles.layout.NodeHalo] is overlapping with the given label candidate
 * @param [haloRect] the bounding box of the [NodeHalo][yfiles.layout.NodeHalo] overlapping with the given label candidate
 * @see [conflictGraph]
 * @see [createEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23MISLabelingBase-method-foundHaloOverlap">Online Documentation</a>
 */
 open protected   fun foundHaloOverlap( labelCandidate: LabelCandidate ,
 node: Node ,
 haloRect: YRectangle )
/**
 * Indicates that an overlap between two [LabelCandidate]s has been found.
 * @param [candidate1] the first overlapping [LabelCandidate]
 * @param [candidate2] the second overlapping [LabelCandidate]
 * @param [edge] the [Edge] in [conflictGraph] representing the found overlap
 * @see [conflictGraph]
 * @see [createEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23MISLabelingBase-method-foundLabelOverlap">Online Documentation</a>
 */
 open protected   fun foundLabelOverlap( candidate1: LabelCandidate ,
 candidate2: LabelCandidate ,
 edge: Edge )
/**
 * Indicates that an overlap between a [LabelCandidate] and a [Node] of the input graph has been found.
 * @param [labelCandidate] the [LabelCandidate] overlapping with the given node
 * @param [node] the [Node] overlapping with the given label candidate
 * @param [nodeBox] the bounding box of the given node
 * @see [conflictGraph]
 * @see [createEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23MISLabelingBase-method-foundNodeOverlap">Online Documentation</a>
 */
 open protected   fun foundNodeOverlap( labelCandidate: LabelCandidate ,
 node: Node ,
 nodeBox: YRectangle )
/**
 * Indicates that an overlap between a [LabelCandidate] and the insets of a cell of the [PartitionGrid][yfiles.layout.PartitionGrid] has been found.
 * @param [labelCandidate] the [LabelCandidate] overlapping with the [PartitionGrid][yfiles.layout.PartitionGrid]
 * @param [insetBox] a [YRectangle] representing an inset region of the [PartitionGrid][yfiles.layout.PartitionGrid] that is overlapping with the given label candidate
 * @see [conflictGraph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23MISLabelingBase-method-foundPartitionGridInsetOverlap">Online Documentation</a>
 */
 open protected   fun foundPartitionGridInsetOverlap( labelCandidate: LabelCandidate ,
 insetBox: YRectangle )
/**
 * Indicates that the [LabelCandidate] is inside of the [PartitionGrid][yfiles.layout.PartitionGrid].
 * @param [labelCandidate] the [LabelCandidate] overlapping with the [PartitionGrid][yfiles.layout.PartitionGrid]
 * @param [partitionGridBounds] a [YRectangle] representing the bounds of the [PartitionGrid][yfiles.layout.PartitionGrid]
 * @see [conflictGraph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23MISLabelingBase-method-foundPartitionGridInteriorOverlap">Online Documentation</a>
 */
 open protected   fun foundPartitionGridInteriorOverlap( labelCandidate: LabelCandidate ,
 partitionGridBounds: YRectangle )
/**
 * Indicates that an overlap between a [LabelCandidate] and the [PartitionGrid][yfiles.layout.PartitionGrid] has been found.
 * @param [labelCandidate] the [LabelCandidate] overlapping with the [PartitionGrid][yfiles.layout.PartitionGrid]
 * @param [lineSegment] a [LineSegment] of the [PartitionGrid][yfiles.layout.PartitionGrid] that is overlapping with the given label candidate
 * @see [conflictGraph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MISLabelingBase%23MISLabelingBase-method-foundPartitionGridLineOverlap">Online Documentation</a>
 */
 open protected   fun foundPartitionGridLineOverlap( labelCandidate: LabelCandidate ,
 lineSegment: LineSegment )

companion object : ClassMetadata<MISLabelingBase> {
}
}
