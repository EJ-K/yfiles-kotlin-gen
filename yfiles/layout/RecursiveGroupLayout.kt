// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.EdgeList
import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata
import yfiles.lang.Id

/**
 * This layout algorithm recursively traverses a hierarchically organized graph in a bottom-up fashion and applies a specified layout algorithm to the contents (direct children) of each group node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [RecursiveGroupLayout] with default settings using the given [layout algorithm][ILayoutAlgorithm] and [IGroupBoundsCalculator] implementation.
 * @param [coreLayout] the layout algorithm that is applied in each step of the recursion
 * @param [groupBoundsCalculator] the [IGroupBoundsCalculator] for calculating group sizes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23RecursiveGroupLayout-constructor-RecursiveGroupLayout">Online Documentation</a>
 * 
 * @property groupBoundsCalculator
 * Gets or sets a [IGroupBoundsCalculator] which computes the sizes of all group nodes.
 * 
 * Default value - [MinimumSizeGroupBoundsCalculator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23groupBoundsCalculator">Online Documentation</a>
 */
external open class RecursiveGroupLayout  (
 coreLayout: ILayoutAlgorithm?  = definedExternally,
open var groupBoundsCalculator: IGroupBoundsCalculator? = definedExternally) : LayoutStageBase {

/**
 * Gets or sets whether or not temporary [PortCandidate]s are inserted to improve the routing of inter-edges.
 * 
 * Default value - `false`. No temporary [PortCandidate]s are added.
 * @see [routeInterEdges]
 * @see [interEdgeRouter]
 * @see [PortCandidate]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23autoAssignPortCandidates">Online Documentation</a>
 */
open var autoAssignPortCandidates: Boolean
/**
 * Gets or sets whether empty group nodes are handled like group nodes with content or like normal nodes.
 * 
 * Default value - `true`. Empty group nodes are resized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23considerEmptyGroups">Online Documentation</a>
 */
open var considerEmptyGroups: Boolean
/**
 * Gets or sets whether or not to consider the initial coordinates of the graph elements.
 * 
 * Default value - `false`. The initial coordinates of the nodes are not taken into account.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23fromSketchMode">Online Documentation</a>
 */
open var fromSketchMode: Boolean
/**
 * Gets or sets the current edge routing algorithm for handling inter-edges.
 * 
 * Default value - `null`. Edges are routed as straight lines from source to target.
 * @see [interEdgesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23interEdgeRouter">Online Documentation</a>
 */
open var interEdgeRouter: ILayoutAlgorithm?
/**
 * Gets or sets the key for marking the inter-edges to be routed.
 * 
 * Default value - [LayoutKeys.AFFECTED_EDGES_DP_KEY]
 * @see [interEdgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23interEdgesDpKey">Online Documentation</a>
 */
open var interEdgesDpKey: EdgeDpKey<Boolean>
/**
 * Gets or sets whether or not [PortConstraint]s of inter-edges are temporarily replaced by [PortCandidate]s.
 * 
 * Default value - `true`. Existing [PortConstraint]s are temporarily replaced with corresponding [PortCandidate]s.
 * @see [routeInterEdges]
 * @see [PortCandidate]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23replacePortConstraints">Online Documentation</a>
 */
open var replacePortConstraints: Boolean
/**
 * Invokes a recursive traversal through the grouping hierarchy of the given graph during which the specified [layout algorithms][GROUP_NODE_LAYOUT_DP_KEY] are applied to the content of the groups.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23RecursiveGroupLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Reroutes the given inter-edges using the current [edge routing algorithm][interEdgeRouter].
 * @param [graph] the input graph
 * @param [interEdges] the edges which traverse the boundary of a group node
 * @see [autoAssignPortCandidates]
 * @see [replacePortConstraints]
 * @see [interEdgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23RecursiveGroupLayout-method-routeInterEdges">Online Documentation</a>
 */
 open protected   fun routeInterEdges( graph: LayoutGraph ,
 interEdges: EdgeList )

companion object : ClassMetadata<RecursiveGroupLayout> {
/**
 * A data provider key for arranging the content of each group node with an individual layout algorithm.
 * @see [NULL_LAYOUT]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23GROUP_NODE_LAYOUT_DP_KEY">Online Documentation</a>
 */
 val GROUP_NODE_LAYOUT_DP_KEY: NodeDpKey<ILayoutAlgorithm>
/**
 * A data provider key for specifying a local partition grid for each group node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23GROUP_NODE_PARTITION_GRID_DP_KEY">Online Documentation</a>
 */
 val GROUP_NODE_PARTITION_GRID_DP_KEY: NodeDpKey<PartitionGrid>
/**
 * A constant that represents a [ILayoutAlgorithm] implementation that does nothing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23NULL_LAYOUT">Online Documentation</a>
 */
 val NULL_LAYOUT: ILayoutAlgorithm
/**
 * A data provider key for assigning source split ids to edges connecting to group nodes.
 * @see [TARGET_SPLIT_ID_DP_KEY]
 * @see [HierarchicLayout][yfiles.hierarchic.HierarchicLayout]
 * @see [EdgeLayoutDescriptor.directGroupContentEdgeRouting][yfiles.hierarchic.EdgeLayoutDescriptor.directGroupContentEdgeRouting]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23SOURCE_SPLIT_ID_DP_KEY">Online Documentation</a>
 */
 val SOURCE_SPLIT_ID_DP_KEY: EdgeDpKey<Id>
/**
 * A data provider key for assigning target split ids to edges connecting to group nodes.
 * @see [SOURCE_SPLIT_ID_DP_KEY]
 * @see [HierarchicLayout][yfiles.hierarchic.HierarchicLayout]
 * @see [EdgeLayoutDescriptor.directGroupContentEdgeRouting][yfiles.hierarchic.EdgeLayoutDescriptor.directGroupContentEdgeRouting]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23TARGET_SPLIT_ID_DP_KEY">Online Documentation</a>
 */
 val TARGET_SPLIT_ID_DP_KEY: EdgeDpKey<Id>
}
}

inline fun RecursiveGroupLayout(
    block: RecursiveGroupLayout.() -> Unit
): RecursiveGroupLayout {
    return RecursiveGroupLayout()
        .apply(block)
}
